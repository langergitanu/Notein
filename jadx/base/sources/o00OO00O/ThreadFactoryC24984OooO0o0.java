package o00OO00O;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o00OO00O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC24984OooO0o0 implements ThreadFactory {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final AtomicInteger f84756OooOoO = new AtomicInteger(1);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AtomicInteger f84757OooOo = new AtomicInteger(1);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ThreadGroup f84758OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final String f84759OooOoO0;

    public ThreadFactoryC24984OooO0o0() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f84758OooOo0o = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f84759OooOoO0 = "lottie-" + f84756OooOoO.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f84758OooOo0o, runnable, this.f84759OooOoO0 + this.f84757OooOo.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
