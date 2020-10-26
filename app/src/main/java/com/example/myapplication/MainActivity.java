package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mainTextView = findViewById(R.id.maintextView);
        mainTextView.setText("Hello educative.io");

        // start the new activity
        startActivity(new Intent(this, BlogDetailsActivity.class));
    }
}