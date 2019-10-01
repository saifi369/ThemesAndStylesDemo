package com.saifi369.themesandstylesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOne = findViewById(R.id.btn_one);
        Button btnTwo = findViewById(R.id.btn_two);
        Button btnThree = findViewById(R.id.btn_three);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int btnId = view.getId();

        switch (btnId) {
            case R.id.btn_one:
                Toast.makeText(this, "Button One Clicked", Toast.LENGTH_SHORT).show();
                return;
            case R.id.btn_two:
                Toast.makeText(this, "Button Two Clicked", Toast.LENGTH_SHORT).show();
                return;
            case R.id.btn_three:
                Toast.makeText(this, "Button Three Clicked", Toast.LENGTH_SHORT).show();
                return;
        }
    }
}
