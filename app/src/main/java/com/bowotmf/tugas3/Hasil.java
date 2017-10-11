package com.bowotmf.tugas3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Hasil extends AppCompatActivity {

    TextView textNama, textAlamat, textTtl, textPassword, textAgama, textJk;
    Intent nama, alamat, ttl, password, agama, jk;
    String strNama, strAlamat, strTtl, strPassword, strAgama, strJk;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);


        textNama        = (TextView) findViewById(R.id.textNama);
        textAlamat      = (TextView) findViewById(R.id.textAlamat);
        textTtl         = (TextView) findViewById(R.id.textTtl);
        textPassword    = (TextView) findViewById(R.id.textPassword);
        textAgama       = (TextView) findViewById(R.id.textAgama);
        textJk          = (TextView) findViewById(R.id.textJk);
        btnback         = (Button) findViewById(R.id.kembali);

        nama = getIntent();
        strNama = nama.getStringExtra("Nama");
        textNama.setText(strNama);

        alamat = getIntent();
        strAlamat = alamat.getStringExtra("Alamat");
        textAlamat.setText(strAlamat);

        ttl = getIntent();
        strTtl = ttl.getStringExtra("Ttl");
        textTtl.setText(strTtl);

        password = getIntent();
        strPassword = password.getStringExtra("Password");
        textPassword.setText(strPassword);

        agama = getIntent();
        strAgama = agama.getStringExtra("Agama");
        textAgama.setText(strAgama);

        jk = getIntent();
        strJk = jk.getStringExtra("JenisKelamin");
        textJk.setText(strJk);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(Hasil.this, MainActivity.class);
                startActivity(kembali);
                finish();
            }
        });


    }
}



