package sunwou.service;

import java.util.List;

import sunwou.entity.MiniProgram;
import sunwou.mongo.util.QueryObject;
import sunwou.mongo.util.UpdateObject;

public interface IMiniProgramService {

	/**
	 * 查询小程序列表
	 * @author hava
	 * @param qo
	 * @return 小程序列表
	 * 2018年3月16日上午10:44:50
	 */
	public List<MiniProgram> miniProgramList(QueryObject qo);
	
	/**
	 * 根据id查询
	 * @author hava
	 * @param id
	 * @return 小程序实体类
	 * 2018年3月16日上午10:46:34
	 */
	public MiniProgram findById(String id);
	
	/**
	 * 添加一个小程序
	 * @author hava
	 * @param miniProgram 
	 * @return 小程序id
	 * 2018年3月16日上午10:51:19
	 */
	public String addMiniPro(MiniProgram miniProgram);
	
	/**
	 * 更新小程序信息
	 * @author hava
	 * @param miniProgram
	 * @return 更新数量
	 * 2018年3月16日上午10:52:50
	 */
	public int update(MiniProgram miniProgram);
	/**
	 * 根据appid查找小程序
	 * @author hava
	 * @param appid
	 * @return 小程序实体类
	 * 2018年3月20日上午8:57:15
	 */
	public MiniProgram findByAppid(String appid);
	/**
	 * 更新小程序信息
	 * @author hava
	 * @param qo
	 * @param update
	 * @return
	 * 2018年3月20日下午12:40:40
	 */
	public int update(QueryObject qo,UpdateObject update);
	
	/**
	 * 删除一条记录
	 * @author hava
	 * @param qo
	 * @return
	 * 2018年3月20日下午12:46:05
	 */
	public int remove(QueryObject qo);
	/**
	 * 获取查询数量
	 * @author hava
	 * @param qo
	 * @return
	 * 2018年3月21日下午2:26:14
	 */
	int count(QueryObject qo);
}
