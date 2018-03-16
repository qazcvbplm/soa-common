package sunwou.service;

import java.util.List;

import sunwou.entity.MiniProgram;
import sunwou.mongo.util.QueryObject;

public interface IMiniProgramService {

	/**
	 * 
	 * hava
	 * 2018年3月16日
	 * 上午10:10:53
	 */
	public List<MiniProgram> find(QueryObject qo);
}
