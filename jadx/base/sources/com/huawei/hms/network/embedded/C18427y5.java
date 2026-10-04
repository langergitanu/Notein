package com.huawei.hms.network.embedded;

import androidx.concurrent.futures.OooO00o;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.y5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18427y5 {

    /* JADX INFO: renamed from: a */
    public boolean f56710a;

    /* JADX INFO: renamed from: b */
    public long f56711b;

    /* JADX INFO: renamed from: c */
    public long f56712c;

    public C18427y5 clearDeadline() {
        this.f56710a = false;
        return this;
    }

    public C18427y5 clearTimeout() {
        this.f56712c = 0L;
        return this;
    }

    public final C18427y5 deadline(long j, TimeUnit timeUnit) {
        if (j <= 0) {
            throw new IllegalArgumentException(OooO00o.OooO0O0(j, "duration <= 0: "));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        return deadlineNanoTime(timeUnit.toNanos(j) + System.nanoTime());
    }

    public long deadlineNanoTime() {
        if (this.f56710a) {
            return this.f56711b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean hasDeadline() {
        return this.f56710a;
    }

    public void throwIfReached() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f56710a && this.f56711b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public C18427y5 timeout(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException(OooO00o.OooO0O0(j, "timeout < 0: "));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f56712c = timeUnit.toNanos(j);
        return this;
    }

    public long timeoutNanos() {
        return this.f56712c;
    }

    public C18427y5 deadlineNanoTime(long j) {
        this.f56710a = true;
        this.f56711b = j;
        return this;
    }
}
