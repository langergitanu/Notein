package oO00oOO;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oO0OoooO.C33519OooO00o;

/* JADX INFO: renamed from: oO00oOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32414OooO00o extends AtomicReference<Future<?>> implements InterfaceC32925OooO0O0 {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final FutureTask<Void> f116532OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final FutureTask<Void> f116533OooOoO0;
    private static final long serialVersionUID = 1811839108042568751L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Thread f116534OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Runnable f116535OooOo0o;

    static {
        C33519OooO00o.OooO0OO oooO0OO = C33519OooO00o.f121088OooO0O0;
        f116533OooOoO0 = new FutureTask<>(oooO0OO, null);
        f116532OooOoO = new FutureTask<>(oooO0OO, null);
    }

    public AbstractC32414OooO00o(Runnable runnable) {
        this.f116535OooOo0o = runnable;
    }

    public final void OooO00o(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f116533OooOoO0) {
                return;
            }
            if (future2 == f116532OooOoO) {
                future.cancel(this.f116534OooOo != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // oO0OO0oO.InterfaceC32925OooO0O0
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f116533OooOoO0 || future == (futureTask = f116532OooOoO) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f116534OooOo != Thread.currentThread());
    }
}
