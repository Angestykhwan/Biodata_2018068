package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class biodataTeori extends AppCompatActivity {
    EditText nama, nim, prodi, angkatan, fakultas;
    TextView nama_t, nim_t, prodi_t, angkatan_t, fakultas_t;
    Button tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata_teori);

        nama = findViewById(R.id.input_nama);
        nim = findViewById(R.id.input_nim);
        prodi = findViewById(R.id.input_prodi);
        angkatan = findViewById(R.id.input_angkatan);
        fakultas = findViewById(R.id.input_fakultas);
        nama_t = findViewById(R.id.output_nama);
        nim_t = findViewById(R.id.output_nim);
        prodi_t = findViewById(R.id.output_prodi);
        angkatan_t = findViewById(R.id.output_angkatan);
        fakultas_t = findViewById(R.id.output_fakultas);
        tampil = findViewById(R.id.btn_proses);
        tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama_t.setText(nama.getText().toString());
                nim_t.setText(nim.getText().toString());
                prodi_t.setText(prodi.getText().toString());
                angkatan_t.setText(angkatan.getText().toString());
                fakultas_t.setText(fakultas.getText().toString());

            }
        });
    }
}