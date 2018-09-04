package com.dicoding.kharisazhar.mymovie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView tvDetailTitle, tvDetailDescription;
    ImageView imgBackdrop;

    private String title, description;
    private int imgUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvDetailTitle = findViewById(R.id.tv_title);
        tvDetailDescription = findViewById(R.id.tv_desscription);
        imgBackdrop = findViewById(R.id.img_backdrop);

        Intent intent = getIntent();
        title = intent.getStringExtra("EXTRA_TITLE");
        description = intent.getStringExtra("EXTRA_DESCRIPTION");
        imgUrl = intent.getIntExtra("EXTRA_IMG",R.drawable.ic_launcher_background);

        tvDetailTitle.setText(title);
        tvDetailDescription.setText(description);
        imgBackdrop.setImageResource(imgUrl);
    }
}
