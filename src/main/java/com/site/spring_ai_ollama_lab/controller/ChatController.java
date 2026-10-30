package com.site.spring_ai_ollama_lab.controller;

import com.site.spring_ai_ollama_lab.dto.ChatRequest;
import com.site.spring_ai_ollama_lab.dto.ChatResponse;
import com.site.spring_ai_ollama_lab.service.ChatService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat")
public class ChatController {
    private ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping
    public ChatResponse chat(@RequestBody ChatRequest req){
        String response = chatService.generateResponse(req.message());
        return new ChatResponse(response);
    }
}
