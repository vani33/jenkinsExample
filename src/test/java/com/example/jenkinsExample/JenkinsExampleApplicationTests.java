package com.example.jenkinsExample;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsExampleApplicationTests {

	static Logger logger = LoggerFactory.getLogger(JenkinsExampleApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("***In a JenkinsExampleApplicationTests****");
		logger.info("********************************");
		logger.info("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}

}
