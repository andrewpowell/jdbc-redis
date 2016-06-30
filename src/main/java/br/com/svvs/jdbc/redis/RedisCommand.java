package br.com.svvs.jdbc.redis;

import br.com.svvs.jdbc.redis.response.RedisArrayResponse;
import br.com.svvs.jdbc.redis.response.RedisResponse;
import br.com.svvs.jdbc.redis.response.RedisScanResponse;
import br.com.svvs.jdbc.redis.response.RedisShutdownResponse;
import br.com.svvs.jdbc.redis.response.RedisSimpleResponse;

public enum RedisCommand {

    APPEND(RedisSimpleResponse.INSTANCE),
    AUTH(RedisSimpleResponse.INSTANCE),
    BITCOUNT(RedisSimpleResponse.INSTANCE),
    BITFIELD(RedisArrayResponse.INSTANCE),
    BITOP(RedisSimpleResponse.INSTANCE),
    BITPOS(RedisSimpleResponse.INSTANCE),
    BGREWRITEAOF(RedisSimpleResponse.INSTANCE),
    BGSAVE(RedisSimpleResponse.INSTANCE),
    DBSIZE(RedisSimpleResponse.INSTANCE),
    DECR(RedisSimpleResponse.INSTANCE),
    DECRBY(RedisSimpleResponse.INSTANCE),
    DEL(RedisSimpleResponse.INSTANCE),
    EXISTS(RedisSimpleResponse.INSTANCE),
    EXPIRE(RedisSimpleResponse.INSTANCE),
    EXPIREAT(RedisSimpleResponse.INSTANCE),
    FLUSHALL(RedisSimpleResponse.INSTANCE),
    FLUSHDB(RedisSimpleResponse.INSTANCE),
    GET(RedisSimpleResponse.INSTANCE),
    GETBIT(RedisSimpleResponse.INSTANCE),
    GETSET(RedisSimpleResponse.INSTANCE),
    HDEL(RedisSimpleResponse.INSTANCE),
    HEXISTS(RedisSimpleResponse.INSTANCE),
    HGET(RedisSimpleResponse.INSTANCE),
    HGETALL(RedisArrayResponse.INSTANCE),
    HINCRBY(RedisSimpleResponse.INSTANCE),
    HINCRBYFLOAT(RedisSimpleResponse.INSTANCE),
    HKEYS(RedisArrayResponse.INSTANCE),
    HLEN(RedisSimpleResponse.INSTANCE),
    HMGET(RedisArrayResponse.INSTANCE),
    HMSET(RedisSimpleResponse.INSTANCE),
    HSCAN(RedisScanResponse.INSTANCE),
    HSET(RedisSimpleResponse.INSTANCE),
    HSETNX(RedisSimpleResponse.INSTANCE),
    HSTRLEN(RedisSimpleResponse.INSTANCE),
    HVALS(RedisArrayResponse.INSTANCE),
    INCR(RedisSimpleResponse.INSTANCE),
    INCRBY(RedisSimpleResponse.INSTANCE),
    INFO(RedisSimpleResponse.INSTANCE),
    KEYS(RedisArrayResponse.INSTANCE),
    LASTSAVE(RedisSimpleResponse.INSTANCE),
    LINDEX(RedisSimpleResponse.INSTANCE),
    LLEN(RedisSimpleResponse.INSTANCE),
    LPOP(RedisSimpleResponse.INSTANCE),
    LPUSH(RedisSimpleResponse.INSTANCE),
    LRANGE(RedisArrayResponse.INSTANCE),
    LREM(RedisSimpleResponse.INSTANCE),
    LSET(RedisSimpleResponse.INSTANCE),
    LTRIM(RedisSimpleResponse.INSTANCE),
    MGET(RedisArrayResponse.INSTANCE),
    MOVE(RedisSimpleResponse.INSTANCE),
    MSET(RedisSimpleResponse.INSTANCE),
    PEXPIRE(RedisSimpleResponse.INSTANCE),
    PTTL(RedisSimpleResponse.INSTANCE),
    QUIT(RedisSimpleResponse.INSTANCE),
    RANDOMKEY(RedisSimpleResponse.INSTANCE),
    RENAME(RedisSimpleResponse.INSTANCE),
    RENAMENX(RedisSimpleResponse.INSTANCE),
    RPOP(RedisSimpleResponse.INSTANCE),
    RPUSH(RedisSimpleResponse.INSTANCE),
    SADD(RedisSimpleResponse.INSTANCE),
    SAVE(RedisSimpleResponse.INSTANCE),
    SCAN(RedisScanResponse.INSTANCE),
    SCARD(RedisSimpleResponse.INSTANCE),
    SELECT(RedisSimpleResponse.INSTANCE),
    SET(RedisSimpleResponse.INSTANCE),
    SETBIT(RedisSimpleResponse.INSTANCE),
    SETNX(RedisSimpleResponse.INSTANCE),
    SHUTDOWN(RedisShutdownResponse.INSTANCE),
    SINTER(RedisSimpleResponse.INSTANCE),
    SINTERSTORE(RedisSimpleResponse.INSTANCE),
    SISMEMBER(RedisSimpleResponse.INSTANCE),
    SMEMBERS(RedisSimpleResponse.INSTANCE),
    SORT(RedisSimpleResponse.INSTANCE),
    SREM(RedisSimpleResponse.INSTANCE),
    TTL(RedisSimpleResponse.INSTANCE),
    TYPE(RedisSimpleResponse.INSTANCE);

    private final RedisResponse response;

    private RedisCommand(RedisResponse response) {
        this.response = response;
    }

    public RedisResponse getResponse() {
        return response;
    }
}
