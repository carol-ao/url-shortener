package com.demo.urlshortener.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.urlshortener.entities.Url;

public interface UrlRepository extends JpaRepository<Url, Long> {

}
