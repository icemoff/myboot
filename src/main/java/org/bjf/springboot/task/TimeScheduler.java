package org.bjf.springboot.task;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.annotation.Resource;

/**
 * Created by binjinfeng on 2017/3/15.
 */
@Component
public class TimeScheduler {

    @Resource
    private AsyncTask task;

    //    @Scheduled(fixedDelay = 2000)
    public void testTime() {
        System.out.println(LocalDateTime.now());
        this.task();
    }

    public void task() {
        System.out.println("begining.........");
        Future<String> future = task.testTask();
        System.out.println("do other");

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
