package lk.ijse.logmanagement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    private static Logger logger = LoggerFactory.getLogger(LogController.class);

    //Log management tools
    //ELK STACK
    //Logstash
    //Kibana

    @GetMapping("/log")
    public String logMessage () {
        logger.debug("This is a DEBUG log message");
        logger.info("This is a INFO log message");
        logger.warn("This is a WARN log message");
        logger.error("This is a ERROR message");

        try {
             throw new RuntimeException("Hello i'm an Exception");
        }catch (Exception e){
            logger.error("This is error: {}",e.getMessage());
        }
        return "Log message generated!";
    }
}
