package com.example.administrator.scaletypetest;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.scaletypetest.R;
import com.example.administrator.scaletypetest.base.BaseGeneralActivity;


/**
 * Created by Administrator on 2016/2/2.
 */
public class WelcomeActivity extends BaseGeneralActivity implements View.OnClickListener{
    private TextView tvSquareVeiwbig;
    private TextView tvSquareVeiwsmall;
    private TextView tvRectangleVeiwbig;
    private TextView tvRectangleVeiwsmall;
    private TextView tvRectangleVeiwmiddle;
    private TextView tvRectangleAllnoruleviewshort;
    private TextView tvRectangleAllnoruleviewlong;
    private TextView tvRectangleAllnoruleviewmiddle1;
    private TextView tvRectangleAllnoruleviewmiddle2;
    private TextView tvSqualeWrapcontent;
    private TextView tvRectangleWrapcontent;

    private void assignViews() {
        tvSquareVeiwbig = (TextView) findViewById(R.id.tv_square_veiwbig);
        tvSquareVeiwsmall = (TextView) findViewById(R.id.tv_square_veiwsmall);
        tvRectangleVeiwbig = (TextView) findViewById(R.id.tv_rectangle_veiwbig);
        tvRectangleVeiwsmall = (TextView) findViewById(R.id.tv_rectangle_veiwsmall);
        tvRectangleVeiwmiddle = (TextView) findViewById(R.id.tv_rectangle_veiwmiddle);
        tvRectangleAllnoruleviewshort = (TextView) findViewById(R.id.tv_rectangle_allnoruleviewshort);
        tvRectangleAllnoruleviewlong = (TextView) findViewById(R.id.tv_rectangle_allnoruleviewlong);
        tvRectangleAllnoruleviewmiddle1 = (TextView) findViewById(R.id.tv_rectangle_allnoruleviewmiddle1);
        tvRectangleAllnoruleviewmiddle2 = (TextView) findViewById(R.id.tv_rectangle_allnoruleviewmiddle2);
        tvSqualeWrapcontent = (TextView) findViewById(R.id.tv_squale_wrapcontent);
        tvRectangleWrapcontent = (TextView) findViewById(R.id.tv_rectangle_wrapcontent);

        setListener();
    }



    private void setListener(){
        tvSquareVeiwbig.setOnClickListener(this);
        tvSquareVeiwsmall.setOnClickListener(this);
        tvRectangleVeiwbig.setOnClickListener(this);
        tvRectangleVeiwmiddle.setOnClickListener(this);
        tvRectangleVeiwsmall.setOnClickListener(this);
        tvSqualeWrapcontent.setOnClickListener(this);
        tvRectangleWrapcontent.setOnClickListener(this);
        tvRectangleAllnoruleviewshort.setOnClickListener(this);
        tvRectangleAllnoruleviewlong.setOnClickListener(this);
        tvRectangleAllnoruleviewmiddle1.setOnClickListener(this);
        tvRectangleAllnoruleviewmiddle2.setOnClickListener(this);
    }


    @Override
    public void initView() {
        setContentView(R.layout.activity_welcome);
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
            case R.id.tv_square_veiwbig://方形图片和view,view比图片大
                in.setClass(WelcomeActivity.this,MainActivity.class);
                break;
            case R.id.tv_square_veiwsmall://方形图片和view,view比图片小
                in.setClass(WelcomeActivity.this,SecondActivity.class);
                break;
            case R.id.tv_rectangle_veiwbig://长方形图片，方形view,view长宽都比图片大
                in.setClass(WelcomeActivity.this,Changfangxing1Activity.class);
                break;
            case R.id.tv_rectangle_veiwsmall://长方形图片，方形view,view长宽都比图片小
                in.setClass(WelcomeActivity.this,Changfangxing2Activity.class);
                break;
            case R.id.tv_rectangle_veiwmiddle://长方形图片，方形view,view长宽介于图片长宽之间
                in.setClass(WelcomeActivity.this,Changfangxing3Activity.class);
                break;

            case R.id.tv_rectangle_allnoruleviewlong://长方形图片，长方形view，view长宽都比图片长
                in.setClass(WelcomeActivity.this,AllNoRuleViewLongActivity.class);
                break;
            case R.id.tv_rectangle_allnoruleviewshort://长方形图片，长方形view，view长宽都比图片小
                in.setClass(WelcomeActivity.this,AllNoRuleViewShortActivity.class);
                break;
            case R.id.tv_rectangle_allnoruleviewmiddle1://长方形图片，长方形view，view短边连图片长边但比图短，view长边连图短边但比图长
                in.setClass(WelcomeActivity.this,AllNoRuleViewMiddle1Activity.class);
                break;
            case R.id.tv_rectangle_allnoruleviewmiddle2://长方形图片，长方形view，view短边连图片短边但比图短，view长边连图长边但比图长
                in.setClass(WelcomeActivity.this,AllNoRuleViewMiddle2Activity.class);
                break;

            case R.id.tv_squale_wrapcontent://正方形图片，方形view,view为wrap_content
                in.setClass(WelcomeActivity.this,WrapContentFangActivity.class);
                break;
            case R.id.tv_rectangle_wrapcontent://长方形图片，方形view,view为wrap_content
                in.setClass(WelcomeActivity.this,WrapContentChangActivity.class);
                break;
        }

        startActivity(in);
    }
}
