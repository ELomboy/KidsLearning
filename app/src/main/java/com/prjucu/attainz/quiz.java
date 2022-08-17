package com.prjucu.attainz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class quiz extends AppCompatActivity {

    private String selectedTopicName = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final LinearLayout alphabet = findViewById(R.id.alphabetLayout);
        final LinearLayout number = findViewById(R.id.numberLayout);
        final LinearLayout color = findViewById(R.id.colorLayout);
        final LinearLayout shapes = findViewById(R.id.shapesLayout);

        final Button startBtn = findViewById(R.id.startQuizBtn);

        alphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "alphabet";

                alphabet.setBackgroundResource(R.drawable.round_back_white_stroke10);

                number.setBackgroundResource(R.drawable.round_back_white10);
                color.setBackgroundResource(R.drawable.round_back_white10);
                shapes.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "number";

                number.setBackgroundResource(R.drawable.round_back_white_stroke10);

                alphabet.setBackgroundResource(R.drawable.round_back_white10);
                color.setBackgroundResource(R.drawable.round_back_white10);
                shapes.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "color";

                color.setBackgroundResource(R.drawable.round_back_white_stroke10);

                number.setBackgroundResource(R.drawable.round_back_white10);
                alphabet.setBackgroundResource(R.drawable.round_back_white10);
                shapes.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        shapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "shapes";

                shapes.setBackgroundResource(R.drawable.round_back_white_stroke10);

                color.setBackgroundResource(R.drawable.round_back_white10);
                number.setBackgroundResource(R.drawable.round_back_white10);
                alphabet.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedTopicName.isEmpty()){
                    Toast.makeText(quiz.this, "Please select the topic", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(quiz.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }
            }
        });

    }
}