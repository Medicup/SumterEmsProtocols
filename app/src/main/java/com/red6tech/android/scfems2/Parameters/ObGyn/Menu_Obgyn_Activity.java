package com.red6tech.android.scfems2.Parameters.ObGyn;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.red6tech.android.scfems2.MainActivity;
import com.red6tech.android.scfems2.Parameters.Pediatric.Menu_Pediatric;
import com.red6tech.android.scfems2.R;

public class Menu_Obgyn_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__obgyn_);
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


        Button childbirth_button;
        childbirth_button = (Button) findViewById(R.id.butt_childbirth);
        childbirth_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent childbirthlIntent = new Intent(Menu_Obgyn_Activity.this, ChildbirthActivity.class);
                startActivity(childbirthlIntent);
            }
        });

        Button childbirth_comp_button;
        childbirth_comp_button = (Button) findViewById(R.id.butt_childbirth_comp);
        childbirth_comp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent childCompIntent = new Intent(Menu_Obgyn_Activity.this, ChildbirthComplicationsActivity.class);
                startActivity(childCompIntent);
            }
        });

        Button newborn_button;
        newborn_button = (Button) findViewById(R.id.butt_newborn);
        newborn_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newbornlIntent = new Intent(Menu_Obgyn_Activity.this, NewbornActivity.class);
                startActivity(newbornlIntent);
            }
        });

        Button postpartum_button;
        postpartum_button = (Button) findViewById(R.id.butt_post_partum);
        postpartum_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent postPartumlIntent = new Intent(Menu_Obgyn_Activity.this, PostPartumActivity.class);
                startActivity(postPartumlIntent);
            }
        });

        Button prenatal_button;
        prenatal_button = (Button) findViewById(R.id.butt_prenatal);
        prenatal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prenatalIntent = new Intent(Menu_Obgyn_Activity.this, PrenatalEmergenciesActivity.class);
                startActivity(prenatalIntent);
            }
        });

        Button trauma_button;
        trauma_button = (Button) findViewById(R.id.butt_trauma);
        trauma_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent traumaIntent = new Intent(Menu_Obgyn_Activity.this, TraumaInPregnancyActivity.class);
                startActivity(traumaIntent);
            }
        });

        Button vaginal_button;
        vaginal_button = (Button) findViewById(R.id.butt_vaginal);
        vaginal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vaginallIntent = new Intent(Menu_Obgyn_Activity.this, VaginalBleedingActivity.class);
                startActivity(vaginallIntent);
            }
        });
    }
}
