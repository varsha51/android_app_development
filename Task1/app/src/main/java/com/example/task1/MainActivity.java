package com.example.task1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView tv;
    int a=0;
    Button b2;
    Button b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.plus);
        b2=findViewById(R.id.minus);
        b3=findViewById(R.id.reset);
        tv = findViewById(R.id.textcount);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a++;
                tv.setText(""+a);
            }
        });
        if (savedInstanceState!=null){
            String s = savedInstanceState.getString("value");
            a = Integer.parseInt(s);
            tv.setText(s);

        }
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a--;
                tv.setText(""+a);
            }
        });
        if (savedInstanceState!=null){
            String s = savedInstanceState.getString("value");
            a = Integer.parseInt(s);
            tv.setText(s);

        }
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                tv.setText(""+a);
            }
        });
        if (savedInstanceState!=null){
            String s = savedInstanceState.getString("value");
            a = Integer.parseInt(s);
            tv.setText(s);

        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("value",tv.getText().toString());
    }


    public void display(View view) {
        Toast.makeText(this, "Your Count is:"+a, Toast.LENGTH_SHORT).show();
    }
}









