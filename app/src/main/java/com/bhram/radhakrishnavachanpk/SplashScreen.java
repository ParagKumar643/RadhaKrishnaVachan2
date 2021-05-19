package com.bhram.radhakrishnavachanpk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen2);

        Thread thread = new Thread(){
            public  void run(){
                try {
                    sleep(1000);
                    Intent intent = new Intent(getApplicationContext(),UserId.class);

                    startActivity(intent);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }};
        thread.start();
    }
}