package com.example.lab2milestone2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunctionAdd(View view) {
        EditText field1 = (EditText) findViewById(R.id.value1);
        EditText field2 = (EditText) findViewById(R.id.value2);

        if (field1.getText().toString().equals("") || field2.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "missing value", Toast.LENGTH_LONG).show();
        } else {
            String str = Double.toString(Double.parseDouble(field1.getText().toString())
                    + Double.parseDouble(field2.getText().toString()));
            goToActivity2(str);
        }
    }

    public void clickFunctionSubtract(View view) {
        EditText field1 = (EditText) findViewById(R.id.value1);
        EditText field2 = (EditText) findViewById(R.id.value2);

        if (field1.getText().toString().equals("") || field2.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "missing value", Toast.LENGTH_LONG).show();
        } else {
            String str = Double.toString(Double.parseDouble(field1.getText().toString())
                    - Double.parseDouble(field2.getText().toString()));
            goToActivity2(str);
        }
    }

    public void clickFunctionMultiply(View view) {
        EditText field1 = (EditText) findViewById(R.id.value1);
        EditText field2 = (EditText) findViewById(R.id.value2);

        if (field1.getText().toString().equals("") || field2.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "missing value", Toast.LENGTH_LONG).show();
        } else {
            String str = Double.toString(Double.parseDouble(field1.getText().toString())
                    * Double.parseDouble(field2.getText().toString()));
            goToActivity2(str);
        }
    }

    public void clickFunctionDivide(View view) {
        EditText field1 = (EditText) findViewById(R.id.value1);
        EditText field2 = (EditText) findViewById(R.id.value2);

        if (field1.getText().toString().equals("") || field2.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "missing value", Toast.LENGTH_LONG).show();
        } else {
            String str = "Infinity";
            if(!field2.getText().toString().equals("0")) {
                str = Double.toString(Double.parseDouble(field1.getText().toString())
                        / Double.parseDouble(field2.getText().toString()));
            }
            goToActivity2(str);
        }
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}