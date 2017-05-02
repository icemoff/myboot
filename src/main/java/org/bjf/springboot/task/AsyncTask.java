package org.bjf.springboot.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by binjinfeng on 2017/3/15.
 */
@Component
public class AsyncTask {

    @Async
    public Future<String> testTask() {
        try {
            TimeUnit.SECONDS.sleep(5);
            System.out.println("task ..");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new AsyncResult<>("done!");
    }
}
