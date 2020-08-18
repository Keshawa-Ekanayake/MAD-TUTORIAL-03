package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    public static final String Extra_msg = "com.example.IntentProj.MESSAGE";
    Button button;

    EditText textView1, textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        textView1 = (EditText) findViewById(R.id.number1);
        textView2 = (EditText) findViewById(R.id.number2);
        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);

                String str = textView1.getText().toString();
                intent.putExtra("name1", str);

                String msg2 = textView2.getText().toString();
                intent.putExtra("name2", msg2);

                intent.putExtra(Extra_msg, str);

                Toast text = Toast.makeText(getApplicationContext(), "Sending Message", Toast.LENGTH_SHORT);
                text.show();

                startActivity(intent);
            }
        });


    }
}