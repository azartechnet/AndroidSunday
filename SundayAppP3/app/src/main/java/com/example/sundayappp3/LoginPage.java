package com.example.sundayappp3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class LoginPage extends Activity
{
    private EditText e3;
    private RatingBar rb1;
    private Button b1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        e3=findViewById(R.id.editText3);
        rb1=findViewById(R.id.ratingBar);
        b1=findViewById(R.id.button3);
        b1.setOnClickListener(new Sample());
    }

    private class Sample implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            String mv=e3.getText().toString();
            String rating=String.valueOf(rb1.getRating());
            String c=mv+rating;
            Toast.makeText(getApplicationContext(),"YourMovieRating:"+c,Toast.LENGTH_LONG).show();


        }
    }
}
