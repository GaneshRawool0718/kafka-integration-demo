package com.example.kafkademo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;

@SpringBootTest
@EmbeddedKafka(partitions = 1, topics = {"hello-world-topic"})
public class KafkademoApplicationTests {

	@Test
	void contextLoads() {
		// This test will start the Spring context and Embedded Kafka broker
	}
}

