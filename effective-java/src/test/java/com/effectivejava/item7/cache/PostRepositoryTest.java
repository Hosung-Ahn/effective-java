package com.effectivejava.item7.cache;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}