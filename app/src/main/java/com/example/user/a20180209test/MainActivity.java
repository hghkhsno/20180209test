package com.example.user.a20180209test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int size =30;

    public void test(View V){
        TextView tv=(TextView)findViewById(R.id.tv);
        tv.setTextSize(++size);
    }

    public void changepage(View V){
       Intent n=new Intent();
      // n.setClass(this,Main2Activity.class);
       startActivity(n);
    }
}
