package sunwou.mongo.util;

import java.io.Serializable;

public class UpdateObject implements Serializable{

	private static final long serialVersionUID = 9000848583615259045L;


	private String tableName;
	
	
	private SetObject sets[];

	
	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public SetObject[] getSets() {
		return sets;
	}

	public void setSets(SetObject[] sets) {
		this.sets = sets;
	}
	
	
}
