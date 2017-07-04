package com.red6tech.android.scfems2.Parameters.MedicalEmergency;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.red6tech.android.scfems2.Parameters.ObGyn.Menu_Obgyn_Activity;
import com.red6tech.android.scfems2.Parameters.ObGyn.TraumaInPregnancyActivity;
import com.red6tech.android.scfems2.R;

public class Menu_Medical_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__medical_);
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

        Button abdpain_button;
        abdpain_button = (Button) findViewById(R.id.but_abdpain);
        abdpain_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abdPainIntent = new Intent(Menu_Medical_Activity.this, AbdominalPainActivity.class);
                startActivity(abdPainIntent);
            }
        });

        Button allergic_button;
        allergic_button = (Button) findViewById(R.id.but_allergic_reaction);
        allergic_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent allergicIntent = new Intent(Menu_Medical_Activity.this, AllergicReactionActivity.class);
                startActivity(allergicIntent);
            }
        });

        Button ams_button;
        ams_button = (Button) findViewById(R.id.but_ams);
        ams_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent amsIntent = new Intent(Menu_Medical_Activity.this, AmsActivity.class);
                startActivity(amsIntent);
            }
        });

        Button cva_button;
        cva_button = (Button) findViewById(R.id.but_cva);
        cva_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cvaIntent = new Intent(Menu_Medical_Activity.this, CvaActivity.class);
                startActivity(cvaIntent);
            }
        });

        Button overdose_button;
        overdose_button = (Button) findViewById(R.id.but_overdose);
        overdose_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent overdoseIntent = new Intent(Menu_Medical_Activity.this, DrugOverdoseActivity.class);
                startActivity(overdoseIntent);
            }
        });

        Button environ_cold_button;
        environ_cold_button = (Button) findViewById(R.id.but_environ_cold);
        environ_cold_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent environColdIntent = new Intent(Menu_Medical_Activity.this, EnvironmentalColdActivity.class);
                startActivity(environColdIntent);
            }
        });

        Button environ_heat_button;
        environ_heat_button = (Button) findViewById(R.id.but_environ_heat);
        environ_heat_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent environHeatIntent = new Intent(Menu_Medical_Activity.this, EnvironmentalHeatActivity.class);
                startActivity(environHeatIntent);
            }
        });

        Button eso_fbo_button;
        eso_fbo_button = (Button) findViewById(R.id.but_esop_fbao);
        eso_fbo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent esoFboIntent = new Intent(Menu_Medical_Activity.this, EsophagealForeignBodyObstructionActivity.class);
                startActivity(esoFboIntent);
            }
        });

        Button excited_delirium_button;
        excited_delirium_button = (Button) findViewById(R.id.but_excied_delirium);
        excited_delirium_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent excitedDelirumIntent = new Intent(Menu_Medical_Activity.this, ExcitedDeliriumActivity.class);
                startActivity(excitedDelirumIntent);
            }
        });

        Button extra_pyramidal_button;
        extra_pyramidal_button = (Button) findViewById(R.id.but_extra_pyramidal);
        extra_pyramidal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent extraPyramidalIntent = new Intent(Menu_Medical_Activity.this, ExtraPyramidalActivity.class);
                startActivity(extraPyramidalIntent);
            }
        });

        Button hazmat_button;
        hazmat_button = (Button) findViewById(R.id.but_hazmat);
        hazmat_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hazmatIntent = new Intent(Menu_Medical_Activity.this, HazardousMaterialActivity.class);
                startActivity(hazmatIntent);
            }
        });

        Button htn_button;
        htn_button = (Button) findViewById(R.id.but_htn);
        htn_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent htnIntent = new Intent(Menu_Medical_Activity.this, HypertensiveCrisisActivity.class);
                startActivity(htnIntent);
            }
        });

        Button hypo_hyperglycemia_button;
        hypo_hyperglycemia_button = (Button) findViewById(R.id.but_hypohyperglycemia);
        hypo_hyperglycemia_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hyperHypoGlycemiaIntent = new Intent(Menu_Medical_Activity.this, HypoHyperGlycemiaActivity.class);
                startActivity(hyperHypoGlycemiaIntent);
            }
        });

        Button nausea_button;
        nausea_button = (Button) findViewById(R.id.but_nausea);
        nausea_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nauseaIntent = new Intent(Menu_Medical_Activity.this, NauseaVomitingActivity.class);
                startActivity(nauseaIntent);
            }
        });

        Button nonenviron_heat_button;
        nonenviron_heat_button = (Button) findViewById(R.id.but_nonenviron_hyper);
        nonenviron_heat_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nonEnvironHeatIntent = new Intent(Menu_Medical_Activity.this, NonEnvironmentalHyperthermiaActivity.class);
                startActivity(nonEnvironHeatIntent);
            }
        });

        Button psycho_button;
        psycho_button = (Button) findViewById(R.id.but_psyhological);
        psycho_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent psychologicalIntent = new Intent(Menu_Medical_Activity.this, PsychologicalBehavioralActivity.class);
                startActivity(psychologicalIntent);
            }
        });

        Button scene_rehab_button;
        scene_rehab_button = (Button) findViewById(R.id.but_scene_rehab);
        scene_rehab_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sceneRehabIntent = new Intent(Menu_Medical_Activity.this, SceneRehabActivity.class);
                startActivity(sceneRehabIntent);
            }
        });

        Button seizure_button;
        seizure_button = (Button) findViewById(R.id.but_seizure);
        seizure_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent seizureIntent = new Intent(Menu_Medical_Activity.this, SeizureActivity.class);
                startActivity(seizureIntent);
            }
        });

        Button sepsis_button;
        sepsis_button = (Button) findViewById(R.id.but_sepsis);
        sepsis_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sepsisIntent = new Intent(Menu_Medical_Activity.this, SepsisActivity.class);
                startActivity(sepsisIntent);
            }
        });

        Button shock_button;
        shock_button = (Button) findViewById(R.id.but_shock);
        shock_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shockIntent = new Intent(Menu_Medical_Activity.this, ShockActivity.class);
                startActivity(shockIntent);
            }
        });

        Button sickle_cell_button;
        sickle_cell_button = (Button) findViewById(R.id.but_sicklecell);
        sickle_cell_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sickleCellIntent = new Intent(Menu_Medical_Activity.this, SickleCellAnemiaActivity.class);
                startActivity(sickleCellIntent);
            }
        });

        Button syncope_button;
        syncope_button = (Button) findViewById(R.id.but_syncope);
        syncope_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent syncopeIntent = new Intent(Menu_Medical_Activity.this, SyncopeActivity.class);
                startActivity(syncopeIntent);
            }
        });
    }
}
