package oO0OOo0o;

import com.google.common.base.Preconditions;
import java.lang.Thread;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: oO0OOo0o.o00ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ExecutorC33121o00ooo implements Executor {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f119763OooOo0o;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ConcurrentLinkedQueue f119762OooOo = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final AtomicReference<Thread> f119764OooOoO0 = new AtomicReference<>();

    /* JADX INFO: renamed from: oO0OOo0o.o00ooo$OooO00o */
    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Runnable f119765OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f119766OooOo0o;

        public OooO00o(OooO0O0 oooO0O0, Runnable runnable) {
            this.f119766OooOo0o = oooO0O0;
            this.f119765OooOo = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ExecutorC33121o00ooo.this.execute(this.f119766OooOo0o);
        }

        public final String toString() {
            return this.f119765OooOo.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.o00ooo$OooO0O0 */
    public static class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f119768OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Runnable f119769OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public boolean f119770OooOoO0;

        public OooO0O0(Runnable runnable) {
            this.f119769OooOo0o = (Runnable) Preconditions.checkNotNull(runnable, "task");
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f119768OooOo) {
                return;
            }
            this.f119770OooOoO0 = true;
            this.f119769OooOo0o.run();
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.o00ooo$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0O0 f119771OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ScheduledFuture<?> f119772OooO0O0;

        public OooO0OO(OooO0O0 oooO0O0, ScheduledFuture scheduledFuture) {
            this.f119771OooO00o = (OooO0O0) Preconditions.checkNotNull(oooO0O0, "runnable");
            this.f119772OooO0O0 = (ScheduledFuture) Preconditions.checkNotNull(scheduledFuture, "future");
        }

        public final void OooO00o() {
            this.f119771OooO00o.f119768OooOo = true;
            this.f119772OooO0O0.cancel(false);
        }
    }

    public ExecutorC33121o00ooo(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f119763OooOo0o = (Thread.UncaughtExceptionHandler) Preconditions.checkNotNull(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    public final void OooO00o() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        do {
            AtomicReference<Thread> atomicReference = this.f119764OooOoO0;
            Thread threadCurrentThread = Thread.currentThread();
            while (!atomicReference.compareAndSet(null, threadCurrentThread)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            while (true) {
                concurrentLinkedQueue = this.f119762OooOo;
                try {
                    Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.f119763OooOo0o.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    atomicReference.set(null);
                    throw th2;
                }
            }
            atomicReference.set(null);
        } while (!concurrentLinkedQueue.isEmpty());
    }

    public final void OooO0O0(Runnable runnable) {
        this.f119762OooOo.add((Runnable) Preconditions.checkNotNull(runnable, "runnable is null"));
    }

    public final OooO0OO OooO0OO(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        OooO0O0 oooO0O0 = new OooO0O0(runnable);
        return new OooO0OO(oooO0O0, scheduledExecutorService.schedule(new OooO00o(oooO0O0, runnable), j, timeUnit));
    }

    public final void OooO0Oo() {
        Preconditions.checkState(Thread.currentThread() == this.f119764OooOoO0.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        OooO0O0(runnable);
        OooO00o();
    }
}
