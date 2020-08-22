package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void toLogin(View v) {
        Toast.makeText(this,"Directing to Login Page",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void Register(View v) {
        Toast.makeText(this,"Registered",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

}
