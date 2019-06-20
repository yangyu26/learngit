package com.example.mycp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button xwz;
    //TAG常量
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     //给当前活动引入一个布局(.xml)；i
        xwz=(Button)findViewById(R.id.button1);
        xwz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,XwzActivity.class);
                startActivity(intent);
            }
        });
        //打印日志的语句
        Log.d("data","onCreate execute");//debug级别的日志



    }
}
