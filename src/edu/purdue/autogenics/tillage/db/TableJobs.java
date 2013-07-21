package edu.purdue.autogenics.tillage.db;

import android.database.sqlite.SQLiteDatabase;

public class TableJobs {
	// Database table
	public static final String TABLE_NAME = "jobs";
	public static final String COL_ID = "_id";
	public static final String COL_REMOTE_ID = "remote_id";
	public static final String COL_HAS_CHANGED = "has_changed";
	public static final String COL_DATE_CHANGED = "date_changed";
	public static final String COL_OPERATION_ID = "operation_id";
	public static final String COL_DATE_OF_OPERATION = "date_of_operation";
	public static final String COL_WORKER_NAME = "worker_name";
	public static final String COL_FIELD_NAME = "field_name";
	public static final String COL_DURATION = "duration";
	public static final String COL_FUEL_USED = "fuel_used";
	public static final String COL_STATUS = "status";
	public static final String COL_COMMENTS = "comments";

	public static String[] COLUMNS = { COL_ID, COL_REMOTE_ID, COL_HAS_CHANGED, 
		COL_DATE_CHANGED, COL_OPERATION_ID, COL_DATE_OF_OPERATION, 
		COL_WORKER_NAME, COL_FIELD_NAME, COL_DURATION, 
		COL_FUEL_USED, COL_STATUS, COL_COMMENTS };

	// Database creation SQL statement
	private static final String DATABASE_CREATE = "create table " 
	      + TABLE_NAME
	      + "(" 
	      + COL_ID + " integer primary key autoincrement," 
	      + COL_REMOTE_ID + " text default ''," 
	      + COL_HAS_CHANGED + " integer," 
	      + COL_DATE_CHANGED + " text,"
	      + COL_OPERATION_ID + " integer,"
	      + COL_DATE_OF_OPERATION + " text,"
	      + COL_WORKER_NAME + " text,"
	      + COL_FIELD_NAME + " text,"
	      + COL_DURATION + " integer,"
	      + COL_FUEL_USED + " real,"
	      + COL_STATUS + " integer,"
	      + COL_COMMENTS + " text"
	      + ");";

	public static void onCreate(SQLiteDatabase database) {
	  database.execSQL(DATABASE_CREATE);
	}

	public static void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
	  database.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
	  onCreate(database);
	}
}
