package com.likui.trunking.controller;

import com.likui.trunking.executor.AsyncTask;
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
public class AsyncController {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AsyncTask asyncTask;

    @RequestMapping("/async")
    public String AsyncTaskTest() throws InterruptedException, ExecutionException {

        for (int i = 0; i < 100; i++) {
            asyncTask.doTask1(i);
        }
        logger.info("All tasks finished.");
        return "123";
    }
}
