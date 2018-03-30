package sunwou.service;

import java.util.List;

import sunwou.entity.Collection;
import sunwou.mongo.util.QueryObject;

public interface ICollectionService {
	
	/**
	 * 查询收藏
	 * @author hava
	 * @param qo
	 * @return
	 * 2018年3月29日下午4:50:52
	 */
	public List<Collection> collList(QueryObject qo);
	
	/**
	 * 添加收藏
	 * @author hava
	 * @param collection
	 * @return
	 * 2018年3月29日下午4:51:36
	 */
	public String add(Collection collection);
	

	/**
	 * 取消收藏
	 * @author hava
	 * @param collection
	 * @return
	 * 2018年3月29日下午4:59:36
	 */
	public int remove(Collection collection);
	
	/**
	 * 计数
	 * @author hava
	 * @param qo
	 * @return
	 * 2018年3月29日下午4:54:12
	 */
	int count(QueryObject qo);

}
