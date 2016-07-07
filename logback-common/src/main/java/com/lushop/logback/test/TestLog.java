package com.lushop.logback.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * logback日志测试
 * 
 * @author lushop
 *
 */
public class TestLog {

	private Logger logger = LoggerFactory.getLogger(TestLog.class);

	@Test
	public void TestNgLearn() {
		logger.info("this is TestNG test case");
	}

}
