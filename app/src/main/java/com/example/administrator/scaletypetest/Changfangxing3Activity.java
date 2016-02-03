package com.example.administrator.scaletypetest;

import android.view.View;
import android.widget.TextView;

import com.example.administrator.scaletypetest.R;
import com.example.administrator.scaletypetest.base.BaseGeneralActivity;


/**
 * Created by Administrator on 2016/2/2.
 */
public class Changfangxing3Activity extends BaseGeneralActivity {
    @Override
    public void initView() {
        setContentView(R.layout.activity_changfangxing3);
    }

    @Override
    public void init() {
        ((TextView)findViewById(R.id.tv_title)).setText("长方形图片，方形view,view长宽介于图片长宽之间");
        findViewById(R.id.tv_title_right).setVisibility(View.GONE);
        findViewById(R.id.tv_title_left).setVisibility(View.GONE);
    }

    @Override
    public void initEvent() {

    }
}
