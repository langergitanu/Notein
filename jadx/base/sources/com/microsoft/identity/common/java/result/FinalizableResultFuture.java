package com.microsoft.identity.common.java.result;

import com.microsoft.identity.common.java.util.ResultFuture;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes9.dex */
public class FinalizableResultFuture<T> extends ResultFuture<T> {
    private final CountDownLatch mFinalized = new CountDownLatch(1);

    public boolean isCleanedUp() {
        try {
            this.mFinalized.await();
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return true;
        }
    }

    public void setCleanedUp() {
        this.mFinalized.countDown();
    }
}
