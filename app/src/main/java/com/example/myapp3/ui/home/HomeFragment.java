package com.example.myapp3.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapp3.R;
import com.example.myapp3.ui.dashboard.DashboardViewModel;

import java.util.ArrayList;
import java.util.HashMap;

public class HomeFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel homeViewModel = ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);



        final TextView textView = root.findViewById(R.id.home_textview);
        ArrayList<HashMap<String, String>> items = homeViewModel.getText();
        textView.setText(items.get(0).get("pubDate").toString());
        // TextView.setText(TextView.getText().toString() + String)



        System.out.println("TEXTVIEW CHECK TEST = " + textView);

        return root;
    }
}
