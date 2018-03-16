package sunwou.service;

import java.util.List;

import sunwou.entity.User;
import sunwou.mongo.util.QueryObject;

public interface IUserService {

	
	/**
	 * 查询用户列表
	 * @param qo
	 * @return   用户信息数组
	 */
	public List<User> userList(QueryObject qo);
	/**
	 * 按手机号码查询用户
	 * @param phone
	 * @return  用户实体类
	 */
	public User findByPhone(String phone);
	/**
	 * 添加用户
	 * @param user
	 * @return  用户id
	 */
	public String add(User user);
	/**
	 * 按照id查询用户
	 * @param user
	 * @return  用户实体类
	 */
	public User findById(String id);
	/**
	 * 跟新用户信息
	 * @param user
	 * @return 更新数量
	 */
	public int update(User user);

}
