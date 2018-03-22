package sunwou.entity;

import java.io.Serializable;

import sunwou.mongo.util.MongoBaseEntity;
import sunwou.mongo.util.MongoEntityAnnotation;

@MongoEntityAnnotation("fileCategory")
public class FileCategory extends MongoBaseEntity implements Serializable{

	private static final long serialVersionUID = 8942679180569602003L;
	
	public static String tableName="";

	
	private String userId;
	
	
	private String name;

	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private String sort;

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}
	
	
}
