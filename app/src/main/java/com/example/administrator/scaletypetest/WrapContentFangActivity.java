package com.example.administrator.scaletypetest;

import android.view.View;
import android.widget.TextView;

import com.example.administrator.scaletypetest.R;
import com.example.administrator.scaletypetest.base.BaseGeneralActivity;


/**
 * Created by Administrator on 2016/2/2.
 */
public class WrapContentFangActivity extends BaseGeneralActivity {
    @Override
    public void initView() {
        setContentView(R.layout.activity_wrapcontent_fang);
    }

    @Override
    public void init() {
        ((TextView)findViewById(R.id.tv_title)).setText("正方形图片，方形view,view为wrap_content");
        ((TextView)findViewById(R.id.tv_title_left)).setVisibility(View.GONE);
        findViewById(R.id.tv_title_right).setVisibility(View.GONE);
    }

    @Override
    public void initEvent() {

    }
}
