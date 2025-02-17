package com.example.week3;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LottieActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie);

        Button btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(v -> {
                    startActivity(new Intent(LottieActivity.this, VideoActivity.class));
        });
    }
}
