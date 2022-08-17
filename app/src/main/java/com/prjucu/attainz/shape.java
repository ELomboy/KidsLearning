package com.prjucu.attainz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class shape extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewShape;
    Button next;
    Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape);

        viewShape = (ViewFlipper) findViewById(R.id.viewShape);
        next = (Button) findViewById(R.id.next);
        back = (Button) findViewById(R.id.back);

        next.setOnClickListener(this);
        back.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if (v == next) {
            viewShape.showNext();
        }
        else if (v == back){
            viewShape.showPrevious();
        }
    }
}