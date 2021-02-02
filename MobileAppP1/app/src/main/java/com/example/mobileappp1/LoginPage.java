package com.example.mobileappp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class LoginPage extends Activity
{
    private Button b5;
    private EditText e1,e2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);
        b5=findViewById(R.id.button4);
        b5.setOnClickListener(new loginaction());
    }

    private class loginaction implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            String t1=e1.getText().toString();

            String t2=e2.getText().toString();

            if(t1.equals("azar")&&t2.equals("azar@123"))
            {
                Toast.makeText(getApplicationContext(),"LoginSucess",Toast.LENGTH_LONG).show();
                Bundle b=new Bundle();
                b.putString("k1",t1);
                Intent h=new Intent(LoginPage.this,UserHomePage.class);
                h.putExtras(b);
                startActivity(h);

            }
            else
            {
                Toast.makeText(getApplicationContext(),"LoginFail",Toast.LENGTH_LONG).show();
            }
        }
    }
}
