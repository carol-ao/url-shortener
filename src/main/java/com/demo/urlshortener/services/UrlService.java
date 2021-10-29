package com.demo.urlshortener.services;

import com.demo.urlshortener.dtos.UrlDto;
import com.demo.urlshortener.dtos.UrlMapper;
import com.demo.urlshortener.entities.Url;
import com.demo.urlshortener.services.exceptions.DuplicateUrlException;
import com.demo.urlshortener.services.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.urlshortener.repository.UrlRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UrlService {

private final UrlRepository repository;
private final UrlMapper urlMapper;

	@Transactional(readOnly = true)
	public Url findById(Long id){
		Optional<Url> url = repository.findById(id);
		return url.orElseThrow( () -> new ResourceNotFoundException("Entity not found") );
	}

	@Transactional(readOnly = true)
	public List<Url> findAll(){
		return repository.findAll();
	}

	public Url createUrl(UrlDto dto) {
		Optional<Url> searchDuplicate = repository.findByAddress(dto.getAddress());
		if(searchDuplicate.isPresent()){
			throw new DuplicateUrlException("the url is already registered: "+ dto.getAddress());
		}
		Url savedUrl = repository.save(urlMapper.toEntity(dto));
		return  savedUrl;
	}

	public void delete(Long id){
		Url savedUrl = findById(id);
		repository.delete(savedUrl);
	}




	
	
}
