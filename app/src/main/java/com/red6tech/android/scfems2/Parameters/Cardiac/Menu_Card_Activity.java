package com.red6tech.android.scfems2.Parameters.Cardiac;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.red6tech.android.scfems2.R;

public class Menu_Card_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__card_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//TODO Fix Pulmonary Edema with ACS?
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

        final Button acs_butt;
        acs_butt = (Button) findViewById(R.id.m_but_card_acs);
        acs_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acsIntent = new Intent(Menu_Card_Activity.this, AcsActivity.class);
                startActivity(acsIntent);
            }
        });
        final Button asystole_butt;
        asystole_butt = (Button) findViewById(R.id.m_but_card_asystole);
        asystole_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asystoleIntent = new Intent(Menu_Card_Activity.this, AsystoleActivity.class);
                startActivity(asystoleIntent);
            }
        });
        final Button brady_butt;
        brady_butt = (Button) findViewById(R.id.m_but_card_brady);
        brady_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bradyIntent = new Intent(Menu_Card_Activity.this, BradycardiaActivity.class);
                startActivity(bradyIntent);
            }
        });
        final Button narr_irreg_butt;
        narr_irreg_butt = (Button) findViewById(R.id.m_but_card_narrow_irreg);
        narr_irreg_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent narrowIrregIntent = new Intent(Menu_Card_Activity.this, NarrowComplexIrregActivity.class);
                startActivity(narrowIrregIntent);
            }
        });
        final Button narr_reg_butt;
        narr_reg_butt = (Button) findViewById(R.id.m_but_card_narrow_reg);
        narr_reg_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent narrowRegIntent = new Intent(Menu_Card_Activity.this, NarrowComplexRegActivity.class);
                startActivity(narrowRegIntent);
            }
        });
        final Button rosc_butt;
        rosc_butt = (Button) findViewById(R.id.m_but_card_rosc);
        rosc_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent roscIntent = new Intent(Menu_Card_Activity.this, RoscActivity.class);
                startActivity(roscIntent);
            }
        });
        final Button vad_butt;
        vad_butt = (Button) findViewById(R.id.m_but_card_vad);
        vad_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vadIntent = new Intent(Menu_Card_Activity.this, VadActivity.class);
                startActivity(vadIntent);
            }
        });
        final Button vfib_butt;
        vfib_butt = (Button) findViewById(R.id.m_but_card_vfib);
        vfib_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vfibIntent = new Intent(Menu_Card_Activity.this, VfibActivity.class);
                startActivity(vfibIntent);
            }
        });
        final Button wide_complex_butt;
        wide_complex_butt = (Button) findViewById(R.id.m_but_card_wide_complex);
        wide_complex_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wideComplexIntent = new Intent(Menu_Card_Activity.this, WideComplexActivity.class);
                startActivity(wideComplexIntent);
            }
        });
    }

}
