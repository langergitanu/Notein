package com.android.billingclient.api;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo implements ThreadFactory {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AtomicInteger f66993OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ThreadFactory f66994OooOo0o;

    public OooOo(C22159OooO0Oo c22159OooO0Oo) {
        Objects.requireNonNull(c22159OooO0Oo);
        this.f66994OooOo0o = Executors.defaultThreadFactory();
        this.f66993OooOo = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f66993OooOo;
        Thread threadNewThread = this.f66994OooOo0o.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
