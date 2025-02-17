package com.example.week3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.week3.R;

public class ImageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        ImageView imageView = findViewById(R.id.imageView);

        String imageUrl = "https://img.pikbest.com/origin/10/12/58/58dpIkbEsTuwB.jpg!w700wp";
        Glide.with(this)
                .load(imageUrl)
                .into(imageView);
        Button btnNext = findViewById(R.id.btnNext3);
        btnNext.setOnClickListener(v -> {
            startActivity(new Intent(ImageActivity.this,  MusicActivity.class));
        });
    }

}
