package sunwou.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Transient;

import sunwou.mongo.util.MongoBaseEntity;
import sunwou.mongo.util.MongoEntityAnnotation;

@MongoEntityAnnotation("article")
public class Article extends MongoBaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 606384023765642451L;

	@Transient
	public static String tableName = "";
	private String title;//标题
	private String sonTitle;//子标题
	private String author;//作者
	private String cover;//封面
	private String richText;//富文本
	private String access;//权限
	private String type;//文章类型
	private String userid;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSonTitle() {
		return sonTitle;
	}
	public void setSonTitle(String sonTitle) {
		this.sonTitle = sonTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getRichText() {
		return richText;
	}
	public void setRichText(String richText) {
		this.richText = richText;
	}
	public String getAccess() {
		return access;
	}
	public void setAccess(String access) {
		this.access = access;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
