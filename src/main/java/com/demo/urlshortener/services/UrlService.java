package com.demo.urlshortener.services;

import org.springframework.stereotype.Service;

import com.demo.urlshortener.repository.UrlRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UrlService {

private final UrlRepository repository;

	Url createUrl(UrlDto dto) {
		
		Url saved url = repository.save(mapper.toEntity(dto));
	}




	
	
}
