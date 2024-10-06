package com.example.babe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class School_info extends AppCompatActivity {
  CardView c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_info);
        getSupportActionBar().hide();
        c1=(CardView) findViewById(R.id.bibis);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bibis();
            }
        });

    }

    private void bibis() {
        LayoutInflater inflater=LayoutInflater.from(this);
        View view=inflater.inflate(R.layout.bibis,null);
        final AlertDialog alertDialog=new AlertDialog.Builder(this)
                .setView(view)
                .create();
        alertDialog.show();
        alertDialog.setCanceledOnTouchOutside(false);
    }
}