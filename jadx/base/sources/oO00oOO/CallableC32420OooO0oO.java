package oO00oOO;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: oO00oOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class CallableC32420OooO0oO extends AbstractC32414OooO00o implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        FutureTask<Void> futureTask = AbstractC32414OooO00o.f116533OooOoO0;
        this.f116534OooOo = Thread.currentThread();
        try {
            this.f116535OooOo0o.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.f116534OooOo = null;
        }
    }
}
