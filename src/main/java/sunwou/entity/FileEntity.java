package sunwou.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Transient;

import sunwou.mongo.util.MongoBaseEntity;
import sunwou.mongo.util.MongoEntityAnnotation;
/**
 * 文件上传实体类
 * @author Administrator
 */
@MongoEntityAnnotation("fileEntity")
public class FileEntity extends MongoBaseEntity implements Serializable{

	private static final long serialVersionUID = -9014527797510484283L;

	@Transient
	public static String tableName="";
	//文件服务器地址
	private String host;
	//文件路径
	private String path;
	//文件大小
	private Long size;
	//文件类型
	private String type;
	//文件字类型
	private String subtype;
	//用户id
	private String userId;
	//程序id
	private String appId;
	//文件原名
	private String originName;
	
	
	
	

	
	public String getOriginName() {
		return originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}

	public FileEntity(String originName,String host, String path, Long size, String type, String subtype, String userId, String appId) {
		super();
		this.originName=originName;
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
	/**
	 * 添加之前调用
	 */
	@Override
	public void beforAdd() {
		super.beforAdd();
	}
	/**
	 * 更新之前调用
	 */
	@Override
	public void beforUpdate() {
		super.beforUpdate();
	}
	
}
