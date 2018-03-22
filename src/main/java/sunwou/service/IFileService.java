package sunwou.service;

import java.util.List;

import sunwou.entity.FileEntity;
import sunwou.mongo.util.QueryObject;

public interface IFileService {
	/**
	 *  添加文件类
	 * @param file
	 * @return  文件的id
	 */
	String add(FileEntity file);
	/**
	 * 批量删除文件
	 * @param ids  文件的id数组
	 * @return   实际删除数量
	 */
	int remove(String[] ids,String root);
	/**
	 * 查询文件列表
	 * @param qo
	 * @return  文件列表
	 */
	List<FileEntity> fileList(QueryObject qo);
	
	/**
	 * 返回数量
	 * @param qo
	 * @return  文件列表
	 */
	int count(QueryObject qo);
	/**
	 * 统计某个用户文件所占空间大小
	 * @param userId
	 * @return 文件总大小b
	 */
	Long userSize(String userId);
	/**
	 * 获取某个用户的文件分类
	 * @param userId 用户id
	 * @return
	 */
	List<FileEntity> findCategory(String userId);
}
