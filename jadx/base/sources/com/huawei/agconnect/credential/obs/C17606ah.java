package com.huawei.agconnect.credential.obs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.ah */
/* JADX INFO: loaded from: classes8.dex */
public final class C17606ah {

    /* JADX INFO: renamed from: a */
    private static final int f52111a;

    /* JADX INFO: renamed from: b */
    private static final int f52112b;

    /* JADX INFO: renamed from: c */
    private static final int f52113c;

    /* JADX INFO: renamed from: d */
    private static final long f52114d = 1;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f52111a = iAvailableProcessors;
        f52112b = (iAvailableProcessors * 2) + 1;
        f52113c = iAvailableProcessors + 1;
    }

    /* JADX INFO: renamed from: a */
    public static ExecutorService m75466a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f52113c, f52112b, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
