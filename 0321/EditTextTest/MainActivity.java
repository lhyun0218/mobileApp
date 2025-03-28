package com.example.edittexttest;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    EditText eText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        eText = (EditText) findViewById(R.id.edittext);

    }
    public void show (View v) {

        String str = eText.getText().toString();
        textView.setText(str);
    }
}