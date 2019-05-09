package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by protean on 2019-05-07-20:27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j

public class LoggerTest {
    @Test
    public void test(){
        log.debug("debug....");
        log.error("error");
        log.info("info....");
    }
}
