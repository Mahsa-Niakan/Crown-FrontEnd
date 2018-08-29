package com.nikanmedia.kalaagh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread time_control = new Thread(){
            public void run(){
                try{
                    sleep(1500);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Intent i1 = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(i1);
                }
            }
        };
        time_control.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
    }

