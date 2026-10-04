package com.microsoft.identity.common.java.cache;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes9.dex */
public class HttpCache {
    private static IHttpCacheCallback sHttpCache;
    private static final ReentrantReadWriteLock sLock = new ReentrantReadWriteLock();

    public interface IHttpCacheCallback {
        void flush();
    }

    public static void flush() {
        ReentrantReadWriteLock reentrantReadWriteLock = sLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            IHttpCacheCallback iHttpCacheCallback = sHttpCache;
            if (iHttpCacheCallback != null) {
                iHttpCacheCallback.flush();
            }
            reentrantReadWriteLock.readLock().unlock();
        } catch (Throwable th) {
            sLock.readLock().unlock();
            throw th;
        }
    }

    public static void setHttpCache(IHttpCacheCallback iHttpCacheCallback) {
        ReentrantReadWriteLock reentrantReadWriteLock = sLock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            sHttpCache = iHttpCacheCallback;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            sLock.writeLock().unlock();
            throw th;
        }
    }
}
