package com.example.contextmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(TextView)findViewById(R.id.textview);
        registerForContextMenu(t);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        // TODO Auto-generated method stub
        menu.setHeaderTitle("Options");
        menu.add("Copy");
        menu.add("Edit");
        menu.add("Paste");
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        if(item.getTitle()=="Edit")
        {
            Toast.makeText(MainActivity.this,"EditOptionselected",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Copy")
        {
            Toast.makeText(MainActivity.this,"CopyOptionselected",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(MainActivity.this,"PasteOptionselected",Toast.LENGTH_LONG).show();
        }
        return super.onContextItemSelected(item);
    }
}
