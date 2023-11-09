package com.example.shapes_calc_projects;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hitungLingkaran extends AppCompatActivity {

    private EditText editTextSide;
    private TextView textViewResult;
    private TextView textViewResultKeliling;
    private Button buttonCalculateArea;
    private Button buttonCalculatePerimeter;
    private Button btn_back;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_lingkaran);

        editTextSide = findViewById(R.id.editTextSide);
        textViewResult = findViewById(R.id.textViewResult);
        buttonCalculateArea = findViewById(R.id.buttonCalculateArea);
        buttonCalculatePerimeter = findViewById(R.id.buttonCalculatePerimeter);
        textViewResultKeliling = findViewById(R.id.textViewResultKeliling);
        btn_back = findViewById(R.id.btn_back);

        buttonCalculateArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateArea();
            }
        });

        buttonCalculatePerimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatePerimeter();
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicit = new Intent(hitungLingkaran.this, MainActivity.class);
                startActivity(explicit);
            }
        });
    }

    private void calculateArea() {
        double side = Double.parseDouble(editTextSide.getText().toString());
        double area = Math.PI * Math.pow(side, 2);
        textViewResult.setText("Luas: " + area);
    }

    private void calculatePerimeter() {
        double side = Double.parseDouble(editTextSide.getText().toString());
        double perimeter = 2 * Math.PI * side;
        textViewResultKeliling.setText("Keliling: " + perimeter);
    }
}
