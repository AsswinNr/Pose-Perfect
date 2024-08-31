package com.example.yogaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Advanced_Poses extends AppCompatActivity {

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_poses);

        EdgeToEdge.enable(this);


        imageButton = findViewById(R.id.go_back);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Advanced_Poses.this, Difficulty_Activity.class);
                startActivity(intent);
            }
        });


        Button btn1 =findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 =new Intent(Advanced_Poses.this, Bakasana.class);
                startActivity(intent2);
            }
        });

        Button btn2 =findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 =new Intent(Advanced_Poses.this, Pigeon.class);
                startActivity(intent3);
            }
        });

        Button btn3 =findViewById(R.id.btn3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 =new Intent(Advanced_Poses.this, Dancer.class);
                startActivity(intent4);
            }
        });

        Button btn4 =findViewById(R.id.btn4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 =new Intent(Advanced_Poses.this, Feather.class);
                startActivity(intent5);
            }
        });

        Button btn5 =findViewById(R.id.btn5);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 =new Intent(Advanced_Poses.this, Peacock.class);
                startActivity(intent6);
            }
        });

        Button btn6 =findViewById(R.id.btn6);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 =new Intent(Advanced_Poses.this, Firefly.class);
                startActivity(intent7);
            }
        });

    }
}