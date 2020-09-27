package com.example.a2ndptoject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SqlHelper extends SQLiteOpenHelper {
    private static final   String name="First.db";
    private static final  int version=2;
  private static final  String table="students";
    String c1="id";
    String c2="Name";
    String c3="Age";
    private Context c;
    String s="Create Table "+table+"( "+c1+"INTEGER PRIMARY KEY AUTOINCREMENT, "+c2+" VARCHAR(255),"+c3+" INTEGER);";
    public SqlHelper(@Nullable Context context) {
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

        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
