package com.example.awesomefat.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AnswerScreen extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_screen);

        TextView theAnswer = (TextView)this.findViewById(R.id.theAnswer);
        int answer = this.getIntent().getIntExtra("theAnswer", -1);
        theAnswer.setText("" + answer);

    }

    public void onButtonClicked (View v)
    {
        int answer = this.getIntent().getIntExtra("theAnswer", -1);
        Intent i = new Intent(this,Activity3.class);
        i.putExtra("theAnswer", answer);
        this.startActivity(i);

    }
}
