package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class AppIntroActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_app_intro);


        addSlide(AppIntroFragment.newInstance("Select Your Food", "This application provides you the opportunity to order your loved food items from your favourite restaurants ",
                R.drawable.one, ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("Get it delivered ", "The food will be delivered to your door steps in less than 30 minutes and you have the take-away option as well",
                R.drawable.two, ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("Payment Mode", "The payable amount can be paid using your Debit/Credit  Card or Pay it though cash when the food item is delivered",
                R.drawable.four, ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("Enjoy !!", "Have a great time by enjoying the food you ordered",
                R.drawable.three, ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary)));

    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
