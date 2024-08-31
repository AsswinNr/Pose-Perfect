package com.example.yogaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Pose_One extends AppCompatActivity {

    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virbhadrasana);



        imageButton = findViewById(R.id.backButton);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pose_One.this, Advanced_Poses.class);
                startActivity(intent);
            }
        });


        };
    }
