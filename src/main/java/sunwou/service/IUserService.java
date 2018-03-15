package sunwou.service;

import java.util.List;

import sunwou.entity.User;
import sunwou.mongo.util.QueryObject;

public interface IUserService {

	public List<User> userList(QueryObject qo);

	/**
	 * 按手机号码查询用户
	 * @param phone
	 * @return
	 */
	public User findByPhone(String phone);

	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public String add(User user);
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public User findById(String id);

}
