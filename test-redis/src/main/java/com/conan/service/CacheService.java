package com.conan.service;

import java.util.concurrent.TimeUnit;

/**
 * Created by yangchangqi on 2017/10/26.
 */
public interface CacheService
{
    boolean exists(String key);

    boolean set(String key, byte[] value);

    byte[] get(String key);

    void delete(String key);

    void expire(String key, long timeout, TimeUnit unit);
}
