package com.example.thuythanh.traning_androi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class FoodheathActivity extends AppCompatActivity {
    private Button btnYourHeath;

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodheath);
        //Code
        btnYourHeath = (Button) findViewById(R.id.btnYourHeath);
        btnYourHeath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FoodheathActivity.this, YourheathActivity.class);
                startActivity(intent);
            }
        });
    }
}
