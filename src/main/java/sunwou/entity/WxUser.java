package sunwou.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import sunwou.mongo.util.MongoBaseEntity;
import sunwou.mongo.util.MongoEntityAnnotation;

@MongoEntityAnnotation("wxUser")
public class WxUser extends MongoBaseEntity implements Serializable{

	private static final long serialVersionUID = -1560344120609663213L;

	public static String tableName="";
	//昵称
	private String nickName;
	//头像
	private String avatarUrl;
	//手机号码
	private String phone;
	//微信用户唯一标示
	private String openid;
	//微信省份
	private String province;
	//微信城市
	private String city;
	//微信性别
	private String gender;
	//积分
	private Integer source;
	//钱包
	private BigDecimal money;

	
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getTableName() {
		return tableName;
	}

	public static void setTableName(String tableName) {
		WxUser.tableName = tableName;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	
	@Override
	public void beforAdd() {
		super.beforAdd();
		this.source=null;
		this.money=null;
	}
	
	@Override
	public void beforUpdate() {
		super.beforUpdate();
		this.source=null;
		this.money=null;
	}
	
}
