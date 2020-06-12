package com.bookshopapp;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.bookshopapp.service.BookConsumerService;
import com.bookshopapp.service.ProviderConnector;
import com.fasterxml.jackson.databind.ObjectMapper;

import au.com.dius.pact.consumer.Pact;
import au.com.dius.pact.consumer.PactProviderRuleMk2;
import au.com.dius.pact.consumer.PactVerification;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.model.RequestResponsePact;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class ApiConsumer1ApplicationTests {
	@Autowired
	BookConsumerService bookconsumerService;
	@Rule
	public PactProviderRuleMk2 mockProvider = new PactProviderRuleMk2("bookProvider2", "localhost", 8055, this);

	@Pact(consumer = "myconsumer2") // will default to the provider name from mockProvider in Rule
	public RequestResponsePact defineExpectation(PactDslWithProvider builder) {
		return builder.uponReceiving("get Book data").path("/bookshopmaintenanceapplication/api/book/7").method("GET")
				.willRespondWith().status(200)
				.body("{\n" + "\t\"bookName\": \"Head First Java\",\n" + "\t\"bookPrice\": 498,\n"
						+ "\t\"publisherName\": \"Raj\",\n" + "\t\"publishingYear\": 2005\n" + "}")
				.toPact();
	}
	
	@Pact(consumer = "myconsumer2") // will default to the provider name from mockProvider in Rule
	public RequestResponsePact defineExpectationwithState(PactDslWithProvider builder) {
		return builder.given("SomeState").uponReceiving("get Book data that was not in provider")
				.path("/bookshopmaintenanceapplication/api/book/1").method("GET").willRespondWith().status(200)
				.body("{\n" + "\t\"bookName\": \"C++\",\n" + "\t\"bookPrice\": 324,\n"
						+ "\t\"publisherName\": \"Manoj\",\n" + "\t\"publishingYear\": 2001\n" + "}")
				.toPact();
	}

	@Test
	@PactVerification(fragment = "defineExpectation")
	public void runTest() {
		Assert.assertTrue(bookconsumerService.getBook((long) 7).isPresent());
	}

	@Test
	@PactVerification(fragment = "defineExpectationwithState")
	public void runTestWithState() {
		Assert.assertTrue(bookconsumerService.getBook((long) 1).isPresent());
	}

}

@TestConfiguration
class TestConfig {
	@Bean
	public BookConsumerService getBookConsumerService(ProviderConnector providerConnector) {
		return new BookConsumerService(providerConnector);
	}

	@Bean
	public ProviderConnector getProviderConnector(ObjectMapper objectMapper, RestTemplateBuilder restTemplateBuilder) {
		return new ProviderConnector("http://localhost:8055/bookshopmaintenanceapplication/api", restTemplateBuilder,
				objectMapper);
	}

	@Bean
	public ObjectMapper getObjectMapper() {
		return new ObjectMapper();
	}

	@Bean
	public RestTemplateBuilder getRestTemplateBuilder() {
		return new RestTemplateBuilder();
	}

}
