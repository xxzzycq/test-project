package com.conan.service.impl;

/**
 * Created by yangchangqi on 2017/10/26.
 */
import com.conan.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

public final class RedisCacheService implements CacheService
{
    @Autowired
    private RedisTemplate<Serializable, Object> redisTemplate;

    @Override
    public boolean exists(String key)
    {
        return redisTemplate.hasKey(key.getBytes());
    }

    @Override
    public boolean set(String key, byte[] value)
    {
        boolean result = false;
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate
                    .opsForValue();
            operations.set(key.getBytes(), value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public byte[] get(String key)
    {
        ValueOperations<Serializable, Object> operations = redisTemplate
                .opsForValue();
        return (byte[]) operations.get(key.getBytes());
    }

    @Override
    public void delete(String key)
    {
        redisTemplate.delete(key.getBytes());
    }

    @Override
    public void expire(String key, long timeout, TimeUnit unit)
    {
        redisTemplate.expire(key.getBytes(), timeout, unit);
    }
}
