package com.example.mobileappp1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class AddProductReview extends Activity
{
    private EditText e10,e11;
    private Button view;
    private RatingBar rb;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addproductreview);
        e10=findViewById(R.id.editText3);
        e11=findViewById(R.id.editText4);
        view=findViewById(R.id.button9);
        rb=findViewById(R.id.ratingBar);
        view.setOnClickListener(new RatingAction());
    }

    private class RatingAction implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            String t1=e10.getText().toString();
            String t2=e11.getText().toString();

            String rb1=String.valueOf(rb.getRating());

            Toast.makeText(getApplicationContext(),"RatingProcess"+t1+""+t2+""+rb1,Toast.LENGTH_LONG).show();

        }
    }
}
