package com.example.myapplication_fact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText t1 =(EditText) findViewById(R.id.num);
        Button B1 =(Button) findViewById(R.id.btn);
        TextView tv1 =(TextView) findViewById(R.id.textView1);
        TextView res =(TextView) findViewById(R.id.textView2);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(t1.getText().toString().trim());
                int fact=1;
                for(int i=1;i<=n;i++)
                {
                    fact=fact*i;
                }
                res.setText("Factorial of " + n + " is " + fact);
            }
        });
    }
}