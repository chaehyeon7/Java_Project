package kr.hs.emirim.chaehyeon.java_project;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class activity_type1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type1);

        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                Intent intent = new Intent(activity_type1.this, activity_birth1.class);
                startActivity(intent);
            }
            }, 4000);

    }
}
