package com.ctrlz.meetingcoming.handler;

import java.util.Comparator;

public class Compare implements Comparator<Object > {
	
	@Override
	public int compare(Object  arg0, Object  arg1) {
		MeetingsToHandlerMode user0=(MeetingsToHandlerMode)arg0;
		MeetingsToHandlerMode user1=(MeetingsToHandlerMode)arg1;

		   //���ȱȽ����䣬���������ͬ����Ƚ�����

		  int flag=user0.getMeetingsToHandlerTime().compareTo(user1.getMeetingsToHandlerTime());
		  if(flag==0){
			  return user0.getMeetingsToHandlerTimeLeft().compareTo(user1.getMeetingsToHandlerTimeLeft());
		  }else{
			  return flag;
		  }  
		 }


}
