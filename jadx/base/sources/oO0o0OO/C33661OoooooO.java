package oO0o0OO;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o0Oo00oO.C28035OooO00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OO.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33661OoooooO extends AbstractC33659Oooooo implements InterfaceC33645OoooO00 {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Executor f121349OooOoO0;

    public C33661OoooooO(Executor executor) {
        this.f121349OooOoO0 = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    public static void o000Oo00(InterfaceC34415OooO0oo interfaceC34415OooO0oo, RejectedExecutionException rejectedExecutionException) {
        oO00o00.OooO0OO.OooO0O0(interfaceC34415OooO0oo, C28035OooO00o.OooO00o("The task was rejected", rejectedExecutionException));
    }

    @Override // oO0o0OO.InterfaceC33645OoooO00
    public final InterfaceC33651OoooOoO OooOooo(long j, Runnable runnable, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        Executor executor = this.f121349OooOoO0;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                o000Oo00(interfaceC34415OooO0oo, e);
            }
        }
        return scheduledFutureSchedule != null ? new C33650OoooOo0(scheduledFutureSchedule) : RunnableC33639Oooo0o.f121321Oooo000.OooOooo(j, runnable, interfaceC34415OooO0oo);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f121349OooOoO0;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C33661OoooooO) && ((C33661OoooooO) obj).f121349OooOoO0 == this.f121349OooOoO0;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f121349OooOoO0);
    }

    @Override // oO0o0OO.InterfaceC33645OoooO00
    public final void o0000o0(long j, C33614OooOOO0 c33614OooOOO0) {
        Executor executor = this.f121349OooOoO0;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new o00000O(this, c33614OooOOO0), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                o000Oo00(c33614OooOOO0.f121299OooOoOO, e);
            }
        }
        if (scheduledFutureSchedule != null) {
            c33614OooOOO0.OooOo0O(new C33601OooO(scheduledFutureSchedule));
        } else {
            RunnableC33639Oooo0o.f121321Oooo000.o0000o0(j, c33614OooOOO0);
        }
    }

    @Override // oO0o0OO.AbstractC33659Oooooo
    public final Executor o000OOoO() {
        return this.f121349OooOoO0;
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final void o0OoO0o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, Runnable runnable) {
        try {
            this.f121349OooOoO0.execute(runnable);
        } catch (RejectedExecutionException e) {
            o000Oo00(interfaceC34415OooO0oo, e);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0.f122045OooOoO0.o0OoO0o(interfaceC34415OooO0oo, runnable);
        }
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final String toString() {
        return this.f121349OooOoO0.toString();
    }
}
