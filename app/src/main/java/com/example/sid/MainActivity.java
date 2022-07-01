package com.example.sid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText ed;
Button bd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=findViewById(R.id.editTextTextPersonName);
        bd=findViewById(R.id.button);

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = ed.getText().toString();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("rol",str);
                startActivity(intent);
            }
        });


    }
}