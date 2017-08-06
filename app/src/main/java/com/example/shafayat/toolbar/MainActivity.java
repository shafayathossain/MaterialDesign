package com.example.shafayat.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int i = item.getItemId();
        if(i == R.id.item1){
            Toast.makeText(this, "item one selected", Toast.LENGTH_SHORT).show();
        }
        else if(i == R.id.item2){
            Toast.makeText(this, "item two selected", Toast.LENGTH_SHORT).show();
        }
        else if(i == R.id.item3){
            Toast.makeText(this, "item 3 selected", Toast.LENGTH_SHORT).show();
        }
        else if (i == R.id.search){
            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
        }
        else if(i == R.id.profile){
            Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
        }
        else if(i == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
