package sunwou.entity;

import java.io.Serializable;
import java.util.Date;

import sunwou.mongo.util.MongoBaseEntity;
import sunwou.mongo.util.MongoEntityAnnotation;
import sunwou.mongo.util.TimeUtil;

/**
 * 展示类型表
 * @author Administrator
 */
@MongoEntityAnnotation("exhibition")
public class Exhibition extends MongoBaseEntity implements Serializable{

	private static final long serialVersionUID = -567884492356460680L;

	
	private String title;//标题
	
	private String minPrice;//最小价格
	
	private String maxPrice;//最大价格
	
	private String company;//单位
	
	private String config;//配置
	
	private String note;//说明
	
	private String sort;//排序字段
	
	private String position;//位置
	
	private String images[];//图片数组
	
	private String remark1;//预留字段
	
	private String remark2;//预留字段
	
	private String remark3;//预留字段
	
	private String richText;//富文本
	
	@Override
	public void beforAdd() {
		super.beforAdd();
		this.position=TimeUtil.formatDate(new Date(), TimeUtil.TO_S3);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public String getRemark2() {
		return remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	public String getRemark3() {
		return remark3;
	}

	public void setRemark3(String remark3) {
		this.remark3 = remark3;
	}

	public String getRichText() {
		return richText;
	}

	public void setRichText(String richText) {
		this.richText = richText;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
