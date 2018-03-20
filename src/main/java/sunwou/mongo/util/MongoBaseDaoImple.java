package sunwou.mongo.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;


/**
 * 
 * @author onepieces
 * mongodb数据库操作类的父类
 * 实现了所有数据的增删改查的基础方法
 * @param <T extends MongoBaseEntity>
 */
@Component
@Scope("prototype")
public class MongoBaseDaoImple<T extends MongoBaseEntity> implements MongoBaseDao<T>{
	
	@Autowired
	public  MongoTemplate mongoTemplate;
	
	//默认从0开始取
	private static final int MIN_COUNT=0;
	//默认取的条数
	private static final int MAX_COUNT=20;
	
    public static Map<String, Class> classes = new HashMap<String, Class>();

	/**
	 * 增加记录的方法
	 * @param add
	 * @return  返回唯一ID
	 */
	public String add(T add)
	{
		add.beforAdd();
		mongoTemplate.save(add);
		return add.getSunwouId();
	}

	/**
	 * 根据实体类的属性来查询
	 * @param queryo
	 * @param skip 从第skip条数据开始
	 * @param limit 取limit条数据  
	 * @return  返回查询结果
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public List<T> find(QueryObject qo) 
	{
			  Query	query = mongoutilQ(qo);
			return (List<T>) mongoTemplate.find(query,classes.get(qo.getTableName()),qo.getTableName());
	}
	
	
	/**
	 * 获取数据量的总数
	 * @param queryo
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public int count(QueryObject qo)
	{
			    Query query = mongoutilQ(qo);
				return  (int)mongoTemplate.count(query, qo.getTableName());
	}
	
	
	/**
	 * 更新数据
	 * @param queryo
	 * @param updateo
	 * @return  更新数量
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
    @Deprecated
	public int update(QueryObject qo,T updateo)
	{
		    Query query = mongoutilQ(qo);
			Update update=mongoutilU(updateo, qo.getTableName());
			return mongoTemplate.updateMulti(query, update, qo.getTableName()).getN();
	}
	
	
	/**
	 * 更新一条数据
	 * @param queryo
	 * @param updateo
	 * @return  更新数量
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
    @Deprecated
	public int updateById(T updateo,String className)
	{
    	    updateo.beforUpdate();
		    Query query = new Query(Criteria.where("_id").is(updateo.getSunwouId()));
			Update update=mongoutilU(updateo,className);
			return mongoTemplate.updateFirst(query, update, className).getN();
	}
    
    /**
	 * 更新一条数据
	 * @param queryo
	 * @param updateo
	 * @return  更新数量
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public int update(QueryObject qo,UpdateObject update)
	{
		int i=0;
		Query query=mongoutilQ(qo);
		List<T> rs=mongoTemplate.find(query,classes.get(qo.getTableName()));
		Update up=mongoutilU(update);
		for(T t:rs){
			t.beforUpdate();
			i+=mongoTemplate.updateMulti(query, up, qo.getTableName()).getN();
		}
		return i;
	}
	
	




	/**
	 * 删除一条数据
	 * @param queryo
	 * @return 删除数量
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public int remove(QueryObject qo)
	{
			Query query = mongoutilQ(qo);
			Update update=new Update();
			update.set("isDelete", true);
			update.set("deleteTime", TimeUtil.formatDate(new Date(), TimeUtil.TO_S));
			return mongoTemplate.updateMulti(query, update, qo.getTableName()).getN();
	}

	/**
	 * 按id查询
	 * @param id
	 * @param className
	 * @return
	 */
	@Override
	public T findById(String id,String className) {
		Criteria c=new Criteria();
		c.andOperator(Criteria.where("_id").is(id),Criteria.where("isDelete").is(false));
		List<MongoBaseEntity> rs=mongoTemplate.find(new Query(c).limit(1), classes.get(className));
		if(rs.size()==0)
		return  null;
		else
		return (T) rs.get(0);
	}

	@Override
	public MongoTemplate getMongoTemplate() {
		return this.mongoTemplate;
	}
	
	
	
	
	private Update mongoutilU(UpdateObject update) {
		Update result=new Update();
		SetObject[] sets=update.getSets();
		for(SetObject temp:sets){
			result.set(temp.getName(), temp.getValue());
		}
		return result;
	}
	
