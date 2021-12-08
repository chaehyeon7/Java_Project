package kr.hs.emirim.chaehyeon.java_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_type8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type8);

        Button btn8 = findViewById(R.id.btn8);

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(btn1);
            }
        });
    }
}
