package com.example.examenhito3.App;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.examenhito3.R;

public class CalcCientiffica extends AppCompatActivity {
    private TextView tvShowU1,tvShows1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_cientiffica);
        initializeComponents();
    }
    private void initializeComponents()
    {
        tvShowU1 = findViewById(R.id.tvShowU1);
        tvShows1 = findViewById(R.id.tvShowS1);
        String username = getIntent().getStringExtra("US");
        String select = getIntent().getStringExtra("AS");
        String msg1 = "App: " + select;
        String msg = "Bienvenido: " + username;

        tvShowU1.setText(msg);
        tvShows1.setText(msg1);
    }
}
