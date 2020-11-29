package com.example.sundayappp4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox pizza,coffe,burger;
    private Button buttonorder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pizza=findViewById(R.id.checkBox);
        coffe=findViewById(R.id.checkBox2);
        burger=findViewById(R.id.checkBox3);

        buttonorder=findViewById(R.id.button);
        buttonorder.setOnClickListener(new Sample());
    }

    private class Sample implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            int totamount=0;
            StringBuilder result=new StringBuilder();
            result.append("selectedItems:");
            if(pizza.isChecked())
            {
                result.append("\nPizza 100Rs");
                totamount+=100;
            }
            if(coffe.isChecked())
            {
                result.append("\nCoffe 50Rs");
                totamount+=50;
            }
            if(burger.isChecked())
            {
                result.append("\nBurger 120Rs");
                totamount+=120;
            }
            result.append("\nTotal"+totamount+"Rs");
            Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
        }
    }
}
