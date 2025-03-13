package com.example.przepisy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView;
    private ListView listView;
    private ArrayAdapter<Przepis> adapter;
    private ArrayList<Przepis> przepisy;
    public static final String NAZWAPRZEPISEK = "NAZWAPRZEPISEK";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String kategoria = getIntent().getExtras().get(MainActivity.KATEGORIA).toString();
        textView = findViewById(R.id.textViewNazwaKategorii);
        textView.setText(kategoria);
        Repozytorium repozytorium = new Repozytorium();
        przepisy = repozytorium.wypiszPrzepisy(kategoria);
        adapter = new ArrayAdapter<>(MainActivity2.this, android.R.layout.simple_list_item_1,przepisy);
        listView = findViewById(R.id.przepisy);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String nazwaprzepisku = przepisy.get(i).toString();
                        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                        intent.putExtra(NAZWAPRZEPISEK,nazwaprzepisku);
                        startActivity(intent);
                    }
                }
        );

    }
}