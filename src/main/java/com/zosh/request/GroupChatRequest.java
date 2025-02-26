package com.zosh.request;

import java.util.List;

import lombok.Data;

@Data
public class GroupChatRequest {
	
	public GroupChatRequest(List<Integer> userIds, String chat_name, String chat_image) {
		super();
		this.userIds = userIds;
		this.chat_name = chat_name;
		this.chat_image = chat_image;
	}
	private List<Integer> userIds;
	private String chat_name;
	private String chat_image;
	
	public GroupChatRequest() {
		
	}
	public List<Integer> getUserIds() {
		return userIds;
	}
	public void setUserIds(List<Integer> userIds) {
		this.userIds = userIds;
	}
	public String getChat_name() {
		return chat_name;
	}
	public void setChat_name(String chat_name) {
		this.chat_name = chat_name;
	}
	public String getChat_image() {
		return chat_image;
	}
	public void setChat_image(String chat_image) {
		this.chat_image = chat_image;
	}
	
	
}
