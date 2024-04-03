package com.example.chilangogourmetcdmx;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ListView lv1;

    private String nombres [] = {"Tecolote", "Los Vitrales", "La Cuna", "Las Moras"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            lv1 = (ListView) findViewById(R.id.lv1);

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item, nombres);
            lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, Tecolote.class);
                    startActivity(intent);
                }else if (position == 1) {
                    Intent intent = new Intent(MainActivity.this, LosVitrales.class);
                    startActivity(intent);
                }else if (position == 2) {
                    Intent intent = new Intent(MainActivity.this, LaCuna.class);
                    startActivity(intent);
                }else if (position == 3) {
                    Intent intent = new Intent(MainActivity.this, LasMoras.class);
                    startActivity(intent);}
            }

        });
    }
}