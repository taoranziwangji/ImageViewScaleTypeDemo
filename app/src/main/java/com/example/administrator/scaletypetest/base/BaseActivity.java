package com.example.administrator.scaletypetest.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public abstract class BaseActivity extends Activity {
	/** 记录处于前台的Activity */
	//private static BaseActivity mForegroundActivity = null;//因为加入了另一个基类BaseFragmentActivity，所以改成public
	public static Activity mForegroundActivity = null;
	/** 记录所有活动的Activity 缺少add方法 由application管理activitys*/
	//private static final List<BaseActivity> mActivities = new LinkedList<BaseActivity>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		windowFeature();
		bundleInOnCreate(savedInstanceState);
		initView();
		init();
		initActionBar();
		initEvent();
		initOther();
	}

	@Override
	protected void onResume() {
		mForegroundActivity = this;
		super.onResume();
	}

	@Override
	protected void onPause() {
		mForegroundActivity = null;
		super.onPause();
	}
	
	//更改窗口样式 可以被重写
	public void windowFeature(){
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	}
	
	public void bundleInOnCreate(Bundle savedInstanceState){};

	//public abstract void addActivity();
	
	public abstract void initView();
	
	public abstract void init();

	public void initActionBar() {
	}
	public void initOther() {
	}
	
	public abstract void initEvent();

	/** 关闭所有Activity */
	/*public static void finishAll() {
		List<BaseActivity> copy;
		synchronized (mActivities) {
			copy = new ArrayList<BaseActivity>(mActivities);
		}
		for (BaseActivity activity : copy) {
			activity.finish();
		}
	}*/

	/** 关闭所有Activity，除了参数传递的Activity */
	/*public static void finishAll(BaseActivity except) {
		List<BaseActivity> copy;
		synchronized (mActivities) {
			copy = new ArrayList<BaseActivity>(mActivities);
		}
		for (BaseActivity activity : copy) {
			if (activity != except) activity.finish();
		}
	}*/

	/** 是否有启动的Activity */
	/*public static boolean hasActivity() {
		return mActivities.size() > 0;
	}*/

	/** 获取当前处于前台的activity 
	 * 由于引入了BaseFragmentActivity作为另一个基类，所以可能导致不准确*/
	public static Activity getForegroundActivity() {
		return mForegroundActivity;
	}

	/** 获取当前处于栈顶的activity，无论其是否处于前台 */
	/*public static BaseActivity getCurrentActivity() {
		List<BaseActivity> copy;
		synchronized (mActivities) {
			copy = new ArrayList<BaseActivity>(mActivities);
		}
		if (copy.size() > 0) {
			return copy.get(copy.size() - 1);
		}
		return null;
	}*/

	/** 推出应用 */
	/*public void exitApp() {
		finishAll();
		android.os.Process.killProcess(android.os.Process.myPid());
	}*/
	

}
