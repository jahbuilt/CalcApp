package jp.techacademy.atsushi.ninomiya.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText EditText1;
    String str1;
    double double1;

    EditText EditText2;
    String str2;
    double double2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText1 = (EditText) findViewById(R.id.editText1);
        EditText2 = (EditText) findViewById(R.id.editText2);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        str1 = EditText1.getText().toString();
        str2 = EditText2.getText().toString();

        TextView textView = (TextView) findViewById(R.id.textView);

        if (str1 != null && str1.length() > 0) {
            double1 = Double.parseDouble(str1);
        } else {
            textView.setText("数字を入力してください");
        }

        if (str2 != null && str2.length() > 0) {
            double2 = Double.parseDouble(str2);
        } else {
            textView.setText("数字を入力してください");
        }

        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra("VALUE1", double1);
        intent.putExtra("VALUE2", double2);

        if (v.getId() == R.id.button1) {
            intent.putExtra("VALUE3", "+");
        } else if (v.getId() == R.id.button2) {
            intent.putExtra("VALUE3", "-");
        } else if (v.getId() == R.id.button3) {
            intent.putExtra("VALUE3", "*");
        } else if (v.getId() == R.id.button4) {
            intent.putExtra("VALUE3", "/");
        }

        startActivity(intent);

    }


}

