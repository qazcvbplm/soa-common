package sunwou.service;

import java.util.List;

import sunwou.entity.Tag;
import sunwou.mongo.util.QueryObject;
import sunwou.mongo.util.UpdateObject;

public interface ITagService {

	/**
	 *添加标签
	 * @author hava
	 * @param tag
	 * @return
	 * 2018年3月20日下午4:40:46
	 */
	public String addTag(Tag tag);
	
	/**
	 * 小程序模板标签列表
	 * @author hava
	 * @param qo
	 * @return  小程序模板标签列表
	 * 2018年3月16日下午12:51:47
	 */
	public List<Tag> tagList(QueryObject qo);
	
	/**
	 * 根据模板标签id查询
	 * @author hava
	 * @param id
	 * @return 模板标签实体类
	 * 2018年3月16日下午12:53:13
	 */
	public Tag findById(String id);
	
	/**
	 * 更新模板标签信息
	 * @author hava
	 * @param tag
	 * @return 更新数量
	 * 2018年3月16日下午12:54:05
	 */
	public int update(QueryObject qo,UpdateObject uo);
}
