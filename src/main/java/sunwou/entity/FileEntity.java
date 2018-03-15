package sunwou.entity;

import java.io.Serializable;

import sunwou.mongo.util.MongoBaseEntity;
import sunwou.mongo.util.MongoEntityAnnotation;

@MongoEntityAnnotation("fileEntity")
public class FileEntity extends MongoBaseEntity implements Serializable{

	private static final long serialVersionUID = -9014527797510484283L;

	public static String tableName="";
	
	private String host;
	
	private String path;
	
	private Long size;
	
	private String type;
	
	private String subtype;
	
	private String userId;
	
	private String appId;
	
	

	public FileEntity(String host, String path, Long size, String type, String subtype, String userId, String appId) {
		super();
		this.host = host;
		this.path = path;
		this.size = size;
		this.type = type;
		this.subtype = subtype;
		this.userId = userId;
		this.appId = appId;
	}

	public static String getTableName() {
		return tableName;
	}

	public static void setTableName(String tableName) {
		FileEntity.tableName = tableName;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}
	
	
}
