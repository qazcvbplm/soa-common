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
	public static String tableName = "";

	private String userid;// 用户编号
	private String modelName;// 模板名称
	private String funcDesc;// 功能描述
	private Object config;// 配置
	private String modelPrice;// 模板价格
	private String modelCover;// 模板封面;
	private String modelImage;// 模板图片和说明;
	private String industry;// 适用行业
	private String status;// 上下架
	private String modelStyle;// 模板风格;
	private String businssType;// 商户性质;
	private String modelType;


	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public String getFuncDesc() {
		return funcDesc;
	}

	public void setFuncDesc(String funcDesc) {
		this.funcDesc = funcDesc;
	}

	public String getModelCover() {
		return modelCover;
	}

	public Object getModelImage() {
		return modelImage;
	}


	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getModelStyle() {
		return modelStyle;
	}

	public void setModelStyle(String modelStyle) {
		this.modelStyle = modelStyle;
	}

	public String getBusinssType() {
		return businssType;
	}

	public void setBusinssType(String businssType) {
		this.businssType = businssType;
	}

	public void setModelCover(String modelCover) {
		this.modelCover = modelCover;
	}

	public void setModelImage(String modelImage) {
		this.modelImage = modelImage;
	}

	public static String getTableName() {
		return tableName;
	}

	public static void setTableName(String tableName) {
		MiniProgramModel.tableName = tableName;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
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



	public String getModelPrice() {
		return modelPrice;
	}

	public void setModelPrice(String modelPrice) {
		this.modelPrice = modelPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
