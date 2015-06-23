package com.ctrlz.meetingcoming;

import com.ctrlz.meetingcoming.utils.ToastUtils;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;

public class BaseActivity extends FragmentActivity {

	protected String TAG;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// ��Ļһֱ������ʾ
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		// ����ǰActivity���뵽ȫ���б���
		MCApplication.addActivity(this);
		
		TAG = this.getClass().getSimpleName();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		MCApplication.removeActivity(this);
	}
	
private long first_time = 0;
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		switch(keyCode){
		case KeyEvent.KEYCODE_BACK:
			long second_time = System.currentTimeMillis();
			if(second_time - first_time>1500){
				ToastUtils.showShort(this, "�ٰ�һ�η��ؼ��˳�����");
				first_time = second_time;
			}else{
				finish();
			}
			
			return true;
		}
		
		return super.onKeyDown(keyCode, event);
	}

}
