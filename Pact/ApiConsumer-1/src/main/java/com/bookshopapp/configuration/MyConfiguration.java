package com.bookshopapp.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bookshopapp.service.ProviderConnector;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class MyConfiguration {
	
	@Value("${user-service.rooturi}")
	String userServiceRootUri;

	@Bean
	public ProviderConnector getProviderConnector(@Autowired ObjectMapper objectMapper,
			@Autowired RestTemplateBuilder restTemplateBuilder) {
		return new ProviderConnector(userServiceRootUri, restTemplateBuilder, objectMapper);
	}
}
