package com.huawei.hms.network.embedded;

import androidx.concurrent.futures.OooO00o;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.kc */
/* JADX INFO: loaded from: classes9.dex */
public class C18248kc {

    /* JADX INFO: renamed from: d */
    public static final C18248kc f55445d = new a();

    /* JADX INFO: renamed from: a */
    public boolean f55446a;

    /* JADX INFO: renamed from: b */
    public long f55447b;

    /* JADX INFO: renamed from: c */
    public long f55448c;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.kc$a */
    public class a extends C18248kc {
        @Override // com.huawei.hms.network.embedded.C18248kc
        /* JADX INFO: renamed from: a */
        public C18248kc mo78995a(long j) {
            return this;
        }

        @Override // com.huawei.hms.network.embedded.C18248kc
        /* JADX INFO: renamed from: b */
        public C18248kc mo78999b(long j, TimeUnit timeUnit) {
            return this;
        }

        @Override // com.huawei.hms.network.embedded.C18248kc
        /* JADX INFO: renamed from: e */
        public void mo79002e() throws IOException {
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m78993a(long j, long j2) {
        return (j != 0 && (j2 == 0 || j < j2)) ? j : j2;
    }

    /* JADX INFO: renamed from: b */
    public C18248kc mo78998b() {
        this.f55448c = 0L;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public long mo79000c() {
        if (this.f55446a) {
            return this.f55447b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* JADX INFO: renamed from: d */
    public boolean mo79001d() {
        return this.f55446a;
    }

    /* JADX INFO: renamed from: e */
    public void mo79002e() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f55446a && this.f55447b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: f */
    public long mo79003f() {
        return this.f55448c;
    }

    /* JADX INFO: renamed from: a */
    public C18248kc mo78994a() {
        this.f55446a = false;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C18248kc mo78999b(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException(OooO00o.OooO0O0(j, "timeout < 0: "));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f55448c = timeUnit.toNanos(j);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C18248kc mo78995a(long j) {
        this.f55446a = true;
        this.f55447b = j;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C18248kc m78996a(long j, TimeUnit timeUnit) {
        if (j <= 0) {
            throw new IllegalArgumentException(OooO00o.OooO0O0(j, "duration <= 0: "));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        return mo78995a(timeUnit.toNanos(j) + System.nanoTime());
    }

    /* JADX INFO: renamed from: a */
    public final void m78997a(Object obj) throws InterruptedIOException {
        try {
            boolean zMo79001d = mo79001d();
            long jMo79003f = mo79003f();
            long jNanoTime = 0;
            if (!zMo79001d && jMo79003f == 0) {
                obj.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zMo79001d && jMo79003f != 0) {
                jMo79003f = Math.min(jMo79003f, mo79000c() - jNanoTime2);
            } else if (zMo79001d) {
                jMo79003f = mo79000c() - jNanoTime2;
            }
            if (jMo79003f > 0) {
                long j = jMo79003f / 1000000;
                obj.wait(j, (int) (jMo79003f - (1000000 * j)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jMo79003f) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
