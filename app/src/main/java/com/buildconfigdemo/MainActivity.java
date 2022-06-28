package com.buildconfigdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt = (TextView)findViewById(R.id.txt);
        txt.setText("Base Url:"+BuildConfig.SERVER_URL
                +" \n Build Type:"+BuildConfig.BUILD_TYPE
                +" \n Build Auth:"+BuildConfig.KEY_AUTH
                +" \n Subscription key:"+BuildConfig.SUBSCRIPTION_KEY);
    }
}