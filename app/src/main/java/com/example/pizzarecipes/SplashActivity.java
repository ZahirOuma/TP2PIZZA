package com.example.pizzarecipes;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread t1 = new Thread(){
            @Override
        public void run() {
            try {
                sleep(11000);
                Intent intent = new Intent(SplashActivity.this, ListPizzaActivity.class);
                startActivity(intent);
                SplashActivity.this.finish();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        };
        t1.start();

    }
}