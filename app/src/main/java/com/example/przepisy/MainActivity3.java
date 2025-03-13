package com.example.przepisy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    private TextView textView;
    private ArrayList<Przepis> przepisy2;
    private ImageView imageView;
    private TextView polubienia;
    private TextView opis;
    private Button buton;
    private RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView = findViewById(R.id.textViewNazwaPrzepisu);
        Repozytorium repozytorium = new Repozytorium();
        String nazwa =  getIntent().getExtras().getString(MainActivity2.NAZWAPRZEPISEK).toString();
        przepisy2 = repozytorium.wypiszPrzepisyNazwa(nazwa);
        textView.setText(nazwa);
        opis = findViewById(R.id.textView3);
        imageView = findViewById(R.id.imageView2);
        opis.setText(przepisy2.get(0).getSkladniki());
        imageView.setImageResource(przepisy2.get(0).getIdObrazka());
        ratingBar = findViewById(R.id.ratingBar);
        buton = findViewById(R.id.button);
        ratingBar.setRating( przepisy2.get(0).getPolubienia());
        ratingBar.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                        //todo
                    }
                }
        );
        buton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_TEXT,przepisy2.get(0).getNazwaPrzepisu()+" \n"+ przepisy2.get(0).getSkladniki());
                        intent.setType("text/plain");
                        Intent podzielSieIntent = Intent.createChooser(intent,null);
                        startActivity(podzielSieIntent);
                    }
                }
        );
    }
}