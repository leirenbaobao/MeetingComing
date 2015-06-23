package com.ctrlz.meetingcoming;
/**
 * �ȴ���
 */

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;

public class ProgressDialog extends Dialog
{

	public ProgressDialog(Context context)
	{
		this(context, R.style.LoadingDialog);
	}
	
	public ProgressDialog(Context context, int theme)
	{
		super(context, theme);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		this.setContentView(R.layout.progress_dialog);
		// ���õ��������������������ȡ���Ի���,���ؼ�Ҳ�����˳�
		this.setCancelable(false);
		ImageView iv_search_progress = (ImageView) findViewById(R.id.iv__progress);
		iv_search_progress.setBackgroundResource(R.drawable.search_pg);
		AnimationDrawable anim = (AnimationDrawable) iv_search_progress.getBackground();
		anim.start();
	}
	
	//��ֹ����down�������÷��ؼ������˳�
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		if(keyCode == KeyEvent.KEYCODE_BACK)
		{
			this.setCancelable(true);
		}
		
		return super.onKeyDown(keyCode, event);
	}
}
