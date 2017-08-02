package com.example.ibanez_xiphos.databindingsample.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.ibanez_xiphos.databindingsample.R;
import com.example.ibanez_xiphos.databindingsample.databinding.ActivityMainBinding;
import com.example.ibanez_xiphos.databindingsample.Demo;

public class MainActivity extends AppCompatActivity {

    private static final int LAYOUT_ACTIVITY = R.layout.activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, LAYOUT_ACTIVITY);
        binding.setUser(Demo.getUser());
    }
}