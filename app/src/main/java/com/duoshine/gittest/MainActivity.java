package com.duoshine.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * 想倒回某个提交编版本使用 Keep
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //master修改
        //其他网络修改
    }
}