package com.example.administrator.scaletypetest;

import android.view.View;
import android.widget.TextView;

import com.example.administrator.scaletypetest.base.BaseGeneralActivity;
import com.example.administrator.scaletypetest.R;


/**
 * Created by Administrator on 2016/2/1.
 */
public class SecondActivity extends BaseGeneralActivity {
    @Override
    public void initView() {
        setContentView(R.layout.activity_second);
    }

    @Override
    public void init() {
        ((TextView)findViewById(R.id.tv_title)).setText("方形图片和view,view比图片小");
        findViewById(R.id.tv_title_right).setVisibility(View.GONE);
        findViewById(R.id.tv_title_left).setVisibility(View.GONE);
    }

    @Override
    public void initEvent() {

    }
}
