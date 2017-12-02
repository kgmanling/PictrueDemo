package com.coracle.ml.picturedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 类    名：OpenActivity
 * 创 建 者：ML
 * 创建时间：2017/12/1 17:14
 * 更 新 者：${Author}
 * 更新时间：2017/12/1
 * 描   述：${TODO}
 */

public class OpenActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);
    }

    public void backToMain(View view) {
        finish();
    }
}
