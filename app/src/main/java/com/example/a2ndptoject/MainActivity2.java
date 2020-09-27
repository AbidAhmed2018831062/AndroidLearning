package com.example.a2ndptoject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("As Learning");

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.as1);
        getSupportActionBar().setDisplayUseLogoEnabled(true);  getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Bundle b=getIntent().getExtras();
        if(b!=null){
            String s=b.getString("va");
            writeCode(s);
        }
    }

    private void writeCode(String s) {
        Typeface typ1 = Typeface.createFromAsset(getAssets(), "Messi/Aller_Bd.ttf");
        if (s.equals("0")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText(" DatePicker dp2=new DatePicker(this);\n\n" +
                    "            int d=dp2.getDayOfMonth();\n\n" +
                    "            int m=dp2.getMonth();\n\n" +
                    "            int y=dp2.getYear();\n\n" +
                    "            dpd=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {\n" +
                    "                @Override\n\n" +
                    "                public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {\n" +
                    "                          t1.setText(\"Date OF Birth: \"+i+\"/\"+i1+\"/\"+i2);\n" +
                    "                }\n" +
                    "            },d,m,y);\n\n" +
                    "            dpd.show();");


        }
        if (s.equals("1")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("     TimePicker tmp = new TimePicker(this);\n\n" +
                    "            int currentday = tmp.getCurrentMinute();\n\n" +
                    "            int h = tmp.getCurrentHour();\n\n" +
                    "            tpd = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {\n" +
                    "                @Override\n\n" +
                    "                public void onTimeSet(TimePicker timePicker, int i, int i1) {\n" +
                    "                    t1.setText(i + \":\" + i1);\n" +
                    "                }\n" +
                    "            }, currentday, h, true);\n\n" +
                    "            tpd.show();");


        }
        if (s.equals("2")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("  AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);\n\n" +
                    "            alert.setTitle(\"Alert\");\n\n" +
                    "            alert.setMessage(\"Do you want to exit?\");\n\n" +
                    "            alert.setPositiveButton(\"Yes\", new DialogInterface.OnClickListener() {\n" +
                    "                @Override\n" +
                    "                public void onClick(DialogInterface dialogInterface, int i) {\n" +
                    "                    finish();\n\n" +
                    "                }\n\n" +
                    "            });\n\n" +
                    "            alert.setNegativeButton(\"No\", new DialogInterface.OnClickListener() {\n" +
                    "                @Override\n\n" +
                    "                public void onClick(DialogInterface dialogInterface, int i) {\n" +
                    "                    dialogInterface.cancel();\n\n" +
                    "                }\n\n" +
                    "            });\n\n" +
                    "            alert.setNeutralButton(\"Yes\", new DialogInterface.OnClickListener() {\n" +
                    "                @Override\n\n" +
                    "                public void onClick(DialogInterface dialogInterface, int i) {\n" +
                    "\n" +
                    "                }\n\n" +
                    "            });\n" +
                    "            AlertDialog alert1=alert.create();\n\nalert1.show();\n\n\n\n\n\n\n");


        }
        if (s.equals("3")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Custom Toast code:\n\n" +
                    "LayoutInflater in=getLayoutInflater();\n\n" +
                    "          View v=  in.inflate(R.layout.customlayout,(ViewGroup) findViewById(R.id.l1));\n" +
                    "            Toast t=new Toast(MainActivity.this);\n\n" +
                    "            t.setDuration(Toast.LENGTH_SHORT);\n\n" +
                    "            t.setView(v);\n" +
                    "            t.show();\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
        if (s.equals("4")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Intent Cdoe:\n\n\n" +
                    "From the class  we are sending data:\n\n" +
                    " Intent in=new Intent(MainActivity.this,MainActivity2.class);\n\n" +
                    "             in.putExtra(\"name\",\"Bangladesh\");\n\n" +
                    "             startActivity(in);" +
                    "For the class we are sending data:\n\n" +
                    "   Bundle b=getIntent().getExtras();\n\n" +
                    "        if(b!=null){\n\n" +
                    "            String s=b.getString(\"va\");\n\n" +
                    "            writeCode(s);\n\n" +
                    "        }\n\n\n\n\n\n\n");

        }
        if (s.equals("5")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Opening another activity:\n\n" +
                    "  b1.setOnClickListener(new View.OnClickListener() {\n\n" +
                    "           @Override\n" +
                    "           public void onClick(View view) {\n\n" +
                    "               Intent in=new Intent(MainActivity.this,MainActivity2.class);\n\n" +
                    "               startActivityForResult(in,1);\n\n" +
                    "           }\n\n" +
                    "       });\n\n" +
                    "Sending data to the previous activity\n\n" +
                    "    b1.setOnClickListener(new View.OnClickListener() {\n\n" +
                    "            @Override\n" +
                    "            public void onClick(View view) {\n\n" +
                    "                Intent in=new Intent(MainActivity2.this,MainActivity.class);\n\n" +
                    "                in.putExtra(\"name\",ed1.getText().toString());\n\n" +
                    "                setResult(1,in);\n\n" +
                    "\n" +
                    "                finish();\n\n" +
                    "            }\n" +
                    "        });" +
                    "Recieiving Data from another intent:\n\n" +
                    " protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {\n" +
                    "        super.onActivityResult(requestCode, resultCode, data);\n\n" +
                    "        if(requestCode==1){\n\n" +
                    "            String s=data.getStringExtra(\"name\");\n\n" +
                    "            t1.setText(s);\n\n" +
                    "        }\n\n" +
                    "    }\n\n\n\n\n\n\n");
        }
        if (s.equals("6")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Custom Adapter code:\n\n" +
                    "package com.example.webapplication;\n" +
                    "\n" +
                    "import android.content.Context;\n" +
                    "import android.view.LayoutInflater;\n" +
                    "import android.view.View;\n" +
                    "import android.view.ViewGroup;\n" +
                    "import android.widget.BaseAdapter;\n" +
                    "import android.widget.ImageView;\n" +
                    "import android.widget.TextView;\n" +
                    "\n" +
                    "import com.example.webapplication.R;\n" +
                    "\n" +
                    "public class MainActivity2 extends BaseAdapter {\n" +
                    "\n" +
                    "    int[] f;\n" +
                    "    private String[] country;\n" +
                    "    private Context c;\n" +
                    "  LayoutInflater in;\n" +
                    "    MainActivity2(Context context,String[] country,int f[]) {\n" +
                    "        this.c=context;\n" +
                    "        this.country=country;\n" +
                    "        this.f=f;\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public int getCount() {\n" +
                    "        return country.length;\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public Object getItem(int i) {\n" +
                    "        return null;\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public long getItemId(int i) {\n" +
                    "        return 0;\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public View getView(int i, View view, ViewGroup viewGroup) {\n" +
                    "        if(view==null){\n" +
                    "            in=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);\n" +
                    "            view=in.inflate(R.layout.activity2,viewGroup,false);\n" +
                    "\n" +
                    "        }\n" +
                    "        ImageView iv1=(ImageView)view.findViewById(R.id.iv1);\n" +
                    "        TextView t1=(TextView)view.findViewById(R.id.t1);\n" +
                    "        iv1.setImageResource(f[i]);\n" +
                    "        t1.setText(country[i]);\n" +
                    "\n" +
                    "        return view;\n" +
                    "    }\n" +
                    "}\n\n\n\n\n\n\n\n");
        }

        if (s.equals("7")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Code For creating menu:\n\n" +
                    "Java code:\n\n" +
                    "  public boolean onCreateOptionsMenu(Menu menu) {\n" +
                    "        MenuInflater in=getMenuInflater();\n" +
                    "        in.inflate(R.menu.menufile,menu);\n" +
                    "        return super.onCreateOptionsMenu(menu);\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public boolean onOptionsItemSelected(@NonNull MenuItem item) {\n" +
                    "\n" +
                    "        return super.onOptionsItemSelected(item);\n" +
                    "    }" +
                    "Code for Xmf file:" +
                    "\n\n<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<menu xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\">\n" +
                    "    <item\n" +
                    "        android:id=\"@+id/share\"\n" +
                    "        android:title=\"Share\"\n" +
                    "        android:icon=\"@drawable/ic_baseline_share_24\"\n" +
                    "       app:showAsAction=\"always\">\n" +
                    "\n" +
                    "    </item>\n" +
                    "    <item\n" +
                    "        android:id=\"@+id/setting\"\n" +
                    "        android:icon=\"@drawable/ic_baseline_settings_24\"\n" +
                    "        app:showAsAction=\"always\"></item>\n" +
                    "\n" +
                    "</menu>\n\n\n\n\n\n\n");


        }
        if (s.equals("8")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
        t1.setText("Code for Action Bar Search View:\n\nCode For Java file:\n\n" +
                " public boolean onCreateOptionsMenu(Menu menu) {\n" +
                "           MenuInflater in=getMenuInflater();\n" +
                "           in.inflate(R.menu.menu,menu);\n" +
                "        MenuItem mi=menu.findItem(R.id.sv1);\n" +
                "        SearchView sv1=(SearchView) mi.getActionView();\n" +
                "        sv1.setOnQueryTextListener(new SearchView.OnQueryTextListener() {\n" +
                "            @Override\n" +
                "            public boolean onQueryTextSubmit(String s) {\n" +
                "                return false;\n" +
                "            }\n" +
                "\n" +
                "            @Override\n" +
                "            public boolean onQueryTextChange(String s) {\n" +
                "                ad.getFilter().filter(s);\n" +
                "                return false;\n" +
                "            }\n" +
                "        });\n" +
                "        return super.onCreateOptionsMenu(menu);\n" +
                "    }"
                + "\n\nCode for Xml FIle" +
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<menu xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\">\n" +
                "    <item\n" +
                "        android:id=\"@+id/sv1\"\n" +
                "        android:title=\"Share\"\n" +
                "        android:icon=\"@drawable/ic_baseline_search_24\"\n" +
                "        app:showAsAction=\"always\"\n" +
                "        app:actionViewClass=\"android.widget.SearchView\">\n" +
                "\n" +
                "    </item>\n" +
                "</menu>\n\n\n\n\n\n\n");
    }
        if (s.equals("9")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Code for Java file:\n\n"+
                    "WebView wv1=(WebView) (findViewById(R.id.wv1\n\nWebSettings wvs=wv1.getSettings()\n\n"+
                    "wvs.setJavaScriptEnabled(true)\n\nwv1.setWebViewClient(new WebViewClient())\n\nwvs.loadUrl(website link)\n\n"+
                    "Code for Manifest file:\n\n"+
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    package=\"com.example.webapplication\">\n" +
                    "    \n" +
                    "    <uses-permission android:name=\"android.permission.INTERNET\"></uses-permission>\n" +
                    "    <application\n" +
                    "        android:allowBackup=\"true\"\n" +
                    "        android:icon=\"@drawable/ban\"\n" +
                    "        android:label=\"@string/app_name\"\n" +
                    "        android:roundIcon=\"@drawable/ban\"\n" +
                    "        android:supportsRtl=\"true\"\n" +
                    "        android:theme=\"@style/AppTheme\">\n" +
                    "        <activity android:name=\".MainActivity\">\n" +
                    "            <intent-filter>\n" +
                    "                <action android:name=\"android.intent.action.MAIN\" />\n" +
                    "\n" +
                    "                <category android:name=\"android.intent.category.LAUNCHER\" />\n" +
                    "            </intent-filter>\n" +
                    "        </activity>\n" +
                    "\n" +
                    "    </application>\n" +
                    "\n" +
                    "</manifest>\n\n\n\n\n\n\n");
        }
        if (s.equals("10")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Code for Spinner:\n\n" +
                    "   sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {\n\n" +
                    "          @Override\n" +
                    "          public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {\n\n" +
                    "             Toast.makeText(getApplicationContext(),c[i]+\"is selected\",Toast.LENGTH_SHORT).show();\n\n" +
                    "          }\n\n" +
                    "\n" +
                    "          @Override\n\n" +
                    "          @Override\n\n" +
                    "          public void onNothingSelected(AdapterView<?> adapterView) {\n" +
                    "\n" +
                    "          }\n\n" +
                    "      });\n\n\n\n\n\n\n");
        }  if (s.equals("11")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Code for Xml File:\n\n" +
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    tools:context=\".MainActivity\">\n" +
                    "\n" +
                    "\n" +
                    "<ImageButton\n" +
                    "    android:id=\"@+id/ib1\"\n" +
                    "    android:layout_width=\"100dp\"\n" +
                    "    android:layout_height=\"30dp\"\n" +
                    "    android:src=\"@drawable/ic_baseline_play_arrow_24\"\n" +
                    "    android:onClick=\"play\"\n" +
                    "    android:textSize=\"30dp\">\n" +
                    "\n" +
                    "</ImageButton>\n" +
                    "\n" +
                    "</LinearLayout" +
                    "\n\nCode for Java File:\n\n" +
                    "package com.example.countryprofile;\n" +
                    "\n" +
                    "import androidx.appcompat.app.AppCompatActivity;\n" +
                    "\n" +
                    "import android.media.MediaPlayer;\n" +
                    "import android.os.Bundle;\n" +
                    "import android.view.View;\n" +
                    "import android.widget.Toast;\n" +
                    "\n" +
                    "import static android.media.MediaPlayer.create;\n" +
                    "\n" +
                    "public class MainActivity extends AppCompatActivity {\n" +
                    "MediaPlayer md;\n" +
                    "\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void onCreate(Bundle savedInstanceState) {\n" +
                    "        super.onCreate(savedInstanceState);\n" +
                    "        setContentView(R.layout.activity_main);\n" +
                    "        md= MediaPlayer.create(this,R.raw.mi);\n" +
                    "    }\n" +
                    "\n" +
                    "    public void play(View view) {\n" +
                    "        md.start();\n" +
                    "\n" +
                    "    }\n\n\n\n\n\n\n\n" );

        }
        if (s.equals("12")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Code for Xml File:\n\n" +
                    " <item\n" +
                    "        android:id=\"@+id/sh1\"\n" +
                    "        android:title=\"Share\"\n" +
                    "        android:icon=\"@drawable/ic_baseline_share_24\"\n" +
                    "        app:showAsAction=\"always\"\n" +
                    "       >\n" +
                    "\n" +
                    "    </item>\n\n" +
                    "Code For Java file:\n\n" +
                    "public boolean onCreateOptionsMenu(Menu menu) {\n" +
                    "           MenuInflater in=getMenuInflater();\n" +
                    "           in.inflate(R.menu.menu,menu);\n" +
                    "\n" +
                    "        return super.onCreateOptionsMenu(menu);\n" +
                    "    }\n\n" +
                    "  public boolean onOptionsItemSelected(@NonNull MenuItem item) {\n" +
                    "        if(item.getItemId()==R.id.sh1) {\n" +
                    "            Intent it = new Intent(Intent.ACTION_SEND);\n" +
                    "            it.setType(\"text/plain\");\n" +
                    "            String sub = \"Sharing As Learning App\";\n" +
                    "            String b = \"Click the link abid to download the app\";\n" +
                    "            it.putExtra(Intent.EXTRA_SUBJECT, sub);\n" +
                    "            it.putExtra(Intent.EXTRA_TEXT, b);\n" +
                    "            startActivity(it);\n" +
                    "        }" +
                    "\n\n  return super.onOptionsItemSelected(item);\n" +
                    "    }\n\n\n\n\n\n\n");
        }
        if (s.equals("13")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Code For Menu Xml File:\n\n" +
                    "<item\n" +
                    "    android:id=\"@+id/f1\"\n" +
                    "    android:title=\"Feedback\"\n" +
                    "    app:showAsAction=\"never\"\n" +
                    "    >\n\n" +
                    "Code For Java file:\n\n" +
                    "Cliking the menu item and creating new activity:\n\n" +
                    "  Intent in =new Intent(MainActivity.this,MainActivity3.class);\n" +
                    "            startActivity(in);" +
                    "Code for new Activity xml file:\n\n" +
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "\n" +
                    "    android:background=\"@drawable/gradient\"\n" +
                    "    android:orientation=\"vertical\"\n" +
                    "    tools:context=\".MainActivity3\"\n" +
                    "\n" +
                    "    >\n" +
                    "    <EditText\n" +
                    "        android:id=\"@+id/e1\"\n" +
                    "         android:layout_margin=\"100px\"\n" +
                    "        android:hint=\"Enter Your Name\"\n" +
                    "\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\">\n" +
                    "\n" +
                    "    </EditText>\n" +
                    "    <EditText\n" +
                    "        android:id=\"@+id/e2\"\n" +
                    "        android:layout_margin=\"100px\"\n" +
                    "        android:hint=\"Enter Your Message\"\n" +
                    "\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\"></EditText>\n" +
                    "\n" +
                    "    <LinearLayout\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:gravity=\"center\">\n" +
                    "        <Button\n" +
                    "    android:id=\"@+id/b1\"\n" +
                    "        android:layout_margin=\"100px\"\n" +
                    "       android:text=\"Send\"\n" +
                    "\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"wrap_content\"></Button>\n" +
                    "        <Button\n" +
                    "            android:id=\"@+id/b2\"\n" +
                    "            android:layout_margin=\"100px\"\n" +
                    "            android:layout_marginLeft=\"30px\"\n" +
                    "            android:text=\"Clear\"\n" +
                    "\n" +
                    "            android:layout_width=\"wrap_content\"\n" +
                    "            android:layout_height=\"wrap_content\"></Button>\n" +
                    "    </LinearLayout>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "</LinearLayout>" +
                    "Code for java file:\n\n" +
                    "package com.example.a2ndptoject;\n" +
                    "\n" +
                    "import androidx.appcompat.app.AppCompatActivity;\n" +
                    "\n" +
                    "import android.content.Intent;\n" +
                    "import android.os.Bundle;\n" +
                    "import android.view.View;\n" +
                    "import android.widget.Button;\n" +
                    "import android.widget.EditText;\n" +
                    "\n" +
                    "public class MainActivity3 extends AppCompatActivity {\n" +
                    "\n" +
                    "\n" +
                    "    private Button b1,b2;\n" +
                    "    private EditText e1,e2;\n" +
                    "    @Override\n" +
                    "    protected void onCreate(Bundle savedInstanceState) {\n" +
                    "\n" +
                    "        super.onCreate(savedInstanceState);\n" +
                    "        setContentView(R.layout.feedback);\n" +
                    "        e1=(EditText)findViewById(R.id.e1);\n" +
                    "        e2=(EditText)findViewById(R.id.e2);\n" +
                    "        b1=(Button)findViewById(R.id.b1);\n" +
                    "        b2=(Button)findViewById(R.id.b2);\n" +
                    "        b1.setOnClickListener(new View.OnClickListener() {\n" +
                    "            @Override\n" +
                    "            public void onClick(View view) {\n" +
                    "                Intent in=new Intent(Intent.ACTION_SEND);\n" +
                    "                 in.setType(\"text/email\");\n" +
                    "                 in.putExtra(Intent.EXTRA_EMAIL,new String[]{\"ahmedabid3409@gmail.com\"} );\n" +
                    "                 in.putExtra(Intent.EXTRA_SUBJECT,\"Feedback From App\");\n" +
                    "                 in.putExtra(Intent.EXTRA_TEXT,\"Name: \"+e1.getText().toString()+\"\\n\\n\"+\"Message:  \"+e2.getText().toString());\n" +
                    "                 startActivity(Intent.createChooser(in,\"Feedback with\"));\n" +
                    "                 e1.setText(\"\");\n" +
                    "                 e2.setText(\"\");\n" +
                    "            }\n" +
                    "        });\n" +
                    "        b2.setOnClickListener(new View.OnClickListener() {\n" +
                    "            @Override\n" +
                    "            public void onClick(View view) {\n" +
                    "                e1.setText(\"\");\n" +
                    "                e2.setText(\"\");\n" +
                    "            }\n" +
                    "        });\n" +
                    "\n" +
                    "\n" +
                    "    }\n" +
                    "}\n\n\n\n\n\n\n");
        }
        if (s.equals("14")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Code for Xml file:\n\n" +
                    "<AutoCompleteTextView\n" +
                    "    android:id=\"@+id/act1\"\n" +
                    "    android:layout_margin=\"100px\"\n" +
                    "    android:hint=\"Enter your country name\"\n" +
                    "    android:textStyle=\"bold|italic\"\n" +
                    "    android:textColorHint=\"#6A0909\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"wrap_content\"></AutoCompleteTextView>\n\n" +
                    "Code for Java file:\n\n" +
                    "import androidx.appcompat.app.AppCompatActivity;\n" +
                    "\n" +
                    "import android.media.MediaPlayer;\n" +
                    "import android.os.Bundle;\n" +
                    "import android.view.View;\n" +
                    "import android.widget.ArrayAdapter;\n" +
                    "import android.widget.AutoCompleteTextView;\n" +
                    "import android.widget.Toast;\n" +
                    "\n" +
                    "import static android.media.MediaPlayer.create;\n" +
                    "\n" +
                    "public class MainActivity extends AppCompatActivity {\n" +
                    "\n" +
                    "\n" +
                    "private AutoCompleteTextView act1;\n" +
                    "    @Override\n" +
                    "    protected void onCreate(Bundle savedInstanceState) {\n" +
                    "        super.onCreate(savedInstanceState);\n" +
                    "        setContentView(R.layout.activity_main);\n" +
                    "\n" +
                    "        act1=(AutoCompleteTextView)findViewById(R.id.act1);\n" +
                    "        String[] c=getResources().getStringArray(R.array.country);\n" +
                    "        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,c);\n" +
                    "        act1.setThreshold(1);\n" +
                    "        act1.setAdapter(ad);\n" +
                    "    }\n\n}\n\n\n\n\n\n\n");
        }
        if (s.equals("15")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Code fro Xml File:\n\n" +
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"wrap_content\"\n" +
                    "    tools:context=\".MainActivity\"\n" +
                    "    android:orientation=\"vertical\">\n" +
                    "    <ExpandableListView\n" +
                    "        android:id=\"@+id/l1\"\n" +
                    "        android:background=\"@drawable/gradient\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"match_parent\"\n" +
                    "        ></ExpandableListView>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "</LinearLayout>\n\n" +
                    "Code for Java file:\n\n" +
                    "\n" +
                    "\n" +
                    "package com.example.countryprofile;\n" +
                    "\n" +
                    "import androidx.annotation.NonNull;\n" +
                    "import androidx.appcompat.app.AppCompatActivity;\n" +
                    "\n" +
                    "import android.content.Intent;\n" +
                    "import android.os.Bundle;\n" +
                    "import android.view.Menu;\n" +
                    "import android.view.MenuInflater;\n" +
                    "import android.view.MenuItem;\n" +
                    "import android.view.View;\n" +
                    "import android.widget.ArrayAdapter;\n" +
                    "import android.widget.ExpandableListView;\n" +
                    "import android.widget.ListView;\n" +
                    "import android.widget.SearchView;\n" +
                    "import android.widget.Toast;\n" +
                    "\n" +
                    "import com.example.countryprofile.CustomAdapter;\n" +
                    "import com.example.countryprofile.R;\n" +
                    "\n" +
                    "import java.util.ArrayList;\n" +
                    "import java.util.HashMap;\n" +
                    "import java.util.List;\n" +
                    "\n" +
                    "public class MainActivity extends AppCompatActivity {\n" +
                    "\n" +
                    "\n" +
                    "    private ExpandableListView l1;\n" +
                    "    String[] c;\n" +
                    "    String[] h;\n" +
                    "    List<String> li;\n" +
                    "    int i1=-1;\n" +
                    "    HashMap<String, List<String>> hmp;\n" +
                    "    @Override\n" +
                    "    protected void onCreate(Bundle savedInstanceState) {\n" +
                    "        super.onCreate(savedInstanceState);\n" +
                    "        setContentView(R.layout.activity_main);\n" +
                    "        h=getResources().getStringArray(R.array.co);\n" +
                    "        c=getResources().getStringArray(R.array.child);\n" +
                    "        preparedata();\n" +
                    "        l1=(ExpandableListView) findViewById(R.id.l1);\n" +
                    "        CustomAdapter ad=new CustomAdapter(this,li,hmp);\n" +
                    "        l1.setAdapter(ad);\n" +
                    "        l1.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {\n" +
                    "            @Override\n" +
                    "            public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long l) {\n" +
                    "           \n" +
                    "            }\n" +
                    "        });\n" +
                    "        l1.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {\n" +
                    "            @Override\n" +
                    "            public void onGroupCollapse(int i) {\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "            }\n" +
                    "        });\n" +
                    "        l1.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {\n" +
                    "            @Override\n" +
                    "            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {\n" +
                    "                Toast.makeText(getApplicationContext(),\"This is child\",Toast.LENGTH_SHORT).show();\n" +
                    "             /*  */\n" +
                    "                return false;\n" +
                    "            }\n" +
                    "        });\n" +
                    "        l1.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {\n" +
                    "            @Override\n" +
                    "            public void onGroupExpand(int i) {\n" +
                    "                if(i1!=-1&&i1!=i)\n" +
                    "                {\n" +
                    "                    l1.collapseGroup(i1);\n" +
                    "\n" +
                    "                }\n" +
                    "                i1=i;\n" +
                    "            }\n" +
                    "        });\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public boolean onCreateOptionsMenu(Menu menu) {\n" +
                    "        MenuInflater in=getMenuInflater();\n" +
                    "        in.inflate(R.menu.search,menu);\n" +
                    "\n" +
                    "        return super.onCreateOptionsMenu(menu);\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public boolean onOptionsItemSelected(@NonNull MenuItem item) {\n" +
                    "        if(item.getItemId()==R.id.sv1)\n" +
                    "        {\n" +
                    "            SearchView sv1= (SearchView) item.getActionView();\n" +
                    "            sv1.setOnQueryTextListener(new SearchView.OnQueryTextListener() {\n" +
                    "                @Override\n" +
                    "                public boolean onQueryTextSubmit(String s) {\n" +
                    "                    return false;\n" +
                    "                }\n" +
                    "\n" +
                    "                @Override\n" +
                    "                public boolean onQueryTextChange(String s) {\n" +
                    "                    ArrayAdapter<String> ad1=new ArrayAdapter<>(MainActivity.this,R.layout.header,R.id.t1,h);\n" +
                    "\n" +
                    "                    return false;\n" +
                    "                }\n" +
                    "            });\n" +
                    "        }\n" +
                    "        return super.onOptionsItemSelected(item);\n" +
                    "    }\n" +
                    "\n" +
                    "    private void preparedata() {\n" +
                    "\n" +
                    "        li=new ArrayList<>();\n" +
                    "        hmp=new HashMap<>();\n" +
                    "        for(int i=0;i<h.length;i++)\n" +
                    "        {\n" +
                    "            li.add(h[i]);\n" +
                    "            List<String> ch=new ArrayList<>();\n" +
                    "            ch.add(c[i]);\n" +
                    "            hmp.put(li.get(i),ch);\n" +
                    "\n" +
                    "        }\n" +
                    "\n" +
                    "    }\n" +
                    "}\n\n" +
                    "Code fro Custom Adapter file:\n\n" +
                    "package com.example.countryprofile;\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "import android.content.Context;\n" +
                    "import android.view.LayoutInflater;\n" +
                    "import android.view.View;\n" +
                    "import android.view.ViewGroup;\n" +
                    "import android.widget.BaseExpandableListAdapter;\n" +
                    "import android.widget.TextView;\n" +
                    "\n" +
                    "import java.util.HashMap;\n" +
                    "import java.util.List;\n" +
                    "\n" +
                    "public class CustomAdapter extends BaseExpandableListAdapter {\n" +
                    "    List<String> li;\n" +
                    "    HashMap<String, List<String>> hmp;\n" +
                    "    Context c;\n" +
                    "    public CustomAdapter(Context c, List<String> li, HashMap<String, List<String>> hmp) {\n" +
                    "        this.c=c;\n" +
                    "        this.li=li;\n" +
                    "        this.hmp=hmp;\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public int getGroupCount() {\n" +
                    "        return li.size();\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public int getChildrenCount(int i) {\n" +
                    "        return hmp.get(li.get(i)).size();\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public Object getGroup(int i) {\n" +
                    "        return li.get(i);\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public Object getChild(int i, int i1) {\n" +
                    "        return hmp.get(li.get(i)).get(i1);\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public long getGroupId(int i) {\n" +
                    "        return i;\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public long getChildId(int i, int i1) {\n" +
                    "        return i1;\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public boolean hasStableIds() {\n" +
                    "        return false;\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {\n" +
                    "        String s=getGroup(i).toString();\n" +
                    "        if(view==null){\n" +
                    "            LayoutInflater in= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);\n" +
                    "            view=in.inflate(R.layout.header,null);\n" +
                    "\n" +
                    "        }\n" +
                    "\n" +
                    "        TextView t1=view.findViewById(R.id.t1);\n" +
                    "        t1.setText(s);\n" +
                    "        return view;\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {\n" +
                    "        String s=getChild(i,i1).toString();\n" +
                    "        if(view==null){\n" +
                    "            LayoutInflater in= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);\n" +
                    "            view=in.inflate(R.layout.child,null);\n" +
                    "\n" +
                    "        }\n" +
                    "        TextView t2=view.findViewById(R.id.t2);\n" +
                    "        t2.setText(s);\n" +
                    "        return view;\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public boolean isChildSelectable(int i, int i1) {\n" +
                    "\n" +
                    "        return true;\n" +
                    "    }\n" +
                    "\n" +
                    "}\n\n\n\n\n\n\n");
        }
        if (s.equals("16")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("code for Xml File:\n\n"+
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    tools:context=\".MainActivity\"\n" +
                    "    android:weightSum=\"3\">\n" +
                    "    <LinearLayout\n" +
                    "        android:layout_weight=\"1\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"wrap_content\">\n" +
                    "        <ListView\n" +
                    "            android:id=\"@+id/l1\"\n" +
                    "            android:layout_width=\"wrap_content\"\n" +
                    "            android:layout_height=\"wrap_content\"\n" +
                    "            android:listSelector=\"#CDDC39\"\n" +
                    "            android:divider=\"#E91E63\"\n" +
                    "            android:dividerHeight=\"10px\"></ListView>\n" +
                    "    </LinearLayout>\n" +
                    "    <LinearLayout\n" +
                    "        android:layout_weight=\"2\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_height=\"match_parent\">\n" +
                    "        <fragment\n" +
                    "            android:name=\"com.example.datepicker.BlankFragment\"\n" +
                    "            android:id=\"@+id/f1\"\n" +
                    "            android:layout_width=\"match_parent\"\n" +
                    "            android:layout_height=\"match_parent\">\n" +
                    "        </fragment>\n" +
                    "    </LinearLayout>\n" +
                    "\n" +
                    "\n" +
                    "</LinearLayout>\n\n"+
                    "Code for Java file:\n\n"+
                    "package com.example.datepicker;\n" +
                    "\n" +
                    "import androidx.appcompat.app.AppCompatActivity;\n" +
                    "import android.app.Fragment;\n" +
                    "\n" +
                    "import android.os.Bundle;\n" +
                    "import android.view.View;\n" +
                    "import android.widget.AdapterView;\n" +
                    "import android.widget.ArrayAdapter;\n" +
                    "import android.widget.ListView;\n" +
                    "\n" +
                    "public class MainActivity extends AppCompatActivity {\n" +
                    "private ListView l1;\n" +
                    "String[] c;\n" +
                    "    @Override\n" +
                    "    protected void onCreate(Bundle savedInstanceState) {\n" +
                    "        super.onCreate(savedInstanceState);\n" +
                    "        setContentView(R.layout.activity_main);\n" +
                    "        l1=(ListView) findViewById(R.id.l1);\n" +
                    "        c=getResources().getStringArray(R.array.player);\n" +
                    "        ArrayAdapter<String> ad=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,c);\n" +
                    "        l1.setAdapter(ad);\n" +
                    "        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {\n" +
                    "            @Override\n" +
                    "            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {\n" +
                    "                Fragment f;\n" +
                    "                if(i==0)\n" +
                    "                {\n" +
                    "                   f=new BlankFragment();\n" +
                    "                getFragmentManager().beginTransaction().replace(R.id.f1, f).commit();\n" +
                    "                }\n" +
                    "            }\n" +
                    "        });\n" +
                    "\n" +
                    "    }\n" +
                    "}\n\n\n"+
                    "Code for fragment xml file:\n\n"+
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    tools:context=\"com.example.datepicker.BlankFragment\"\n" +
                    "    android:background=\"@drawable/gradient\"\n" +
                    "    android:gravity=\"center\"\n" +
                    "\n" +
                    "   >\n" +
                    "    <LinearLayout\n" +
                    "        android:layout_margin=\"200px\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:id=\"@+id/lin1\"\n" +
                    "        android:orientation=\"vertical\"\n" +
                    "        android:gravity=\"center\"\n" +
                    "      >\n" +
                    "\n" +
                    "        <ImageView\n" +
                    "            android:layout_width=\"200dp\"\n" +
                    "            android:layout_height=\"50dp\"\n" +
                    "            android:gravity=\"center\"\n" +
                    "            android:src=\"@drawable/korea\"></ImageView>\n" +
                    "\n" +
                    "        <TextView\n" +
                    "        android:textColor=\"#fff\"\n" +
                    "        android:gravity=\"center\"\n" +
                    "        android:layout_margin=\"100px\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:text=\"Korea \"/>\n" +
                    "\n" +
                    "    </LinearLayout>\n" +
                    "\n" +
                    "</FrameLayout>\n\n\n\n"+
                    "Code for Fragment Java file:\n\n"+
                    "package com.example.datepicker;\n" +
                    "\n" +
                    "import android.os.Bundle;\n" +
                    "\n" +
                    "import android.app.Fragment;\n" +
                    "\n" +
                    "import android.view.LayoutInflater;\n" +
                    "import android.view.View;\n" +
                    "import android.view.ViewGroup;\n" +
                    "\n" +
                    "\n" +
                    "public class BlankFragment extends Fragment {\n" +
                    "\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public View onCreateView(LayoutInflater inflater, ViewGroup container,\n" +
                    "                             Bundle savedInstanceState) {\n" +
                    "\n" +
                    "        return inflater.inflate(R.layout.fragment_blank, container, false);\n" +
                    "    }\n" +
                    "}\n\n\n\n\n\n\n");
        }
        if (s.equals("17")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Code for Xml File:\n\n\n"+
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    tools:context=\".MainActivity\"\n" +
                    "    android:gravity=\"center\">\n" +
                    "    <androidx.cardview.widget.CardView\n" +
                    "        android:foreground=\"?android:attr/selectableItemBackground\"\n" +
                    "\n" +
                    "        android:clickable=\"true\"\n" +
                    "    android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:id=\"@+id/card1\"\n" +
                    "        android:background=\"#000\"\n" +
                    "        >\n" +
                    "        <LinearLayout\n" +
                    "\n" +
                    "            android:layout_width=\"wrap_content\"\n" +
                    "            android:layout_height=\"wrap_content\"\n" +
                    "            android:orientation=\"vertical\"\n" +
                    "            android:layout_margin=\"30px\">\n" +
                    "            <ImageView\n" +
                    "                android:layout_margin=\"30px\"\n" +
                    "                android:layout_width=\"200dp\"\n" +
                    "                android:layout_height=\"100dp\"\n" +
                    "        android:src=\"@drawable/korea\"></ImageView>\n" +
                    "            <View\n" +
                    "                android:layout_margin=\"30px\"\n" +
                    "                android:layout_width=\"match_parent\"\n" +
                    "                android:layout_height=\"3px\"\n" +
                    "                android:background=\"#FFEB3B\"></View>\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:text=\"Korea\"\n" +
                    "        android:gravity=\"center\"\n" +
                    "        android:textSize=\"20sp\"></TextView>\n" +
                    "\n" +
                    "        </LinearLayout>\n" +
                    "\n" +
                    "\n" +
                    "    </androidx.cardview.widget.CardView>\n" +
                    "\n" +
                    "</LinearLayout>\n\n\n"+
                    "Code fror Java File:\n\n\n"+
                    "package com.example.cardview1;\n" +
                    "\n" +
                    "import androidx.appcompat.app.AppCompatActivity;\n" +
                    "import androidx.cardview.widget.CardView;\n" +
                    "\n" +
                    "import android.os.Bundle;\n" +
                    "import android.view.View;\n" +
                    "import android.widget.Toast;\n" +
                    "\n" +
                    "public class MainActivity extends AppCompatActivity {\n" +
                    "private CardView card1;\n" +
                    "    @Override\n" +
                    "    protected void onCreate(Bundle savedInstanceState) {\n" +
                    "        super.onCreate(savedInstanceState);\n" +
                    "        setContentView(R.layout.activity_main);\n" +
                    "        card1=(CardView) findViewById(R.id.card1);\n" +
                    "        card1.setOnClickListener(new View.OnClickListener() {\n" +
                    "            @Override\n" +
                    "            public void onClick(View view) {\n" +
                    "                Toast.makeText(MainActivity.this,\"Ma Chudao\",Toast.LENGTH_SHORT).show();\n" +
                    "            }\n" +
                    "        });\n" +
                    "    }\n\n\n\n");
        }
        if (s.equals("18")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Code for Xml File:\n\n\n"+
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.viewpager.widget.ViewPager xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    tools:context=\".MainActivity\"\n" +
                    "\n" +
                    "    android:id=\"@+id/vp1\"\n" +
                    "   >\n" +
                    "    <androidx.viewpager.widget.PagerTitleStrip\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:background=\"#03A9F4\"\n" +
                    "        android:id=\"@+id/pt1\"\n" +
                    "        android:gravity=\"center\"></androidx.viewpager.widget.PagerTitleStrip>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "</androidx.viewpager.widget.ViewPager>\n\n\n\n"+
                    "Code for Java File:\n\n\n\n"+
                    "package com.example.gallery;\n" +
                    "\n" +
                    "import androidx.annotation.NonNull;\n" +
                    "import androidx.annotation.Nullable;\n" +
                    "import androidx.appcompat.app.AppCompatActivity;\n" +
                    "\n" +
                    "import androidx.fragment.app.Fragment;\n" +
                    "import androidx.fragment.app.FragmentStatePagerAdapter;\n" +
                    "import androidx.viewpager.widget.ViewPager;\n" +
                    "\n" +
                    "import androidx.fragment.app.FragmentManager;\n" +
                    "import android.os.Bundle;\n" +
                    "\n" +
                    "public class MainActivity extends AppCompatActivity {\n" +
                    "  private ViewPager vp1;\n" +
                    "    @Override\n" +
                    "    protected void onCreate(Bundle savedInstanceState) {\n" +
                    "        super.onCreate(savedInstanceState);\n" +
                    "        setContentView(R.layout.activity_main);\n" +
                    "        vp1=(ViewPager) findViewById(R.id.vp1);\n" +
                    " FragmentManager fm=getSupportFragmentManager();\n" +
                    "        CustomAdapter ad=new CustomAdapter(fm);\n" +
                    "        vp1.setAdapter(ad);\n" +
                    "    }\n" +
                    "}\n" +
                    "class CustomAdapter extends FragmentStatePagerAdapter {\n" +
                    "\n" +
                    "\n" +
                    "    public CustomAdapter(@NonNull FragmentManager fm) {\n" +
                    "        super(fm);\n" +
                    "    }\n" +
                    "\n" +
                    "    @NonNull\n" +
                    "    @Override\n" +
                    "    public Fragment getItem(int position) {\n" +
                    "        Fragment fm1=null;\n" +
                    "        if(position==0)\n" +
                    "        {\n" +
                    "            fm1=new First();\n" +
                    "        }\n" +
                    "        if(position==1)\n" +
                    "        {\n" +
                    "            fm1=new Second();\n" +
                    "        }\n" +
                    "        if(position==2)\n" +
                    "        {\n" +
                    "            fm1=new Third();\n" +
                    "        }\n" +
                    "        return fm1;\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public int getCount() {\n" +
                    "        return 3;\n" +
                    "    }\n" +
                    "\n" +
                    "    @Nullable\n" +
                    "    @Override\n" +
                    "    public CharSequence getPageTitle(int position) {\n" +
                    "\n" +
                    "\n" +
                    "        return \"Page:\"+position;\n" +
                    "    }\n" +
                    "}\n\n"+
                    "Code for Fragment xml file:\n\n"+
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    tools:context=\".MainActivity2\"\n" +
                    "    android:weightSum=\"2\"\n" +
                    "    android:orientation=\"vertical\"\n" +
                    "    android:gravity=\"center\">\n" +
                    "    <LinearLayout\n" +
                    "        android:layout_weight=\"1\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "\n" +
                    "      ></LinearLayout>\n" +
                    "\n" +
                    "</LinearLayout>\n\n"+
                    "Code for Fragment Java file:\n\n"+
                  "package com.example.gallery;\n" +
                    "\n" +
                    "import android.os.Bundle;\n" +
                    "\n" +
                    "import androidx.fragment.app.Fragment;\n" +
                    "\n" +
                    "import android.view.LayoutInflater;\n" +
                    "import android.view.View;\n" +
                    "import android.view.ViewGroup;\n" +
                    "\n" +
                    "\n" +
                    "public class Third extends Fragment {\n" +
                    "\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public View onCreateView(LayoutInflater inflater, ViewGroup container,\n" +
                    "                             Bundle savedInstanceState) {\n" +
                    "        // Inflate the layout for this fragment\n" +
                    "        return inflater.inflate(R.layout.fragment_third, container, false);\n" +
                    "    }\n" +
                    "}\n\n\n\n\n");
        }
        if (s.equals("19")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Code For Shared Preference:\n\n\n" +
                    "To save Data:\n\n" +
                    "     SharedPreferences sh=getSharedPreferences(\"color\", Context.MODE_PRIVATE);\n" +
                    "        SharedPreferences.Editor ed=sh.edit();\n" +
                    "       ed.putInt(\"red\",c);\n" +
                    "       ed.commit();\n\n\n" +
                    "To show Data:\n\n\n" +
                    "  SharedPreferences sh=getSharedPreferences(\"color\", Context.MODE_PRIVATE);\n" +
                    "        int c=sh.getInt(\"red\",Color.WHITE);\n\n\n\n");
        }  if (s.equals("20")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Code for Xml File:\n\n\n"+
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    tools:context=\".MainActivity\"\n" +
                    "    android:orientation=\"vertical\"\n" +
                    "    android:background=\"#F44336\">\n" +
                    "    <EditText\n" +
                    "        android:layout_marginTop=\"100dp\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"200dp\"\n" +
                    "        android:id=\"@+id/e1\"\n" +
                    "        android:background=\"#fff\"\n" +
                    "        ></EditText>\n" +
                    "\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:layout_marginTop=\"100dp\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:text=\"Save\"\n" +
                    "        android:gravity=\"center\"\n" +
                    "        android:id=\"@+id/b1\"\n" +
                    "        android:background=\"#fff\">\n" +
                    "\n" +
                    "    </Button>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "</LinearLayout>\n\n\n"+
                    "Code for Java File:\n\n\n"+
                    "package com.example.myapplication2;\n" +
                    "\n" +
                    "import androidx.appcompat.app.AppCompatActivity;\n" +
                    "\n" +
                    "import android.content.Context;\n" +
                    "import android.os.Bundle;\n" +
                    "import android.view.View;\n" +
                    "import android.widget.Button;\n" +
                    "import android.widget.EditText;\n" +
                    "\n" +
                    "import java.io.BufferedInputStream;\n" +
                    "import java.io.BufferedReader;\n" +
                    "import java.io.FileInputStream;\n" +
                    "import java.io.FileNotFoundException;\n" +
                    "import java.io.FileOutputStream;\n" +
                    "import java.io.IOException;\n" +
                    "import java.io.InputStreamReader;\n" +
                    "\n" +
                    "public class MainActivity extends AppCompatActivity {\n" +
                    " private EditText e1;\n" +
                    " private Button b1;\n" +
                    "    @Override\n" +
                    "    protected void onCreate(Bundle savedInstanceState) {\n" +
                    "        super.onCreate(savedInstanceState);\n" +
                    "        setContentView(R.layout.activity_main);\n" +
                    "        e1=(EditText) findViewById(R.id.e1);\n" +
                    "        b1=(Button) findViewById(R.id.b1);\n" +
                    "        b1.setOnClickListener(new View.OnClickListener() {\n" +
                    "            @Override\n" +
                    "            public void onClick(View view) {\n" +
                    "                String s=e1.getText().toString();\n" +
                    "                writeFile(s);\n" +
                    "             \n" +
                    "            }\n" +
                    "        });\n" +
                    "        readFile();\n" +
                    "    }\n" +
                    "\n" +
                    "    private void readFile() {\n" +
                    "\n" +
                    "        try {\n" +
                    "            FileInputStream in = openFileInput(\"edit1.txt\");\n" +
                    "            InputStreamReader in1=new InputStreamReader(in);\n" +
                    "            BufferedReader bf=new BufferedReader(in1);\n" +
                    "            String l;\n" +
                    "            StringBuffer s=new StringBuffer();\n" +
                    "            while((l=bf.readLine())!=null){\n" +
                    "                s.append(l+\"\\n\");\n" +
                    "            }\n" +
                    "        } catch (FileNotFoundException e) {\n" +
                    "            e.printStackTrace();\n" +
                    "        } catch (IOException e) {\n" +
                    "            e.printStackTrace();\n" +
                    "        }\n" +
                    "\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "    private void writeFile(String s) {\n" +
                    "        FileOutputStream file= null;\n" +
                    "        try {\n" +
                    "            file = openFileOutput(\"edit1.txt\", Context.MODE_PRIVATE);\n" +
                    "        } catch (FileNotFoundException e) {\n" +
                    "            e.printStackTrace();\n" +
                    "        }\n" +
                    "        try {\n" +
                    "            file.write(s.getBytes());\n" +
                    "        } catch (IOException e) {\n" +
                    "            e.printStackTrace();\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n\n\n\n\n");
        }  if (s.equals("21")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Code for Creating Table(In Database Java file):\n\n\n"+
                    "package com.example.signupcode;\n" +
                    "\n" +
                    "import android.content.ContentValues;\n" +
                    "import android.content.Context;\n" +
                    "import android.database.Cursor;\n" +
                    "import android.database.sqlite.SQLiteDatabase;\n" +
                    "import android.database.sqlite.SQLiteOpenHelper;\n" +
                    "import android.widget.Toast;\n" +
                    "\n" +
                    "import androidx.annotation.Nullable;\n" +
                    "\n" +
                    "public class DataBase extends SQLiteOpenHelper {\n" +
                    "\n" +
                    "    private  static final String name=\"Signup.db\";\n" +
                    "    private  static final String phone=\"phone\";\n" +
                    "    private  static final String email=\"email\";\n" +
                    "    private  static final String user=\"user\";\n" +
                    "    private  static final String pass=\"password\";\n" +
                    "    private  static final String tablen=\"info\";\n" +
                    "    private  static final String table=\"CREATE TABLE \"+tablen+\"(\"+phone+\" INTEGER PRIMARY KEY,\"+email+\" TEXT NOT NULL,\"+user+\" TEXT NOT NULL,\"+pass+\" TEXT NOT NULL);\";\n" +
                    "    private  static final int version=3;\n" +
                    "    private Context c;\n" +
                    "    private  static final String table1=\"DROP TABLE IF EXISTS \"+tablen;\n" +
                    "\n" +
                    "    public DataBase( Context context) {\n" +
                    "        super(context, name, null, version);\n" +
                    "        c=context;\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void onCreate(SQLiteDatabase sql) {\n" +
                    "        try{\n" +
                    "            sql.execSQL(table);\n" +
                    "            Toast.makeText(c,\"Table Created\",Toast.LENGTH_LONG).show();\n" +
                    "        }\n" +
                    "        catch(Exception e)\n" +
                    "        {\n" +
                    "            Toast.makeText(c,e.getMessage(),Toast.LENGTH_LONG).show();\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void onUpgrade(SQLiteDatabase sql, int i, int i1) {\n" +
                    "        try{\n" +
                    "            sql.execSQL(table1);\n" +
                    "\n" +
                    "            Toast.makeText(c,\"Upgraded\",Toast.LENGTH_LONG).show();\n" +
                    "            onCreate(sql);\n" +
                    "        }\n" +
                    "        catch(Exception e)\n" +
                    "        {\n" +
                    "            Toast.makeText(c,e.getMessage(),Toast.LENGTH_LONG).show();\n" +
                    "        }\n" +
                    "    }\n\n\n"+
                    "Code in database calling Java file:\n\n"+
                    " Sqh sql=new Sqh(this);\n" +
                    "        SQLiteDatabase sql1=sql.getWritableDatabase();\n\n\n\n\n");
        }
        if (s.equals("22")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Code for Inserting Data(In dataBase class):\n\n\n"+"" +
                    " public long insertData(String toString, String toString1, String toString2, String toString3, String toString4) {\n" +
                    "        SQLiteDatabase sql=this.getWritableDatabase();\n" +
                    "        ContentValues c1=new ContentValues();\n" +
                    "        c1.put(\"first_name\" ,toString);\n" +
                    "        c1.put(\"last_name\" ,toString1);\n" +
                    "        c1.put(\"contact_id\" ,toString2);\n" +
                    "        c1.put(\"email\" ,toString3);\n" +
                    "        c1.put(\"phone\" ,toString4);\n" +
                    "        long r=sql.insert(\"contact\",null,c1);\n" +
                    "        return r;\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "    }\n\n"+
                    "Code in database calling JAva file:\n\n\n"+
                    "    long r=sql.insertData(e1.getText().toString(),e2.getText().toString(),e3.getText().toString(),e4.getText().toString(),e5.getText().toString());\n" +
                    "                 if(r>0)\n" +
                    "                 {\n" +
                    "                     Toast.makeText(MainActivity.this,\"Successful\",Toast.LENGTH_SHORT).show();\n" +
                    "                 }\n" +
                    "                 else{\n" +
                    "                     Toast.makeText(MainActivity.this,\"Unsuccessful\",Toast.LENGTH_SHORT).show();\n" +
                    "\n" +
                    "                 }\n\n\n\n");
        }
        if (s.equals("23")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Code in Database Java file:\n\n"+
                    "  public Boolean updateData(String toString, String toString1, String toString2, String toString3, String toString4) {\n" +
                    "        SQLiteDatabase sql=this.getWritableDatabase();\n" +
                    "        ContentValues c1=new ContentValues();\n" +
                    "        c1.put(\"first_name\" ,toString);\n" +
                    "        c1.put(\"last_name\" ,toString1);\n" +
                    "        c1.put(\"contact_id\" ,toString2);\n" +
                    "        c1.put(\"email\" ,toString3);\n" +
                    "        c1.put(\"phone\" ,toString4);\n" +
                    "        sql.update(\"contact\",c1,\"contact_id=?\",new String[] {toString2});\n" +
                    "        return true;\n" +
                    "    }\n\n"+
                    "Code in Database calling Java file:\n\n"+
                    "   Boolean b= sql.updateData(e1.getText().toString(),e2.getText().toString(),e3.getText().toString(),e4.getText().toString(),e5.getText().toString());\n" +
                    "       \n\n\n\n\n");
        }
        if (s.equals("24")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText(" Code in Java Database file:\n\n\n\n public int deleteData(String toString) {\n" +
                    "        SQLiteDatabase sql=this.getWritableDatabase();\n" +
                    "        return sql.delete(\"contact\",\"contact_id=?\",new String[]{toString});\n" +
                    "    }\n\n"+
                    "Code in Database calling Java file:\n\n\n"+
                    "   int p= sql.deleteData(e3.getText().toString());\n\n\n\n");
        }
        if (s.equals("25")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Code for Database Java file:\n\n"+
                    " public Cursor readData() {\n" +
                    "        SQLiteDatabase sql=this.getWritableDatabase();\n" +
                    "            Cursor cur=sql.rawQuery(\"SELECT * FROM contact\",null);\n" +
                    "            return cur;\n" +
                    "\n" +
                    "\n" +
                    "    }\n\n\n"+
                    "Code for Database calling Java file:\n\n\n"+
                    "  Cursor cur=sql.readData();\n" +
                    "         if(cur.getCount()==0)\n" +
                    "         {\n" +
                    "             showData(\"Information\",\"No Data\");\n" +
                    "         }\n" +
                    "         else{\n" +
                    "             StringBuilder s1=new StringBuilder();\n" +
                    "             while(cur.moveToNext())\n" +
                    "             {\n" +
                    "                    s1.append(\"\\nContact Id: \"+cur.getString(0));\n" +
                    "                    s1.append(\"\\nFirst Name: \"+cur.getString(1));\n" +
                    "                    s1.append(\"\\nLast Name: \"+cur.getString(2));\n" +
                    "                    s1.append(\"\\nEmail: \"+cur.getString(3));\n" +
                    "                    s1.append(\"\\nPhone: \"+cur.getString(4));\n" +
                    "             }\n" +
                    "             showData(\"Infromation\",s1.toString());\n" +
                    "        }\n\n\n\n\n\n");
        }   if (s.equals("26")) {
            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setTypeface(typ1);
            t1.setTextColor(Color.WHITE);
            t1.setText("Code for xml File:\n\n" +
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    tools:context=\".MainActivity\"\n" +
                    "    android:padding=\"20dp\">\n" +
                    "    <androidx.recyclerview.widget.RecyclerView\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"match_parent\"\n" +
                    "        android:id=\"@+id/re1\"\n" +
                    "\n" +
                    "        ></androidx.recyclerview.widget.RecyclerView>\n" +
                    "\n" +
                    "\n" +
                    "</LinearLayout>\n\n\n\n" +
                    "Code for Java file:\n\n\n" +
                    "package com.example.recyclerview;\n" +
                    "\n" +
                    "import androidx.appcompat.app.AppCompatActivity;\n" +
                    "import androidx.lifecycle.MutableLiveData;\n" +
                    "import androidx.recyclerview.widget.LinearLayoutManager;\n" +
                    "import androidx.recyclerview.widget.RecyclerView;\n" +
                    "\n" +
                    "import android.os.Bundle;\n" +
                    "import android.view.View;\n" +
                    "import android.widget.Toast;\n" +
                    "\n" +
                    "public class MainActivity extends AppCompatActivity {\n" +
                    "  private RecyclerView re1;\n" +
                    "    int f[]={R.drawable.bang,\n" +
                    "            R.drawable.indi,\n" +
                    "            R.drawable.pak,\n" +
                    "            R.drawable.korea,\n" +
                    "            R.drawable.spai,\n" +
                    "            R.drawable.arge};\n" +
                    "    String[] c;\n" +
                    "\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void onCreate(Bundle savedInstanceState) {\n" +
                    "        super.onCreate(savedInstanceState);\n" +
                    "        setContentView(R.layout.activity_main);\n" +
                    "        re1=(RecyclerView) findViewById(R.id.re1);\n" +
                    "        c=getResources().getStringArray(R.array.country);\n" +
                    "        Adapter1 ad=new Adapter1(this,c,f);\n" +
                    "        re1.setAdapter(ad);\n" +
                    "        re1.setLayoutManager(new LinearLayoutManager(this));\n" +
                    "   ad.setOnItemClick(new Adapter1.ClickListener() {\n" +
                    "       @Override\n" +
                    "       public void onClick(int i, View v) {\n" +
                    "           Toast.makeText(getApplicationContext(),c[i]+\" is selected\",Toast.LENGTH_LONG).show();\n" +
                    "       }\n" +
                    "\n" +
                    "       @Override\n" +
                    "       public void onLongClick(int i, View v) {\n" +
                    "           Toast.makeText(MainActivity.this,c[i]+\" is selected(LOng Click)\",Toast.LENGTH_LONG).show();\n" +
                    "       }\n" +
                    "   });\n" +
                    "    }\n" +
                    "}\n\n\n\n" +
                    "Code for Adapter Sample file:\n\n\n" +
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<LinearLayout\n" +
                    "    xmlns:android=\"http://schemas.android.com/apk/res/android\" android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"wrap_content\">\n" +
                    "    <LinearLayout\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:weightSum=\"3\"\n" +
                    "        android:layout_margin=\"20dp\"\n" +
                    "        >\n" +
                    "        <ImageView\n" +
                    "            android:layout_width=\"0dp\"\n" +
                    "            android:layout_weight=\"1\"\n" +
                    "            android:layout_height=\"100dp\"\n" +
                    "            android:src=\"@drawable/korea\"\n" +
                    "            android:id=\"@+id/im1\"></ImageView>\n" +
                    "        <TextView\n" +
                    "            android:id=\"@+id/t1\"\n" +
                    "        android:layout_width=\"0dp\"\n" +
                    "        android:layout_weight=\"2\"\n" +
                    "        android:layout_height=\"match_parent\"\n" +
                    "            android:gravity=\"center\"\n" +
                    "            android:text=\"Korea\"\n" +
                    "            android:textSize=\"20dp\"\n" +
                    "        ></TextView>\n" +
                    "\n" +
                    "    </LinearLayout>\n" +
                    "\n" +
                    "</LinearLayout>\n\n\n" +
                    "Code for Adapter Java File:\n\n\n" +
                    "package com.example.recyclerview;\n" +
                    "\n" +
                    "\n" +
                    "import android.content.Context;\n" +
                    "import android.view.LayoutInflater;\n" +
                    "import android.view.View;\n" +
                    "import android.view.ViewGroup;\n" +
                    "import android.widget.ImageView;\n" +
                    "import android.widget.TextView;\n" +
                    "\n" +
                    "import androidx.annotation.NonNull;\n" +
                    "import androidx.recyclerview.widget.RecyclerView;\n" +
                    "\n" +
                    "public class Adapter1  extends RecyclerView.Adapter<Adapter1.View1>{\n" +
                    "    public static ClickListener cl;\n" +
                    "    private Context c;\n" +
                    "    private TextView t1;\n" +
                    "    private ImageView im1;\n" +
                    "\n" +
                    "    private String[] co;\n" +
                    "    private int[] f;\n" +
                    "    public Adapter1(Context c,String[] co,int[] f){\n" +
                    "        this.c=c;\n" +
                    "        this.co=co;\n" +
                    "        this.f=f;\n" +
                    "    }\n" +
                    "\n" +
                    "    @NonNull\n" +
                    "    @Override\n" +
                    "    public View1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {\n" +
                    "        LayoutInflater in=LayoutInflater.from(c);\n" +
                    "        View view=in.inflate(R.layout.sample,parent,false);\n" +
                    "        return new View1(view);\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void onBindViewHolder(@NonNull View1 holder, int i) {\n" +
                    "             t1.setText(co[i]);\n" +
                    "             im1.setImageResource(f[i]);\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public int getItemCount() {\n" +
                    "        return co.length;\n" +
                    "    }\n" +
                    "\n" +
                    "    class View1 extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener{\n" +
                    "      public View1(@NonNull View itemView) {\n" +
                    "\n" +
                    "          super(itemView);\n" +
                    "          t1=itemView.findViewById(R.id.t1);\n" +
                    "          im1=itemView.findViewById(R.id.im1);\n" +
                    "          itemView.setOnClickListener(this);\n" +
                    "          itemView.setOnLongClickListener(this);\n" +
                    "\n" +
                    "      }\n" +
                    "\n" +
                    "        @Override\n" +
                    "        public void onClick(View view) {\n" +
                    "              cl.onClick(getAdapterPosition(),view);\n" +
                    "        }\n" +
                    "\n" +
                    "        @Override\n" +
                    "        public boolean onLongClick(View view) {   cl.onLongClick(getAdapterPosition(),view);\n" +
                    "            cl.onLongClick(getAdapterPosition(),view);\n" +
                    "            return false;\n" +
                    "        }\n" +
                    "    }\n" +
                    "    public interface ClickListener\n" +
                    "    {\n" +
                    "        public void onClick(int i,View v);\n" +
                    "        public void onLongClick(int i,View v);\n" +
                    "    }\n" +
                    "    public void setOnItemClick(ClickListener cl)\n" +
                    "    {\n" +
                    "        Adapter1.cl=cl;\n" +
                    "    }\n" +
                    "\n" +
                    "\n" +
                    "}\n" +
                    "\n\n\n\n\n");
        }




    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}