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

import java.util.ArrayList;
import java.util.HashMap;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
 //  private Object String;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel = ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);



        final TextView textView = root.findViewById(R.id.text_dashboard);
        ArrayList<HashMap<String, String>> items = dashboardViewModel.getText();
        for(int i = 0 ; i<items.size();i++) {
            textView.setText(items.get(i).get("link").toString());

        }

       // TextView.setText(TextView.getText().toString() + String)



        System.out.println("TEXTVIEW CHECK TEST = " + textView);

        return root;
    }
}


