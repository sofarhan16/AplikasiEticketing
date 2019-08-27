package com.example.eticketing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tampilan3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan3);

        TextView txtdari = findViewById(R.id.outputdari);
        TextView txttujuan = findViewById(R.id.outputtujuan);
        TextView txtjumlah = findViewById(R.id.outputjumlah);
        TextView txttanggal = findViewById(R.id.outputtanggal);
        TextView txttotal = findViewById(R.id.outputtotal);

        txtdari.setText(getIntent().getStringExtra("kota_keberangkatan"));
        txttujuan.setText(getIntent().getStringExtra("kota_tujuan"));
        txtjumlah.setText(getIntent().getStringExtra("jumlah"));
        txttanggal.setText(getIntent().getStringExtra("tanggal"));
        int hasil = Integer.parseInt(getIntent().getStringExtra("jumlah"))*Integer.parseInt(getIntent().getStringExtra("harga"));

        txttotal.setText(String.valueOf(hasil));

    }
}
