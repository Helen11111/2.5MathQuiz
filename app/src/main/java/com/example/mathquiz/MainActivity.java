package com.example.mathquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView problem;
    TextView text1;
    TextView text2;
    TextView text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
        getRandom(1, 5);
        getRandom(-123, 1235);
        getRandom(-11, 523);
        getRandom(1211, 1245);
    }

    private void setupUI() {
        problem = findViewById(R.id.problem);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
    }

    private int getRandom(int max, int min) {
        int random = (int)(Math.random() * (max - min) + min);
        Log.d("DEBUGGER_TAG", "max: " + max + " min: " + min + " random: " + random);
        return random;
    }
}