package com.example.custombrsend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/*
 * CustomBRReceive : User define BroadCast message send example
 * Author : DONGGEUN JUNG (Dennis)
 * Email : topsan72@gmail.com / topofsan@naver.com
 */

public class MainActivity extends AppCompatActivity {
    EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText1);
    }

    public void onClick(View v) {
        String data1 = editText1.getText().toString();
        // 인텐트를 생성하고 브로드캐스트 정보를 지정
        Intent intent = new Intent();
        intent.setAction("ACTION_USER_CUSTOM");
        intent.putExtra("data1", data1);
        // 브로드캐스트를 전달
        sendBroadcast(intent);
    }

}
