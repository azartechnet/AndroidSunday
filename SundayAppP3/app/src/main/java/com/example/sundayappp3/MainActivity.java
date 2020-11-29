package com.example.sundayappp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText e1,e2;
    private Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);
        b1=findViewById(R.id.button);

        b1.setOnClickListener(new Sample());
    }

    private class Sample implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            String u1=e1.getText().toString();
            String p1=e2.getText().toString();

            if(u1.equals("admin")&&p1.equals("admin"))
            {
                Toast.makeText(getApplicationContext(),"LoginSucess",Toast.LENGTH_LONG).show();
                Intent f1=new Intent(MainActivity.this,LoginPage.class);
                startActivity(f1);
            }
            else
            {
                Toast.makeText(getApplicationContext(),"LoginFail",Toast.LENGTH_LONG).show();
            }
        }
    }
}
