package oO00oOO;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import oO00o.AbstractC32318OooO0o;
import oO00oO0.EnumC32398OooO0OO;
import oO0OO0oO.C32924OooO00o;
import oO0OO0oO.InterfaceC32925OooO0O0;

/* JADX INFO: renamed from: oO00oOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32416OooO0OO extends AbstractC32318OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ThreadFactoryC32418OooO0o f116549OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final ThreadFactoryC32418OooO0o f116550OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C20229OooO0OO f116552OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o f116554OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference<OooO00o> f116555OooO00o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final TimeUnit f116553OooO0o0 = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long f116551OooO0Oo = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    /* JADX INFO: renamed from: oO00oOO.OooO0OO$OooO00o */
    public static final class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final ConcurrentLinkedQueue<C20229OooO0OO> f116556OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final long f116557OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final ScheduledExecutorService f116558OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final C32924OooO00o f116559OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final ScheduledFuture f116560OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final ThreadFactoryC32418OooO0o f116561OooOoo0;

        public OooO00o(long j, TimeUnit timeUnit, ThreadFactoryC32418OooO0o threadFactoryC32418OooO0o) {
            OooO00o oooO00o;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.f116557OooOo0o = nanos;
            this.f116556OooOo = new ConcurrentLinkedQueue<>();
            this.f116559OooOoO0 = new C32924OooO00o();
            this.f116561OooOoo0 = threadFactoryC32418OooO0o;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, C32416OooO0OO.f116550OooO0OO);
                oooO00o = this;
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(oooO00o, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                oooO00o = this;
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            oooO00o.f116558OooOoO = scheduledExecutorServiceNewScheduledThreadPool;
            oooO00o.f116560OooOoOO = scheduledFutureScheduleWithFixedDelay;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue<C20229OooO0OO> concurrentLinkedQueue = this.f116556OooOo;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long jNanoTime = System.nanoTime();
            for (C20229OooO0OO c20229OooO0OO : concurrentLinkedQueue) {
                if (c20229OooO0OO.f116566OooOoO0 > jNanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(c20229OooO0OO)) {
                    this.f116559OooOoO0.OooO0O0(c20229OooO0OO);
                }
            }
        }
    }

    /* JADX INFO: renamed from: oO00oOO.OooO0OO$OooO0O0 */
    public static final class OooO0O0 extends AbstractC32318OooO0o.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO00o f116562OooOo;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final C20229OooO0OO f116565OooOoO0;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final AtomicBoolean f116564OooOoO = new AtomicBoolean();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C32924OooO00o f116563OooOo0o = new C32924OooO00o();

        public OooO0O0(OooO00o oooO00o) {
            C20229OooO0OO c20229OooO0OO;
            C20229OooO0OO c20229OooO0OO2;
            this.f116562OooOo = oooO00o;
            if (oooO00o.f116559OooOoO0.f118804OooOo) {
                c20229OooO0OO2 = C32416OooO0OO.f116552OooO0o;
            } else {
                while (true) {
                    if (oooO00o.f116556OooOo.isEmpty()) {
                        c20229OooO0OO = new C20229OooO0OO(oooO00o.f116561OooOoo0);
                        oooO00o.f116559OooOoO0.OooO0OO(c20229OooO0OO);
                        break;
                    } else {
                        c20229OooO0OO = oooO00o.f116556OooOo.poll();
                        if (c20229OooO0OO != null) {
                            break;
                        }
                    }
                }
                c20229OooO0OO2 = c20229OooO0OO;
            }
            this.f116565OooOoO0 = c20229OooO0OO2;
        }

        @Override // oO00o.AbstractC32318OooO0o.OooO0O0
        public final InterfaceC32925OooO0O0 OooO00o(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.f116563OooOo0o.f118804OooOo ? EnumC32398OooO0OO.f116503OooOo0o : this.f116565OooOoO0.OooO0OO(runnable, j, timeUnit, this.f116563OooOo0o);
        }

        @Override // oO0OO0oO.InterfaceC32925OooO0O0
        public final void dispose() {
            if (this.f116564OooOoO.compareAndSet(false, true)) {
                this.f116563OooOo0o.dispose();
                OooO00o oooO00o = this.f116562OooOo;
                oooO00o.getClass();
                long jNanoTime = System.nanoTime() + oooO00o.f116557OooOo0o;
                C20229OooO0OO c20229OooO0OO = this.f116565OooOoO0;
                c20229OooO0OO.f116566OooOoO0 = jNanoTime;
                oooO00o.f116556OooOo.offer(c20229OooO0OO);
            }
        }
    }

    /* JADX INFO: renamed from: oO00oOO.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C20229OooO0OO extends C32419OooO0o0 {

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public long f116566OooOoO0;

        public C20229OooO0OO(ThreadFactoryC32418OooO0o threadFactoryC32418OooO0o) {
            super(threadFactoryC32418OooO0o);
            this.f116566OooOoO0 = 0L;
        }
    }

    static {
        C20229OooO0OO c20229OooO0OO = new C20229OooO0OO(new ThreadFactoryC32418OooO0o("RxCachedThreadSchedulerShutdown"));
        f116552OooO0o = c20229OooO0OO;
        c20229OooO0OO.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        ThreadFactoryC32418OooO0o threadFactoryC32418OooO0o = new ThreadFactoryC32418OooO0o("RxCachedThreadScheduler", iMax, false);
        f116549OooO0O0 = threadFactoryC32418OooO0o;
        f116550OooO0OO = new ThreadFactoryC32418OooO0o("RxCachedWorkerPoolEvictor", iMax, false);
        OooO00o oooO00o = new OooO00o(0L, null, threadFactoryC32418OooO0o);
        f116554OooO0oO = oooO00o;
        oooO00o.f116559OooOoO0.dispose();
        ScheduledFuture scheduledFuture = oooO00o.f116560OooOoOO;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = oooO00o.f116558OooOoO;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public C32416OooO0OO() {
        AtomicReference<OooO00o> atomicReference;
        ThreadFactoryC32418OooO0o threadFactoryC32418OooO0o = f116549OooO0O0;
        OooO00o oooO00o = f116554OooO0oO;
        this.f116555OooO00o = new AtomicReference<>(oooO00o);
        OooO00o oooO00o2 = new OooO00o(f116551OooO0Oo, f116553OooO0o0, threadFactoryC32418OooO0o);
        do {
            atomicReference = this.f116555OooO00o;
            if (atomicReference.compareAndSet(oooO00o, oooO00o2)) {
                return;
            }
        } while (atomicReference.get() == oooO00o);
        oooO00o2.f116559OooOoO0.dispose();
        ScheduledFuture scheduledFuture = oooO00o2.f116560OooOoOO;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = oooO00o2.f116558OooOoO;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // oO00o.AbstractC32318OooO0o
    public final AbstractC32318OooO0o.OooO0O0 OooO00o() {
        return new OooO0O0(this.f116555OooO00o.get());
    }
}
