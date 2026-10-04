package oO00oOO;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import oO00o.AbstractC32318OooO0o;
import oO00oO0.EnumC32398OooO0OO;
import oO00oOo0.C32430OooO00o;
import oO0OO0oO.C32924OooO00o;
import oO0OO0oO.InterfaceC32925OooO0O0;

/* JADX INFO: renamed from: oO00oOO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32422OooOO0 extends AbstractC32318OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ThreadFactoryC32418OooO0o f116579OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final ScheduledExecutorService f116580OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService> f116581OooO00o;

    /* JADX INFO: renamed from: oO00oOO.OooOO0$OooO00o */
    public static final class OooO00o extends AbstractC32318OooO0o.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C32924OooO00o f116582OooOo = new C32924OooO00o();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final ScheduledExecutorService f116583OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public volatile boolean f116584OooOoO0;

        public OooO00o(ScheduledExecutorService scheduledExecutorService) {
            this.f116583OooOo0o = scheduledExecutorService;
        }

        @Override // oO00o.AbstractC32318OooO0o.OooO0O0
        public final InterfaceC32925OooO0O0 OooO00o(Runnable runnable, long j, TimeUnit timeUnit) {
            boolean z = this.f116584OooOoO0;
            EnumC32398OooO0OO enumC32398OooO0OO = EnumC32398OooO0OO.f116503OooOo0o;
            if (z) {
                return enumC32398OooO0OO;
            }
            RunnableC32421OooO0oo runnableC32421OooO0oo = new RunnableC32421OooO0oo(runnable, this.f116582OooOo);
            this.f116582OooOo.OooO0OO(runnableC32421OooO0oo);
            try {
                runnableC32421OooO0oo.OooO00o(j <= 0 ? this.f116583OooOo0o.submit((Callable) runnableC32421OooO0oo) : this.f116583OooOo0o.schedule((Callable) runnableC32421OooO0oo, j, timeUnit));
                return runnableC32421OooO0oo;
            } catch (RejectedExecutionException e) {
                dispose();
                C32430OooO00o.OooO00o(e);
                return enumC32398OooO0OO;
            }
        }

        @Override // oO0OO0oO.InterfaceC32925OooO0O0
        public final void dispose() {
            if (this.f116584OooOoO0) {
                return;
            }
            this.f116584OooOoO0 = true;
            this.f116582OooOo.dispose();
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f116580OooO0OO = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f116579OooO0O0 = new ThreadFactoryC32418OooO0o("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    }

    public C32422OooOO0() {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f116581OooO00o = atomicReference;
        boolean z = C32413OooO.f116528OooO00o;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, f116579OooO0O0);
        if (C32413OooO.f116528OooO00o && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            C32413OooO.f116531OooO0Oo.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // oO00o.AbstractC32318OooO0o
    public final AbstractC32318OooO0o.OooO0O0 OooO00o() {
        return new OooO00o(this.f116581OooO00o.get());
    }

    @Override // oO00o.AbstractC32318OooO0o
    public final InterfaceC32925OooO0O0 OooO0OO(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        CallableC32420OooO0oO callableC32420OooO0oO = new CallableC32420OooO0oO(runnable);
        AtomicReference<ScheduledExecutorService> atomicReference = this.f116581OooO00o;
        try {
            callableC32420OooO0oO.OooO00o(j <= 0 ? atomicReference.get().submit(callableC32420OooO0oO) : atomicReference.get().schedule(callableC32420OooO0oO, j, timeUnit));
            return callableC32420OooO0oO;
        } catch (RejectedExecutionException e) {
            C32430OooO00o.OooO00o(e);
            return EnumC32398OooO0OO.f116503OooOo0o;
        }
    }
}
