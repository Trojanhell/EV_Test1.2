package com.example.evtest12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Map extends AppCompatActivity {


    private Button book;
    private Button strt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        book = findViewById(R.id.btn2);
        strt = findViewById(R.id.btn3);


        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Map.this, SlotBook.class);
                startActivity(intent);

                overridePendingTransition(R.anim.goup, R.anim.godown);
            }
        });

        strt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Map.this, Start.class);
                startActivity(intent1);
            }
        });
    }





}
/*
      book = (Button)findViewById(R.id.btn2);
      strt = (Button)findViewById(R.id.btn3);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn2:
                Intent intent = new Intent(Map.this, SlotBook.class);
                startActivity(intent);
                break;

            case R.id.btn3:
                Intent intent1 = new Intent(Map.this, Start.class);
                startActivity(intent1);

                break;
        }
    }
}
*/