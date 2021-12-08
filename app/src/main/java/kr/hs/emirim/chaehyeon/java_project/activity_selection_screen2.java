package kr.hs.emirim.chaehyeon.java_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_selection_screen2 extends AppCompatActivity {
    Button b_1;
    Button b_2;
    Button b_3;
    Button b_4;
    Button b_5;
    Button b_6;
    Button b_7;
    Button b_8;
    Button b_9;
    Button b_10;
    Button b_11;
    Button b_12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_screen2);


        b_1 = findViewById(R.id.b_1);
        b_2 = findViewById(R.id.b_2);
        b_3 = findViewById(R.id.b_3);
        b_4 = findViewById(R.id.b_4);
        b_5 = findViewById(R.id.b_5);
        b_6 = findViewById(R.id.b_6);
        b_7 = findViewById(R.id.b_7);
        b_8 = findViewById(R.id.b_8);
        b_9 = findViewById(R.id.b_9);
        b_10 = findViewById(R.id.b_10);
        b_11 = findViewById(R.id.b_11);
        b_12 = findViewById(R.id.b_12);

        b_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn1 = new Intent(getApplicationContext(), activity_birth1.class);
                startActivity(btn1);
            }
        });



        b_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn2 = new Intent(getApplicationContext(), activity_type2.class);
                startActivity(btn2);
            }
        });
        b_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn3 = new Intent(getApplicationContext(), activity_type3.class);
                startActivity(btn3);
            }
        });
        b_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn4 = new Intent(getApplicationContext(), activity_type4.class);
                startActivity(btn4);
            }
        });
        b_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn5 = new Intent(getApplicationContext(), activity_type5.class);
                startActivity(btn5);
            }
        });
        b_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn6 = new Intent(getApplicationContext(), activity_type6.class);
                startActivity(btn6);
            }
        });
        b_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn7 = new Intent(getApplicationContext(), activity_type7.class);
                startActivity(btn7);
            }
        });
        b_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn8 = new Intent(getApplicationContext(), activity_type8.class);
                startActivity(btn8);
            }
        });
        b_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn9 = new Intent(getApplicationContext(), activity_type9.class);
                startActivity(btn9);
            }
        });

    }
}
