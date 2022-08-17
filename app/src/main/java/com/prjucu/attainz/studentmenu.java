package com.prjucu.attainz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class studentmenu extends AppCompatActivity {

    ImageView number, abc, shapes, color, rhyming, fruits;

    private Button takeQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentmenu);

        number = findViewById(R.id.number);
        abc = findViewById(R.id.abc);
        shapes = findViewById(R.id.shapes);
        color = findViewById(R.id.color);
        rhyming = findViewById(R.id.rhyming);
        fruits = findViewById(R.id.fruits);

        takeQuiz = findViewById(R.id.takeQuiz);

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(studentmenu.this, number.class));
            }
        });
        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(studentmenu.this, alphabet.class));
            }
        });
        shapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(studentmenu.this, shape.class));
            }
        });
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(studentmenu.this, color.class));
            }
        });
        rhyming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(studentmenu.this, rhyming.class));
            }
        });
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(studentmenu.this, fruits.class));
            }
        });

        takeQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(studentmenu.this, quiz.class));
            }
        });

    }
}