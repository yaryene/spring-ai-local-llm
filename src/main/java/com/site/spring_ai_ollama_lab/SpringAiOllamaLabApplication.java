package com.site.spring_ai_ollama_lab;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAiOllamaLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAiOllamaLabApplication.class, args);
	}

}
