package com.example.oauth2login.repository;

import com.example.oauth2login.domain.UrlEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<UrlEntity, Long> {
}
