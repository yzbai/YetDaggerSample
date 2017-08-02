package com.brlite.app3.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.brlite.app3.R;
import com.brlite.app3.logic.UserBiz;
import com.brlite.app3lib.util.UsefulHelper;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    @Inject
    UserBiz _userBiz;

    @Inject
    UsefulHelper _usefulHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
