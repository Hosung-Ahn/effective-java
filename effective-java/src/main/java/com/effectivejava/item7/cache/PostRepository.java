package com.effectivejava.item7.cache;

import java.util.HashMap;
import java.util.Map;

public class PostRepository {
    private Map<CacheKey, Post> cache;

    public PostRepository() {
        this.cache = new HashMap<>(); // WeakHashMap 사용하면 Key가 GC되면 같이 삭제된다.
    }

    public Post getPostById(Integer id) {
        CacheKey cacheKey = new CacheKey(id);
        if (cache.containsKey(cacheKey)) {
            return cache.get(cacheKey);
        } else {
            // DB에서 조회 또는 REST API 호출하여 가져올 수 있다.( 예제이므로 생략 )
            Post post = new Post();
            cache.put(cacheKey, post);
            return post;
        }
    }

    public Map<CacheKey, Post> getCache() {
        return cache;
    }
}
