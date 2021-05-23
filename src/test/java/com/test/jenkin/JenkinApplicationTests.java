package com.test.jenkin;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinApplicationTests.class);


	@Test
	void contextLoads() {
		logger.info("test case executing");

		logger.info("test case executing second commit");
		Assertions.assertTrue(true);

	}

}
