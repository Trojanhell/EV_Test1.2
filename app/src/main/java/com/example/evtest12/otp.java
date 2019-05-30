package com.example.evtest12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class otp extends AppCompatActivity {

    private EditText Otp;
    private Button Next;

    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        Otp = (EditText)findViewById(R.id.pText1);
        Next = (Button)findViewById(R.id.btn1);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Otp.getText().toString());

            }
        });

    }

    private void validate(String otpNo){
        if (otpNo.equals("0000")){
            Intent intent = new Intent(otp.this, Map.class);
            startActivity(intent);
        }

        else {
            counter--;
            Toast.makeText(this, "INVALID OTP", Toast.LENGTH_LONG).show();

            if(counter == 0){
                Next.setEnabled(false);
            }
        }
    }
}

