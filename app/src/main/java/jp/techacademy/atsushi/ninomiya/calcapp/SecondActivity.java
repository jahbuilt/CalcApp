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
        int value1 = intent.getIntExtra("VALUE1", 0);
        int value2 = intent.getIntExtra("VALUE2", 0);
        int value3 = intent.getIntExtra("VALUE3", 0);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(value1 + value3+ value2));
    }
}