package com.effectivejava.item7.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ManyThread {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            executorService.submit(new TaskRunnable());
        }
        executorService.shutdown();

        Future<String> submit = executorService.submit(new TaskCallable());
    }

    public static class TaskRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread: " + Thread.currentThread().getName());
        }
    }

    public static class TaskCallable implements Callable<String> {
        @Override
        public String call() throws Exception {
            return "Thread: " + Thread.currentThread().getName();
        }
    }
}
