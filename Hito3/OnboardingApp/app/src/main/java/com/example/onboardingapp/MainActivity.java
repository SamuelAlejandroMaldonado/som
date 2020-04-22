package com.example.onboardingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.onboardingapp.adapters.OnboardingAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPagerContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        _initializeComponents();


        _initializeFragmentAdapter();
    }

    public void _initializeComponents() {
        viewPagerContainer = findViewById(R.id.viewPagerContainer);
    }

    public void _initializeFragmentAdapter() {
        OnboardingAdapter adapter = new OnboardingAdapter(getSupportFragmentManager());
        viewPagerContainer.setAdapter(adapter);
    }
}



