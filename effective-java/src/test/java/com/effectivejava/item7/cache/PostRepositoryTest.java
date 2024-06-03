package com.effectivejava.item7.cache;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PostRepositoryTest {
    @Test
    void cacheTest() {
        PostRepository postRepository = new PostRepository();


        Post post = postRepository.getPostById(1); // cache 데이터 생성
        assertThat(postRepository.getCache().isEmpty()).isFalse();

        System.out.println("Run GC");
        System.gc();
        System.out.println("End GC");

        assertThat(postRepository.getCache().isEmpty()).isTrue();
    }

    @Test
    void backgroundThread() throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        PostRepository postRepository = new PostRepository();
        postRepository.getPostById(1); // cache 데이터 생성

        Runnable removeOldCache = () -> {
            Map<CacheKey, Post> cache = postRepository.getCache();
            // 가장 오래된 cache 데이터 삭제
            cache.keySet().stream()
                    .min(Comparator.comparing(CacheKey::getCreatedAt))
                    .ifPresent((k) -> {
                        System.out.println("Remove cache: " + k);
                        cache.remove(k);
                    });
        };

        executor.scheduleAtFixedRate(removeOldCache, 1, 3, TimeUnit.SECONDS);
        Thread.sleep(5000L);
        executor.shutdown();

        assertThat(postRepository.getCache().isEmpty()).isTrue();
    }
}