	//******************************************************************************************************************************************************************************//
	/**
     * 返回query查询对象 mongo
     * @param ob
     * @throws IllegalAccessException 
     * @throws IllegalArgumentException 
     */
    private  Query mongoutilQ(QueryObject qo) {
    	Query query=new Query();
    	Criteria c=new Criteria();
    	List<Criteria> andparam = new ArrayList<Criteria>();
    	List<Criteria> orparam = new ArrayList<Criteria>();
    	if(qo.getFields()!=null){
    		String[] fields=qo.getFields();
    		for(String temp:fields){
    			if(temp.endsWith("-")){
    				query.fields().exclude(temp);
    			}else{
    				query.fields().include(temp);
    			}
    		}
    	}
    	if(qo.getWheres()!=null){
    		WhereObject[] wheres=qo.getWheres();
    		for(WhereObject temp:wheres){
    			where(temp,andparam,orparam);
    		}
    		if(andparam.size()>0)
    		c.andOperator(andparam.toArray(new Criteria[andparam.size()]));
    		if(orparam.size()>0)
    		c.orOperator(orparam.toArray(new Criteria[orparam.size()]));
    	}
    	if(qo.getSorts()!=null){
    		SortObject[] sorts=qo.getSorts();
    		List<Order> orders=new ArrayList<>();
    		for(SortObject temp:sorts){
    			if(temp.isAsc()){
    				orders.add(new Order(Direction.ASC, temp.getValue()));
    			}else
    			{
    				orders.add(new Order(Direction.DESC, temp.getValue()));
    			}
    		}
    		if(orders.size()>0){
    			query.with(new Sort(orders));
    		}
    	}
    	if(qo.getPages()!=null){
    		PageObejct pages=qo.getPages();
    		query.skip((pages.getCurrentPage()-1)*pages.getSize()).limit(pages.getSize());
    	}else
    	{
    		query.limit(MAX_COUNT);
    	}
    	query.addCriteria(c);	
    	return query;
    }
    
    
    public static void where(WhereObject where,List<Criteria> andparam,List<Criteria> orparam){
    	if(where.isAnd()){
    		switch (where.getOpertionType()) {
    		case "equal":
    			andparam.add(Criteria.where(where.getValue()).is(where.getOpertionValue()));
    			break;
    		case "lt":
    			andparam.add(Criteria.where(where.getValue()).lt(where.getOpertionValue()));
    			break;
    		case "lte":
    			andparam.add(Criteria.where(where.getValue()).lte(where.getOpertionValue()));
    			break;
    		case "gte":
    			andparam.add(Criteria.where(where.getValue()).gte(where.getOpertionValue()));
    			break;
    		case "gt":
    			andparam.add(Criteria.where(where.getValue()).gt(where.getOpertionValue()));
    			break;
    		case "ne":
    			andparam.add(Criteria.where(where.getValue()).ne(where.getOpertionValue()));
    			break;
    		case "like":
    			char[] chars=where.getOpertionValue().toString().toCharArray();
    			StringBuffer sb=new StringBuffer();
    			sb.append(".*");
    			for(char temp:chars)
    			{
    				sb.append(temp).append(".*");
    			}
    			andparam.add(Criteria.where(where.getValue()).regex(sb.toString()));
    			break;
    		default:
    			break;
    	}
		}else
		{
			switch (where.getOpertionType()) {
    		case "equal":
    			orparam.add(Criteria.where(where.getValue()).is(where.getOpertionValue()));
    			break;
    		case "lt":
    			orparam.add(Criteria.where(where.getValue()).lt(where.getOpertionValue()));
    			break;
    		case "lte":
    			orparam.add(Criteria.where(where.getValue()).lte(where.getOpertionValue()));
    			break;
    		case "gte":
    			orparam.add(Criteria.where(where.getValue()).gte(where.getOpertionValue()));
    			break;
    		case "gt":
    			orparam.add(Criteria.where(where.getValue()).gt(where.getOpertionValue()));
    			break;
    		case "ne":
    			orparam.add(Criteria.where(where.getValue()).ne(where.getOpertionValue()));
    			break;
    		case "like":
    			char[] chars=where.getOpertionValue().toString().toCharArray();
    			StringBuffer sb=new StringBuffer();
    			sb.append(".*");
    			for(char temp:chars)
    			{
    				sb.append(temp).append(".*");
    			}
    			orparam.add(Criteria.where(where.getValue()).regex(sb.toString()));
    			break;
    		default:
    			break;
			}
		}
    }

    
    
    /**
     * 返回update查询对象 mongo
     * @param ob
     * @throws IllegalAccessException 
     * @throws IllegalArgumentException 
     */
    @Deprecated
    private  Update mongoutilU(Object ob, String classname)  {
        Update update = new Update();
        Object value=null;
        Class cl=classes.get(classname);
        Class base=classes.get("mongoBaseEntity");
        for (Field f : base.getDeclaredFields()) {
            f.setAccessible(true);
                try {
					value = f.get(ob);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					value=null;
				}
                if (check(value)){
	                update.set(f.getName(), value);
	                }
        }
        for (Field f : cl.getDeclaredFields()) {
        		f.setAccessible(true);
                try {
					value = f.get(ob);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					value=null;
				}
                if (check(value)){
                update.set(f.getName(), value);
                }
        }
        return update;
    }
    
    private  boolean check(Object value){
    	if(value==null)
    		return false;
    	if(value instanceof String)
    		if(value!=null)
    			return true;
    		else
    			return false;
    	else
    		return true;
    }

	
}
