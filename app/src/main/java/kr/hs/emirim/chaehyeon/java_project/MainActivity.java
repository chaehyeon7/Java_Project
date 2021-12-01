package kr.hs.emirim.chaehyeon.java_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.button1:
                Toast.makeText(MainActivity.this, "버튼 1을 클릭하였습니다.", Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Toast.makeText(MainActivity.this, "버튼 2을 클릭하였습니다.", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
    }
}


//        button1.setOnClickListener(new View.OnClickListener() {//버튼 이벤트 처리
//
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"버튼 클릭 성공",Toast.LENGTH_SHORT).show();
//                //버튼 클릭시 Toast 메세지"버튼 클릭 성공" 출력
//            }
//        });
//
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "버튼 2을 클릭하였습니다.", Toast.LENGTH_LONG).show();
//            }
//        });
//    }
//
//}
