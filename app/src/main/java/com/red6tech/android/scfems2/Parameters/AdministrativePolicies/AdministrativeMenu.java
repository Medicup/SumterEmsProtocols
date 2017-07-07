package com.red6tech.android.scfems2.Parameters.AdministrativePolicies;

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

public class AdministrativeMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrative_menu);
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

        final Button general_measure_butt;
        general_measure_butt = (Button) findViewById(R.id.butt_general_measure);
        general_measure_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genIntent = new Intent(AdministrativeMenu.this, GeneralMeasures.class);
                startActivity(genIntent);
            }
        });

        final Button crime_scene_butt;
        crime_scene_butt = (Button) findViewById(R.id.butt_crime_response);
        crime_scene_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crimeIntent = new Intent(AdministrativeMenu.this, CrimeSceneReport.class);
                startActivity(crimeIntent);
            }
        });
    }
}
