package com.likui.trunking.controller;

import com.likui.trunking.executortwo.AsyncTaskTwo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.ExecutionException;

/**
 * @Auther: likui
 * @Date: 2019/8/6 23:13
 * @Description:
 */
@Controller
public class TwoAsyncController {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AsyncTaskTwo asyncTaskTwo;

    @RequestMapping("/async2")
    public String AsyncTaskTest() throws InterruptedException, ExecutionException {

        for (int i = 0; i < 100; i++) {
            asyncTaskTwo.doTask2(i);
        }
        logger.info("All tasks finished.");
        return "123";
    }
}
