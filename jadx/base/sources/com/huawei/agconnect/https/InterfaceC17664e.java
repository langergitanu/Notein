package com.huawei.agconnect.https;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.agconnect.https.e */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC17664e {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC17664e f52255a = new InterfaceC17664e() { // from class: com.huawei.agconnect.https.e.1

        /* JADX INFO: renamed from: b */
        Executor f52256b = new ThreadPoolExecutor(0, 8, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.huawei.agconnect.https.e.1.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "AGC-Https-Thread");
            }
        });

        @Override // com.huawei.agconnect.https.InterfaceC17664e
        /* JADX INFO: renamed from: a */
        public Executor mo75648a() {
            return this.f52256b;
        }
    };

    /* JADX INFO: renamed from: a */
    Executor mo75648a();
}
