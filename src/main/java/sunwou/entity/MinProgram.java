package sunwou.entity;

import java.io.Serializable;

import sunwou.mongo.util.MongoBaseEntity;
import sunwou.mongo.util.MongoEntityAnnotation;

@MongoEntityAnnotation("minProgram")
public class MinProgram extends MongoBaseEntity implements Serializable{

	private static final long serialVersionUID = -2285525834277061756L;

	public static String tableName="";
	
}
