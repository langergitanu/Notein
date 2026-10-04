package oO00o0o0;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: oO00o0o0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class CallableC32382OooO0oO extends AbstractC32376OooO00o implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        FutureTask<Void> futureTask = AbstractC32376OooO00o.f116410OooOoO0;
        this.f116411OooOo = Thread.currentThread();
        try {
            this.f116412OooOo0o.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.f116411OooOo = null;
        }
    }
}
