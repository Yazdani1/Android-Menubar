package com.yazdaniscodelab.androidmenu;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.menu1:
                Toast.makeText(getApplicationContext(),R.string.item1,Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu2:
                Toast.makeText(getApplicationContext(),R.string.item2,Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu3:

                Toast.makeText(getApplicationContext(),R.string.item3,Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }


}
