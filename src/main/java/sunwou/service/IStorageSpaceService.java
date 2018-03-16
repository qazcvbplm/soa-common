package sunwou.service;

import java.util.List;


import sunwou.entity.StorageSpace;
import sunwou.mongo.util.QueryObject;

public interface IStorageSpaceService {

	/**
	 *  添加交易记录
	 * @param storageSpace
	 * @return  id
	 */
	String add(StorageSpace storageSpace);
	/**
	 * 批量删除
	 * @param ids  文件的id数组
	 * @return   
	 */
	int remove(String[] ids);
	/**
	 * 查询列表
	 * @param qo
	 * @return  文件列表
	 */
	List<StorageSpace> findAll(QueryObject qo);
	/**
	 * 查询一个用户的空间大小，返回一个数值
	 * @param qo
	 * @return  文件列表
	 */
	Double findSpace(String id);
	
}
