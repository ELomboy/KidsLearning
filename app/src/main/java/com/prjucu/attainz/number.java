package com.prjucu.attainz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class number extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewNumber;
    Button next;
    Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        viewNumber = (ViewFlipper) findViewById(R.id.viewNumber);
        next = (Button) findViewById(R.id.next);
        back = (Button) findViewById(R.id.back);

        next.setOnClickListener(this);
        back.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if (v == next) {
            viewNumber.showNext();
        }
        else if (v == back){
            viewNumber.showPrevious();
        }
    }
}