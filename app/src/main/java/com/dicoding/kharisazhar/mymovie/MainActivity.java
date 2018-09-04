package com.dicoding.kharisazhar.mymovie;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnDetailOne, btnDetailTwo;

    private String titleOne = "Avengers Intfinity War";
    private String titleTwo = "Mission: Impossible - Fallout";

    private int imgUrlOne = R.drawable.img_poster_avengers;
    private int imgUrlTwo = R.drawable.img_poster_mission;

    private String descriptionOne = "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.";
    private String desctiptionTwo = "When an IMF mission ends badly, the world is faced with dire consequences. As Ethan Hunt takes it upon himself to fulfil his original briefing, the CIA begin to question his loyalty and his motives. The IMF team find themselves in a race against time, hunted by assassins while trying to prevent a global catastrophe.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDetailOne = findViewById(R.id.btn_detail_one);
        btnDetailTwo = findViewById(R.id.btn_detail_two);

        btnDetailOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("EXTRA_TITLE",titleOne);
                intent.putExtra("EXTRA_DESCRIPTION",descriptionOne);
                intent.putExtra("EXTRA_IMG",imgUrlOne);
                startActivity(intent);
            }
        });



        btnDetailTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("EXTRA_TITLE",titleTwo);
                intent.putExtra("EXTRA_DESCRIPTION",desctiptionTwo);
                intent.putExtra("EXTRA_IMG",imgUrlTwo);
                startActivity(intent);
            }
        });
    }
}
