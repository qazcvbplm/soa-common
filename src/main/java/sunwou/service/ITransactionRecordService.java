package sunwou.service;

import java.util.List;


import sunwou.entity.TransactionRecord;
import sunwou.mongo.util.QueryObject;

public interface ITransactionRecordService {
	/**
	 *  添加
	 * @param file
	 * @return  id
	 */
	String add(TransactionRecord transactionRecord);
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
	List<TransactionRecord> findAll(QueryObject qo);
	/**
	 * 查询一个用户的交易记录，返回一个数值
	 * @param qo
	 * @return  文件列表
	 */
	List<TransactionRecord> findSpace(String id,QueryObject qo);
}
