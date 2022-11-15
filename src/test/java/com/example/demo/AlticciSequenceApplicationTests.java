package com.example.demo;

import com.example.demo.service.AlticciImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AlticciSequenceApplicationTests {

	AlticciImpl alticci = new AlticciImpl();
	@Test
	void alticciSequenceTest1() {
		assertEquals(alticci.alticciSequence(2), 1);
	}
	@Test
	void alticciSequenceTest2() {
		assertEquals(alticci.alticciSequence(7), 4);
	}
}
