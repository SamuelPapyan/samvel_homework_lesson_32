package com.example.samvel_homework_lesson_32.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.samvel_homework_lesson_32.R;
import com.example.samvel_homework_lesson_32.SharingActivity;
import com.example.samvel_homework_lesson_32.viewModels.TwoFragmentsViewModel;


public class FragmentB extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        AppCompatEditText editText = view.findViewById(R.id.fragment_b_edit_text);
        AppCompatButton fragmentALink = view.findViewById(R.id.fragment_a_link_button);
        AppCompatButton submit = view.findViewById(R.id.fragment_b_submit_button);
        AppCompatTextView message = view.findViewById(R.id.fragment_b_message);
        TwoFragmentsViewModel twoFragmentsViewModel = ViewModelProviders.of(this).get(TwoFragmentsViewModel.class);
        twoFragmentsViewModel.getMessageContainerB().observe(getViewLifecycleOwner(),text->{
            message.setText((CharSequence) text);
        });
        submit.setOnClickListener(v->{
            twoFragmentsViewModel.sendMessageToA(editText.getText().toString());
            Toast.makeText(getContext(), "Fragment A Message Sent.", Toast.LENGTH_SHORT).show();
        });
        fragmentALink.setOnClickListener(v->{
            FragmentA nextFragment = new FragmentA();
            SharingActivity activity = (SharingActivity)getActivity();
            FragmentManager fm = activity.getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_view_2, nextFragment);
            ft.commit();
        });
    }
}