package com.example.administrator.scaletypetest;

import android.view.View;
import android.widget.TextView;

import com.example.administrator.scaletypetest.R;
import com.example.administrator.scaletypetest.base.BaseGeneralActivity;


/**
 * Created by Administrator on 2016/2/2.
 */
public class Changfangxing1Activity extends BaseGeneralActivity {
    @Override
    public void initView() {
        setContentView(R.layout.activity_changfangxing1);
    }

    @Override
    public void init() {
        ((TextView)findViewById(R.id.tv_title)).setText("长方形图片，方形view,view长宽都比图片大");
        findViewById(R.id.tv_title_right).setVisibility(View.GONE);
        ((TextView)findViewById(R.id.tv_title_left)).setVisibility(View.GONE);
    }

    @Override
    public void initEvent() {

    }
}
