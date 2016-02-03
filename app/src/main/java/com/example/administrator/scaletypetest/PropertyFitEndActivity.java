package com.example.administrator.scaletypetest;

import android.view.View;
import android.widget.TextView;

import com.example.administrator.scaletypetest.base.BaseGeneralActivity;
import com.example.administrator.scaletypetest.R;

/**
 * Created by Administrator on 2016/2/3.
 */
public class PropertyFitEndActivity extends BaseGeneralActivity {
    @Override
    public void initView() {
        setContentView(R.layout.activity_propertyfitend);
    }

    @Override
    public void init() {
        ((TextView)findViewById(R.id.tv_title)).setText("fitEnd");
        findViewById(R.id.tv_title_right).setVisibility(View.GONE);
        findViewById(R.id.tv_title_left).setVisibility(View.GONE);
    }

    @Override
    public void initEvent() {

    }
}
