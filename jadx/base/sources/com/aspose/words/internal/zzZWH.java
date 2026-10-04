package com.aspose.words.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZWH {
    private final ExecutorService zz8K = Executors.newSingleThreadExecutor();
    private final FutureTask<Object> zz8J = new FutureTask<>(new Callable<Object>() { // from class: com.aspose.words.internal.zzZWH.1
        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            try {
                zzZWH.this.zzHy();
                return null;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    });

    public final synchronized void start() {
        if (!this.zz8K.isShutdown()) {
            this.zz8K.execute(this.zz8J);
            this.zz8K.shutdown();
        }
    }

    public abstract void zzHy() throws Exception;

    public final void zzol() {
        try {
            this.zz8J.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
