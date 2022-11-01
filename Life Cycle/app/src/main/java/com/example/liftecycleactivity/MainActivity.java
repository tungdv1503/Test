package com.example.liftecycleactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("test", "onDestroy: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("test", "onRestart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("test", "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("test", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("test", "onStop: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("test", "onStart: ");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("test","onCreate");
    }
}