package sunwou.mongo.util;

import java.io.Serializable;

public class SortObject implements Serializable{

	private static final long serialVersionUID = -4663745615945128394L;

	private String value;
	
	private boolean asc=true;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isAsc() {
		return asc;
	}

	public void setAsc(boolean asc) {
		this.asc = asc;
	}
	
	
}
