package com.example.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Button startButton = findViewById(R.id.start_button);
        startButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //โค้ดที่ต้องการให้ทำ เมื่อปุ่มถูกคลิก
                Toast T = Toast.makeText(SplashActivity.this,"Hello",Toast.LENGTH_SHORT);
                T.show();
            }
        });
    }
}
