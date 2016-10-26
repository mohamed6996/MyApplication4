package com.example.lenovo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
TextView overView, releaseDate, voteAvg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        overView = (TextView) findViewById(R.id.over_view);
        releaseDate = (TextView) findViewById(R.id.release_date);
        voteAvg = (TextView) findViewById(R.id.vote_average);

        overView.setText(getIntent().getStringExtra("OVER_VIEW_KEY"));
        releaseDate.setText(getIntent().getStringExtra("RELEASE_DATE_KEY"));
        voteAvg.setText(getIntent().getStringExtra("VOTE_AVERAGE_KEY"));




    }
}
