package com.ctrlz.meetingcoming.personal;

public class MessageMode {
	
	//��Ϣ������
	private String sender;
	//��Ϣ����
	private String content;
	//��Ϣʱ��
	private String time;
	//��Ϣ����
	private String title;
	//���� 0�㲥 1����
	private String type;
	//��ϢID
	private String messageId;
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

}
