package com.example.mobileappp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class UserHomePage extends Activity
{
    private TextView tv9;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userhomepage);
        tv9=findViewById(R.id.textView9);

        Intent h=getIntent();

        Bundle b=h.getExtras();

        String r1=b.getString("k1");

        tv9.setText(r1);
    }
}
