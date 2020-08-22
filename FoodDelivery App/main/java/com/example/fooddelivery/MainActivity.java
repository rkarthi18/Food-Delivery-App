package com.example.fooddelivery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;  // to set the navigation drawer

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        View headerView = navigationView.getHeaderView(0);


        navigationView.setNavigationItemSelectedListener( this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment() ).commit();
            navigationView.setCheckedItem(R.id.nav_home); // the initial page would be Home
        }


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home://  inflates the Home fragment

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
                break;
            case R.id.nav_profile: // sets the bundle and inflates the profile fragment

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ProfileFragment()).commit();

                break;
            case R.id.nav_order: // sets the bundle and inflates the order
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new OrderFragment()).commit();
                break;

            case R.id.nav_promotion:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new PromotionFragment()).commit();
                break;
            case R.id.nav_cart: // sets the bundle and inflates the Complaint fragment
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CartFragment()).commit();
                break;

            case R.id.nav_logout: // sets the bundle and inflates the Complaint fragment
                Toast.makeText(this, "Logging Out", Toast.LENGTH_SHORT).show();
                break;

        }
        drawer.closeDrawer(GravityCompat.START);




        return true;
    }
}
