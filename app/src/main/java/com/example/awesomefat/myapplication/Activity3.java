package com.example.awesomefat.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        TextView  textView3 = (TextView)this.findViewById(R.id.textView3);
        textView3.setText("" + Test2.answer);

    }

    public void onButtonClick(View v)
    {
        //Intent i = new Intent(this, AnswerScreen.class);
        //this.startActivity(i);
        super.onBackPressed();

    }

    @Override
    public void onBackPressed()
    {
        //super.onBackPressed();
        System.out.println("Do back button logic");
    }
}
