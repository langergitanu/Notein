package oO00o0o0;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import oO00o0.OooO00o;

/* JADX INFO: renamed from: oO00o0o0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32376OooO00o extends AtomicReference<Future<?>> implements oO0OOO00.OooO0O0 {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final FutureTask<Void> f116409OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final FutureTask<Void> f116410OooOoO0;
    private static final long serialVersionUID = 1811839108042568751L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Thread f116411OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Runnable f116412OooOo0o;

    static {
        OooO00o.RunnableC32322OooO0Oo runnableC32322OooO0Oo = oO00o0.OooO00o.f116236OooO0O0;
        f116410OooOoO0 = new FutureTask<>(runnableC32322OooO0Oo, null);
        f116409OooOoO = new FutureTask<>(runnableC32322OooO0Oo, null);
    }

    public AbstractC32376OooO00o(Runnable runnable) {
        this.f116412OooOo0o = runnable;
    }

    public final void OooO00o(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f116410OooOoO0) {
                return;
            }
            if (future2 == f116409OooOoO) {
                future.cancel(this.f116411OooOo != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // oO0OOO00.OooO0O0
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f116410OooOoO0 || future == (futureTask = f116409OooOoO) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f116411OooOo != Thread.currentThread());
    }
}
