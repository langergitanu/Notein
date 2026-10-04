package oO00o0o0;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import oO0OooOO.AbstractC33500OooOOOo;
import ooOOo0.EnumC35110OooO0OO;

/* JADX INFO: renamed from: oO00o0o0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32378OooO0OO extends AbstractC33500OooOOOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ThreadFactoryC32380OooO0o f116426OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final ThreadFactoryC32380OooO0o f116427OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final TimeUnit f116428OooO0Oo = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f116429OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C20224OooO0OO f116430OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference<OooO00o> f116431OooO00o;

    /* JADX INFO: renamed from: oO00o0o0.OooO0OO$OooO00o */
    public static final class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final ConcurrentLinkedQueue<C20224OooO0OO> f116432OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final long f116433OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final ScheduledExecutorService f116434OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final oO0OOO00.OooO00o f116435OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final ScheduledFuture f116436OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final ThreadFactoryC32380OooO0o f116437OooOoo0;

        public OooO00o(long j, TimeUnit timeUnit, ThreadFactoryC32380OooO0o threadFactoryC32380OooO0o) {
            OooO00o oooO00o;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.f116433OooOo0o = nanos;
            this.f116432OooOo = new ConcurrentLinkedQueue<>();
            this.f116435OooOoO0 = new oO0OOO00.OooO00o();
            this.f116437OooOoo0 = threadFactoryC32380OooO0o;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, C32378OooO0OO.f116427OooO0OO);
                oooO00o = this;
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(oooO00o, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                oooO00o = this;
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            oooO00o.f116434OooOoO = scheduledExecutorServiceNewScheduledThreadPool;
            oooO00o.f116436OooOoOO = scheduledFutureScheduleWithFixedDelay;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue<C20224OooO0OO> concurrentLinkedQueue = this.f116432OooOo;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long jNanoTime = System.nanoTime();
            for (C20224OooO0OO c20224OooO0OO : concurrentLinkedQueue) {
                if (c20224OooO0OO.f116442OooOoO0 > jNanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(c20224OooO0OO)) {
                    this.f116435OooOoO0.OooO0O0(c20224OooO0OO);
                }
            }
        }
    }

    /* JADX INFO: renamed from: oO00o0o0.OooO0OO$OooO0O0 */
    public static final class OooO0O0 extends AbstractC33500OooOOOo.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO00o f116438OooOo;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final C20224OooO0OO f116441OooOoO0;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final AtomicBoolean f116440OooOoO = new AtomicBoolean();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final oO0OOO00.OooO00o f116439OooOo0o = new oO0OOO00.OooO00o();

        public OooO0O0(OooO00o oooO00o) {
            C20224OooO0OO c20224OooO0OO;
            C20224OooO0OO c20224OooO0OO2;
            this.f116438OooOo = oooO00o;
            if (oooO00o.f116435OooOoO0.f118918OooOo) {
                c20224OooO0OO2 = C32378OooO0OO.f116430OooO0o0;
            } else {
                while (true) {
                    if (oooO00o.f116432OooOo.isEmpty()) {
                        c20224OooO0OO = new C20224OooO0OO(oooO00o.f116437OooOoo0);
                        oooO00o.f116435OooOoO0.OooO00o(c20224OooO0OO);
                        break;
                    } else {
                        c20224OooO0OO = oooO00o.f116432OooOo.poll();
                        if (c20224OooO0OO != null) {
                            break;
                        }
                    }
                }
                c20224OooO0OO2 = c20224OooO0OO;
            }
            this.f116441OooOoO0 = c20224OooO0OO2;
        }

        @Override // oO0OooOO.AbstractC33500OooOOOo.OooO0O0
        public final oO0OOO00.OooO0O0 OooO00o(Runnable runnable, TimeUnit timeUnit) {
            return this.f116439OooOo0o.f118918OooOo ? EnumC35110OooO0OO.f126094OooOo0o : this.f116441OooOoO0.OooO0OO(runnable, TimeUnit.NANOSECONDS, this.f116439OooOo0o);
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            if (this.f116440OooOoO.compareAndSet(false, true)) {
                this.f116439OooOo0o.dispose();
                OooO00o oooO00o = this.f116438OooOo;
                oooO00o.getClass();
                long jNanoTime = System.nanoTime() + oooO00o.f116433OooOo0o;
                C20224OooO0OO c20224OooO0OO = this.f116441OooOoO0;
                c20224OooO0OO.f116442OooOoO0 = jNanoTime;
                oooO00o.f116432OooOo.offer(c20224OooO0OO);
            }
        }
    }

    /* JADX INFO: renamed from: oO00o0o0.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C20224OooO0OO extends C32381OooO0o0 {

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public long f116442OooOoO0;

        public C20224OooO0OO(ThreadFactoryC32380OooO0o threadFactoryC32380OooO0o) {
            super(threadFactoryC32380OooO0o);
            this.f116442OooOoO0 = 0L;
        }
    }

    static {
        C20224OooO0OO c20224OooO0OO = new C20224OooO0OO(new ThreadFactoryC32380OooO0o("RxCachedThreadSchedulerShutdown"));
        f116430OooO0o0 = c20224OooO0OO;
        c20224OooO0OO.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        ThreadFactoryC32380OooO0o threadFactoryC32380OooO0o = new ThreadFactoryC32380OooO0o("RxCachedThreadScheduler", iMax, false);
        f116426OooO0O0 = threadFactoryC32380OooO0o;
        f116427OooO0OO = new ThreadFactoryC32380OooO0o("RxCachedWorkerPoolEvictor", iMax, false);
        OooO00o oooO00o = new OooO00o(0L, null, threadFactoryC32380OooO0o);
        f116429OooO0o = oooO00o;
        oooO00o.f116435OooOoO0.dispose();
        ScheduledFuture scheduledFuture = oooO00o.f116436OooOoOO;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = oooO00o.f116434OooOoO;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public C32378OooO0OO() {
        AtomicReference<OooO00o> atomicReference;
        ThreadFactoryC32380OooO0o threadFactoryC32380OooO0o = f116426OooO0O0;
        OooO00o oooO00o = f116429OooO0o;
        this.f116431OooO00o = new AtomicReference<>(oooO00o);
        OooO00o oooO00o2 = new OooO00o(60L, f116428OooO0Oo, threadFactoryC32380OooO0o);
        do {
            atomicReference = this.f116431OooO00o;
            if (atomicReference.compareAndSet(oooO00o, oooO00o2)) {
                return;
            }
        } while (atomicReference.get() == oooO00o);
        oooO00o2.f116435OooOoO0.dispose();
        ScheduledFuture scheduledFuture = oooO00o2.f116436OooOoOO;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = oooO00o2.f116434OooOoO;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // oO0OooOO.AbstractC33500OooOOOo
    public final AbstractC33500OooOOOo.OooO0O0 OooO00o() {
        return new OooO0O0(this.f116431OooO00o.get());
    }
}
