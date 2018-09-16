package com.example.awesomefat.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        TextView  textView3 = (TextView)this.findViewById(R.id.textView3);
        int answer = this.getIntent().getIntExtra("theAnswer", -1);
        textView3.setText("" + answer);

    }


}
