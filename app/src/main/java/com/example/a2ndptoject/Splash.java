package com.example.a2ndptoject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
  private TextView t4;
  private ProgressBar p1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);
        t4=(TextView) findViewById(R.id.t4);
        t4.setTextColor(Color.CYAN);
       p1=(ProgressBar) findViewById(R.id.p1);
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
            doWork();
              newIntentr();
            }
        });
        t.start();


    }

   private void newIntentr() {
        Intent i=new Intent(Splash.this,MainActivity.class);
        startActivity(i);
        finish();

    }

   private void doWork() {
        for(int i=10;i<=100;i=i+20){
            try{
                Thread.sleep(1000);
                p1.setProgress(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}