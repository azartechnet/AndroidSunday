package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new PrcessMenu());
    }

    private class PrcessMenu implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            //Creating the instance of PopupMenu
            PopupMenu popup = new PopupMenu(MainActivity.this, b1);
            //Inflating the Popup using xml file
            popup.getMenuInflater().inflate(R.menu.menu_popup, popup.getMenu());

            //registering popup with OnMenuItemClickListener
            popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                public boolean onMenuItemClick(MenuItem item) {
                    Toast.makeText(MainActivity.this,"You Selected : " + item.getTitle(),Toast.LENGTH_SHORT).show();
                    return true;
                }
            });

            popup.show();//showing popup menu
        }
    }
}
