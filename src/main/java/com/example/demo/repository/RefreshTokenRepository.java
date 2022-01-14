package com.example.demo.repository;

import com.example.demo.model.RefreshToken;

import java.util.Optional;

public interface RefreshTokenRepository {
    Optional<RefreshToken> findByToken(String token);

    void deleteByToken(String token);
}
