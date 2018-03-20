package sunwou.mongo.util;

import java.io.Serializable;


/**
 * 查询对象
 * @author ops
 */
public class QueryObject implements Serializable{
	
	private static final long serialVersionUID = -1272810731896071772L;
	
	private String tableName;
	private String fields[];
	private SortObject  sorts[];
	private WhereObject wheres[];
	private PageObejct pages;
	private Integer count=0;
	

	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public PageObejct getPages() {
		return pages;
	}

	public void setPages(PageObejct pages) {
		this.pages = pages;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String[] getFields() {
		return fields;
	}

	public void setFields(String[] fields) {
		this.fields = fields;
	}

	public SortObject[] getSorts() {
		return sorts;
	}

	public void setSorts(SortObject[] sorts) {
		this.sorts = sorts;
	}

	public WhereObject[] getWheres() {
		return wheres;
	}

	public void setWheres(WhereObject[] wheres) {
		this.wheres = wheres;
	}
	
	
}

