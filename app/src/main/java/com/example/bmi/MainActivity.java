// Name-Lakshay Sharma   Student Id.217645367
package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bmi.BMIModel.BMIModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View v)
    {
        EditText weightView = (EditText) findViewById(R.id.weightBox);
        String wS = weightView.getText().toString();

        EditText heightView = (EditText) findViewById(R.id.heightBox);
        String hS = heightView.getText().toString();

        double wD = BMIModel.toDouble(wS);
        double hD = BMIModel.toDouble(hS);
        double bmiD = BMIModel.getBMI(wD,hD);
        String bmiS = BMIModel.formatBMI(bmiD);
        TextView ans = (TextView)findViewById(R.id.answer);
        if(bmiD<19)
            ans.setTextColor(Color.BLUE);
        else if(bmiD>=19&&bmiD<=25)
            ans.setTextColor(Color.GREEN);
        else if(bmiD>25&&bmiD<=29)
            ans.setTextColor(Color.rgb(255,210,2));
        else if(bmiD>29&&bmiD<=39)
            ans.setTextColor(Color.rgb(255,165,0));
        else
            ans.setTextColor(Color.RED);

        ((TextView)findViewById(R.id.answer)).setText(bmiS);


    }
}
