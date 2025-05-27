package com.example.oauth2login.service;

import com.example.oauth2login.domain.UrlEntity;
import com.example.oauth2login.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

    private final UrlRepository urlRepository;

    @Autowired
    public UrlService(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    public UrlEntity saveUrl(String url) {
        UrlEntity urlEntity = new UrlEntity(url);
        return urlRepository.save(urlEntity);
    }
}
