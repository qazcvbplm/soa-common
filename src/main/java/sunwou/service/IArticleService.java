package sunwou.service;

import java.util.List;

import sunwou.entity.Article;
import sunwou.mongo.util.QueryObject;

public interface IArticleService {
	
	/**
	 * 查询文章
	 * @author hava
	 * @param qo
	 * @return 文章列表
	 * 2018年3月24日下午2:25:37
	 */
	public List<Article> artList(QueryObject qo);
	
	/**
	 * 添加文章
	 * @author hava
	 * @param article
	 * @return 添加成功的文章id
	 * 2018年3月24日下午2:26:38
	 */
	public String add(Article article);
	/**
	 * 修改文章内容
	 * @author hava
	 * @param article
	 * @return 修改成功数量
	 * 2018年3月24日下午2:28:08
	 */
	public int update(Article article);
	
	/**
	 * 删除文章
	 * @author hava
	 * @param ids 文章id数组
	 * @return
	 * 2018年3月24日下午2:29:36
	 */
	public int remove(String ids);
	
	/**
	 * 总天数
	 * @author hava
	 * @param qo
	 * @return
	 * 2018年3月25日上午11:51:57
	 */
	int count(QueryObject qo);

}
