package oO000Oo;

import com.google.common.base.Stopwatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import oO000Oo.o00Ooo;
import oO0OOo0o.ExecutorC33121o00ooo;

/* JADX INFO: loaded from: classes10.dex */
public final class o000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ScheduledExecutorService f114576OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ExecutorC33121o00ooo f114577OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Ooo.OooOO0 f114578OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Stopwatch f114579OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f114580OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f114581OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ScheduledFuture<?> f114582OooO0oO;

    public final class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o000OO o000oo2 = o000OO.this;
            if (!o000oo2.f114580OooO0o) {
                o000oo2.f114582OooO0oO = null;
                return;
            }
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jElapsed = o000oo2.f114581OooO0o0 - o000oo2.f114579OooO0Oo.elapsed(timeUnit);
            if (jElapsed > 0) {
                o000oo2.f114582OooO0oO = o000oo2.f114576OooO00o.schedule(o000oo2.new OooO0O0(), jElapsed, timeUnit);
            } else {
                o000oo2.f114580OooO0o = false;
                o000oo2.f114582OooO0oO = null;
                o000oo2.f114578OooO0OO.run();
            }
        }
    }

    public final class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o000OO o000oo2 = o000OO.this;
            o000oo2.f114577OooO0O0.execute(o000oo2.new OooO00o());
        }
    }

    public o000OO(o00Ooo.OooOO0 oooOO02, ExecutorC33121o00ooo executorC33121o00ooo, ScheduledExecutorService scheduledExecutorService, Stopwatch stopwatch) {
        this.f114578OooO0OO = oooOO02;
        this.f114577OooO0O0 = executorC33121o00ooo;
        this.f114576OooO00o = scheduledExecutorService;
        this.f114579OooO0Oo = stopwatch;
        stopwatch.start();
    }
}
