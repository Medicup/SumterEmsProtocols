package com.red6tech.android.scfems2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.red6tech.android.scfems2.Parameters.Cardiac.Menu_Card_Activity;
import com.red6tech.android.scfems2.Parameters.ClinicalCare.InitialMedicalCareActivity;
import com.red6tech.android.scfems2.Parameters.ClinicalCare.PainManagementActivity;
import com.red6tech.android.scfems2.Parameters.MedicalEmergency.Menu_Medical_Activity;
import com.red6tech.android.scfems2.Parameters.ObGyn.Menu_Obgyn_Activity;
import com.red6tech.android.scfems2.Parameters.Pediatric.Menu_Pediatric;
import com.red6tech.android.scfems2.Parameters.Respiratory.Menu_Respiratory_Activity;
import com.red6tech.android.scfems2.Parameters.Trauma.ChestInjuryActivity;
import com.red6tech.android.scfems2.Parameters.Trauma.CrushActivity;
import com.red6tech.android.scfems2.Parameters.Trauma.DecompressionActivity;
import com.red6tech.android.scfems2.Parameters.Trauma.DrowningActivity;
import com.red6tech.android.scfems2.Parameters.Trauma.Menu_Trauma_Activity;
import com.red6tech.android.scfems2.data.DbHelper;

import static com.red6tech.android.scfems2.R.id.fab;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        Button init_medical_button;
        init_medical_button = (Button) findViewById(R.id.but_initmed_trauma_care);
        init_medical_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent initMedicalIntent = new Intent(MainActivity.this, InitialMedicalCareActivity.class);
                startActivity(initMedicalIntent);
            }
        });

        Button pain_button;
        pain_button = (Button) findViewById(R.id.but_pain);
        pain_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent painIntent = new Intent(MainActivity.this, PainManagementActivity.class);
                startActivity(painIntent);
            }
        });

        Button resp_button;
        resp_button = (Button) findViewById(R.id.but_respiratory);
        resp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent respIntent = new Intent(MainActivity.this, Menu_Respiratory_Activity.class);
                startActivity(respIntent);
            }
        });

        Button card_button;
        card_button = (Button) findViewById(R.id.but_cardiac);
        card_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cardIntent = new Intent(MainActivity.this, Menu_Card_Activity.class);
                startActivity(cardIntent);
            }
        });

        Button medical_button;
        medical_button = (Button) findViewById(R.id.but_medical_emergencies);
        medical_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent medicalIntent = new Intent(MainActivity.this, Menu_Medical_Activity.class);
                startActivity(medicalIntent);
            }
        });

        Button pediatric_button;
        pediatric_button = (Button) findViewById(R.id.but_pediatric);
        pediatric_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pediatriclIntent = new Intent(MainActivity.this, Menu_Pediatric.class);
                startActivity(pediatriclIntent);
            }
        });

        Button obgyn_button;
        obgyn_button = (Button) findViewById(R.id.but_obgyn);
        obgyn_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obgynIntent = new Intent(MainActivity.this, Menu_Obgyn_Activity.class);
                startActivity(obgynIntent);
            }
        });

        Button trauma_button;
        trauma_button = (Button) findViewById(R.id.but_trauma);
        trauma_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent traumaIntent = new Intent(MainActivity.this, Menu_Trauma_Activity.class);
                startActivity(traumaIntent);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Log.i(TAG, "Trying to create DB");
        DbHelper dbHelper = new DbHelper(this);
        dbHelper.getReadableDatabase();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
