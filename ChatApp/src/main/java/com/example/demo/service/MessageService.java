package com.example.demo.service;

import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class MessageService {

    private final MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public Message saveMessage(String username, String content) {
        Message message = new Message(username, content, LocalDateTime.now());
        return repository.save(message);
    }

    public List<Message> getAllMessages() {
        return repository.findAll();
    }
}
