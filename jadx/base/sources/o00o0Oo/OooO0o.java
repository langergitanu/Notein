package o00o0Oo;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0o extends AbstractExecutorService implements ScheduledExecutorService {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static OooO0o f86694OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Handler f86695OooOo0o;

    public OooO0o(Handler handler) {
        this.f86695OooOo0o = handler;
    }

    public final void OooO00o(Runnable runnable) {
        this.f86695OooOo0o.post(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f86695OooOo0o.getLooper().getThread()) {
            runnable.run();
        } else {
            OooO00o(runnable);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableFutureC25417OooO0Oo(runnable, obj);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        RunnableFutureC25417OooO0Oo runnableFutureC25417OooO0Oo = new RunnableFutureC25417OooO0Oo(runnable, null);
        this.f86695OooOo0o.postDelayed(runnableFutureC25417OooO0Oo, timeUnit.toMillis(j));
        return runnableFutureC25417OooO0Oo;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        runnable.getClass();
        RunnableFutureC25417OooO0Oo runnableFutureC25417OooO0Oo = new RunnableFutureC25417OooO0Oo(runnable, null);
        execute(runnableFutureC25417OooO0Oo);
        return runnableFutureC25417OooO0Oo;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC25417OooO0Oo(callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableFutureC25417OooO0Oo runnableFutureC25417OooO0Oo = new RunnableFutureC25417OooO0Oo(callable);
        this.f86695OooOo0o.postDelayed(runnableFutureC25417OooO0Oo, timeUnit.toMillis(j));
        return runnableFutureC25417OooO0Oo;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        RunnableFutureC25417OooO0Oo runnableFutureC25417OooO0Oo = new RunnableFutureC25417OooO0Oo(runnable, obj);
        execute(runnableFutureC25417OooO0Oo);
        return runnableFutureC25417OooO0Oo;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        callable.getClass();
        RunnableFutureC25417OooO0Oo runnableFutureC25417OooO0Oo = new RunnableFutureC25417OooO0Oo(callable);
        execute(runnableFutureC25417OooO0Oo);
        return runnableFutureC25417OooO0Oo;
    }
}
