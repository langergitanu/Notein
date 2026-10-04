package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.n3 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18281n3 {

    /* JADX INFO: renamed from: b */
    public static final String f55747b = "RequestThreadPoolMgr";

    /* JADX INFO: renamed from: a */
    public ExecutorService f55748a;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.n3$b */
    public static class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "HttpsBizThreadPool");
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.n3$c */
    public static class c {
        public static final C18281n3 INSTANCE = new C18281n3();
    }

    public C18281n3() {
        this.f55748a = null;
        Logger.m76963i(f55747b, "ThreadPool init!");
        this.f55748a = Executors.newCachedThreadPool(new b());
    }

    public static C18281n3 getInstance() {
        return c.INSTANCE;
    }

    public void execute(Runnable runnable) {
        try {
            this.f55748a.execute(runnable);
        } catch (RejectedExecutionException unused) {
            Logger.m76960e(f55747b, "the runnable task cannot be accepted for execution");
        }
    }

    public void release() {
        Logger.m76963i(f55747b, "ThreadPool release!");
        ExecutorService executorService = this.f55748a;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        this.f55748a.shutdown();
    }

    public Future submit(Runnable runnable) {
        try {
            return this.f55748a.submit(runnable);
        } catch (RejectedExecutionException unused) {
            Logger.m76960e(f55747b, "the runnable task cannot be accepted for execution");
            return null;
        }
    }
}
