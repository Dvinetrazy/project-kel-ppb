package com.example.shapes_calc_projects;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class hitungPerjang extends AppCompatActivity {

    private EditText editTextLength;
    private EditText editTextWidth;
    private Button buttonCalculateArea;
    private Button buttonCalculatePerimeter;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_perjang);

        Button btn_back = findViewById(R.id.btn_back);
        editTextLength = findViewById(R.id.editTextLength);
        editTextWidth = findViewById(R.id.editTextWidth);
        buttonCalculateArea = findViewById(R.id.buttonCalculateArea);
        buttonCalculatePerimeter = findViewById(R.id.buttonCalculatePerimeter);
        textViewResult = findViewById(R.id.textViewResult);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(hitungPerjang.this, MainActivity.class);
                startActivity(explicit);
            }
        });

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
    }


    private void calculateArea() {
        double length = Double.parseDouble(editTextLength.getText().toString());
        double width = Double.parseDouble(editTextWidth.getText().toString());
        double area = length * width;
        textViewResult.setText("Luas: " + area);
    }

    private void calculatePerimeter() {
        double length = Double.parseDouble(editTextLength.getText().toString());
        double width = Double.parseDouble(editTextWidth.getText().toString());
        double perimeter = 2 * (length + width);
        textViewResult.setText("Keliling: " + perimeter);
    }
}
