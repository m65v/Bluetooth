package com.example.mayra.carapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Button;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> listAdapter;
    Button ConnectNew;
    ListView listView;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        init();

    }
    private void init(){
        ConnectNew(Button)findViewById(R.id.bConnectNew);
        listView(ListView)findViewById(R.id.listView);
        listAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,0);
        listView.setAdapter(listAdapter);



    }
}
