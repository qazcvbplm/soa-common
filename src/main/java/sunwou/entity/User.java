package sunwou.entity;


import java.io.Serializable;

import org.springframework.data.annotation.Transient;

import sunwou.mongo.util.MongoBaseEntity;
import sunwou.mongo.util.MongoEntityAnnotation;

@MongoEntityAnnotation("user")
public class User extends MongoBaseEntity implements Serializable{

	private static final long serialVersionUID = -5576312838982130373L;

	@Transient
	public static String tableName="";
	
	private String phone;
	
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
	
	
}
