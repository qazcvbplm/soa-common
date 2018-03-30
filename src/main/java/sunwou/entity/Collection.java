package sunwou.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Transient;

import sunwou.mongo.util.MongoBaseEntity;
import sunwou.mongo.util.MongoEntityAnnotation;
@MongoEntityAnnotation("collection")
public class Collection extends MongoBaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5589916806157320007L;

	@Transient
	private static String tableName="";
	
	private String userId;
	private String miniId;
	private String collId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMiniId() {
		return miniId;
	}
	public void setMiniId(String miniId) {
		this.miniId = miniId;
	}
	public String getCollId() {
		return collId;
	}
	public void setCollId(String collId) {
		this.collId = collId;
	}
}
