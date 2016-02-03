package com.example.administrator.scaletypetest;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.scaletypetest.R;
import com.example.administrator.scaletypetest.base.BaseGeneralActivity;


/**
 * Created by Administrator on 2016/2/2.
 */
public class WelcomeActivity2 extends BaseGeneralActivity implements View.OnClickListener{
    private TextView tvCenter;
    private TextView tvCentercrop;
    private TextView tvCenterinside;
    private TextView tvFitcenter;
    private TextView tvFitstart;
    private TextView tvFitend;
    private TextView tvFitxy;
    private TextView tvMatrix;

    private void assignViews() {
        tvCenter = (TextView) findViewById(R.id.tv_center);
        tvCentercrop = (TextView) findViewById(R.id.tv_centercrop);
        tvCenterinside = (TextView) findViewById(R.id.tv_centerinside);
        tvFitcenter = (TextView) findViewById(R.id.tv_fitcenter);
        tvFitstart = (TextView) findViewById(R.id.tv_fitstart);
        tvFitend = (TextView) findViewById(R.id.tv_fitend);
        tvFitxy = (TextView) findViewById(R.id.tv_fitxy);
        tvMatrix = (TextView) findViewById(R.id.tv_matrix);

        tvCenter.setOnClickListener(this);
        tvCentercrop.setOnClickListener(this);
        tvCenterinside.setOnClickListener(this);
        tvFitcenter.setOnClickListener(this);
        tvFitstart.setOnClickListener(this);
        tvFitend.setOnClickListener(this);
        tvFitxy.setOnClickListener(this);
        tvMatrix.setOnClickListener(this);
    }

    @Override
    public void initView() {
        setContentView(R.layout.activity_welcome2);
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
        switch (v.getId()){
            case R.id.tv_center:
                in.setClass(WelcomeActivity2.this,PropertyCenterActivity.class);
                break;
            case R.id.tv_centercrop:
                in.setClass(WelcomeActivity2.this,PropertyCenterCropActivity.class);
                break;
            case R.id.tv_centerinside:
                in.setClass(WelcomeActivity2.this,PropertyCenterInsideActivity.class);
                break;
            case R.id.tv_fitcenter:
                in.setClass(WelcomeActivity2.this,PropertyFitCenterActivity.class);
                break;
            case R.id.tv_fitstart:
                in.setClass(WelcomeActivity2.this,PropertyFitStartActivity.class);
                break;
            case R.id.tv_fitend:
                in.setClass(WelcomeActivity2.this,PropertyFitEndActivity.class);
                break;
            case R.id.tv_fitxy:
                in.setClass(WelcomeActivity2.this,PropertyFitXyActivity.class);
                break;
            case R.id.tv_matrix:
                in.setClass(WelcomeActivity2.this,PropertyMatrixActivity.class);
                break;
        }

        startActivity(in);
    }
}
