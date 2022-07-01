package com.example.sid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t1=findViewById(R.id.textView8);
        t2=findViewById(R.id.textView6);
        t3=findViewById(R.id.textView7);
        Intent intent2 = getIntent();
        String str = intent2.getStringExtra("name");
        t1.setText(str);
        String str1 = intent2.getStringExtra("fathername");
        t2.setText(str1);

        String str2 = intent2.getStringExtra("roll");
        t3.setText(str2);

    }
}