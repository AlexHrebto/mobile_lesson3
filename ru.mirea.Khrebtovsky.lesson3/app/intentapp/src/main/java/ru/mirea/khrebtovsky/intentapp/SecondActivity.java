package ru.mirea.khrebtovsky.intentapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String currentTime = getIntent().getStringExtra("currentTime");

        String displayText = "КВАДРАТ ЗНАЧЕНИЯ МОЕГО НОМЕРА ПО СПИСКУ В ГРУППЕ СОСТАВЛЯЕТ 576, а текущее время " + currentTime;

        TextView textView = findViewById(R.id.textView);
        textView.setText(displayText);
    }
}
