package com.example.eticketing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtdari = findViewById(R.id.indari);
        final EditText txtke = findViewById(R.id.intujuan);
        final EditText txttgl = findViewById(R.id.intgl);
        final EditText txtjmlh = findViewById(R.id.injmlh);
        Button btnmove = findViewById(R.id.btnnext);
        btnmove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tampilan2.class);
                intent.putExtra("kota_keberangkatan", txtdari.getText().toString() );
                intent.putExtra("kota_tujuan", txtke.getText().toString());
                intent.putExtra("jumlah", txtjmlh.getText().toString());
                intent.putExtra("tanggal", txttgl.getText().toString());
                startActivity(intent);
            }
        });
    }


}
