package sunwou.service;

import java.util.List;


import sunwou.entity.TransactionRecord;
import sunwou.mongo.util.QueryObject;

public interface ITransactionRecordService {

	/**
	 * 添加交易记录
	 * @author hava
	 * @param transactionRecord
	 * @return
	 * 2018年3月22日下午3:38:20
	 */
	String add(TransactionRecord transactionRecord);
	/**
	 * 删除交易记录
	 * @author hava
	 * @param ids
	 * @return
	 * 2018年3月22日下午3:38:27
	 */
	int remove(String ids);
	/**
	 * 查询
	 * @author hava
	 * @param qo
	 * @return 交易记录列表
	 * 2018年3月22日下午3:38:30
	 */
	List<TransactionRecord> find(QueryObject qo);

}
