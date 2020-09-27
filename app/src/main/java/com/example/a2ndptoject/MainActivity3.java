package com.example.a2ndptoject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {


    private Button b1,b2;
    private EditText e1,e2;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        getSupportActionBar().setLogo(R.drawable.as1);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
 getSupportActionBar().setDisplayHomeAsUpEnabled(true);
 getSupportActionBar().setDisplayShowHomeEnabled(true);





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if( e1.getText().toString().equals("")|| e2.getText().toString().equals("")){
                        Toast.makeText(MainActivity3.this,"Fill all the fields",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Intent in = new Intent(Intent.ACTION_SEND);
                        in.setType("text/email");
                        in.putExtra(Intent.EXTRA_EMAIL, new String[]{"ahmedabid3409@gmail.com"});
                        in.putExtra(Intent.EXTRA_SUBJECT, "Feedback From App");
                        in.putExtra(Intent.EXTRA_TEXT, "Name: " + e1.getText().toString() + "\n\n" + "Message:  " + e2.getText().toString());
                        startActivity(Intent.createChooser(in, "Feedback with"));
                        e1.setText("");
                        e2.setText("");
                    }
                } catch (Exception e) {

                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                e2.setText("");
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}