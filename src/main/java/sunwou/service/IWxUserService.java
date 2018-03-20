package sunwou.service;

import sunwou.entity.WxUser;

public interface IWxUserService {

	/**
	 * 按openid查询用户
	 * @param openid
	 * @return
	 */
	public WxUser findByOpenid(String openid);
	
	/**
	 * 按手机号码查询用户
	 * @param phone
	 * @return
	 */
	public WxUser findByPhone(String phone);
	
	/**
	 * 添加用户
	 * @param wxUser
	 * @return
	 */
	public String add(WxUser wxUser);
	/**
	 * 按照Id更新用户
	 * @param wxUser
	 * @return
	 */
	public int updateById(WxUser wxUser);
}
