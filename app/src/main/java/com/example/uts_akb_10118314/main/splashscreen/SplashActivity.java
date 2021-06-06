package com.example.uts_akb_10118314.main.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import com.example.uts_akb_10118314.R;
import com.example.uts_akb_10118314.main.viewpager.ViewPagerActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
//04 June 2021, 10118314, Moch Rivally Ilham Bintang, IF8
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, ViewPagerActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);

    }
}