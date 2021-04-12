package com.example.csc250_lab_4_9_21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView cTV;
    private EditText aET, bET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.cTV = this.findViewById(R.id.cTV);
        this.aET = this.findViewById(R.id.aET);
        this.bET = this.findViewById(R.id.bET);
    }

    public void onCalculateCButtonPressed(View v)
    {
        int a = Integer.parseInt(this.aET.getText().toString());
        int b = Integer.parseInt(this.bET.getText().toString());
        //a^2 + b^2 = c^2
        a = (int)Math.pow(a, 2);
        //(int)3.14 -> 3
        //(int)3.99 -> 3
        b = (int)Math.pow(b, 2);
        int sum = a + b;
        double c = Math.sqrt(sum);
        this.cTV.setText("" + c);

    }
}