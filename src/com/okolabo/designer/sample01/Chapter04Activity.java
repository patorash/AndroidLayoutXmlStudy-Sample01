package com.okolabo.designer.sample01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Chapter04Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter04);
        setTitle(R.string.title_chapter04);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch(item.getItemId()) {
            case R.id.menu_chapter01:
                intent = new Intent(this, Chapter01Activity.class);
                startActivity(intent);
                break;
                
            case R.id.menu_chapter02:
                intent = new Intent(this, Chapter02Activity.class);
                startActivity(intent);
                break;
                
            case R.id.menu_chapter03:
                intent = new Intent(this, Chapter03Activity.class);
                startActivity(intent);
                break;
                
            case R.id.menu_chapter04:
                intent = new Intent(this, Chapter04Activity.class);
                startActivity(intent);
                break;
                
            case R.id.menu_chapter05:
                intent = new Intent(this, Chapter05Activity.class);
                startActivity(intent);
                break;
                
            case R.id.menu_chapter06:
                intent = new Intent(this, Chapter06Activity.class);
                startActivity(intent);
                break;
        }
        return true;
    }
}