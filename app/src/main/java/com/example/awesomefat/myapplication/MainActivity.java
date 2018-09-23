package com.example.awesomefat.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView myLabel;
    private EditText num1ET;
    private EditText num2ET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        this.myLabel = (TextView)this.findViewById(R.id.myLabel);
        this.myLabel.setText("");

        this.num1ET = (EditText)this.findViewById(R.id.num1ET);
        this.num2ET = (EditText)this.findViewById(R.id.num2ET);
    }

    public void onButtonClicked(View v)
    {
        int num1 = Test2.getIntFromString(this.num1ET.getText().toString());

        int num2 = Test2.getIntFromString(this.num2ET.getText().toString());
        //int num1 = Integer.parseInt(this.num1ET.getText().toString());

        //int num2 = Integer.parseInt(this.num2ET.getText().toString());

        int answer = num1 + num2;
        this.myLabel.setText("" + answer);

        Intent i = new Intent(this, AnswerScreen.class);
        //Test.getInstance().setTheAnswer();
        Test2.answer = answer;
        this.startActivity(i);
    }
}
