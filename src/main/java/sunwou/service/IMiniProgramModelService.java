package sunwou.service;

import java.util.List;

import sunwou.entity.MiniProgramModel;
import sunwou.mongo.util.QueryObject;
import sunwou.mongo.util.UpdateObject;

public interface IMiniProgramModelService {

	/**
	 * 查询小程序模板列表
	 * @author hava
	 * @param qo
	 * @return 小程序模板列表
	 * 2018年3月16日上午11:03:58
	 */
	public List<MiniProgramModel> miniProList(QueryObject qo);
	
	/**
	 * 根据id查询
	 * @author hava
	 * @param id
	 * @return 小程序模板实体类
	 * 2018年3月16日上午11:05:54
	 */
	public MiniProgramModel findById(String id);
	
	/**
	 * 添加一个小程序模板
	 * @author hava
	 * @param miniProModel
	 * @return 小程序模板id
	 * 2018年3月16日下午12:28:05
	 */
	public String addMiniProModel(MiniProgramModel miniProModel);
	
	/**
	 * 更新小程序模板信息
	 * @author hava
	 * @param miniProModel
	 * @return  更新数量
	 * 2018年3月16日下午12:29:12
	 */
	public int update(MiniProgramModel miniProModel);
	
	/**
	 * 更新小程序模板信息
	 * @author hava
	 * @param qo
	 * @param update
	 * @return
	 * 2018年3月20日下午12:34:52
	 */
	public int update(QueryObject qo,UpdateObject update);

	/**
	 * 删除小程序模板信息
	 * @author hava
	 * @param qo
	 * @return
	 * 2018年3月20日下午4:19:47
	 */
	public int remove(QueryObject qo);
}
