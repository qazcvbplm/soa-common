package sunwou.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import org.springframework.data.annotation.Transient;

import sunwou.mongo.util.MongoBaseEntity;
import sunwou.mongo.util.MongoEntityAnnotation;

/**
 * 小程序模板
 * 
 * @author hanyangji
 *
 */
@MongoEntityAnnotation("miniProgramModel")
public class MiniProgramModel extends MongoBaseEntity implements Serializable {

	/**
	 */
	private static final long serialVersionUID = -8193469407509113087L;
	@Transient
	private static String tableName = "";

	private String modelid;// 模板编号
	private String userid;// 用户编号
	private String modelName;// 模板名称
	private String funcDesc;// 功能描述
	private Object config;// 配置
	private Double modelPrice;// 模板价格
	private String modelCover;// 模板封面;
	private Map<Object, Object> modelImage;// 模板图片和说明;
	private Tag[] industry;// 适用行业
	private String status;// 上下架
	private Tag[] modelStyle;// 模板风格;
	private Tag[] businssType;// 模板风格;

	public String getFuncDesc() {
		return funcDesc;
	}

	public void setFuncDesc(String funcDesc) {
		this.funcDesc = funcDesc;
	}

	public String getModelCover() {
		return modelCover;
	}

	public void setModelCover(String modelCover) {
		this.modelCover = modelCover;
	}

	public Map<Object, Object> getModelImage() {
		return modelImage;
	}

	public void setModelImage(Map<Object, Object> modelImage) {
		this.modelImage = modelImage;
	}



	public static String getTableName() {
		return tableName;
	}

	public static void setTableName(String tableName) {
		MiniProgramModel.tableName = tableName;
	}

	public Tag[] getIndustry() {
		return industry;
	}

	public void setIndustry(Tag[] industry) {
		this.industry = industry;
	}

	public Tag[] getModelStyle() {
		return modelStyle;
	}

	public void setModelStyle(Tag[] modelStyle) {
		this.modelStyle = modelStyle;
	}

	public Tag[] getBusinssType() {
		return businssType;
	}

	public void setBusinssType(Tag[] businssType) {
		this.businssType = businssType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getModelid() {
		return modelid;
	}

	public void setModelid(String modelid) {
		this.modelid = modelid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Object getConfig() {
		return config;
	}

	public void setConfig(Object config) {
		this.config = config;
	}

	public Double getModelPrice() {
		return modelPrice;
	}

	public void setModelPrice(Double modelPrice) {
		this.modelPrice = modelPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
