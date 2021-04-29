package com.example.hellotoastapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView showCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount =findViewById(R.id.show_count); // atribui elemento a variavel showCount
        AppCompatDelegate.setDefaultNightMode((AppCompatDelegate.MODE_NIGHT_NO));
    }

    public void showToast(View view) {
        //criar o Toast
       Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
       toast.show(); //mostrar toast
    }

    public void countUp(View view) {
        count++;
        if(showCount != null) {
            showCount.setText(Integer.toString(count));
        }

    }

    public void countDown(View view) {
        count--;
        if(showCount != null) {
            showCount.setText(Integer.toString(count));
        }
    }

    public void clearCount(View view) {
        count = 0;
        if(showCount != null) {
            showCount.setText(Integer.toString(count));
        }
    }
}