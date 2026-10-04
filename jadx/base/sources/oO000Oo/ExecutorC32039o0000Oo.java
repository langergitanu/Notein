package oO000Oo;

import com.google.common.base.Preconditions;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: oO000Oo.o0000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ExecutorC32039o0000Oo implements Executor, Runnable {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final Logger f114539OooOoO = Logger.getLogger(ExecutorC32039o0000Oo.class.getName());

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final OooO00o f114540OooOoOO;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Executor f114542OooOo0o;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ConcurrentLinkedQueue f114541OooOo = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public volatile int f114543OooOoO0 = 0;

    /* JADX INFO: renamed from: oO000Oo.o0000Oo$OooO00o */
    public static abstract class OooO00o {
        public abstract boolean OooO00o(ExecutorC32039o0000Oo executorC32039o0000Oo);

        public abstract void OooO0O0(ExecutorC32039o0000Oo executorC32039o0000Oo);
    }

    /* JADX INFO: renamed from: oO000Oo.o0000Oo$OooO0O0 */
    public static final class OooO0O0 extends OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AtomicIntegerFieldUpdater<ExecutorC32039o0000Oo> f114544OooO00o;

        public OooO0O0(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            this.f114544OooO00o = atomicIntegerFieldUpdater;
        }

        @Override // oO000Oo.ExecutorC32039o0000Oo.OooO00o
        public final boolean OooO00o(ExecutorC32039o0000Oo executorC32039o0000Oo) {
            return this.f114544OooO00o.compareAndSet(executorC32039o0000Oo, 0, -1);
        }

        @Override // oO000Oo.ExecutorC32039o0000Oo.OooO00o
        public final void OooO0O0(ExecutorC32039o0000Oo executorC32039o0000Oo) {
            this.f114544OooO00o.set(executorC32039o0000Oo, 0);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o0000Oo$OooO0OO */
    public static final class OooO0OO extends OooO00o {
        @Override // oO000Oo.ExecutorC32039o0000Oo.OooO00o
        public final boolean OooO00o(ExecutorC32039o0000Oo executorC32039o0000Oo) {
            synchronized (executorC32039o0000Oo) {
                try {
                    if (executorC32039o0000Oo.f114543OooOoO0 != 0) {
                        return false;
                    }
                    executorC32039o0000Oo.f114543OooOoO0 = -1;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // oO000Oo.ExecutorC32039o0000Oo.OooO00o
        public final void OooO0O0(ExecutorC32039o0000Oo executorC32039o0000Oo) {
            synchronized (executorC32039o0000Oo) {
                executorC32039o0000Oo.f114543OooOoO0 = 0;
            }
        }
    }

    static {
        OooO00o oooO0OO;
        try {
            oooO0OO = new OooO0O0(AtomicIntegerFieldUpdater.newUpdater(ExecutorC32039o0000Oo.class, "OooOoO0"));
        } catch (Throwable th) {
            f114539OooOoO.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            oooO0OO = new OooO0OO();
        }
        f114540OooOoOO = oooO0OO;
    }

    public ExecutorC32039o0000Oo(Executor executor) {
        Preconditions.checkNotNull(executor, "'executor' must not be null.");
        this.f114542OooOo0o = executor;
    }

    public final void OooO00o(Runnable runnable) {
        OooO00o oooO00o = f114540OooOoOO;
        if (oooO00o.OooO00o(this)) {
            try {
                this.f114542OooOo0o.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f114541OooOo.remove(runnable);
                }
                oooO00o.OooO0O0(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f114541OooOo.add((Runnable) Preconditions.checkNotNull(runnable, "'r' must not be null."));
        OooO00o(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        OooO00o oooO00o = f114540OooOoOO;
        while (true) {
            concurrentLinkedQueue = this.f114541OooOo;
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e) {
                    f114539OooOoO.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e);
                }
            } catch (Throwable th) {
                oooO00o.OooO0O0(this);
                throw th;
            }
        }
        oooO00o.OooO0O0(this);
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        OooO00o(null);
    }
}
