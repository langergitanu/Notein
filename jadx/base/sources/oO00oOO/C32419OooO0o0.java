package oO00oOO;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import oO00o.AbstractC32318OooO0o;
import oO00oO0.EnumC32398OooO0OO;
import oO00oOo0.C32430OooO00o;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oO0OO0oO.InterfaceC32926OooO0OO;

/* JADX INFO: renamed from: oO00oOO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C32419OooO0o0 extends AbstractC32318OooO0o.OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile boolean f116572OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ScheduledExecutorService f116573OooOo0o;

    public C32419OooO0o0(ThreadFactoryC32418OooO0o threadFactoryC32418OooO0o) {
        boolean z = C32413OooO.f116528OooO00o;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactoryC32418OooO0o);
        if (C32413OooO.f116528OooO00o && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            C32413OooO.f116531OooO0Oo.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f116573OooOo0o = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // oO00o.AbstractC32318OooO0o.OooO0O0
    public final InterfaceC32925OooO0O0 OooO00o(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f116572OooOo ? EnumC32398OooO0OO.f116503OooOo0o : OooO0OO(runnable, j, timeUnit, null);
    }

    @Override // oO00o.AbstractC32318OooO0o.OooO0O0
    public final void OooO0O0(Runnable runnable) {
        OooO00o(runnable, 0L, null);
    }

    public final RunnableC32421OooO0oo OooO0OO(Runnable runnable, long j, TimeUnit timeUnit, InterfaceC32926OooO0OO interfaceC32926OooO0OO) {
        RunnableC32421OooO0oo runnableC32421OooO0oo = new RunnableC32421OooO0oo(runnable, interfaceC32926OooO0OO);
        if (interfaceC32926OooO0OO == null || interfaceC32926OooO0OO.OooO0OO(runnableC32421OooO0oo)) {
            ScheduledExecutorService scheduledExecutorService = this.f116573OooOo0o;
            try {
                runnableC32421OooO0oo.OooO00o(j <= 0 ? scheduledExecutorService.submit((Callable) runnableC32421OooO0oo) : scheduledExecutorService.schedule((Callable) runnableC32421OooO0oo, j, timeUnit));
                return runnableC32421OooO0oo;
            } catch (RejectedExecutionException e) {
                if (interfaceC32926OooO0OO != null) {
                    interfaceC32926OooO0OO.OooO0O0(runnableC32421OooO0oo);
                }
                C32430OooO00o.OooO00o(e);
            }
        }
        return runnableC32421OooO0oo;
    }

    @Override // oO0OO0oO.InterfaceC32925OooO0O0
    public final void dispose() {
        if (this.f116572OooOo) {
            return;
        }
        this.f116572OooOo = true;
        this.f116573OooOo0o.shutdownNow();
    }
}
