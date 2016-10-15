package jp.techacademy.atsushi.ninomiya.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        double value1 = intent.getDoubleExtra("VALUE1", 0);
        double value2 = intent.getDoubleExtra("VALUE2", 0);
        String value3 = intent.getStringExtra("VALUE3");

        TextView textView = (TextView) findViewById(R.id.textView);

        double result = 0;
        if (value3.equals ("+")) {
            result = value1 + value2;
        } else if (value3.equals("-")) {
            result = value1 - value2;
        } else if (value3.equals("*")) {
            result = value1 * value2;
        } else if (value3.equals("/")) {
            result = value1 / value2;
        }

        textView.setText(String.valueOf(result));

    }
}