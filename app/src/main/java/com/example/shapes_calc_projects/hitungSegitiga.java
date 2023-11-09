package com.example.shapes_calc_projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hitungSegitiga extends AppCompatActivity {
    Button BtnKeliling, BtnLuas, BtnHitung;
    TextView TVhasil;
    EditText ETtinggi, ETsisiA, ETsisiB, ETsisiC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_segitiga);

        Button btn_back = findViewById(R.id.btn_back);
        ETtinggi = findViewById(R.id.tinggi);
        ETsisiA = findViewById(R.id.sisiA);
        ETsisiB = findViewById(R.id.sisiB);
        ETsisiC = findViewById(R.id.sisiC);
        TVhasil = findViewById(R.id.hasil);
        BtnHitung = findViewById(R.id.Bhitung);
        BtnLuas = findViewById(R.id.Bluas);
        BtnKeliling = findViewById(R.id.Bkeliling);


        BtnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a, b, c, d;
                double hitung;

                if (!ETtinggi.getText().toString().isEmpty()) {
                    a = Integer.parseInt(ETsisiA.getText().toString());
                    d = Integer.parseInt(ETtinggi.getText().toString());
                    hitung = 0.5 * a * d;
                    TVhasil.setText(hitung+"");
                } else {
                    a = Integer.parseInt(ETsisiA.getText().toString());
                    b = Integer.parseInt(ETsisiB.getText().toString());
                    c = Integer.parseInt(ETsisiC.getText().toString());
                    hitung = a + b + c;
                    TVhasil.setText(hitung+"");
                }

            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(hitungSegitiga.this, MainActivity.class);
                startActivity(explicit);
            }
        });

        BtnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ETsisiA.setText("");
                ETsisiB.setText("");
                ETsisiC.setText("");
                TVhasil.setText("");
                ETtinggi.setVisibility(view.VISIBLE);
                ETsisiA.setVisibility(view.VISIBLE);
                ETsisiB.setVisibility(view.GONE);
                ETsisiC.setVisibility(view.GONE);
            }
        });

        BtnKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ETsisiA.setText("");
                ETtinggi.setText("");
                TVhasil.setText("");
                ETtinggi.setVisibility(view.GONE);
                ETsisiA.setVisibility(view.VISIBLE);
                ETsisiB.setVisibility(view.VISIBLE);
                ETsisiC.setVisibility(view.VISIBLE);
            }
        });

    }
}