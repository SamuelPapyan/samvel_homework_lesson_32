package com.example.samvel_homework_lesson_32;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.samvel_homework_lesson_32.fragments.BottomNavigationFragment1;
import com.example.samvel_homework_lesson_32.fragments.BottomNavigationFragment2;
import com.example.samvel_homework_lesson_32.fragments.BottomNavigationFragment3;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class BottomNavigationViewActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    BottomNavigationFragment1 fragment1 = new BottomNavigationFragment1();
    BottomNavigationFragment2 fragment2 = new BottomNavigationFragment2();
    BottomNavigationFragment3 fragment3 = new BottomNavigationFragment3();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_view);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        switch(item.getItemId()){
            case R.id.fragment_1:
                ft.replace(R.id.fragment_container_view, fragment1);
                ft.commit();
                return true;
            case R.id.fragment_2:
                ft.replace(R.id.fragment_container_view, fragment2);
                ft.commit();
                return true;
            case R.id.fragment_3:
                ft.replace(R.id.fragment_container_view, fragment3);
                ft.commit();
                return true;
        }
        return false;
    }
}