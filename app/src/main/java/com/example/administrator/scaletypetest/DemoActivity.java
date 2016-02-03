package com.example.administrator.scaletypetest;

import android.view.View;
import android.widget.TextView;

import com.example.administrator.scaletypetest.R;
import com.example.administrator.scaletypetest.base.BaseGeneralActivity;

/**
 * Created by Administrator on 2016/2/3.
 */
public class DemoActivity extends BaseGeneralActivity {
    @Override
    public void initView() {
        setContentView(R.layout.activity_demo);
    }

    @Override
    public void init() {
        ((TextView)findViewById(R.id.tv_title)).setText("原图展示");
        ((TextView)findViewById(R.id.tv_title_right)).setVisibility(View.GONE);
        ((TextView)findViewById(R.id.tv_title_left)).setVisibility(View.GONE);
    }

    @Override
    public void initEvent() {

    }
}
