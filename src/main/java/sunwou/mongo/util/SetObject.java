package sunwou.mongo.util;

import java.io.Serializable;

public class SetObject implements Serializable{

	private static final long serialVersionUID = 4909818891445474058L;

	private String name;
	
	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
