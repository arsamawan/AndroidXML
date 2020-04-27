package com.example.myapp3.ui.dashboard;

import android.content.Intent;
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

import com.example.myapp3.MainActivity;
import com.example.myapp3.R;
import com.example.myapp3.dashboard;

import java.util.ArrayList;
import java.util.HashMap;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel = ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);



        final TextView textView = root.findViewById(R.id.text_dashboard);
        ArrayList<HashMap<String, String>> items = dashboardViewModel.getText();

                textView.setText("its an test from ---"+items.get(0).get("link").toString());


        return root;
    }
}
