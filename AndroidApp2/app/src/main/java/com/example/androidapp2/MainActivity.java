package com.example.androidapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        Log.i(TAG,"OnCreate Called");
    }
    protected  void onStart()
    {
        super.onStart();
        Log.i(TAG,"OnStart Called");
    }
    protected void OnResume()
    {
        super.onResume();;
        Log.i(TAG,"OnResume Started");
    }
    protected void OnPause()
    {
        super.onPause();
        Log.i(TAG,"OnPause Called");
    }
    protected void OnStop()
    {
        super.onStop();
        Log.i(TAG,"OnStopCalled");
    }
    protected void OnDestroy()
    {
        super.onDestroy();
        Log.i(TAG,"OnDestory");
    }
}
