package com.miui.penengine.p594c;

import com.miui.penengine.p594c.EnumC18758a;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.miui.penengine.c.a */
/* JADX INFO: loaded from: classes9.dex */
public enum EnumC18758a {
    INSTANCE;


    /* JADX INFO: renamed from: a */
    public final ExecutorService f57142a = new ThreadPoolExecutor(0, 2, 60, TimeUnit.SECONDS, new ArrayBlockingQueue(10), m80271b());

    EnumC18758a() {
    }

    /* JADX INFO: renamed from: b */
    public static ThreadFactory m80271b() {
        final AtomicInteger atomicInteger = new AtomicInteger(1);
        return new ThreadFactory() { // from class: o0O0Oo0O.OooO00o
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return EnumC18758a.m80269a(atomicInteger, runnable);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Thread m80269a(AtomicInteger atomicInteger, Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("PenEngine-GlobalThreadPool-" + atomicInteger.getAndIncrement());
        return thread;
    }

    /* JADX INFO: renamed from: a */
    public void m80272a(Runnable runnable) {
        this.f57142a.submit(runnable);
    }
}
