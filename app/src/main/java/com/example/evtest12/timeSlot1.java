package com.example.evtest12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class timeSlot1 extends AppCompatActivity {

    private Button proceed;
    private Button back_btn;
    RadioGroup radioGroup;
   // RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12, rb13, rb14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_slot1);

        proceed = findViewById(R.id.btn6);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(timeSlot1.this, Payment.class);
                startActivity(intent);
            }
        });

        back_btn = findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(timeSlot1.this, SlotBook.class);
                startActivity(intent);
            }
        });
/*
        radioGroup = (RadioGroup)findViewById(R.id.G2);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.rb1) {
                    Toast.makeText(timeSlot1.this, "09:00AM - 10:00AM", Toast.LENGTH_SHORT).show();
                }
                if (checkedId == R.id.rb2) {
                    Toast.makeText(timeSlot1.this, "10:00AM - 11:00AM", Toast.LENGTH_SHORT).show();
                }
                if (checkedId == R.id.rb3) {
                    Toast.makeText(timeSlot1.this, "11:00AM - 12:00PM", Toast.LENGTH_SHORT).show();
                }
                if (checkedId == R.id.rb4) {
                    Toast.makeText(timeSlot1.this, "12:00PM - 01:00PM", Toast.LENGTH_SHORT).show();
                }
                if (checkedId == R.id.rb5) {
                    Toast.makeText(timeSlot1.this, "02:00PM - 03:00PM", Toast.LENGTH_SHORT).show();
                }
                if (checkedId == R.id.rb6) {
                    Toast.makeText(timeSlot1.this, "03:00PM - 04:00PM", Toast.LENGTH_SHORT).show();
                }
                if (checkedId == R.id.rb7) {
                    Toast.makeText(timeSlot1.this, "04:00PM - 05:00PM", Toast.LENGTH_SHORT).show();
                }
                if (checkedId == R.id.rb8) {
                    Toast.makeText(timeSlot1.this, "05:00PM - 06:00PM", Toast.LENGTH_SHORT).show();
                }
                if (checkedId == R.id.rb9) {
                    Toast.makeText(timeSlot1.this, "06:00AM - 07:00PM", Toast.LENGTH_SHORT).show();
                }
                if (checkedId == R.id.rb10) {
                    Toast.makeText(timeSlot1.this, "07:00PM - 08:00PM", Toast.LENGTH_SHORT).show();
                }
                if (checkedId == R.id.rb11) {
                    Toast.makeText(timeSlot1.this, "08:00PM - 08:30PM", Toast.LENGTH_SHORT).show();
                }
                if (checkedId == R.id.rb12) {
                    Toast.makeText(timeSlot1.this, "08:30PM - 09:00PM", Toast.LENGTH_SHORT).show();
                }
                if (checkedId == R.id.rb13) {
                    Toast.makeText(timeSlot1.this, "09:00PM - 09:30PM", Toast.LENGTH_SHORT).show();
                }
                if (checkedId == R.id.rb14) {
                    Toast.makeText(timeSlot1.this, "09:30PM - 10:00PM", Toast.LENGTH_SHORT).show();
                }

            }
        });*/

    }


/*
    public void onRadioButtonClicked(View view){
       boolean checked = ((RadioButton) view).isChecked();
        String str = "";
        //Check whcih radio is clciked

        switch (view.getId()) {
            case R.id.rb1:
                if (checked)
                    str = "09:00AM - 10:00AM";
                break;

            case R.id.rb2:
                if (checked)
                    str = "09:00AM - 10:00AM";
                break;

            case R.id.rb3:
                if (checked)
                    str = "09:00AM - 10:00AM";
                break;

            case R.id.rb4:
                if (checked)
                    str = "09:00AM - 10:00AM";
                break;

            case R.id.rb5:
                if (checked)
                    str = "09:00AM - 10:00AM";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }*/

    }

