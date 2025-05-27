package com.example.oauth2login.domain;

import jakarta.persistence.*;

@Entity
public class UrlEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    public UrlEntity() {
    }

    public UrlEntity(String url) {
        this.url = url;
    }

    // Getter/Setter
    public Long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
