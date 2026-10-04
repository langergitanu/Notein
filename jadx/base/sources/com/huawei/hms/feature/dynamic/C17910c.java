package com.huawei.hms.feature.dynamic;

import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import java.lang.Thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.c */
/* JADX INFO: loaded from: classes6.dex */
public class C17910c {

    /* JADX INFO: renamed from: a */
    public static final String f53601a = "ExecutorsManager";

    /* JADX INFO: renamed from: b */
    public static final long f53602b = 60;

    /* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.c$a */
    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f53603a = new AtomicInteger(1);

        /* JADX INFO: renamed from: b */
        public final String f53604b;

        /* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.c$a$a, reason: collision with other inner class name */
        public class C19117a implements Thread.UncaughtExceptionHandler {
            public C19117a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                Logger.m75877e(C17910c.f53601a, thread.getName() + " : " + th.getMessage());
            }
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [int, java.lang.String] */
        public a(String str) {
            this.f53604b = Bundle.getInt(str);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f53604b + this.f53603a.getAndIncrement());
            thread.setUncaughtExceptionHandler(new C19117a());
            return thread;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ExecutorService m76948a(int i, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
