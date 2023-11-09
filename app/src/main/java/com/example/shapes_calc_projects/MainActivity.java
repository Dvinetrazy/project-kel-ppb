package com.example.shapes_calc_projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHitung1 = findViewById(R.id.btnHitung1);
        Button btnHitung2 = findViewById(R.id.btnHitung2);
        Button btnHitung3 = findViewById(R.id.btnHitung3);
        Button btnHitung4 = findViewById(R.id.btnHitung4);
        Button aboutUs = findViewById(R.id.aboutUs);

        btnHitung1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(MainActivity.this, hitungLingkaran.class);
                startActivity(explicit);
            }
        });

        btnHitung2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(MainActivity.this, hitungPersegi.class);
                startActivity(explicit);
            }
        });

        btnHitung3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(MainActivity.this, hitungPerjang.class);
                startActivity(explicit);
            }
        });

        btnHitung4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(MainActivity.this, hitungSegitiga.class);
                startActivity(explicit);
            }
        });

        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(MainActivity.this, aboutUs.class);
                startActivity(explicit);
            }
        });
    }
}