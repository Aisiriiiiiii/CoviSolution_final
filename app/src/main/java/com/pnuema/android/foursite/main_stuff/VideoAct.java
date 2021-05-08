package com.pnuema.android.foursite.main_stuff;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.pnuema.android.foursite.R;

public class VideoAct extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> youtube());

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(v -> breathingexercises());

    }

    public void youtube() {
        Intent intent = new Intent(this, youtube.class);
        startActivity(intent);
    }

    public void breathingexercises() {
        Intent intent = new Intent(this, breathingexcersizes.class);
        startActivity(intent);
    }


}

