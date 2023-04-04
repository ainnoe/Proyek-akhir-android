package com.example.bismillahproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class HomeActivity extends AppCompatActivity implements
        BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView menu;
    private TextView Tulisan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        menu = findViewById(R.id.menu);
        Tulisan= findViewById(R.id.Tulisan);
        menu.setOnNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (MenuItem.getItemId()){
            case R.id.home:
                //aksi ketika home di klik
                Tulisan.setText("Tombol Home di Klik");
                break;
            case R.id.input:
                //aksi ketika input di klik
                Tulisan.setText("Tombol laporan di Klik");
                break;
        }
        return true;
    }
}