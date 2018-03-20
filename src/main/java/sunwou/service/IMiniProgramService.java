package sunwou.service;

import java.util.List;

import sunwou.entity.MiniProgram;
import sunwou.mongo.util.QueryObject;

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
	
	public MiniProgram findByAppid(String appid);
	
}
