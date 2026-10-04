package com.alipay.android.phone.mrpc.core;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.n */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0162n implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f81a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "com.alipay.mobile.common.transport.http.HttpManager.HttpWorker #" + this.f81a.getAndIncrement());
        thread.setPriority(4);
        return thread;
    }
}
