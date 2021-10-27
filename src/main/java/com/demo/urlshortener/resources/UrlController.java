package com.demo.urlshortener.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.urlshortener.dtos.UrlDto;
import com.demo.urlshortener.entities.Url;

@RestController
@RequestMapping(value="/url")
public class UrlController {
	
	@PostMapping
	ResponseEntity<Url> create(@RequestBody UrlDto urlPostDto){
		
		Url url = Url.builder().Address("test").build();
		return ResponseEntity.ok(url);
		
	}
	
//	@GetMapping
//	ResponseEntity<Url> findById(@PathVariable id){
//		
//		
//		
//	}

}
