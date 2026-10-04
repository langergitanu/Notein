package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.p4 */
/* JADX INFO: loaded from: classes9.dex */
public class ExecutorC18309p4 implements Executor {

    /* JADX INFO: renamed from: g */
    public static final long f55866g = -1;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ boolean f55867h = true;

    /* JADX INFO: renamed from: b */
    public boolean f55869b;

    /* JADX INFO: renamed from: c */
    public boolean f55870c;

    /* JADX INFO: renamed from: d */
    public InterruptedIOException f55871d;

    /* JADX INFO: renamed from: e */
    public RuntimeException f55872e;

    /* JADX INFO: renamed from: f */
    public long f55873f = -1;

    /* JADX INFO: renamed from: a */
    public final BlockingQueue<Runnable> f55868a = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: a */
    private Runnable m79345a(boolean z, long j) throws InterruptedIOException {
        try {
            Runnable runnableTake = !z ? this.f55868a.take() : this.f55868a.poll(j, TimeUnit.NANOSECONDS);
            if (runnableTake != null) {
                return runnableTake;
            }
            throw new SocketTimeoutException("loop timeout");
        } catch (InterruptedException e) {
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            interruptedIOException.initCause(e);
            throw interruptedIOException;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) throws RejectedExecutionException {
        if (runnable == null) {
            throw new IllegalArgumentException();
        }
        try {
            this.f55868a.put(runnable);
        } catch (InterruptedException e) {
            throw new RejectedExecutionException(e);
        }
    }

    public boolean hasLoopFailed() {
        return this.f55870c;
    }

    public boolean isRunning() {
        return this.f55869b;
    }

    public void loop() throws IOException {
        loop(0);
    }

    public void quit() {
        if (!f55867h && !m79346a()) {
            throw new AssertionError();
        }
        this.f55869b = false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m79346a() {
        long j = this.f55873f;
        if (j != -1) {
            return j == Thread.currentThread().getId();
        }
        this.f55873f = Thread.currentThread().getId();
        return true;
    }

    public void loop(int i) throws IOException {
        Runnable runnableM79345a;
        if (!f55867h && !m79346a()) {
            throw new AssertionError();
        }
        long jNanoTime = System.nanoTime();
        long jConvert = TimeUnit.NANOSECONDS.convert(i, TimeUnit.MILLISECONDS);
        if (this.f55870c) {
            InterruptedIOException interruptedIOException = this.f55871d;
            if (interruptedIOException == null) {
                throw this.f55872e;
            }
            throw interruptedIOException;
        }
        if (this.f55869b) {
            throw new IllegalStateException("Cannot run loop when it is already running.");
        }
        this.f55869b = true;
        while (this.f55869b) {
            if (i == 0) {
                try {
                    runnableM79345a = m79345a(false, 0L);
                } catch (InterruptedIOException e) {
                    this.f55869b = false;
                    this.f55870c = true;
                    this.f55871d = e;
                    throw e;
                } catch (RuntimeException e2) {
                    this.f55869b = false;
                    this.f55870c = true;
                    this.f55872e = e2;
                    throw e2;
                }
            } else {
                runnableM79345a = m79345a(true, (jConvert - System.nanoTime()) + jNanoTime);
            }
            runnableM79345a.run();
        }
    }
}
