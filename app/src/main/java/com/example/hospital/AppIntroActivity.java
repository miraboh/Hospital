package com.example.hospital;

import android.content.Intent;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

public class AppIntroActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_app_intro);

        addSlide(AppIntroFragment.newInstance("Medicine can cure but a good doctors inspirational words can give strength to fight from within.", "Laughing is the best medicine. But dont laugh for no reason.",
                R.drawable.i1, ContextCompat.getColor(getApplicationContext(), R.color.colorBlue)));
        addSlide(AppIntroFragment.newInstance("Good doctors understand responsibility better than privilege, accountability better than business.", "Embrace more health-conscious lifestyles.",
                R.drawable.i2, ContextCompat.getColor(getApplicationContext(), R.color.dot_dark_screen3)));
        addSlide(AppIntroFragment.newInstance("Before saying that we are extraordinary doctors we want to tell you that you are an extraordinary human being.", "Whether headache, fever or the flu, We cure.",
                R.drawable.i7, ContextCompat.getColor(getApplicationContext(), R.color.dot_dark_screen2)));
        addSlide(AppIntroFragment.newInstance("A good doctors comforting and reassuring words are some times more powerful than medicine.", "Be always grateful to God for life.",
                R.drawable.i8, ContextCompat.getColor(getApplicationContext(), R.color.dot_dark_screen4)));
    }


    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }
}