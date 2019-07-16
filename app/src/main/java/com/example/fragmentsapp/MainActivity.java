package com.example.fragmentsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements HeadlinesFragment.OnHeadlineSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//1
    }



    @Override
    public void onArticleSelected(String headline) {//b
        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
        detailsFragment.updateTextView(headline);
    }
}
