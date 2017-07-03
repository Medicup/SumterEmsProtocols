package com.red6tech.android.scfems2.Parameters.Pediatric;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.red6tech.android.scfems2.Parameters.Cardiac.AcsActivity;
import com.red6tech.android.scfems2.Parameters.Cardiac.Menu_Card_Activity;
import com.red6tech.android.scfems2.R;

public class Menu_Pediatric extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__pediatric);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        fab.hide();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final Button pedi_asys_butt;
        pedi_asys_butt = (Button) findViewById(R.id.butt_pedi_asystole);
        pedi_asys_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pedAsystoleIntent = new Intent(Menu_Pediatric.this, PediatricAsystoleActivity.class);
                startActivity(pedAsystoleIntent);
            }
        });
        final Button pedi_brady_butt;
        pedi_brady_butt = (Button) findViewById(R.id.butt_pedi_brady);
        pedi_brady_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pedBradyIntent = new Intent(Menu_Pediatric.this, PediatricBradycardiaActivity.class);
                startActivity(pedBradyIntent);
            }
        });

        final Button pedi_fbo_butt;
        pedi_fbo_butt = (Button) findViewById(R.id.butt_pedi_fbo);
        pedi_fbo_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pedFboIntent = new Intent(Menu_Pediatric.this, PediatricFboActivity.class);
                startActivity(pedFboIntent);
            }
        });

        final Button pedi_febrile_butt;
        pedi_febrile_butt = (Button) findViewById(R.id.butt_pedi_febrile);
        pedi_febrile_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pedFebrileIntent = new Intent(Menu_Pediatric.this, PediatricFebrileEmergencyActivity.class);
                startActivity(pedFebrileIntent);
            }
        });

        final Button pedi_infectious_butt;
        pedi_infectious_butt = (Button) findViewById(R.id.butt_pedi_infectious);
        pedi_infectious_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pedInfectiousIntent = new Intent(Menu_Pediatric.this, PediatricInfectiosActivity.class);
                startActivity(pedInfectiousIntent);
            }
        });

        final Button pedi_tachy_butt;
        pedi_tachy_butt = (Button) findViewById(R.id.butt_pedi_tachy);
        pedi_tachy_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pedTachyIntent = new Intent(Menu_Pediatric.this, PediatricTachycardiaActivity.class);
                startActivity(pedTachyIntent);
            }
        });

        final Button pedi_vfib_butt;
        pedi_vfib_butt = (Button) findViewById(R.id.butt_pedi_vfib);
        pedi_vfib_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pedVfibIntent = new Intent(Menu_Pediatric.this, PediatricVfibActivity.class);
                startActivity(pedVfibIntent);
            }
        });
    }
}
