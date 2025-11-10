package com.chatAssistant.config;

import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.ai.openai.api.OpenAiApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenRouterConfig {

    private static final String API_KEY = "sk-xxxxxxxxxxxx9417";
    private static final String BASE_URL = "https://openrouter.ai/api";

    @Bean
    public ChatClient chatClient() {
        OpenAiApi api = new OpenAiApi(BASE_URL, API_KEY);
        OpenAiChatOptions opts = OpenAiChatOptions.builder()
                .withModel("gpt-4o")
                .withTemperature(0.5f)
                .withMaxTokens(1500)
                .build();
        return new OpenAiChatClient(api, opts);
    }
}
