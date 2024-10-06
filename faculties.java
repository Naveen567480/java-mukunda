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

public class faculties extends AppCompatActivity {
 CardView c1,c2,c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculties);
        getSupportActionBar().hide();
        c1=(CardView) findViewById(R.id.CEF);
        c2=(CardView) findViewById(R.id.COM);
        c3=(CardView) findViewById(R.id.EDU);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computerengineering();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                commerce();
            }
        });

    }

    private void commerce() {
        LayoutInflater inflater=LayoutInflater.from(this);
        View view=inflater.inflate(R.layout.commerce1,null);
        final AlertDialog alertDialog=new AlertDialog.Builder(this)
                .setView(view)
                .create();
        alertDialog.show();
        alertDialog.setCanceledOnTouchOutside(false);
    }

    private void computerengineering() {

    LayoutInflater inflater=LayoutInflater.from(this);
    View view=inflater.inflate(R.layout.c_engineering,null);
    final AlertDialog alertDialog=new AlertDialog.Builder(this)
            .setView(view)
            .create();
        alertDialog.show();
        alertDialog.setCanceledOnTouchOutside(false);
}
}