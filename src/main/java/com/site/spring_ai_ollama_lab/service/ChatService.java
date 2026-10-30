package com.site.spring_ai_ollama_lab.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
    private final ChatClient chatClient;

    public ChatService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public String generateResponse(String message) {
        return chatClient.prompt()
                // Instructions that define the assistant's behavior
                .system("""
                    You are a professional Java programming tutor.

                    Your responsibilities:
                    1. Explain concepts in beginner-friendly language.
                    2. Use Java examples whenever appropriate.
                    3. Explain technical terms before using them.
                    4. Organize answers using headings and bullet points.
                    5. Avoid unnecessary complexity.
                    """)
                // The actual request from the user
                .user(message)
                .call()
                .content();
    }
}
