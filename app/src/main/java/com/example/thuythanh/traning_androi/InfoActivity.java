package com.example.thuythanh.traning_androi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.content.Intent;

public class InfoActivity extends AppCompatActivity {

    protected boolean _active = true;
    protected int _splashTime = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Thread splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    while(_active && (waited < _splashTime)) {
                        sleep(100);
                        if(_active) {
                            waited += 100;
                        }
                    }
                } catch(InterruptedException e) {
                } finally {
                    finish();
                    Intent mainIntent = new Intent(InfoActivity.this, FoodheathActivity.class);
                    InfoActivity.this.startActivity(mainIntent);
                    InfoActivity.this.finish();
                    onStop();
                }
            }
        };
        splashTread.start();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            _active = false;
        }
        return true;
    }

}
