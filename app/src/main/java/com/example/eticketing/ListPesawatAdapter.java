package com.example.eticketing;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListPesawatAdapter extends RecyclerView.Adapter<ListPesawatAdapter.ListViewHolder> {
    private ArrayList<Pesawat> listPesawat;

    String ktberangkat ;
    String kttujuan;
    String kttanggal;
    String ktjumlah;

    public ListPesawatAdapter(ArrayList<Pesawat> list, String kota_keberangkatan, String kota_tujuan, String jumlah, String tanggal) {this.listPesawat = list; ktberangkat=kota_keberangkatan; kttujuan=kota_tujuan; kttanggal=tanggal; ktjumlah=jumlah;}
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_pesawat, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder listViewHolder, final int i) {
        final Pesawat psw = listPesawat.get(i);

        Glide.with(listViewHolder.itemView.getContext()).load(psw.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(listViewHolder.imgPhoto);

        listViewHolder.tvName.setText(psw.getName());
        listViewHolder.tvHarga.setText(psw.getHarga());
        listViewHolder.rlpesawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pesawat = new Intent(listViewHolder.itemView.getContext(), Tampilan3.class);
                pesawat.putExtra("kota_keberangkatan", ktberangkat);
                pesawat.putExtra("kota_tujuan", kttujuan);
                pesawat.putExtra("tanggal", kttanggal);
                pesawat.putExtra("jumlah", ktjumlah);
                pesawat.putExtra("harga", psw.getHarga());
                listViewHolder.itemView.getContext().startActivity(pesawat);


            }
        });


    }

    @Override
    public int getItemCount(){return listPesawat.size();}

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvHarga;
        RelativeLayout rlpesawat;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_psw);
            tvName = itemView.findViewById(R.id.nama_pesawat);
            tvHarga = itemView.findViewById(R.id.harga);
            rlpesawat = itemView.findViewById(R.id.rlpesawat);
        }
    }
}
