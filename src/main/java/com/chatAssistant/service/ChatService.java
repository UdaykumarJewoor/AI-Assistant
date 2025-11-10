package com.chatAssistant.service;

import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    @Autowired
    private ChatClient chatClient;

    public String getChatResponse(String userMessage) {
        String prompt = """
                You are a friendly and helpful AI assistant.
                Keep responses short, clear, and conversational.
                Maintain context between questions and answers.
                User: %s
                AI:
                """.formatted(userMessage);
        return chatClient.call(prompt);
    }
}
