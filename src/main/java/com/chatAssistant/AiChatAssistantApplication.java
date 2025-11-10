package com.chatAssistant;

import org.springframework.ai.autoconfigure.openai.OpenAiAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = OpenAiAutoConfiguration.class)
public class AiChatAssistantApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiChatAssistantApplication.class, args);
	}

}
