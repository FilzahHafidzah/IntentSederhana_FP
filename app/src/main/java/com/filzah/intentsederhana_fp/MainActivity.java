package com.filzah.intentsederhana_fp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView tnFood;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tnFood = findViewById(R.id.tn_go_food);

        tnFood.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tn_go_food:
                Intent moveToOrder = new Intent(MainActivity.this,MoveOrderActivity.class);
                startActivity(moveToOrder);
                break;
        }
    }
}
