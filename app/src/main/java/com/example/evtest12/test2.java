package com.example.evtest12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class test2 extends AppCompatActivity {


    private EditText name;
    private Button next, back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        back = (Button)findViewById(R.id.back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(test2.this, signup.class);
                startActivity(intent);
            }
        });

        final Button next = (Button) findViewById(R.id.btnReg);
        name = findViewById(R.id.enterName);

        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String usernameInput = name.getText().toString().trim();

                next.setEnabled(!usernameInput.isEmpty());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
       // next.findViewById(R.id.btnReg);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(test2.this, otp_new.class);
                startActivity(intent);
            }
        });
    }
}
