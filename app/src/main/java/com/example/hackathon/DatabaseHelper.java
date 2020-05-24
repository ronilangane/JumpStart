package com.example.hackathon;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME="contacts.db";
    private static final String TABLE_NAME="contacts";
    //private static final String COLUMN_CPASS="cpass";
    private static final String COLUMN_NAME="name";
    private static final String COLUMN_UNAME="uname";
    private static final String COLUMN_EMAIL="email";
    private static final String COLUMN_PASS="pass";


    SQLiteDatabase db;

    private static final String TABLE_CREATE = "create table contacts (name VARCHAR(50) NOT NULL DEFAULT '' , email VARCHAR(250) NOT NULL DEFAULT '', uname VARCHAR(50) NOT NULL DEFAULT '' , pass VARCHAR(50) NOT NULL DEFAULT '' )";
    private static final String Drop_Table ="DROP TABLE IF EXISTS contacts";
    public DatabaseHelper(Context context){
        super(context , DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //db.execSQL(Drop_Table);
        db.execSQL(TABLE_CREATE);
        this.db=db;
    }
    public void insertcontact(contact c)
    {
        db=this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME,c.getName());
        values.put(COLUMN_EMAIL,c.getEmail());
        values.put(COLUMN_UNAME,c.getUname());
        values.put(COLUMN_PASS,c.getPass());
      //  values.put(COLUMN_CPASS,c.getCpass());
        db.insert(TABLE_NAME,null,values);
    }

    public String searchPass(String pass){
        db = this.getReadableDatabase();
        String query = "select uname, pass from " + TABLE_NAME;
        Cursor cursor= db.rawQuery(query, null);
        String a,b;
        b= "not found";

        if(cursor.moveToFirst()) {
            do {
                a = cursor.getString(0);
                if (a.equals(pass)) {
                    b = cursor.getString(1);
                    break;
                }


            }
            while(cursor.moveToNext());
        }
        return b;
    }
    public Cursor viewdata()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        String query =  "select uname, pass from " + TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);

        return cursor;

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query="Drop Table If Exsists"+TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);

    }
}