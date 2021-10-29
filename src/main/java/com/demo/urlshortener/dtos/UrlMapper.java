package com.demo.urlshortener.dtos;

import com.demo.urlshortener.entities.Url;
import org.springframework.stereotype.Service;

@Service
public class UrlMapper {
	public Url toEntity( UrlDto urlDto){
	    Url url = Url.builder().Address(urlDto.getAddress()).build();
	    return url;
    }

}
