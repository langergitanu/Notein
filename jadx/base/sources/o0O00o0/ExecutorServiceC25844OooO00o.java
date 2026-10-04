package o0O00o0;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o0O00o0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ExecutorServiceC25844OooO00o implements ExecutorService {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final long f88181OooOo = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static volatile int f88182OooOoO0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ThreadPoolExecutor f88183OooOo0o;

    /* JADX INFO: renamed from: o0O00o0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class ThreadFactoryC19722OooO00o implements ThreadFactory {

        /* JADX INFO: renamed from: o0O00o0.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C19723OooO00o extends Thread {
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new C19723OooO00o(runnable);
        }
    }

    /* JADX INFO: renamed from: o0O00o0.OooO00o$OooO0O0 */
    public static final class OooO0O0 implements ThreadFactory {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final String f88184OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final ThreadFactoryC19722OooO00o f88185OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final boolean f88186OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final OooO0OO.C19725OooO00o f88187OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final AtomicInteger f88188OooOoOO;

        /* JADX INFO: renamed from: o0O00o0.OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
        public class RunnableC19724OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ Runnable f88190OooOo0o;

            public RunnableC19724OooO00o(Runnable runnable) {
                this.f88190OooOo0o = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooO0O0 oooO0O0 = OooO0O0.this;
                if (oooO0O0.f88186OooOoO) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f88190OooOo0o.run();
                } catch (Throwable th) {
                    oooO0O0.f88187OooOoO0.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                    }
                }
            }
        }

        public OooO0O0(ThreadFactoryC19722OooO00o threadFactoryC19722OooO00o, String str, boolean z) {
            OooO0OO.C19725OooO00o c19725OooO00o = OooO0OO.f88191OooO00o;
            this.f88188OooOoOO = new AtomicInteger();
            this.f88185OooOo0o = threadFactoryC19722OooO00o;
            this.f88184OooOo = str;
            this.f88187OooOoO0 = c19725OooO00o;
            this.f88186OooOoO = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            RunnableC19724OooO00o runnableC19724OooO00o = new RunnableC19724OooO00o(runnable);
            this.f88185OooOo0o.getClass();
            ThreadFactoryC19722OooO00o.C19723OooO00o c19723OooO00o = new ThreadFactoryC19722OooO00o.C19723OooO00o(runnableC19724OooO00o);
            c19723OooO00o.setName("glide-" + this.f88184OooOo + "-thread-" + this.f88188OooOoOO.getAndIncrement());
            return c19723OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0O00o0.OooO00o$OooO0OO */
    public interface OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C19725OooO00o f88191OooO00o = new C19725OooO00o();

        /* JADX INFO: renamed from: o0O00o0.OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
        public class C19725OooO00o implements OooO0OO {
        }
    }

    public ExecutorServiceC25844OooO00o(ThreadPoolExecutor threadPoolExecutor) {
        this.f88183OooOo0o = threadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f88183OooOo0o.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f88183OooOo0o.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f88183OooOo0o.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f88183OooOo0o.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f88183OooOo0o.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f88183OooOo0o.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f88183OooOo0o.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f88183OooOo0o.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f88183OooOo0o.submit(runnable);
    }

    public final String toString() {
        return this.f88183OooOo0o.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f88183OooOo0o.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f88183OooOo0o.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.f88183OooOo0o.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f88183OooOo0o.submit(callable);
    }
}
