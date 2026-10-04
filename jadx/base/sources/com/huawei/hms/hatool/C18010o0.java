package com.huawei.hms.hatool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.huawei.hms.hatool.o0 */
/* JADX INFO: loaded from: classes8.dex */
public class C18010o0 {

    /* JADX INFO: renamed from: b */
    public static C18010o0 f53888b;

    /* JADX INFO: renamed from: c */
    public static C18010o0 f53889c;

    /* JADX INFO: renamed from: d */
    public static C18010o0 f53890d;

    /* JADX INFO: renamed from: a */
    public ThreadPoolExecutor f53891a = new ThreadPoolExecutor(0, 1, 60000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(5000), new b());

    /* JADX INFO: renamed from: com.huawei.hms.hatool.o0$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Runnable f53892a;

        public a(Runnable runnable) {
            this.f53892a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.f53892a;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception unused) {
                    C18030y.m77590e("hmsSdk", "InnerTask : Exception has happened,From internal operations!");
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.hatool.o0$b */
    public static class b implements ThreadFactory {

        /* JADX INFO: renamed from: d */
        public static final AtomicInteger f53893d = new AtomicInteger(1);

        /* JADX INFO: renamed from: a */
        public final ThreadGroup f53894a;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f53895b = new AtomicInteger(1);

        /* JADX INFO: renamed from: c */
        public final String f53896c;

        public b() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f53894a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.f53896c = "FormalHASDK-base-" + f53893d.getAndIncrement();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(this.f53894a, runnable, this.f53896c + this.f53895b.getAndIncrement(), 0L);
        }
    }

    static {
        new C18010o0();
        new C18010o0();
        f53888b = new C18010o0();
        f53889c = new C18010o0();
        f53890d = new C18010o0();
    }

    /* JADX INFO: renamed from: a */
    public static C18010o0 m77485a() {
        return f53890d;
    }

    /* JADX INFO: renamed from: b */
    public static C18010o0 m77486b() {
        return f53889c;
    }

    /* JADX INFO: renamed from: c */
    public static C18010o0 m77487c() {
        return f53888b;
    }

    /* JADX INFO: renamed from: a */
    public void m77488a(InterfaceRunnableC18007n0 interfaceRunnableC18007n0) {
        try {
            this.f53891a.execute(new a(interfaceRunnableC18007n0));
        } catch (RejectedExecutionException unused) {
            C18030y.m77590e("hmsSdk", "addToQueue() Exception has happened!Form rejected execution");
        }
    }
}
