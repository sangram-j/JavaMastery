package com.sj.demo.Future;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureDemo {
    // Create an ExecutorService with a single thread pool
    static ExecutorService threadPool = Executors.newSingleThreadExecutor();

    public static void main(String[] args) {
        threadPool.shutdown();

    }

}
