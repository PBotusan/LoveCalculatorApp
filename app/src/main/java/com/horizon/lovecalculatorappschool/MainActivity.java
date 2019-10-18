package com.horizon.lovecalculatorappschool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(com.horizon.lovecalculatorappschool.R.layout.activity_main);

        TextView tvInstructions = findViewById(com.horizon.lovecalculatorappschool.R.id.tvInstructions);
        tvInstructions.setText(getString(com.horizon.lovecalculatorappschool.R.string.app_name));
        Button submitButton = findViewById(com.horizon.lovecalculatorappschool.R.id.btnCalculateMatch);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                calculateMatch(view);

            }
        });
    }

    public void calculateMatch(View view)
    {
        int maxAmount = 100;
        int sum1 = 0;
        int sum2 = 0;

        String etNameOne = ((EditText)findViewById(com.horizon.lovecalculatorappschool.R.id.etNameOne)).getText().toString();
        String etNameTwo = ((EditText)findViewById(com.horizon.lovecalculatorappschool.R.id.etNameTwo)).getText().toString();
        TextView tvResult = findViewById(com.horizon.lovecalculatorappschool.R.id.tvResult);

        for(int i = 0; i< etNameOne.length(); i++)
        {
            char ch = etNameOne.charAt(i);
            int ascii = ch;
            sum1 = sum1 + ascii;
        }

        for(int x = 0; x< etNameTwo.length(); x++)
        {
            char ch = etNameTwo.charAt(x);
            int ascii = ch;
            sum2 = sum2 + ascii;
        }

        int totaal = sum1 + sum2;
        int resultInProcent = Math.abs(totaal / 40);

        if(resultInProcent > maxAmount)
        {
            resultInProcent = maxAmount;
        }

        tvResult.setText(Integer.toString(resultInProcent));
    }


}
