package com.example.examenhito3.App;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.examenhito3.R;

public class CalcBasica extends AppCompatActivity {
    private TextView tvShowU,tvShows;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_basica);
        initializeComponents();
    }

    private void initializeComponents()
    {
        tvShowU = findViewById(R.id.tvShowU);
        tvShows = findViewById(R.id.tvShowS);
        String username = getIntent().getStringExtra("US");
        String select = getIntent().getStringExtra("AS");
        String msg1 = "App: " + select;
        String msg = "Bienvenido: " + username;
        tvShowU.setText(msg);
        tvShows.setText(msg1);
    }
}
