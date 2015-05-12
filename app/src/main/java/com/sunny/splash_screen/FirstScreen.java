package com.sunny.splash_screen;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Sunny on 5/12/2015.
 */
public class FirstScreen extends ActionBarActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onDestroy() {

        super.onDestroy();

    }
}
