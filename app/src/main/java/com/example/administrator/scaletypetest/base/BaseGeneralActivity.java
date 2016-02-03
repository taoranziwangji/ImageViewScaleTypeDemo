package com.example.administrator.scaletypetest.base;

import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

import com.example.administrator.scaletypetest.DemoActivity;
import com.example.administrator.scaletypetest.R;


/**一般的activity基类，有finish动画*/
public abstract class BaseGeneralActivity extends BaseActivity {

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	    switch (keyCode) {
	        case KeyEvent.KEYCODE_BACK:
	        	/*this.finish();
	        	if(VersionUtil.getAndroidVerson() > 5) {//在子线程中不会出现动画效果
					UIUtils.runInMainThread(new Runnable() {
						@Override
						public void run() {
							// TODO Auto-generated method stub
							overridePendingTransition(com.vdolrm.lrmlibrary.R.anim.vdo_in_from_left, com.vdolrm.lrmlibrary.R.anim.vdo_out_to_right);
						}
					});
				}*/
				finishAndAnimation();
	        return true;
	    }
	    return super.onKeyDown(keyCode, event);
	}

	public void finishAndAnimation(){
		this.finish();

	}

	@Override
	public void initOther() {
		super.initOther();

        try {
			View v = findViewById(R.id.tv_title);
			if(v==null){
				Toast.makeText(BaseGeneralActivity.this,"title 为空",Toast.LENGTH_SHORT).show();
				return;
			}
			v.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent in = new Intent(BaseGeneralActivity.this,DemoActivity.class);
					startActivity(in);
				}
			});
		}catch (RuntimeException e){
			e.printStackTrace();
			Toast.makeText(BaseGeneralActivity.this,"BaseGeneralActivity 异常",Toast.LENGTH_SHORT).show();
		}
	}
}
