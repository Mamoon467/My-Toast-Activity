package com.example.mytoastactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button byDefault ,simpleToast ,nestedToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        byDefault = findViewById(R.id.byDefault);
        simpleToast = findViewById(R.id.simpleGravity);
        nestedToast = findViewById(R.id.nestedToast);
        byDefault.setOnClickListener(v -> Toast.makeText(MainActivity.this, "By Default Toast", Toast.LENGTH_LONG).show());
        simpleToast.setOnClickListener(v -> {
            Toast toast =Toast.makeText(MainActivity.this,"Simple Gravity Toast" ,Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        });
        nestedToast.setOnClickListener(v -> {
            Toast toast =Toast.makeText(MainActivity.this,"Nested  Toast" ,Toast.LENGTH_LONG);
            toast.setGravity(Gravity.BOTTOM |Gravity.RIGHT,0,0);
            toast.show();
        });
    }
}