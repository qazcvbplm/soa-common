package sunwou.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Transient;

import sunwou.mongo.util.MongoBaseEntity;
import sunwou.mongo.util.MongoEntityAnnotation;

@MongoEntityAnnotation("tag")
public class Tag extends MongoBaseEntity implements Serializable {

	/**
	 */
	private static final long serialVersionUID = 5981175850821446818L;
	@Transient
	public static String tableName = "";

	private String tagId;
	private String tagType;
	private String tagName;
	private String num;


	public String getTagId() {
		return tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getTagType() {
		return tagType;
	}

	public void setTagType(String tagType) {
		this.tagType = tagType;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getIsremove() {
		return isremove;
	}

	public void setIsremove(String isremove) {
		this.isremove = isremove;
	}

	private String isremove;
}
