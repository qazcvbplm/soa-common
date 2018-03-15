package sunwou.service;

import sunwou.entity.FileEntity;

public interface IFileService {

	/**
	 *  添加文件类
	 * @param file
	 * @return
	 */
	String add(FileEntity file);

}
