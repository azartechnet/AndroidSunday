package com.example.mobileappp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class AdminPage extends Activity
{
    private Button b17;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminpage);
        b17=findViewById(R.id.button6);
        b17.setOnClickListener(new RatingPage());
    }

    private class RatingPage implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            Intent h1=new Intent(AdminPage.this,AddProductReview.class);
            startActivity(h1);
        }
    }
}
