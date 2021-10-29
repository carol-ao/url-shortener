package com.demo.urlshortener.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UrlDto {
	
	@JsonProperty("address")
	private String Address;

}
