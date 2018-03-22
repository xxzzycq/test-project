package com.conan.service.impl;

import com.conan.service.CacheService;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * Created by yangchangqi on 2017/10/26.
 */
public class LocalCacheService
        implements CacheService {
    ConcurrentHashMap<String, byte[]> localCache = new ConcurrentHashMap<>();

    @Override
    public boolean exists(String key) {
        return localCache.containsKey(key);
    }

    @Override
    public boolean set(String key, byte[] value) {
        localCache.put(key, value);
        return true;
    }

    @Override
    public byte[] get(String key) {
        return localCache.get(key);
    }

    @Override
    public void delete(String key) {
        localCache.remove(key);
    }

    @Override
    public void expire(String key, long timeout, TimeUnit unit) {
    }
}