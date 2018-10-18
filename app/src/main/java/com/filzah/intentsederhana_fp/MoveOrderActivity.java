package com.filzah.intentsederhana_fp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MoveOrderActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtNama, edtAlamat, edtPesanan;

    private Button tnPesan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_order);

        edtNama = findViewById(R.id.edt_nama);
        edtAlamat = findViewById(R.id.edt_alamat);
        edtPesanan = findViewById(R.id.edt_pesanan);
        tnPesan = findViewById(R.id.tn_order);
        tnPesan.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        //taking input user
        String name = edtNama.getText().toString();
        String  address= edtAlamat.getText().toString();
        String order  = edtPesanan.getText().toString();

        //taking input user
//        edtNama.getText().toString();
//        edtAlamat.getText().toString();
//        edtPesanan.getText().toString();
//
        //sending data
        Intent movePesanan = new Intent(MoveOrderActivity.this, MovePesanan.class);
        movePesanan.putExtra(MovePesanan.EXTRA_NAME, name);
        movePesanan.putExtra(MovePesanan.EXTRA_ADDRESS, address);
        movePesanan.putExtra(MovePesanan.EXTRA_ORDER, order);

        //start intent
        startActivity(movePesanan);





    }
}
