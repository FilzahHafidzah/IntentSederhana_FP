package com.filzah.intentsederhana_fp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MovePesanan extends AppCompatActivity implements View.OnClickListener {

    private Button tnCancel;
    private TextView txtNama, txtAlamat, txtPesan;

    public static String EXTRA_NAME = "extra_name";
    public static String EXTRA_ADDRESS = "extra_address";
    public static String EXTRA_ORDER = "extra_order";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_pesanan);

        //deklarasi
        tnCancel = findViewById(R.id.tn_cancel);
        txtNama = findViewById(R.id.nama_receiver);
        txtAlamat = findViewById(R.id.alamat_receiver);
        txtPesan = findViewById(R.id.pesanan_receiver);

        tnCancel.setOnClickListener(this);

        //get intent
        String name = getIntent().getStringExtra(EXTRA_NAME);
        String address = getIntent().getStringExtra(EXTRA_ADDRESS);
        String order = getIntent().getStringExtra(EXTRA_ORDER);

        txtNama.setText(name);
        txtAlamat.setText(address);
        txtPesan.setText(order);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tn_cancel:
                Intent moveCancel = new Intent(MovePesanan.this, MainActivity.class);
                startActivity(moveCancel);
                finish();
                break;
        }
    }
}
