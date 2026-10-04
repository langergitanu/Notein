package com.huawei.cloud.client.task;

import com.huawei.cloud.base.util.Logger;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Task implements Runnable {
    private Future<?> future;
    private boolean isCancel;
    public static final String TAG = "Task";
    private static final Logger LOGGER = Logger.getLogger(TAG);

    public abstract void call();

    public boolean cancel() {
        Future<?> future = this.future;
        if (future == null) {
            return false;
        }
        this.isCancel = true;
        return future.cancel(true);
    }

    public Future<?> getFuture() {
        return this.future;
    }

    public boolean isCancel() {
        return this.isCancel;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            call();
        } catch (Exception e) {
            LOGGER.m75693w("task error: " + e.toString());
        }
    }

    public void setCancel(boolean z) {
        this.isCancel = z;
    }

    public void setFuture(Future<?> future) {
        this.future = future;
    }
}
