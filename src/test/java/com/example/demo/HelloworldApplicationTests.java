package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(classes = HelloworldApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class HelloworldApplicationTests {
	@Autowired
    private TestRestTemplate template;

	@Test
	void contextLoads() throws Exception {
		ResponseEntity<String> response = template.getForEntity("/", String.class);
        assertThat(response.getBody()).isEqualTo("Hello World, Spring Boot!");
	}

}
