package com.demo.urlshortener.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.urlshortener.entities.Url;

import java.util.Optional;

public interface UrlRepository extends JpaRepository<Url, Long> {

    Optional<Url> findByAddress(String address);

}
