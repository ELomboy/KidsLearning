package com.prjucu.attainz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class color extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewColor;
    Button next;
    Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        viewColor = (ViewFlipper) findViewById(R.id.viewColor);
        next = (Button) findViewById(R.id.next);
        back = (Button) findViewById(R.id.back);

        next.setOnClickListener(this);
        back.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if (v == next) {
            viewColor.showNext();
        }
        else if (v == back){
            viewColor.showPrevious();
        }
    }
}
