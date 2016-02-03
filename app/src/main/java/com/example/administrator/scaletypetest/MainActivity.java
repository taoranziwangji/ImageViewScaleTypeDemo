package com.example.administrator.scaletypetest;

import android.view.View;
import android.widget.TextView;

import com.example.administrator.scaletypetest.R;
import com.example.administrator.scaletypetest.base.BaseGeneralActivity;


public class MainActivity extends BaseGeneralActivity {
    @Override
    public void initView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void init() {
        ((TextView)findViewById(R.id.tv_title)).setText("方形图片和view,view比图片大");
        ((TextView)findViewById(R.id.tv_title_right)).setVisibility(View.GONE);
        ((TextView)findViewById(R.id.tv_title_left)).setVisibility(View.GONE);
    }

    @Override
    public void initEvent() {

    }

}
