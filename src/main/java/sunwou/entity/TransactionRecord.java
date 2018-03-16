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
public class TransactionRecord extends MongoBaseEntity implements Serializable{

	private static final long serialVersionUID = -7096658130026119298L;
	
	@Transient
	private static String tableName = "";
	
	private String userId;
	
	//产品类型：模板/服务器/SSD
	private String proType;
	
	//模板ID
	private String modalId;
	
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

	public String getModalId() {
		return modalId;
	}

	public void setModalId(String modalId) {
		this.modalId = modalId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
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

	//交易名称
	private String name;
	
	//交易金额
	private Double price;
	
	//交易类型：普通支付/续费
	private String payType;
	
	//交易方式:支付宝/微信
	private String payStyle;
	
	
}
