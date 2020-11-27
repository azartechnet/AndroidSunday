package com.example.sundayappp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ed1,ed2;//declare the variables
    private Button bs,reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.editText);
        ed2=findViewById(R.id.editText2);
        bs=findViewById(R.id.button);
        reset=findViewById(R.id.button2);
        bs.setOnClickListener(new SumProcess());
        reset.setOnClickListener(new ResetProcess());
    }

    private class SumProcess implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            String t1=ed1.getText().toString();
            String t2=ed2.getText().toString();
            int a=Integer.parseInt(t1);
            int b=Integer.parseInt(t2);
            int sum=a+b;

            Toast.makeText(getApplicationContext(),"SumOf"+sum,Toast.LENGTH_LONG).show();
        }
    }

    private class ResetProcess implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            ed1.setText(" ");
            ed2.setText(" ");
        }
    }
}
