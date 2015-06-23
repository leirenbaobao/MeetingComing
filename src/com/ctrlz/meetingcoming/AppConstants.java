package com.ctrlz.meetingcoming;

public class AppConstants {

	//���Ե�ַ
//	public static final String DOMAINNAME = "http://31caabe4.ngrok.com/";
	//�����Ʒ�������ַ
	public static final String DOMAINNAME = "http://www.lofver.com/";
	
	
	/**
	 * �����������ַ�趨
	 */
	//��¼
	public static final String LOGIN = "base/signIn";
	//��ѯ�������
	public static final String QUERY_HANDLE = "meeting/query";
	//�Ƴٻ��� 
	public static final String MEETING_PUT_OFF = "meeting/delay";
	//ȡ������
	public static final String MEETING_CANCEL = "meeting/cancel";
	//���μӻ���
	public static final String MEETING_UNATTEND = "meeting/refuse";
	//��ȡͨѶ¼
	public static final String CONTACTS = "base/contacts";
	//�ѽ�������
	public static final String MEETING_FINISHED = "meeting/history";
	
	//��ѯ��Ϣ
	public static final String QUERY_MESSAGES = "message/query";
	//ɾ����Ϣ
	public static final String DELETE_MESSAGES = "message/delete";
	
	//����ǩ��
	public static final String SIGN_MEETING = "meeting/sign";
	
	//�������
	public static final String LAUNCH_MEETING = "meeting/launch";
	
	//����ǩ��
	public static final String MEETING_SIGN = "sign?meetingId={";
	
	public static final String USER_DATA = "user_date";
	public static final String LOGIN_NAME = "login_name";
	public static final String LOGIN_PASSWORD = "login_password";
	public static final String IS_PASSWORD = "remember_word";
	
	
	public static final String SVN_ADDRESS = "svn_address";
	public static final String SVN_NAME = "svn_name";
	public static final String SVN_CODE = "svn_code";
	
	//�����쳣
	public static final String NETWORK_ERROR = "�����쳣";
	
	public static String getUrl(String urlName) {
		return DOMAINNAME  + urlName;
	}

}
