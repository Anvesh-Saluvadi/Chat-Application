package com.example.demo.controller;

import com.example.demo.model.Message;
import com.example.demo.service.MessageService;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class ChatController {

    private final MessageService service;

    public ChatController(MessageService service) {
        this.service = service;
    }

    @MessageMapping("/send")
    @SendTo("/topic/messages")
    public List<Message> sendMessage(Message message) {
        service.saveMessage(message.getUsername(), message.getContent());
        return service.getAllMessages();
    }
}
