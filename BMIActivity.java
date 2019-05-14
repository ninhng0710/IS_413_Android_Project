package net.androidbootcamp.project_take1;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class BMIActivity extends AppCompatActivity {

    EditText height, weight;
    TextView result;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        height = (EditText)findViewById(R.id.height);
        weight = (EditText)findViewById(R.id.weight);
        result = (TextView)findViewById(R.id.result);
        calculate = (Button)findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateBMI();
            }
        });
    }

    private void calculateBMI(){
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();

        if(heightStr != null && !"".equals(heightStr) && weightStr != null && !"".equals(weightStr)){
            float heightValue = Float.parseFloat(heightStr); //Float.parseFloat(heightStr) / 100; <--was this for cm and kg
            float weightValue = Float.parseFloat(weightStr);

            float bmi = (weightValue / (heightValue * heightValue)) * 703; //float bmi = weightValue / (heightValue * heightValue); <-- was this for cm and kg

            displayBMI(bmi);
        }
    }

    private void displayBMI(float bmi){
        String bmiLabel = "";

        if(Float.compare(bmi, 15f) <= 0) {
            bmiLabel = "Very severely underweight";
        } else if(Float.compare(bmi, 15f) > 0 && Float.compare(bmi, 16f) <=0){
            bmiLabel = "Severely underweight";
        } else if(Float.compare(bmi, 16f) > 0 && Float.compare(bmi, 18.5f) <=0){
            bmiLabel = "Underweight";
        } else if(Float.compare(bmi, 18.5f) > 0 && Float.compare(bmi, 25f) <=0){
            bmiLabel = "Normal";
        } else if(Float.compare(bmi, 25f) > 0 && Float.compare(bmi, 30f) <=0){
            bmiLabel = "Overweight";
        } else if(Float.compare(bmi, 30f) > 0 && Float.compare(bmi, 35f) <=0){
            bmiLabel = "Obese class I";
        } else if(Float.compare(bmi, 35f) > 0 && Float.compare(bmi, 40f) <=0){
            bmiLabel = "Obese class II";
        } else {
            bmiLabel = "Obese class III";
        }


        String newLine = System.getProperty("line.separator");
        bmiLabel = "BMI: " + bmi + newLine + "Weight Status: " + bmiLabel;
        result.setText(bmiLabel);
    }
}
