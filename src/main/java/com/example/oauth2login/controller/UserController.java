package com.example.oauth2login.controller;

import com.example.oauth2login.dto.UrlRequestDto;
import com.example.oauth2login.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UrlService urlService;

    @Autowired
    public UserController(UrlService urlService) {
        this.urlService = urlService;
    }

    // ✅ OAuth 로그인한 사용자 정보 반환
    @GetMapping("/user")
    public ResponseEntity<?> getUserInfo(@AuthenticationPrincipal OAuth2User user) {
        return ResponseEntity.ok(user.getAttributes());
    }

    // ✅ 프론트엔드에서 전달한 URL 받아서 DB에 저장
    @PostMapping("/receive-url")
    public ResponseEntity<String> receiveUrl(@RequestBody UrlRequestDto requestDto) {
        String receivedUrl = requestDto.getUrl();
        System.out.println("프론트엔드에서 받은 URL: " + receivedUrl);

        // URL 저장 로직
        urlService.saveUrl(receivedUrl);

        return ResponseEntity.ok("URL 수신 및 저장 완료: " + receivedUrl);
    }
}
