package o00o0Oo;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o00o0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25414OooO00o extends AbstractExecutorService {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C25414OooO00o f86683OooOo0o = new C25414OooO00o();

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return true;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return Collections.EMPTY_LIST;
    }
}
