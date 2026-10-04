package com.microsoft.identity.common.java.util;

import Oooo0oO.C21111o0ooOoO;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.microsoft.identity.common.java.logging.Logger;
import java.lang.Thread;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes9.dex */
public class ThreadUtils {
    private static ThreadFactory getNamedThreadFactory(String str, SecurityManager securityManager) {
        if (str != null) {
            return new ThreadFactory(str, securityManager) { // from class: com.microsoft.identity.common.java.util.ThreadUtils.1
                private final ThreadGroup group;
                private final String poolPrefix;
                private final AtomicLong threadNumber = new AtomicLong(1);
                final /* synthetic */ String val$poolName;
                final /* synthetic */ SecurityManager val$securityManager;

                {
                    this.val$poolName = str;
                    this.val$securityManager = securityManager;
                    this.poolPrefix = C21111o0ooOoO.OooO0Oo(str, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
                    this.group = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
                }

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(this.group, runnable, this.poolPrefix + this.threadNumber.getAndIncrement(), 0L);
                    thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.microsoft.identity.common.java.util.ThreadUtils.1.1
                        @Override // java.lang.Thread.UncaughtExceptionHandler
                        public void uncaughtException(Thread thread2, Throwable th) {
                            if (thread2 == null) {
                                throw new NullPointerException("t is marked non-null but is null");
                            }
                            if (th == null) {
                                throw new NullPointerException("e is marked non-null but is null");
                            }
                            if (th instanceof ThreadDeath) {
                                Logger.info(OooO00o.OooO0OO(new StringBuilder("ThreadPool["), ThreadFactoryC187451.this.val$poolName, "]"), null, "Thread Death Exception in thread pool " + ThreadFactoryC187451.this.val$poolName);
                                return;
                            }
                            Logger.error(OooO00o.OooO0OO(new StringBuilder("ThreadPool["), ThreadFactoryC187451.this.val$poolName, "]"), null, "Uncaught Exception in thread pool " + ThreadFactoryC187451.this.val$poolName, th);
                        }
                    });
                    return thread;
                }
            };
        }
        throw new NullPointerException("poolName is marked non-null but is null");
    }

    public static ExecutorService getNamedThreadPoolExecutor(int i, int i2, int i3, long j, TimeUnit timeUnit, String str) {
        if (timeUnit == null) {
            throw new NullPointerException("keepAliveUnit is marked non-null but is null");
        }
        if (str != null) {
            return i3 > 0 ? new ThreadPoolExecutor(i, i2, j, timeUnit, new ArrayBlockingQueue(i3), getNamedThreadFactory(str, System.getSecurityManager())) : i3 == 0 ? new ThreadPoolExecutor(i, i2, j, timeUnit, new SynchronousQueue(), getNamedThreadFactory(str, System.getSecurityManager())) : new ThreadPoolExecutor(i, i2, j, timeUnit, new LinkedBlockingQueue(), getNamedThreadFactory(str, System.getSecurityManager()));
        }
        throw new NullPointerException("poolName is marked non-null but is null");
    }

    public static void sleepSafely(int i, String str, String str2) {
        if (str == null) {
            throw new NullPointerException("tag is marked non-null but is null");
        }
        if (str2 == null) {
            throw new NullPointerException("message is marked non-null but is null");
        }
        if (i > 0) {
            try {
                Thread.sleep(i);
            } catch (InterruptedException unused) {
                Logger.info(str, str2);
                Thread.currentThread().interrupt();
            }
        }
    }
}
