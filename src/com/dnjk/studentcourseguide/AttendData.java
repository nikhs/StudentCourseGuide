package com.dnjk.studentcourseguide;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import android.database.sqlite.SQLiteOpenHelper;

public class AttendData {

	public static final String KEY_ROWID="_id";
	public static final int KEY_MONTH=1;
	public static final int KEY_DAY=1;
	public static final int KEY_ATTENDED=0;
	public static final int KEY_TOTAL=0;

	private static final String DATABASE_NAME="AtendanceDatabase";
	private static final String DATABASE_TABLE="Semester";
	private static final int DATABASE_VERSION=1;
	
	private DbHelper atthelper;
	private final Context mycontext;
	private SQLiteDatabase attdatabase;
	
	
	private static class DbHelper extends SQLiteOpenHelper{

		public DbHelper(Context context) {
			super(context, DATABASE_NAME,null,DATABASE_VERSION);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
		db.execSQL("CREATE TABLE "+DATABASE_TABLE+" ("+
			KEY_ROWID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
			KEY_MONTH+" INT, "+
			KEY_DAY+" INT, "+
			KEY_ATTENDED+ " INT, "+
			KEY_TOTAL+ " INT)"
			);	
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			
		}
		
	}



public AttendData(Context c){
	mycontext=c;
}	
public AttendData open(){
	atthelper=new DbHelper(mycontext);
	attdatabase=atthelper.getWritableDatabase();
	return this;
}

}
