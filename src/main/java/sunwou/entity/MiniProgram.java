package sunwou.entity;

import java.io.Serializable;

import javax.xml.crypto.Data;

import org.springframework.data.annotation.Transient;

import sunwou.mongo.util.MongoBaseEntity;
import sunwou.mongo.util.MongoEntityAnnotation;

/**
 * 小程序
 * @author hanyangji
 */
@MongoEntityAnnotation("MiniProgram")
public class MiniProgram extends MongoBaseEntity implements Serializable {

	/**
	 */
	private static final long serialVersionUID = -243653557604531560L;

	@Transient
	public static String tableName = "";
	private String userid;// 用户编号
	private String appid;
	private String appSecret;
	private String merchantNumber;// 商户号
	private String merchantSecret;// 商户秘钥
	private String appName;// 小程序名称
	private String status;// 未付款/暂停服务/服务中/即将停止服务/请续费
	private String modelId;//小程序模板id
	private String deadLine;//到期时间
	private Data deadline;

	public static String getTableName() {
		return tableName;
	}

	public static void setTableName(String tableName) {
		MiniProgram.tableName = tableName;
	}

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(String deadLine) {
		this.deadLine = deadLine;
	}

	public Data getDeadline() {
		return deadline;
	}

	public void setDeadline(Data deadline) {
		this.deadline = deadline;
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

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getAppSecret() {
		return appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

	public String getMerchantNumber() {
		return merchantNumber;
	}

	public void setMerchantNumber(String merchantNumber) {
		this.merchantNumber = merchantNumber;
	}

	public String getMerchantSecret() {
		return merchantSecret;
	}

	public void setMerchantSecret(String merchantSecret) {
		this.merchantSecret = merchantSecret;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
