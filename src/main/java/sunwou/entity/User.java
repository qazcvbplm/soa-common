package sunwou.entity;


import java.io.Serializable;

import org.springframework.data.annotation.Transient;

import sunwou.mongo.util.MongoBaseEntity;
import sunwou.mongo.util.MongoEntityAnnotation;

/**
 * 用户实体类
 * @author Administrator
 */
@MongoEntityAnnotation("user")
public class User extends MongoBaseEntity implements Serializable{

	private static final long serialVersionUID = -5576312838982130373L;

	@Transient
	public static String tableName="";
	//用户手机号码也是用户名
	private String phone;
	//用户密码
	private String passWord;
	
	

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public User(String phone,String passWord) {
		super();
		this.phone = phone;
		this.passWord=passWord;
	}

	
	public static String getTableName() {
		return tableName;
	}

	public static void setTableName(String tableName) {
		User.tableName = tableName;
	}

	public User() {
		super();
	}
	/**
	 * 添加之前调用
	 */
	@Override
	public void beforAdd() {
		// TODO Auto-generated method stub
		super.beforAdd();
	}
	/**
	 * 更新之前调用
	 */
	@Override
	public void beforUpdate() {
		// TODO Auto-generated method stub
		super.beforUpdate();
	}
}
