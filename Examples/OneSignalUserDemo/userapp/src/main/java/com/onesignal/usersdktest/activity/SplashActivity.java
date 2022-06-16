package com.onesignal.usersdktest.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.onesignal.usersdktest.R;
import com.onesignal.usersdktest.model.SplashActivityViewModel;

public class SplashActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity_layout);

        new SplashActivityViewModel()
                .onActivityCreated(this)
                .setupInterfaceElements();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

}
