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

        final Button end_of_life_butt;
        end_of_life_butt = (Button) findViewById(R.id.butt_end_of_life);
        end_of_life_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eolIntent = new Intent(AdministrativeMenu.this, EndOfLife.class);
                startActivity(eolIntent);
            }
        });

        final Button medication_alternative_butt;
        medication_alternative_butt = (Button) findViewById(R.id.butt_medication_alternative);
        medication_alternative_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent medicationIntent = new Intent(AdministrativeMenu.this, MedicationAlternatives.class);
                startActivity(medicationIntent);
            }
        });

        final Button physician_on_scene_butt;
        physician_on_scene_butt = (Button) findViewById(R.id.butt_physician_on_scene);
        physician_on_scene_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent physicianIntent = new Intent(AdministrativeMenu.this, PhysicianOnScene.class);
                startActivity(physicianIntent);
            }
        });

        final Button radio_report_butt;
        radio_report_butt = (Button) findViewById(R.id.butt_radio_report);
        radio_report_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent radioIntent = new Intent(AdministrativeMenu.this, RadioReport.class);
                startActivity(radioIntent);
            }
        });
    }
}
