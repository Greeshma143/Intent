package com.arun.valuepassingintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Hello extends AppCompatActivity {
    TextView textView;
    String getValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        textView=(TextView)findViewById(R.id.Tx1);
        Intent intent=getIntent();
        getValue=intent.getStringExtra("myname");
        textView.setText(getValue);

    }
}
