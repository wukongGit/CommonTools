package com.suncheng.sample;

import android.os.Bundle;

import com.suncheng.commontools.framwork.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onActivityCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        setTitle("演示");
    }
}
