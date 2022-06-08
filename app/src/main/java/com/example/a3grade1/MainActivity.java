package com.example.a3grade1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("메인화면");

        int loginedMemberId = getIntent().getIntExtra("loginedMemberId", 0);

        Member loginedMember = AppDatabase.findMember(loginedMemberId);

        TextView textViewLoginedMemberName = findViewById(R.id.textViewLoginedMemberName);
        textViewLoginedMemberName.setText(loginedMember.getName() + "님 환영합니다.");
    }
}
