package com.dnjk.studentcourseguide;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AttendData {

	public static final String KEY_ROWID="_id";
	public static final String KEY_MONTH="month of date";
	public static final String KEY_DAY="day of month";
	public static final String KEY_ATTENDED="attendedClasses";
	public static final String KEY_TOTAL="totalClasses";

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
			KEY_DAY+" INT, "+
			KEY_MONTH+" INT, "+
			KEY_ATTENDED+ " INT, "+
			KEY_TOTAL+ " INT)"
			);	
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			onCreate(db);
		}
		
	}



public AttendData(Context c){
	mycontext=c;
}	
public AttendData open()throws SQLException{
	atthelper=new DbHelper(mycontext);
	attdatabase=atthelper.getWritableDatabase();
	return this;
}
public void close(){
	atthelper.close();
}
public long createEntry(String dayS, String monthS, String acountS, String ycountS) {
	// TODO Auto-generated method stub
	ContentValues cv= new ContentValues();
	cv.put(KEY_DAY,dayS);
	cv.put(KEY_MONTH,monthS);
	cv.put(KEY_ATTENDED,acountS);
	cv.put(KEY_TOTAL,ycountS);
	return attdatabase.insert(DATABASE_TABLE, null, cv);
	
	
	
	
}
}
