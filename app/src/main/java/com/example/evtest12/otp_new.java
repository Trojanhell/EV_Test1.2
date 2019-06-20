package com.example.evtest12;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class otp_new extends AppCompatActivity {

    private EditText editText1, editText2, editText3, editText4;
    private EditText[] editTexts;
    private Button Next;
    private Button Back;
    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_new);

        Next = (Button)findViewById(R.id.btn1);
        Back = (Button)findViewById(R.id.back_btn);

        editText1 = (EditText) findViewById(R.id.et1);
        ((EditText) editText1).setSelection(0);
        editText2 = (EditText) findViewById(R.id.et2);
        editText3 = (EditText) findViewById(R.id.et3);
        editText4 = (EditText) findViewById(R.id.et4);
        editTexts = new EditText[]{editText1, editText2, editText3, editText4};

        editText1.addTextChangedListener(new PinTextWatcher(0));
        editText2.addTextChangedListener(new PinTextWatcher(1));
        editText3.addTextChangedListener(new PinTextWatcher(2));
        editText4.addTextChangedListener(new PinTextWatcher(3));

        editText1.setOnKeyListener((View.OnKeyListener) new PinOnKeyListener(0));
        editText2.setOnKeyListener(new PinOnKeyListener(1));
        editText3.setOnKeyListener(new PinOnKeyListener(2));
        editText4.setOnKeyListener(new PinOnKeyListener(3));

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(otp_new.this, mobile.class);
                startActivity(intent);
            }
        });

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          //      validate1(editText1.getText().toString());

              //  validate1(editText2.getText().toString());

                //validate1(editText3.getText().toString());

                //validate1(editText4.getText().toString());

                Intent intent = new Intent(otp_new.this, nav_activity.class);
                startActivity(intent);
            }
        });
    }
/*
    private void validate1(String otpNo1) {
        if ((editText1.equals("0"))) {
            editText2.requestFocus();
        }


    }

    private void validate2(String otpNo2) {
        if (editText2.equals("0")) {
            editText3.requestFocus();
        }

    }
    private void validate3(String otpNo3) {
        if (editText3.equals("0")) {
            editText4.requestFocus();
        }

    }
    private void validate4(String otpNo4){
        if (editText4.equals("0")){
            Intent intent = new Intent(otp_new.this, Map.class);
            startActivity(intent);
        }

        else {
            counter--;
            Toast.makeText(this, "INVALID OTP", Toast.LENGTH_LONG).show();

            if(counter == 0){
                Next.setEnabled(false);
            }
        }
    }*/



    public class PinTextWatcher implements TextWatcher {

        private int currentIndex;
        private boolean isFirst = true, isLast = false;
        private String newTypedString = "";

        PinTextWatcher(int currentIndex) {
            this.currentIndex = currentIndex;

            if (currentIndex == 0)
                this.isFirst = true;
            else if (currentIndex == editTexts.length - 1)
                this.isLast = true;
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            newTypedString = s.subSequence(start, start + count).toString().trim();
        }



        @Override
        public void afterTextChanged(Editable s) {

            String text = newTypedString;

            /* Detect paste event and set first char */
            if (text.length() > 1)
                text = String.valueOf(text.charAt(0)); // TODO: We can fill out other EditTexts

            editTexts[currentIndex].removeTextChangedListener(this);
            editTexts[currentIndex].setText(text);
            editTexts[currentIndex].setSelection(text.length());
            editTexts[currentIndex].addTextChangedListener(this);

            if (text.length() == 1)
                moveToNext();
            // else if (text.length() == 0)
            //  moveToPrevious();
        }

        private void moveToNext() {
            if (!isLast)
                editTexts[currentIndex + 1].requestFocus();

            if (isAllEditTextsFilled() && isLast) { // isLast is optional
                editTexts[currentIndex].clearFocus();
                hideKeyboard();
            }
        }

        private void moveToPrevious() {
            if (!isFirst)
                editTexts[currentIndex - 1].requestFocus();
        }

        private boolean isAllEditTextsFilled() {
            for (EditText editText : editTexts)
                if (editText.getText().toString().trim().length() == 0)
                    return false;
            return true;
        }

        private void hideKeyboard() {
            if (getCurrentFocus() != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
            }
        }

    }

    public class PinOnKeyListener implements View.OnKeyListener {

        private int currentIndex;

        PinOnKeyListener(int currentIndex) {
            this.currentIndex = currentIndex;
        }

        @Override
        public boolean onKey(View v, int keyCode, KeyEvent event) {
            if (keyCode == KeyEvent.KEYCODE_DEL && event.getAction() == KeyEvent.ACTION_DOWN) {
                if (editTexts[currentIndex].getText().toString().isEmpty() && currentIndex != 0)
                    editTexts[currentIndex - 1].requestFocus();
            }
            return false;
        }

    }

}