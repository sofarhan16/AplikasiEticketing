package com.example.eticketing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Tampilan2 extends AppCompatActivity {

    private RecyclerView rc;
    private ArrayList<Pesawat> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan2);

        rc = findViewById(R.id.rc_tmp2);
        rc.setHasFixedSize(true);

        list.addAll(PesawatData.getListData());
        showRecycler();




    }

    private void showRecycler() {

        rc.setLayoutManager(new LinearLayoutManager(this));
        ListPesawatAdapter listpsw = new ListPesawatAdapter(list, getIntent().getStringExtra("kota_keberangkatan"), getIntent().getStringExtra("kota_tujuan"), getIntent().getStringExtra("jumlah"), getIntent().getStringExtra("tanggal") );
        rc.setAdapter(listpsw);

    }
}
