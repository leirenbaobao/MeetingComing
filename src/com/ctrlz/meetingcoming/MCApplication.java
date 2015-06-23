package com.ctrlz.meetingcoming;

import java.util.LinkedList;
import java.util.List;

import com.ctrlz.meetingcoming.launch.LaunchMode;

import android.app.Activity;
import android.app.Application;

public class MCApplication extends Application {

	// ����ϵͳ������Activity����
	public static List<Activity> mCActivityList = new LinkedList<Activity>();

	public static void addActivity(Activity activity) {
		mCActivityList.add(activity);
	}

	public static void removeActivity(Activity activity) {
		mCActivityList.remove(activity);
	}
	
	//�������Ҫ�����Ϣ
	public static LaunchMode lanuchMode;
	
	public static LaunchMode getLanuchMode() {
		return lanuchMode;
	}
	public static void setLanuchMode(LaunchMode lanuchMode) {
		MCApplication.lanuchMode = lanuchMode;
	}

	// Ա������
	private static String name;
	// Ա��ְλ
	private static String position;
	// Ա���Ա�
	private static String gender;
	// Ա�����
	private static String loginId;
	// Ա���μӻ�����
	private static String attendNum;
	// Ա�����������
	private static String launchNum;
	// Ա��δ�μӻ�����
	private static String unattendNum;
	// ����
	private static String deparment;
	
	//staffId
	private static String holderStaffId;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		MCApplication.name = name;
	}

	public static String getPosition() {
		return position;
	}

	public static void setPosition(String position) {
		MCApplication.position = position;
	}

	public static String getGender() {
		return gender;
	}

	public static void setGender(String gender) {
		MCApplication.gender = gender;
	}

	public static String getLoginId() {
		return loginId;
	}

	public static void setLoginId(String loginId) {
		MCApplication.loginId = loginId;
	}

	public static String getAttendNum() {
		return attendNum;
	}

	public static void setAttendNum(String attendNum) {
		MCApplication.attendNum = attendNum;
	}

	public static String getLaunchNum() {
		return launchNum;
	}

	public static void setLaunchNum(String launchNum) {
		MCApplication.launchNum = launchNum;
	}

	public static String getUnattendNum() {
		return unattendNum;
	}

	public static void setUnattendNum(String unattendNum) {
		MCApplication.unattendNum = unattendNum;
	}

	public static String getDeparment() {
		return deparment;
	}

	public static void setDeparment(String deparment) {
		MCApplication.deparment = deparment;
	}

	public static String getHolderStaffId() {
		return holderStaffId;
	}

	public static void setHolderStaffId(String holderStaffId) {
		MCApplication.holderStaffId = holderStaffId;
	}
	
}
