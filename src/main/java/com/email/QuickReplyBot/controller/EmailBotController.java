package com.email.QuickReplyBot.controller;

import com.email.QuickReplyBot.domain.EmailRequest;
import com.email.QuickReplyBot.services.EmailBotService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/email")
@AllArgsConstructor
public class EmailBotController {

    private final EmailBotService emailBotService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
        String response = emailBotService.generateReply(emailRequest);
        return ResponseEntity.ok(response);
    }
}
