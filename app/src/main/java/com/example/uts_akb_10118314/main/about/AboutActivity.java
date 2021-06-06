package com.example.uts_akb_10118314.main.about;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.example.uts_akb_10118314.R;
import com.example.uts_akb_10118314.main.diary.CategoriActivity;
import com.example.uts_akb_10118314.main.profile.ProfileActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

//04 June 2021, 10118314, Moch Rivally Ilham Bintang, IF8
public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //Initialize And Assign Variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Set Home Selected
        bottomNavigationView.setSelectedItemId(R.id.About);

        //Perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ProfileId:
                        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.CatatanHarian:
                        startActivity(new Intent(getApplicationContext(), CategoriActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.About:
                        startActivity(new Intent(getApplicationContext(), AboutActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }

                return false;
            }
        });
    }
}