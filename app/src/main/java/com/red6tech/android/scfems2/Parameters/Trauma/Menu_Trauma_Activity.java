package com.red6tech.android.scfems2.Parameters.Trauma;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.red6tech.android.scfems2.Parameters.ObGyn.ChildbirthComplicationsActivity;
import com.red6tech.android.scfems2.Parameters.ObGyn.Menu_Obgyn_Activity;
import com.red6tech.android.scfems2.Parameters.ObGyn.PrenatalEmergenciesActivity;
import com.red6tech.android.scfems2.R;

public class Menu_Trauma_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__trauma_);
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

        Button animal_bite_button;
        animal_bite_button = (Button) findViewById(R.id.butt_animal_bite);
        animal_bite_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prenatalIntent = new Intent(Menu_Trauma_Activity.this, AnimalBiteActivity.class);
                startActivity(prenatalIntent);
            }
        });

        Button burns_button;
        burns_button = (Button) findViewById(R.id.butt_burns);
        burns_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent burnsIntent = new Intent(Menu_Trauma_Activity.this, BurnsActivity.class);
                startActivity(burnsIntent);
            }
        });

        Button chest_injury_button;
        chest_injury_button = (Button) findViewById(R.id.butt_chest_injury);
        chest_injury_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chestInjuryIntent = new Intent(Menu_Trauma_Activity.this, ChestInjuryActivity.class);
                startActivity(chestInjuryIntent);
            }
        });

        Button crush_button;
        crush_button = (Button) findViewById(R.id.butt_crush);
        crush_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crushIntent = new Intent(Menu_Trauma_Activity.this, CrushActivity.class);
                startActivity(crushIntent);
            }
        });

        Button decompression_button;
        decompression_button = (Button) findViewById(R.id.butt_decompression);
        decompression_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent decompressionIntent = new Intent(Menu_Trauma_Activity.this, DecompressionActivity.class);
                startActivity(decompressionIntent);
            }
        });

        Button drowning_button;
        drowning_button = (Button) findViewById(R.id.butt_drowning);
        drowning_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent drowningIntent = new Intent(Menu_Trauma_Activity.this, DrowningActivity.class);
                startActivity(drowningIntent);
            }
        });


    }
}
