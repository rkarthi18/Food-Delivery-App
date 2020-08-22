package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void toRegister(View v) {
        Toast.makeText(this,"Directing to Register Page",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void toProfile(View v) {
        Toast.makeText(this,"Directing to Account",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
