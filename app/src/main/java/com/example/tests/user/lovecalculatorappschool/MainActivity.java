package com.example.tests.user.lovecalculatorappschool;

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
        setContentView(R.layout.activity_main);

        TextView tvInstructions = findViewById(R.id.tvInstructions);
        tvInstructions.setText(getString(R.string.app_name));
        Button submitButton = findViewById(R.id.btnCalculateMatch);


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
        EditText etNameOne = findViewById(R.id.etNameTwo);
        EditText etNameTwo = findViewById(R.id.etNameTwo);
        TextView tvResult = findViewById(R.id.tvResult);

        int etNameLength1 = etNameOne.length();
        int etNameLength2 = etNameTwo.length();

        int resultInProcent = Math.abs(etNameLength1 + etNameLength2 - 100);

        tvResult.setText(Integer.toString(resultInProcent));
    }


}
