package com.example.administrator.scaletypetest;

import android.view.View;
import android.widget.TextView;

import com.example.administrator.scaletypetest.R;
import com.example.administrator.scaletypetest.base.BaseGeneralActivity;


/**
 * Created by Administrator on 2016/2/2.
 */
public class AllNoRuleViewMiddle2Activity extends BaseGeneralActivity {
    @Override
    public void initView() {
        setContentView(R.layout.activity_allnoruleviewmiddle2);
    }

    @Override
    public void init() {
        ((TextView)findViewById(R.id.tv_title)).setText("长方形图片，长方形view，view短边连图片短边但比图短，view长边连图长边但比图长");
        ((TextView)findViewById(R.id.tv_title_right)).setVisibility(View.GONE);
        ((TextView)findViewById(R.id.tv_title_left)).setVisibility(View.GONE);
    }

    @Override
    public void initEvent() {

    }
}
