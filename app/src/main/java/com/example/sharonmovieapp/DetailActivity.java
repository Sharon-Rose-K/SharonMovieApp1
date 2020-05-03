package com.example.sharonmovieapp;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    TextView NameMovie, SummarySynopsis, Rating, Release;
    ImageView imageView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initCollapsingToolBar();

        imageView = (ImageView) findViewById(R.id.thumbnail_image_header);
        NameMovie = (TextView) findViewById(R.id.Title);
        SummarySynopsis = (TextView) findViewById(R.id.SummarySynopsis);
        Rating = (TextView) findViewById(R.id.UserRating);
        Release = (TextView) findViewById(R.id.UserRating);

        Intent intentThatStartedThisActivity = getIntent();
        if (intentThatStartedThisActivity.hasExtra("Orginal_title")){
            String Thumbnail = getIntent().getExtras().getString("poster_path");
            String MovieName =
        }

    }

}
