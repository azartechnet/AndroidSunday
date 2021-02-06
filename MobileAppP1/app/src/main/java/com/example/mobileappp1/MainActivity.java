package com.example.mobileappp1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button b1,b2,b3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b1.setOnClickListener(new loginpage());
        b2.setOnClickListener(new adminpage());
        b3.setOnClickListener(new registerpage());
    }

    private class loginpage implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            Intent k1=new Intent(MainActivity.this,LoginPage.class);
            startActivity(k1);
            Toast.makeText(getApplicationContext(),"Your Click LoginButton",Toast.LENGTH_LONG).show();
        }
    }

    private class adminpage implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent k2=new Intent(MainActivity.this,LoginPage.class);
            startActivity(k2);
            Toast.makeText(getApplicationContext(),"Login AdminPage",Toast.LENGTH_LONG).show();

        }
    }

    private class registerpage implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent k3=new Intent(MainActivity.this,RegisterPage.class);
            startActivity(k3);
            Toast.makeText(getApplicationContext(),"RegisterPage",Toast.LENGTH_LONG).show();
        }
    }
}
