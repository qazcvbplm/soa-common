package sunwou.mongo.util;

import java.io.Serializable;

public class PageObejct implements Serializable{

	private static final long serialVersionUID = -1092635544762413954L;

	private int currentPage;
	
	private int size;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
