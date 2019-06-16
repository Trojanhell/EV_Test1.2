package com.example.evtest12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;

public class mobile extends AppCompatActivity {

    private EditText Phone;
    private Button Next;

    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile);

        Phone = (EditText) findViewById(R.id.pText);
        Next = (Button) findViewById(R.id.btn);


        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Phone.getText().toString());

                Phone.setText("");


            }
        });

    }


    /* OTP screen code*/
    private void validate(String phoneNo) {
        if ((phoneNo.equals("9872314250")) || (phoneNo.equals("9450984250"))) {
            Intent intent = new Intent(mobile.this, otp_new.class);
            startActivity(intent);
        } /*else{
            Intent intent = new Intent(mobile.this, NameReg.class);
            startActivity(intent);
        }*/
     /*  else if ((phoneNo.equals("8175076544")) || (phoneNo.equals("9450730239"))) {
            Intent intent = new Intent(mobile.this, NameReg.class);
            startActivity(intent);
        }*/
     else {
            Intent intent = new Intent(mobile.this, test2.class);
            startActivity(intent);
        }
}

}

/*       else {
            counter--;
            Toast.makeText(this, "INVALID MOBILE NUMBER", Toast.LENGTH_LONG).show();

            if(counter == 0){
                Next.setEnabled(false);
            }
        }*/



