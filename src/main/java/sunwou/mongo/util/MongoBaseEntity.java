package sunwou.mongo.util;



import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;




/**
 * 实体类父类
 * @author onepieces
 */
@Configuration  //让Spring来加载该类配置
public class MongoBaseEntity {
	static{
		MongoBaseDaoImple.classes.put("mongoBaseEntity", MongoBaseEntity.class);
		List<Class<?>> classes=MongoUtil.getClasses("sunwou.entity");
		for(Class<?> temp:classes){
			MongoEntityAnnotation anno;
			if(temp.isAnnotationPresent(MongoEntityAnnotation.class)){
				anno=temp.getAnnotation(MongoEntityAnnotation.class);
				MongoBaseDaoImple.classes.put(anno.value(), temp);
				try {
					Field field=temp.getField("tableName");
					field.set(temp, anno.value());
					System.out.println(temp.getName());
				} catch (NoSuchFieldException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
				
			}
		}
	}


	@Id
	private String sunwouId;
	
	private String createTime;
	
	private String createDate;
	
	private Boolean isDelete;
	
	public Boolean getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}


	public String getSunwouId() {
		return sunwouId;
	}


	public void setSunwouId(String sunwouId) {
		this.sunwouId = sunwouId;
	}

	
	public void  beforAdd(){
		String timeTamp=TimeUtil.formatDate(new Date(), TimeUtil.TO_S3);
		this.sunwouId="sunwou"+timeTamp;
		String time=TimeUtil.formatDate(new Date(), TimeUtil.TO_S);
		this.setCreateTime(time);
		this.setCreateDate(time.substring(0, 10));
		this.setIsDelete(false);
	}
	
	public void beforUpdate(){
		
	}
	
}
