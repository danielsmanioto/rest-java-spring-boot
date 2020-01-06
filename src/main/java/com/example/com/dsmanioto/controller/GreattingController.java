package com.example.com.dsmanioto.controller;

import com.example.com.dsmanioto.dto.MessageDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreattingController {
	
	private MessageDTO message;
	
	@GetMapping("/message")
	public ResponseEntity<MessageDTO> message() {
		return ResponseEntity.ok(message);
	}
	
	@PutMapping("/message")
	public ResponseEntity<MessageDTO> update(@RequestBody MessageDTO message) {
		this.message = message.updateMessage(message);
		return ResponseEntity.ok(message);
	}
	
}
