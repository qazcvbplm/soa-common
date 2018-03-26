package sunwou.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Transient;

import sunwou.mongo.util.MongoBaseEntity;
import sunwou.mongo.util.MongoEntityAnnotation;

/**
 * 通用交易记录表
 * 
 * @author Landalf
 *
 */
@MongoEntityAnnotation("transactionRecord")
public class TransactionRecord extends MongoBaseEntity implements Serializable {

	private static final long serialVersionUID = -7096658130026119298L;

	@Transient
	public static String tableName = "";

	private String userId;

	// 产品类型：模板/服务器/SSD
	private String proType;
	// 购买的使用时间
	private String runTime;

	// 流水编号
	private String name;

	// 交易金额
	private String price;

	// 交易类型：普通支付/续费
	private String payType;

	// 交易方式:支付宝/微信
	private String payStyle;

	// 模板ID
	private String modelId;
	//小程序id
	private String miniId;



	public String getMiniId() {
		return miniId;
	}

	public void setMiniId(String miniId) {
		this.miniId = miniId;
	}

	public String getRunTime() {
		return runTime;
	}

	public void setRunTime(String runTime) {
		this.runTime = runTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProType() {
		return proType;
	}

	public void setProType(String proType) {
		this.proType = proType;
	}



	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPayStyle() {
		return payStyle;
	}

	public void setPayStyle(String payStyle) {
		this.payStyle = payStyle;
	}

}
