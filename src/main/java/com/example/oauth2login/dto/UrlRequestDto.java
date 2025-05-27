package com.example.oauth2login.dto;

public class UrlRequestDto {
    private String url;

    public UrlRequestDto() {
    }

    public UrlRequestDto(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
