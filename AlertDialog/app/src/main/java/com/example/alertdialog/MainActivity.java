package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button b;
    private AlertDialog.Builder a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        b.setOnClickListener(new demo());
    }
    public class demo implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            a=new AlertDialog.Builder(MainActivity.this);
            // a=new AlertDialog.Builder(LoginHomePage.this);
            a.setTitle("ConfirmationBox");
            a.setMessage("Do u want to close?").setPositiveButton("Yes",new class1()).
                    setNegativeButton("No",new class2());
            a.show();
        }
    }

    public class class1 implements DialogInterface.OnClickListener {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            MainActivity.this.finish();
            //LoginHomePage.this.finish();
        }
    }

    private class class2 implements DialogInterface.OnClickListener {
        @Override
        public void onClick(DialogInterface dialog, int i) {
            dialog.cancel();
        }
    }
}
