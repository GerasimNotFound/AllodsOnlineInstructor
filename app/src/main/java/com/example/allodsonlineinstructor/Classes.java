package com.example.allodsonlineinstructor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Classes extends AppCompatActivity implements View.OnClickListener {
    ImageButton Druid, Mage, Necr, Jryak, Pal, Mist, Archer, War, Bard, Engenier,Demonologist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);
        Druid = findViewById(R.id.Druid);
        Mage = findViewById(R.id.Mage);
        Necr = findViewById(R.id.Necr);
        Jryak = findViewById(R.id.Jryak);
        Pal = findViewById(R.id.Pal);
        Mist = findViewById(R.id.Mist);
        Archer = findViewById(R.id.Bow);
        War = findViewById(R.id.War);
        Bard = findViewById(R.id.Bard);
        Engenier = findViewById(R.id.Engenier);
        Demonologist = findViewById(R.id.Demon);
        Druid.setOnClickListener(this);
        Mage.setOnClickListener(this);
        Necr.setOnClickListener(this);
        Jryak.setOnClickListener(this);
        Pal.setOnClickListener(this);
        Mist.setOnClickListener(this);
        Archer.setOnClickListener(this);
        War.setOnClickListener(this);
        Bard.setOnClickListener(this);
        Engenier.setOnClickListener(this);
        Demonologist.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, Druid.class);
        Intent intent2 = new Intent(this, Mages.class);
        Intent intent3 = new Intent(this, Necro.class);
        Intent intent4 = new Intent(this, Prist.class);
        Intent intent5 = new Intent(this, Paladin.class);
        Intent intent6 = new Intent(this, Mistik.class);
        Intent intent7 = new Intent(this, Bows.class);
        Intent intent8 = new Intent(this, Warriors.class);
        Intent intent9 = new Intent(this, Bards.class);
        Intent intent10 = new Intent(this, Enginier.class);
        Intent intent11 = new Intent(this, Demons.class);
        Druid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
        Mage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent2);
            }
        });
        Necr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent3);
            }
        });
        Jryak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent4);
            }
        });
        Pal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent5);
            }
        });
        Mist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent6);
            }
        });
        Archer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent7);
            }
        });
        War.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent8);
            }
        });
        Bard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent9);
            }
        });
        Engenier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent10);
            }
        });
        Demonologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent11);
            }
        });
    }
}