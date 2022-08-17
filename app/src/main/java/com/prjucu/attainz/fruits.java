package com.prjucu.attainz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class fruits extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFruit;
    Button next;
    Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        viewFruit = (ViewFlipper) findViewById(R.id.viewFruit);
        next = (Button) findViewById(R.id.next);
        back = (Button) findViewById(R.id.back);

        next.setOnClickListener(this);
        back.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if (v == next) {
            viewFruit.showNext();
        }
        else if (v == back){
            viewFruit.showPrevious();
        }
    }
}