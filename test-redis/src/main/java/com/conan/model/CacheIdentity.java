package com.conan.model;

/**
 * Created by yangchangqi on 2017/10/26.
 */
public class CacheIdentity {
    private String userName;
    private String cacheKey;
    private String dbName;
    private String tableName;

    public CacheIdentity(String userName, String cacheKey) {
        this(userName, cacheKey, "");
    }

    public CacheIdentity(String userName, String cacheKey, String dbName) {
        this(userName, cacheKey, dbName, "");
    }

    public CacheIdentity(String userName, String cacheKey, String dbName, String tableName) {
        this.userName = userName;
        this.cacheKey = cacheKey;
        this.dbName = dbName;
        this.tableName = tableName;
    }

    // 按照字符串拼接生成key
    public String getKey(String userName, String cacheKey, String dbName, String tableName) {
        return cacheKey + "#" + userName + "#" + dbName + "#" + tableName + "#" + hashCode();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CacheIdentity that = (CacheIdentity) o;

        if (!userName.equals(that.userName)) return false;
        if (!cacheKey.equals(that.cacheKey)) return false;
        if (!dbName.equals(that.dbName)) return false;
        if (!tableName.equals(that.tableName)) return false;

        return true;
    }

    // 按照字符串的hash值生成key
    @Override
    public int hashCode() {
        int result = cacheKey.hashCode();
        result = 31 * result + userName.hashCode();
        result = 31 * result + dbName.hashCode();
        result = 31 * result + tableName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "CacheIdentity{" +
                ", userName='" + userName + '\'' +
                ", cacheKey='" + cacheKey + '\'' +
                ", dbName='" + dbName + '\'' +
                ", tableName='" + tableName + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCacheKey() {
        return cacheKey;
    }

    public void setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
