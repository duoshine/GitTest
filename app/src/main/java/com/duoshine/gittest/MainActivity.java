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
        //我正在修改代码，但是突然要基于上个提交出版本
        //修改后出了版本 这个修改要提交
        //1
        //2
        //3
        //4
        //我做了修改，并输出了版本，
        //做了两次改动并提交
    }
}