package com.example.sid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText ed1,ed2;
    TextView t1;
    Button bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ed1=findViewById(R.id.editTextTextPersonName2);
        ed2=findViewById(R.id.editTextTextPersonName3);
        t1=findViewById(R.id.rollno);

        bt2=findViewById(R.id.button2);
        Intent intent2 = getIntent();
        String str2 = intent2.getStringExtra("rol");
        t1.setText(str2);
bt2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent2=new Intent(MainActivity2.this,MainActivity3.class);

        String str = ed1.getText().toString();
        String strr = ed2.getText().toString();
        intent2.putExtra("name",str);
        intent2.putExtra("fathername",strr);
        intent2.putExtra("roll",str2);
        startActivity(intent2);

    }
});

    }
}