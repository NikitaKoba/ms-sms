package com.example.mssms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/sms/")
public class SmsController {
    private static final Logger log = LoggerFactory.getLogger(SmsController.class);

    @PostMapping("/send")
    public ResponseEntity<String> sendSms(){
        log.info("SMS was sent");
        return ResponseEntity.ok("SMS was sent");
    }

}
