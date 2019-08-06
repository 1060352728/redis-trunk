package com.likui.trunking.executortwo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Auther: likui
 * @Date: 2019/8/6 23:34
 * @Description:
 */
@Service
public class AsyncTaskTwo {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Async
    public void doTask2(int i) throws InterruptedException{
        logger.info("Task2-Native"+i+" started.");
    }
}
