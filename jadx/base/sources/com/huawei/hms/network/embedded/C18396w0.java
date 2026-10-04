package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.w0 */
/* JADX INFO: loaded from: classes9.dex */
public class C18396w0 {

    /* JADX INFO: renamed from: d */
    public static final C18396w0 f56503d = new C18396w0();

    /* JADX INFO: renamed from: e */
    public static final String f56504e = "AIModel_Train";

    /* JADX INFO: renamed from: f */
    public static final String f56505f = "AIModel_Execute";

    /* JADX INFO: renamed from: g */
    public static final int f56506g = 0;

    /* JADX INFO: renamed from: h */
    public static final int f56507h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f56508i = 0;

    /* JADX INFO: renamed from: j */
    public static final int f56509j = 5;

    /* JADX INFO: renamed from: k */
    public static final int f56510k = 5;

    /* JADX INFO: renamed from: l */
    public static final int f56511l = 64;

    /* JADX INFO: renamed from: a */
    public RejectedExecutionHandler f56512a = new ThreadPoolExecutor.DiscardOldestPolicy();

    /* JADX INFO: renamed from: b */
    public ThreadPoolExecutor f56513b;

    /* JADX INFO: renamed from: c */
    public ThreadPoolExecutor f56514c;

    public C18396w0() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f56513b = new ThreadPoolExecutor(0, 1, 5L, timeUnit, new LinkedBlockingQueue(64), ExecutorsUtils.createThreadFactory(f56504e), this.f56512a);
        this.f56514c = new ThreadPoolExecutor(0, 5, 5L, timeUnit, new LinkedBlockingQueue(), ExecutorsUtils.createThreadFactory(f56505f));
    }

    /* JADX INFO: renamed from: a */
    public static C18396w0 m79812a() {
        return f56503d;
    }

    /* JADX INFO: renamed from: b */
    public void m79814b(Runnable runnable) {
        try {
            this.f56514c.execute(new RunnableC18139d1(runnable));
        } catch (RejectedExecutionException unused) {
            Logger.m76958d("AIexecute", "executeUrgent meet RejectedExecutionException");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m79813a(Runnable runnable) {
        try {
            this.f56513b.execute(new RunnableC18139d1(runnable));
        } catch (RejectedExecutionException unused) {
            Logger.m76958d("AIexecute", "executeTrain meet RejectedExecutionException");
        }
    }
}
