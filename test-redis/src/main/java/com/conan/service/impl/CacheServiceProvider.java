package com.conan.service.impl;

import com.conan.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by yangchangqi on 2017/10/26.
 */
public class CacheServiceProvider {
    @Value("${cache.strategy}")
    private String cacheStrategy;

    @Autowired
    RedisCacheService redisCacheService;

    @Autowired
    LocalCacheService localCacheService;

    public CacheService getCacheService() {
        switch (cacheStrategy) {
            case "redis":
                return redisCacheService;
            case "local":
                return localCacheService;
            default:
                throw new RuntimeException("unsupported cache strategy!");
        }
    }
}
