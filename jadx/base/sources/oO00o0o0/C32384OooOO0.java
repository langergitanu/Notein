package oO00o0o0;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import oO0OooOO.AbstractC33500OooOOOo;
import ooOOo0.EnumC35110OooO0OO;

/* JADX INFO: renamed from: oO00o0o0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32384OooOO0 extends AbstractC33500OooOOOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ThreadFactoryC32380OooO0o f116455OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final ScheduledExecutorService f116456OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService> f116457OooO00o;

    /* JADX INFO: renamed from: oO00o0o0.OooOO0$OooO00o */
    public static final class OooO00o extends AbstractC33500OooOOOo.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final oO0OOO00.OooO00o f116458OooOo = new oO0OOO00.OooO00o();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final ScheduledExecutorService f116459OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public volatile boolean f116460OooOoO0;

        public OooO00o(ScheduledExecutorService scheduledExecutorService) {
            this.f116459OooOo0o = scheduledExecutorService;
        }

        @Override // oO0OooOO.AbstractC33500OooOOOo.OooO0O0
        public final oO0OOO00.OooO0O0 OooO00o(Runnable runnable, TimeUnit timeUnit) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            boolean z = this.f116460OooOoO0;
            EnumC35110OooO0OO enumC35110OooO0OO = EnumC35110OooO0OO.f126094OooOo0o;
            if (z) {
                return enumC35110OooO0OO;
            }
            RunnableC32383OooO0oo runnableC32383OooO0oo = new RunnableC32383OooO0oo(runnable, this.f116458OooOo);
            this.f116458OooOo.OooO00o(runnableC32383OooO0oo);
            try {
                runnableC32383OooO0oo.OooO00o(this.f116459OooOo0o.submit((Callable) runnableC32383OooO0oo));
                return runnableC32383OooO0oo;
            } catch (RejectedExecutionException e) {
                dispose();
                oO0OOO0O.OooO00o.OooO0O0(e);
                return enumC35110OooO0OO;
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            if (this.f116460OooOoO0) {
                return;
            }
            this.f116460OooOoO0 = true;
            this.f116458OooOo.dispose();
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f116456OooO0OO = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f116455OooO0O0 = new ThreadFactoryC32380OooO0o("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public C32384OooOO0() {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f116457OooO00o = atomicReference;
        boolean z = C32375OooO.f116405OooO00o;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, f116455OooO0O0);
        if (C32375OooO.f116405OooO00o && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            C32375OooO.f116408OooO0Oo.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // oO0OooOO.AbstractC33500OooOOOo
    public final AbstractC33500OooOOOo.OooO0O0 OooO00o() {
        return new OooO00o(this.f116457OooO00o.get());
    }

    @Override // oO0OooOO.AbstractC33500OooOOOo
    public final oO0OOO00.OooO0O0 OooO0OO(Runnable runnable) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        CallableC32382OooO0oO callableC32382OooO0oO = new CallableC32382OooO0oO(runnable);
        try {
            callableC32382OooO0oO.OooO00o(this.f116457OooO00o.get().submit(callableC32382OooO0oO));
            return callableC32382OooO0oO;
        } catch (RejectedExecutionException e) {
            oO0OOO0O.OooO00o.OooO0O0(e);
            return EnumC35110OooO0OO.f126094OooOo0o;
        }
    }
}
