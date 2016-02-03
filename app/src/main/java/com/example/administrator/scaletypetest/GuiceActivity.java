package com.example.administrator.scaletypetest;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.scaletypetest.base.BaseDoubleClickExitActivity;
import com.example.administrator.scaletypetest.R;


/**
 * Created by Administrator on 2016/2/2.
 */
public class GuiceActivity extends BaseDoubleClickExitActivity implements View.OnClickListener{

    private TextView tvShape;
    private TextView tvProperty;

    private void assignViews() {
        tvShape = (TextView) findViewById(R.id.tv_shape);
        tvProperty = (TextView) findViewById(R.id.tv_property);

        tvShape.setOnClickListener(this);
        tvProperty.setOnClickListener(this);
    }

    @Override
    public void initView() {
        setContentView(R.layout.activity_guice);
    }

    @Override
    public void init() {
        assignViews();
    }

    @Override
    public void initEvent() {

    }

    @Override
    public void onClick(View v) {
        Intent in = new Intent();
        switch(v.getId()){
            case R.id.tv_shape:
                in.setClass(GuiceActivity.this,WelcomeActivity.class);
                break;
            case R.id.tv_property:
                in.setClass(GuiceActivity.this,WelcomeActivity2.class);
                break;
        }

        startActivity(in);
    }
}
