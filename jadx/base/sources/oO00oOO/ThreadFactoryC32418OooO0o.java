package oO00oOO;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: oO00oOO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ThreadFactoryC32418OooO0o extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f116569OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f116570OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f116571OooOoO0;

    /* JADX INFO: renamed from: oO00oOO.OooO0o$OooO00o */
    public static final class OooO00o extends Thread {
    }

    public ThreadFactoryC32418OooO0o(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f116570OooOo0o + '-' + incrementAndGet();
        Thread oooO00o = this.f116571OooOoO0 ? new OooO00o(runnable, str) : new Thread(runnable, str);
        oooO00o.setPriority(this.f116569OooOo);
        oooO00o.setDaemon(true);
        return oooO00o;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("RxThreadFactory["), this.f116570OooOo0o, "]");
    }

    public ThreadFactoryC32418OooO0o(String str, int i, boolean z) {
        this.f116570OooOo0o = str;
        this.f116569OooOo = i;
        this.f116571OooOoO0 = z;
    }
}
