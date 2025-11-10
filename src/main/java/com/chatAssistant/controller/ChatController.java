package com.chatAssistant.controller;

import com.chatAssistant.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/chat")
@CrossOrigin(origins = "*")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping
    public Map<String, String> chat(@RequestBody Map<String, String> req) {
        String userMessage = req.get("message");
        String aiResponse = chatService.getChatResponse(userMessage);
        return Map.of("response", aiResponse);
    }
}
