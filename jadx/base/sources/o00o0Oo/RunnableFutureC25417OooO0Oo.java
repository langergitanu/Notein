package o00o0Oo;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: o00o0Oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableFutureC25417OooO0Oo<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final FutureTask<V> f86693OooOo0o;

    public RunnableFutureC25417OooO0Oo(Callable callable) {
        this.f86693OooOo0o = new FutureTask<>(callable);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f86693OooOo0o.cancel(z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        return this.f86693OooOo0o.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f86693OooOo0o.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f86693OooOo0o.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        this.f86693OooOo0o.run();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f86693OooOo0o.get(j, timeUnit);
    }

    public RunnableFutureC25417OooO0Oo(Runnable runnable, Object obj) {
        this.f86693OooOo0o = new FutureTask<>(runnable, obj);
    }
}
