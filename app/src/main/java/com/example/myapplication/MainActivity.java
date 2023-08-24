package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    EditText editText;
    public boolean flag=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView4);
        editText = findViewById(R.id.editTextText3);
    }

    public void clickButton(View view){
        flag=!flag;
        if(flag){
            int value = Integer.parseInt(editText.getText().toString());
            float val = value/84.0f;
            textView.setText(Float.toString(val));
            imageView.setImageResource(R.drawable.dollar);
        }else{
            int value = Integer.parseInt(editText.getText().toString());
            float val = value * 84.0f;
            textView.setText(Float.toString(val));
            imageView.setImageResource(R.drawable.rupee);
        }
    }
}