package com.effectivejava.item7.cache;

import java.time.LocalDateTime;
import java.util.Objects;

public class CacheKey {
    private Integer value;
    private LocalDateTime createdAt = LocalDateTime.now();

    public CacheKey(Integer value) {
        this.value = value;
        this.createdAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CacheKey cacheKey = (CacheKey) obj;
        return Objects.equals(value, cacheKey.value) &&
                Objects.equals(createdAt, cacheKey.createdAt);
    }

    @Override
    public String toString() {
        return "CacheKey{" +
                "value=" + value +
                ", createdAt=" + createdAt +
                '}';
    }
}
