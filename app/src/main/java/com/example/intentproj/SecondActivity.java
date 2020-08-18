package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView1, textView2, textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        textView1 = (TextView) findViewById(R.id.num1);
        textView2 = (TextView) findViewById(R.id.num2);
        textView3 = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();

        textView1.setText(getIntent().getStringExtra("name1"));
        textView2.setText(getIntent().getStringExtra("name2"));


    }


    public void onClickAdd(View view){

        EditText editText1 = (EditText) findViewById(R.id.num1);
        EditText editText2 = (EditText) findViewById(R.id.num2);

        TextView textView = (TextView) findViewById(R.id.textView);

        float num1 = Float.parseFloat(editText1.getText().toString());
        float num2 = Float.parseFloat(editText2.getText().toString());

        float x = num1 + num2;

        textView.setText(editText1.getText()+"+"+editText2.getText()+"="+Float.toString(x));

    }

    public void onClickSub(View view){

        EditText editText1 = (EditText) findViewById(R.id.num1);
        EditText editText2 = (EditText) findViewById(R.id.num2);

        TextView textView = (TextView) findViewById(R.id.textView);

        float num1 = Float.parseFloat(editText1.getText().toString());
        float num2 = Float.parseFloat(editText2.getText().toString());

        float x = num1 - num2;

        textView.setText(editText1.getText()+"-"+editText2.getText()+"="+Float.toString(x));

    }

    public void onClickDiv(View view){

        EditText editText1 = (EditText) findViewById(R.id.num1);
        EditText editText2 = (EditText) findViewById(R.id.num2);

        TextView textView = (TextView) findViewById(R.id.textView);

        float num1 = Float.parseFloat(editText1.getText().toString());
        float num2 = Float.parseFloat(editText2.getText().toString());

        float x = num1 / num2;

        textView.setText(editText1.getText()+"/"+editText2.getText()+"="+Float.toString(x));

    }

    public void onClickMul(View view){

        EditText editText1 = (EditText) findViewById(R.id.num1);
        EditText editText2 = (EditText) findViewById(R.id.num2);

        TextView textView = (TextView) findViewById(R.id.textView);

        float num1 = Float.parseFloat(editText1.getText().toString());
        float num2 = Float.parseFloat(editText2.getText().toString());

        float x = num1 * num2;

        textView.setText(editText1.getText()+"*"+editText2.getText()+"="+Float.toString(x));

    }
}