package com.example.webviewconcepts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new Sample());
    }

    private class Sample implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            Intent g1=new Intent(MainActivity.this,WebViewProcess.class);
            startActivity(g1);
        }
    }
}
