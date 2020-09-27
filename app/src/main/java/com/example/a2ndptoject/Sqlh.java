package com.example.a2ndptoject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class Sqlh extends SQLiteOpenHelper {
    private static final   String name="First.db";
    private static final  int version=8;
    private static final  String table="students";
    private static final  String c1="id";
    private static final  String c2="Name";
    private static final  String c3="Age";
    private Context c;
    String s="CREATE TABLE contacts (\n" +
            "\tcontact_id INTEGER PRIMARY KEY,\n" +
            "\tfirst_name TEXT NOT NULL,\n" +
            "\tlast_name TEXT NOT NULL,\n" +
            "\temail TEXT NOT NULL UNIQUE,\n" +
            "\tphone TEXT NOT NULL UNIQUE\n" +
            ");";
    public Sqlh(Context context) {
        super(context,
                name,
                null,
                version);
        c=context;
    }

    @Override
    public void onCreate(SQLiteDatabase sql) {
        try {
            Toast.makeText(c, "Database Created Successfully", Toast.LENGTH_SHORT).show();
            sql.execSQL(s);

        }catch(Exception e){
            Toast.makeText(c, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        Toast.makeText(c, "Database Upgraded Successfully", Toast.LENGTH_SHORT).show();
          onCreate(sqLiteDatabase);
    }
}
