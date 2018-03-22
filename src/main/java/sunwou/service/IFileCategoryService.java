package sunwou.service;

import java.io.File;
import java.util.List;

import sunwou.entity.FileCategory;
import sunwou.mongo.util.QueryObject;

public interface IFileCategoryService {

	/**
	 * 添加方法
	 * @param fc
	 * @return
	 */
	public String add(FileCategory fc);
	/**
	 * 查询文件分类
	 * @param qo
	 * @return
	 */
	public List<FileCategory> find(QueryObject qo);
	/**
	 * 更新文件分类
	 * @param fc
	 * @return
	 */
	public int update(FileCategory fc);
}
