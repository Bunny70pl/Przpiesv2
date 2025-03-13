package com.example.przepisy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listViewkategorie;
    public static final String KATEGORIA = "KATEGORIA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewkategorie = findViewById(R.id.listViewkategorie);
        listViewkategorie.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String kategoria = listViewkategorie.getItemAtPosition(i).toString();
                        Toast.makeText(MainActivity.this, "Wybrano: " + kategoria, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                        intent.putExtra(KATEGORIA,kategoria);
                        startActivity(intent);
                    }
                }
        );
    }
}