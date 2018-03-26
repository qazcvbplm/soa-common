package sunwou.service;


import java.util.List;

import sunwou.entity.Exhibition;
import sunwou.mongo.util.QueryObject;

public interface IExhibitionService {

	/**
	 * 常规查询方法
	 * @param qo 条件参数
	 * @return  列表
	 */
	public List<Exhibition> find(QueryObject qo);
	
	/**
	 * 常规查询数量方法
	 * @param qo  条件参数
	 * @return  数量
	 */
	public int count(QueryObject qo);
	
	/**
	 * 更新方法
	 * @param 实体类 ex
	 * @return  更新数量
	 */
	public int update(Exhibition ex);
	
	/**
	 * 添加
	 * @author hava
	 * @param ex
	 * @return
	 * 2018年3月26日上午10:38:40
	 */
	public String add(Exhibition ex);
	
}
