package com.example.samvel_homework_lesson_32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.samvel_homework_lesson_32.fragments.FragmentA;
import com.example.samvel_homework_lesson_32.viewModels.TwoFragmentsViewModel;

public class SharingActivity extends AppCompatActivity {

    TwoFragmentsViewModel twoFragmentsViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharing);
        FragmentA startFragment = new FragmentA();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container_view_2, startFragment);
        ft.commit();
    }
}