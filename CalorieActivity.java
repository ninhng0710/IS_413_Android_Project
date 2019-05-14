package net.androidbootcamp.project_take1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class CalorieActivity extends AppCompatActivity {
    Button button1, button2;
    String breakfastDecision, lunchDecision, dinnerDecision, finalText;
    Integer breakCals, lunchCals, dinnerCals, totalCals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie);
        button1 = findViewById(R.id.btnCalcCal);
        //button1.setOnClickListener(bCalCalc);
        button2 = findViewById(R.id.findDinner);
        final Spinner breakfast1 = (Spinner)findViewById(R.id.breakChoice);
        final Spinner lunch1 = (Spinner)findViewById(R.id.lunchChoice);
        final Spinner dinner1 = (Spinner)findViewById(R.id.dinnerChoice);
        final TextView result = ((TextView)findViewById(R.id.result));
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                breakfastDecision = breakfast1.getSelectedItem().toString();
                lunchDecision = lunch1.getSelectedItem().toString();
                dinnerDecision = dinner1.getSelectedItem().toString();
                breakCals = 0;
                lunchCals = 0;
                dinnerCals = 0;

                if (breakfastDecision.equals("1 Cup of Oatmeal"))
                {
                    breakCals = 158;

                }
                else if (breakfastDecision.equals("Granola Bar"))
                {
                    breakCals = 132;

                }
                else
                {
                    breakCals = 156;

                }
                if (lunchDecision.equals("Shrimp Alfredo Lean Cuisine"))
                {
                    lunchCals = 240;
                    //button1.setText("we got here");

                }
                else if (lunchDecision.equals("Veggie and Hummus Sandwich"))
                {
                    lunchCals = 325;

                }
                else
                {
                    lunchCals = 386;

                }
                if (dinnerDecision.equals("Cauliflower Chicken Chili"))
                {
                    dinnerCals = 432;

                }
                else if (dinnerDecision.equals("Steak and Eggs"))
                {
                    dinnerCals = 404;

                }
                else
                {
                    dinnerCals = 536;

                }
                totalCals = breakCals + lunchCals + dinnerCals;
                finalText = "The total calories for your meals today are: " + totalCals +
                        " You chose options: " + breakfastDecision + ", " + lunchDecision +
                        ", and " + dinnerDecision;
                result.setText(finalText);



            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.buzzfeed.com/carolynkylstra/healthy-and-filling-dinners-under-500-calories")));
            }
        });

    }
}
