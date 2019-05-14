package net.androidbootcamp.project_take1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.btnWork);
        button2 = findViewById(R.id.btnCal);
        button3 = findViewById(R.id.btnBMI);
        button1.setOnClickListener(bWork);
        button2.setOnClickListener(bCal);
        button3.setOnClickListener(bBMI);
    }

    Button.OnClickListener bWork = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, workoutActivity.class));

        }
    };
    Button.OnClickListener bCal = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, CalorieActivity.class));

        }
    };
    Button.OnClickListener bBMI = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, BMIActivity.class));

        }
    };
}