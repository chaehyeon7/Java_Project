package kr.hs.emirim.chaehyeon.java_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_selection_screen extends AppCompatActivity {
//    Button.OnClickListener clickListener;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_screen);

//        btn_1 = findViewById(R.id.btn_1);
//        btn_2 = findViewById(R.id.btn_2);

//        Button btn_1 = findViewById(R.id.btn_1);
//        Button btn_2 = findViewById(R.id.btn_2);
//        Button btn_3 = findViewById(R.id.btn_3);
//        Button btn_4 = findViewById(R.id.btn_4);
//        Button btn_5 = findViewById(R.id.btn_5);
//        Button btn_6 = findViewById(R.id.btn_6);
//        Button btn_7 = findViewById(R.id.btn_7);
//        Button btn_8 = findViewById(R.id.btn_8);
//        Button btn_9 = findViewById(R.id.btn_9);

        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);

//        btn_1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), activity_type1.class);
//                startActivity(intent);
//            }
//        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn1 = new Intent(getApplicationContext(), activity_type1.class);
                startActivity(btn1);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn2 = new Intent(getApplicationContext(), activity_type2.class);
                startActivity(btn2);
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn3 = new Intent(getApplicationContext(), activity_type3.class);
                startActivity(btn3);
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn4 = new Intent(getApplicationContext(), activity_type4.class);
                startActivity(btn4);
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn5 = new Intent(getApplicationContext(), activity_type5.class);
                startActivity(btn5);
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn6 = new Intent(getApplicationContext(), activity_type6.class);
                startActivity(btn6);
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn7 = new Intent(getApplicationContext(), activity_type7.class);
                startActivity(btn7);
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn8 = new Intent(getApplicationContext(), activity_type8.class);
                startActivity(btn8);
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn9 = new Intent(getApplicationContext(), activity_type9.class);
                startActivity(btn9);
            }
        });








    }
}


//        btn_1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), activity_selection_screen.class);
//                startActivity(intent);
//            }
//        });




//        btn_1.setOnClickListener(new View.OnClickListener() {
//        View.OnClickListener onClickListener = new Button.OnClickListener() {
//        clickListener = new View.OnClickListener(){

//    실행시 주석 풀기

//        btn_1.setOnClickListener(clickListener);
//        btn_2.setOnClickListener(clickListener);
