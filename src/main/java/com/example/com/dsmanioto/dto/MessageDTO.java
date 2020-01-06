package com.example.com.dsmanioto.dto;

import lombok.Data;

@Data
public class MessageDTO {
	
	private String message;
	
	public MessageDTO updateMessage(MessageDTO messageDTO) {
		this.message = messageDTO.getMessage();
		return this;
	}
	
	public String getMessage() {
		return message;
	}
}
