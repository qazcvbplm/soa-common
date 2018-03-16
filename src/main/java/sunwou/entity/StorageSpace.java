package sunwou.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Transient;

import sunwou.mongo.util.MongoBaseEntity;
import sunwou.mongo.util.MongoEntityAnnotation;

/**
 * 存储空间
 * @author Landalf
 */
@MongoEntityAnnotation("storageSpace")
public class StorageSpace extends MongoBaseEntity implements Serializable{


	private static final long serialVersionUID = 2003796915550535356L;
	
	@Transient
	public static String tableName="";
	
	//用户ID
	private String userId ;
	
	//存储空间说明
	private String explain;
	
	//空间价格
	private Double price;
	
	//优惠
	private Object[] dsicounts;
	
	/**
	 * status状态
	 *未购买
	 *已购买
	 *即将到期
	 *请续费
	 */
	private String status;
	
	//到期时间
	private String expiryTime;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Object[] getDsicounts() {
		return dsicounts;
	}

	public void setDsicounts(Object[] dsicounts) {
		this.dsicounts = dsicounts;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getExpiryTime() {
		return expiryTime;
	}

	public void setExpiryTime(String expiryTime) {
		this.expiryTime = expiryTime;
	}
	
	
	
}
