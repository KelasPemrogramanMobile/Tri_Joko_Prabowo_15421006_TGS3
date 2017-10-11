package com.bowotmf.tugas3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    private EditText edNama, edAlamat, edTtl, edPswd;
    private Spinner edAgama;
    private RadioGroup edJk;
    private RadioButton edBtn;
    private Button btnGetData;
    String nama, alamat, ttl, password, agama, btnjk;
    int jeniskelamin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edNama          = (EditText) findViewById(R.id.isiNama);
        edAlamat        = (EditText) findViewById(R.id.isiAlamat);
        edTtl           = (EditText) findViewById(R.id.isiTtl);
        edPswd          = (EditText) findViewById(R.id.isiPassword);
        edAgama         = (Spinner) findViewById(R.id.sp_name);
        edJk            = (RadioGroup) findViewById(R.id.radioGrupNb);
        btnGetData      = (Button) findViewById(R.id.btnambildata);

        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama            = edNama.getText().toString();
                alamat          = edAlamat.getText().toString();
                ttl             = edTtl.getText().toString();
                password        = edPswd.getText().toString();
                agama           = edAgama.getSelectedItem().toString();
                jeniskelamin    = edJk.getCheckedRadioButtonId();
                edBtn           = (RadioButton) findViewById(jeniskelamin);
                btnjk           = edBtn.getText().toString();


                Intent go = new Intent(MainActivity.this, Hasil.class);
                go.putExtra("Nama", nama);
                go.putExtra("Alamat", alamat);
                go.putExtra("Ttl", ttl);
                go.putExtra("Password", password);
                go.putExtra("JenisKelamin", btnjk);
                go.putExtra("Agama", agama);
                startActivity(go);

                finish();

            }


        });
    }
}





