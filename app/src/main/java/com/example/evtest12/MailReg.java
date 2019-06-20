package com.example.evtest12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MailReg extends AppCompatActivity {

    private Button mailreg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_reg);

        Button mailreg = (Button) findViewById(R.id.btnRegMail);
        //mailreg.findViewById(R.id.btnRegMail);
        mailreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MailReg.this, otp_new.class);
                startActivity(intent);
            }
        });
    }
}
