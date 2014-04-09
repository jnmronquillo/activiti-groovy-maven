package com.example;

import java.util.logging.Handler;
import java.util.logging.LogManager;
import java.util.logging.Logger;

//import org.activiti.engine.impl.util.LogUtil;
import org.junit.BeforeClass;
import org.slf4j.bridge.SLF4JBridgeHandler;

public abstract class AbstractTest {
	
	@BeforeClass
	public static void routeLoggingToSlf4j() {
//		LogUtil.readJavaUtilLoggingConfigFromClasspath();
		/*remove loggers of jdk1.4*/
		Logger rootLogger = LogManager.getLogManager().getLogger("");  
		Handler[] handlers = rootLogger.getHandlers();  
		for (int i = 0; i < handlers.length; i++) {  
			rootLogger.removeHandler(handlers[i]);  
		}
		/*end*/
		
		//direct logs of jdk1.4 to slf4j
		SLF4JBridgeHandler.install();
	}

}
