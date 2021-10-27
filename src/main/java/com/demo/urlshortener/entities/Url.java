package com.demo.urlshortener.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Builder
public class Url {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 Long id;
	 
	 String Address;

}
