package com.mine.SpringDataTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataTestApplicationTests {

	@Test
	void contextLoads() {
		int val = 1; 
		val = val+1-1; 
		assertEquals(1,val); 
	}

}
