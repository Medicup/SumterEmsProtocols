package com.red6tech.android.scfems2.Parameters.Respiratory;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.red6tech.android.scfems2.MainActivity;
import com.red6tech.android.scfems2.R;

public class Menu_Respiratory_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__respiratory_);
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

        Button asthma_but;
        asthma_but = (Button) findViewById(R.id.m_resp_asthma);
        asthma_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asthmaIntent = new Intent(Menu_Respiratory_Activity.this, AsthmaActivity.class);
                startActivity(asthmaIntent);
            }
        });

        Button carbonmono_but;
        carbonmono_but = (Button) findViewById(R.id.m_resp_carbonmono);
        carbonmono_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent carbonMonoIntent = new Intent(Menu_Respiratory_Activity.this, CarbonMonoxideActivity.class);
                startActivity(carbonMonoIntent);
            }
        });

        Button copd_but;
        copd_but = (Button) findViewById(R.id.m_resp_copd);
        copd_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent copdIntent = new Intent(Menu_Respiratory_Activity.this, CopdActivity.class);
                startActivity(copdIntent);
            }
        });

        Button diffair_but;
        diffair_but = (Button) findViewById(R.id.m_resp_diffair);
        diffair_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent diffAirIntent = new Intent(Menu_Respiratory_Activity.this, DifficultAirwayActivity.class);
                startActivity(diffAirIntent);
            }
        });

        Button fbao_but;
        fbao_but = (Button) findViewById(R.id.m_resp_fbao);
        fbao_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fbaoIntent = new Intent(Menu_Respiratory_Activity.this, FbaoActivity.class);
                startActivity(fbaoIntent);
            }
        });

        Button pulmonay_but;
        pulmonay_but = (Button) findViewById(R.id.m_resp_pulmonary);
        pulmonay_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pulmonaryaIntent = new Intent(Menu_Respiratory_Activity.this, PulmonaryEdemaActivity.class);
                startActivity(pulmonaryaIntent);
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
