package oO00o0o0;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import oO0OOOOo.C32978OooOOo0;
import oO0OooOO.AbstractC33500OooOOOo;
import ooOOo0.EnumC35110OooO0OO;
import ooOOo0.InterfaceC35108OooO00o;

/* JADX INFO: renamed from: oO00o0o0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C32381OooO0o0 extends AbstractC33500OooOOOo.OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile boolean f116448OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ScheduledExecutorService f116449OooOo0o;

    public C32381OooO0o0(ThreadFactoryC32380OooO0o threadFactoryC32380OooO0o) {
        boolean z = C32375OooO.f116405OooO00o;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactoryC32380OooO0o);
        if (C32375OooO.f116405OooO00o && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            C32375OooO.f116408OooO0Oo.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f116449OooOo0o = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // oO0OooOO.AbstractC33500OooOOOo.OooO0O0
    public final oO0OOO00.OooO0O0 OooO00o(Runnable runnable, TimeUnit timeUnit) {
        return this.f116448OooOo ? EnumC35110OooO0OO.f126094OooOo0o : OooO0OO(runnable, timeUnit, null);
    }

    @Override // oO0OooOO.AbstractC33500OooOOOo.OooO0O0
    public final void OooO0O0(C32978OooOOo0.OooO00o oooO00o) {
        OooO00o(oooO00o, null);
    }

    public final RunnableC32383OooO0oo OooO0OO(Runnable runnable, TimeUnit timeUnit, InterfaceC35108OooO00o interfaceC35108OooO00o) {
        RunnableC32383OooO0oo runnableC32383OooO0oo = new RunnableC32383OooO0oo(runnable, interfaceC35108OooO00o);
        if (interfaceC35108OooO00o == null || interfaceC35108OooO00o.OooO00o(runnableC32383OooO0oo)) {
            try {
                runnableC32383OooO0oo.OooO00o(this.f116449OooOo0o.submit((Callable) runnableC32383OooO0oo));
                return runnableC32383OooO0oo;
            } catch (RejectedExecutionException e) {
                if (interfaceC35108OooO00o != null) {
                    interfaceC35108OooO00o.OooO0O0(runnableC32383OooO0oo);
                }
                oO0OOO0O.OooO00o.OooO0O0(e);
            }
        }
        return runnableC32383OooO0oo;
    }

    @Override // oO0OOO00.OooO0O0
    public final void dispose() {
        if (this.f116448OooOo) {
            return;
        }
        this.f116448OooOo = true;
        this.f116449OooOo0o.shutdownNow();
    }
}
