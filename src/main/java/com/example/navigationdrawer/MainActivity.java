package com.example.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);


        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case R.id.camera:
                        menuItem.setChecked(true);
                        Show_Message("Camera is selected");
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.movie:
                        menuItem.setChecked(true);
                        Show_Message("Movie is selected");
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.tool:
                        menuItem.setChecked(true);
                        Show_Message("Tool is selected");
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.slide_show:
                        menuItem.setChecked(true);
                        Show_Message("Slide show is selected");
                        drawerLayout.closeDrawers();
                        return true;

                }

                return false;
            }
        });

    }

    public void Show_Message(String message){

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;

        }


        return super.onOptionsItemSelected(item);
    }
}