package com.example.a1818;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import static com.example.a1818.R.layout.activity_loading;

public class loadingActivity extends AppCompatActivity {
    private ImageView Logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_loading);
        Handler handler = new Handler();


        handler.postDelayed(new Runnable() {

            public void run() {
                Intent intent = new Intent(loadingActivity.this, mainActivity.class);
                startActivity(intent);
                finish();


            }
        },2500);
    }
}