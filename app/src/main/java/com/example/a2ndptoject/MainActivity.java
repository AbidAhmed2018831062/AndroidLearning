package com.example.a2ndptoject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private ListView l1;
    ArrayAdapter<String> ad;
    private Spinner sp1;
    String c[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Sqlh s=new Sqlh(this);
        SQLiteDatabase sql=s.getWritableDatabase();

        l1=(ListView) findViewById(R.id.l1);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.as1);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
       c=getResources().getStringArray(R.array.co);
         ad=new ArrayAdapter<String>(MainActivity.this,R.layout.sample,R.id.t1,c);
        l1.setAdapter(ad);
        setTitle("As Learning");

        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    Intent in=new Intent(MainActivity.this,MainActivity2.class);
                    in.putExtra("va","0");
                    startActivity(in);
                }
                if(i==1)
                {
                    Intent in=new Intent(MainActivity.this,MainActivity2.class);
                    in.putExtra("va","1");
                    startActivity(in);
                }
                if(i==2)
                {
                    Intent in=new Intent(MainActivity.this,MainActivity2.class);
                    in.putExtra("va","2");
                    startActivity(in);
                }
                if(i==3)
                {
                    Intent in=new Intent(MainActivity.this,MainActivity2.class);
                    in.putExtra("va","3");
                    startActivity(in);
                }
                if(i==4)
                {
                    Intent in=new Intent(MainActivity.this,MainActivity2.class);
                    in.putExtra("va","4");
                    startActivity(in);
                }
                if(i==5)
                {
                    Intent in=new Intent(MainActivity.this,MainActivity2.class);
                    in.putExtra("va","5");
                    startActivity(in);
                }
                if(i==6)
                {
                    Intent in=new Intent(MainActivity.this,MainActivity2.class);
                    in.putExtra("va","6");
                    startActivity(in);
                }
                if(i==7)
                {
                    Intent in=new Intent(MainActivity.this,MainActivity2.class);
                    in.putExtra("va","7");
                    startActivity(in);
                }
                if(i==8) {
                    Intent in = new Intent(MainActivity.this, MainActivity2.class);
                    in.putExtra("va", "8");
                    startActivity(in);
                }
                if(i==9)
                {

                Intent in=new Intent(MainActivity.this,MainActivity2.class);
                    in.putExtra("va","9");
                    startActivity(in);
                }     if(i==10)
                {
                    Intent in=new Intent(MainActivity.this,MainActivity2.class);
                    in.putExtra("va","10");
                    startActivity(in);
                }
                if(i==11)
                {
                    Intent in=new Intent(MainActivity.this,MainActivity2.class);
                    in.putExtra("va","11");
                    startActivity(in);
                }
                if(i==12) {
                    Intent in = new Intent(MainActivity.this, MainActivity2.class);
                    in.putExtra("va", "12");
                    startActivity(in);
                }
                if(i==13) {
                    Intent in = new Intent(MainActivity.this, MainActivity2.class);
                    in.putExtra("va", "13");
                    startActivity(in);
                }
                if(i==14) {
                    Intent in = new Intent(MainActivity.this, MainActivity2.class);
                    in.putExtra("va", "14");
                    startActivity(in);
                }
                if(i==15) {
                    Intent in = new Intent(MainActivity.this, MainActivity2.class);
                    in.putExtra("va", "14");
                    startActivity(in);
                }
                if(i==16) {
                    Intent in = new Intent(MainActivity.this, MainActivity2.class);
                    in.putExtra("va", "16");
                    startActivity(in);
                } if(i==17)
                {
                    Intent in=new Intent(MainActivity.this,MainActivity2.class);
                    in.putExtra("va","17");
                    startActivity(in);
                } if(i==18)
                {
                    Intent in=new Intent(MainActivity.this,MainActivity2.class);
                    in.putExtra("va","18");
                    startActivity(in);
                }
                if(i==19) {
                    Intent in = new Intent(MainActivity.this, MainActivity2.class);
                    in.putExtra("va", "19");
                    startActivity(in);
                }
                if(i==20) {
                    Intent in = new Intent(MainActivity.this, MainActivity2.class);
                    in.putExtra("va", "20");
                    startActivity(in);
                }
                if(i==21) {
                    Intent in = new Intent(MainActivity.this, MainActivity2.class);
                    in.putExtra("va", "21");
                    startActivity(in);
                }
                if(i==22) {
                    Intent in = new Intent(MainActivity.this, MainActivity2.class);
                    in.putExtra("va", "22");
                    startActivity(in);
                }
                if(i==23) {
                    Intent in = new Intent(MainActivity.this, MainActivity2.class);
                    in.putExtra("va", "23");
                    startActivity(in);
                }
                if(i==24) {
                    Intent in = new Intent(MainActivity.this, MainActivity2.class);
                    in.putExtra("va", "24");
                    startActivity(in);
                }
                if(i==25) {
                    Intent in = new Intent(MainActivity.this, MainActivity2.class);
                    in.putExtra("va", "25");
                    startActivity(in);
                }
                if(i==26) {
                    Intent in = new Intent(MainActivity.this, MainActivity2.class);
                    in.putExtra("va", "26");
                    startActivity(in);
                }



            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
           MenuInflater in=getMenuInflater();
           in.inflate(R.menu.menu,menu);
           MenuItem item=menu.findItem(R.id.sv1);
        SearchView sv1=(SearchView) item.getActionView();
        sv1.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s){
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                ad.getFilter().filter(s);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.sh1) {
            Intent it = new Intent(Intent.ACTION_SEND);
            it.setType("text/plain");
            String sub = "Sharing As Learning App";
            String b = "Click the link abid to download the app";
            it.putExtra(Intent.EXTRA_SUBJECT, sub);
            it.putExtra(Intent.EXTRA_TEXT, b);
            startActivity(it);
        }
        else if(item.getItemId()==R.id.f1){
            Intent in =new Intent(MainActivity.this,MainActivity3.class);
            startActivity(in);
        }

        return super.onOptionsItemSelected(item);
    }
}