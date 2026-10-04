package oO000Oo;

import androidx.core.app.NotificationCompat;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO000Oo.OooOo00;

/* JADX INFO: renamed from: oO000Oo.ooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32069ooOO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final long f114798OooOO0O = TimeUnit.SECONDS.toNanos(10);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f114799OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ScheduledExecutorService f114800OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Stopwatch f114801OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC32070OooO0Oo f114802OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public EnumC32071OooO0o0 f114803OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ScheduledFuture<?> f114804OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ScheduledFuture<?> f114805OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00O0O f114806OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00O0O f114807OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f114808OooOO0;

    /* JADX INFO: renamed from: oO000Oo.ooOO$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C32069ooOO c32069ooOO;
            boolean z;
            synchronized (C32069ooOO.this) {
                c32069ooOO = C32069ooOO.this;
                EnumC32071OooO0o0 enumC32071OooO0o0 = c32069ooOO.f114803OooO0Oo;
                EnumC32071OooO0o0 enumC32071OooO0o02 = EnumC32071OooO0o0.f114819OooOoo0;
                if (enumC32071OooO0o0 != enumC32071OooO0o02) {
                    c32069ooOO.f114803OooO0Oo = enumC32071OooO0o02;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                c32069ooOO.f114802OooO0OO.OooO00o();
            }
        }
    }

    /* JADX INFO: renamed from: oO000Oo.ooOO$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            synchronized (C32069ooOO.this) {
                try {
                    C32069ooOO c32069ooOO = C32069ooOO.this;
                    c32069ooOO.f114804OooO0o = null;
                    EnumC32071OooO0o0 enumC32071OooO0o0 = c32069ooOO.f114803OooO0Oo;
                    EnumC32071OooO0o0 enumC32071OooO0o02 = EnumC32071OooO0o0.f114813OooOo;
                    if (enumC32071OooO0o0 == enumC32071OooO0o02) {
                        c32069ooOO.f114803OooO0Oo = EnumC32071OooO0o0.f114815OooOoO;
                        c32069ooOO.f114805OooO0o0 = c32069ooOO.f114800OooO00o.schedule(c32069ooOO.f114806OooO0oO, c32069ooOO.f114808OooOO0, TimeUnit.NANOSECONDS);
                        z = true;
                    } else {
                        if (enumC32071OooO0o0 == EnumC32071OooO0o0.f114816OooOoO0) {
                            ScheduledExecutorService scheduledExecutorService = c32069ooOO.f114800OooO00o;
                            o00O0O o00o0o2 = c32069ooOO.f114807OooO0oo;
                            long j = c32069ooOO.f114799OooO;
                            Stopwatch stopwatch = c32069ooOO.f114801OooO0O0;
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            c32069ooOO.f114804OooO0o = scheduledExecutorService.schedule(o00o0o2, j - stopwatch.elapsed(timeUnit), timeUnit);
                            C32069ooOO.this.f114803OooO0Oo = enumC32071OooO0o02;
                        }
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                C32069ooOO.this.f114802OooO0OO.OooO0O0();
            }
        }
    }

    /* JADX INFO: renamed from: oO000Oo.ooOO$OooO0OO */
    public static final class OooO0OO implements InterfaceC32070OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oO0OO0OO.OooO f114811OooO00o;

        /* JADX INFO: renamed from: oO000Oo.ooOO$OooO0OO$OooO00o */
        public class OooO00o implements OooOo00.OooO00o {
            public OooO00o() {
            }

            @Override // oO000Oo.OooOo00.OooO00o
            public final void OooO00o() {
                OooO0OO.this.f114811OooO00o.OooO0O0(oO0OOo0o.o00Oo0.f119725OooOOOO.OooO0oo("Keepalive failed. The connection is likely gone"));
            }
        }

        public OooO0OO(oO0OO0OO.OooO oooO) {
            this.f114811OooO00o = oooO;
        }

        @Override // oO000Oo.C32069ooOO.InterfaceC32070OooO0Oo
        public final void OooO00o() {
            this.f114811OooO00o.OooO0O0(oO0OOo0o.o00Oo0.f119725OooOOOO.OooO0oo("Keepalive failed. The connection is likely gone"));
        }

        @Override // oO000Oo.C32069ooOO.InterfaceC32070OooO0Oo
        public final void OooO0O0() {
            long jNextLong;
            OooO00o oooO00o = new OooO00o();
            Executor executorDirectExecutor = MoreExecutors.directExecutor();
            oO0OO0OO.OooO oooO = this.f114811OooO00o;
            synchronized (oooO.f118581OooOO0O) {
                try {
                    boolean z = true;
                    Preconditions.checkState(oooO.f118571OooO != null);
                    if (oooO.f118596OooOoO0) {
                        oO0OOo0o.o00Ooo o00oooOooOO0o = oooO.OooOO0o();
                        Logger logger = C31997OoooOo0.f114243OooO0oO;
                        try {
                            executorDirectExecutor.execute(new RunnableC31996OoooOOo(oooO00o, o00oooOooOO0o));
                        } catch (Throwable th) {
                            C31997OoooOo0.f114243OooO0oO.log(Level.SEVERE, "Failed to execute PingCallback", th);
                        }
                        return;
                    }
                    C31997OoooOo0 c31997OoooOo0 = oooO.f118590OooOo;
                    if (c31997OoooOo0 != null) {
                        jNextLong = 0;
                        z = false;
                    } else {
                        jNextLong = oooO.f118575OooO0Oo.nextLong();
                        Stopwatch stopwatch = oooO.f118577OooO0o0.get();
                        stopwatch.start();
                        C31997OoooOo0 c31997OoooOo02 = new C31997OoooOo0(jNextLong, stopwatch);
                        oooO.f118590OooOo = c31997OoooOo02;
                        oooO.f118609Oooo0o0.getClass();
                        c31997OoooOo0 = c31997OoooOo02;
                    }
                    if (z) {
                        oooO.f118571OooO.o0000oo0((int) (jNextLong >>> 32), (int) jNextLong, false);
                    }
                    synchronized (c31997OoooOo0) {
                        try {
                            if (!c31997OoooOo0.f114247OooO0Oo) {
                                c31997OoooOo0.f114246OooO0OO.put(oooO00o, executorDirectExecutor);
                                return;
                            }
                            oO0OOo0o.o00Ooo o00ooo2 = c31997OoooOo0.f114249OooO0o0;
                            Runnable runnableC31996OoooOOo = o00ooo2 != null ? new RunnableC31996OoooOOo(oooO00o, o00ooo2) : new RunnableC31995OoooOOO(oooO00o, c31997OoooOo0.f114248OooO0o);
                            try {
                                executorDirectExecutor.execute(runnableC31996OoooOOo);
                            } catch (Throwable th2) {
                                C31997OoooOo0.f114243OooO0oO.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                            }
                        } finally {
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: oO000Oo.ooOO$OooO0Oo, reason: case insensitive filesystem */
    public interface InterfaceC32070OooO0Oo {
        void OooO00o();

        void OooO0O0();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oO000Oo.ooOO$OooO0o0, reason: case insensitive filesystem */
    public static final class EnumC32071OooO0o0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final EnumC32071OooO0o0 f114813OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC32071OooO0o0 f114814OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final EnumC32071OooO0o0 f114815OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final EnumC32071OooO0o0 f114816OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final EnumC32071OooO0o0 f114817OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final /* synthetic */ EnumC32071OooO0o0[] f114818OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final EnumC32071OooO0o0 f114819OooOoo0;

        static {
            EnumC32071OooO0o0 enumC32071OooO0o0 = new EnumC32071OooO0o0("IDLE", 0);
            f114814OooOo0o = enumC32071OooO0o0;
            EnumC32071OooO0o0 enumC32071OooO0o02 = new EnumC32071OooO0o0("PING_SCHEDULED", 1);
            f114813OooOo = enumC32071OooO0o02;
            EnumC32071OooO0o0 enumC32071OooO0o03 = new EnumC32071OooO0o0("PING_DELAYED", 2);
            f114816OooOoO0 = enumC32071OooO0o03;
            EnumC32071OooO0o0 enumC32071OooO0o04 = new EnumC32071OooO0o0("PING_SENT", 3);
            f114815OooOoO = enumC32071OooO0o04;
            EnumC32071OooO0o0 enumC32071OooO0o05 = new EnumC32071OooO0o0("IDLE_AND_PING_SENT", 4);
            f114817OooOoOO = enumC32071OooO0o05;
            EnumC32071OooO0o0 enumC32071OooO0o06 = new EnumC32071OooO0o0("DISCONNECTED", 5);
            f114819OooOoo0 = enumC32071OooO0o06;
            f114818OooOoo = new EnumC32071OooO0o0[]{enumC32071OooO0o0, enumC32071OooO0o02, enumC32071OooO0o03, enumC32071OooO0o04, enumC32071OooO0o05, enumC32071OooO0o06};
        }

        public EnumC32071OooO0o0() {
            throw null;
        }

        public static EnumC32071OooO0o0 valueOf(String str) {
            return (EnumC32071OooO0o0) Enum.valueOf(EnumC32071OooO0o0.class, str);
        }

        public static EnumC32071OooO0o0[] values() {
            return (EnumC32071OooO0o0[]) f114818OooOoo.clone();
        }
    }

    static {
        TimeUnit.MILLISECONDS.toNanos(10L);
    }

    public C32069ooOO(OooO0OO oooO0OO, ScheduledExecutorService scheduledExecutorService, long j, long j2) {
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        this.f114803OooO0Oo = EnumC32071OooO0o0.f114814OooOo0o;
        this.f114806OooO0oO = new o00O0O(new OooO00o());
        this.f114807OooO0oo = new o00O0O(new OooO0O0());
        this.f114802OooO0OO = (InterfaceC32070OooO0Oo) Preconditions.checkNotNull(oooO0OO, "keepAlivePinger");
        this.f114800OooO00o = (ScheduledExecutorService) Preconditions.checkNotNull(scheduledExecutorService, "scheduler");
        this.f114801OooO0O0 = (Stopwatch) Preconditions.checkNotNull(stopwatchCreateUnstarted, NotificationCompat.CATEGORY_STOPWATCH);
        this.f114799OooO = j;
        this.f114808OooOO0 = j2;
        stopwatchCreateUnstarted.reset().start();
    }

    public final synchronized void OooO00o() {
        try {
            this.f114801OooO0O0.reset().start();
            EnumC32071OooO0o0 enumC32071OooO0o0 = this.f114803OooO0Oo;
            EnumC32071OooO0o0 enumC32071OooO0o02 = EnumC32071OooO0o0.f114813OooOo;
            if (enumC32071OooO0o0 == enumC32071OooO0o02) {
                this.f114803OooO0Oo = EnumC32071OooO0o0.f114816OooOoO0;
            } else if (enumC32071OooO0o0 == EnumC32071OooO0o0.f114815OooOoO || enumC32071OooO0o0 == EnumC32071OooO0o0.f114817OooOoOO) {
                ScheduledFuture<?> scheduledFuture = this.f114805OooO0o0;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f114803OooO0Oo == EnumC32071OooO0o0.f114817OooOoOO) {
                    this.f114803OooO0Oo = EnumC32071OooO0o0.f114814OooOo0o;
                } else {
                    this.f114803OooO0Oo = enumC32071OooO0o02;
                    Preconditions.checkState(this.f114804OooO0o == null, "There should be no outstanding pingFuture");
                    this.f114804OooO0o = this.f114800OooO00o.schedule(this.f114807OooO0oo, this.f114799OooO, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooO0O0() {
        try {
            EnumC32071OooO0o0 enumC32071OooO0o0 = this.f114803OooO0Oo;
            if (enumC32071OooO0o0 == EnumC32071OooO0o0.f114814OooOo0o) {
                this.f114803OooO0Oo = EnumC32071OooO0o0.f114813OooOo;
                if (this.f114804OooO0o == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f114800OooO00o;
                    o00O0O o00o0o2 = this.f114807OooO0oo;
                    long j = this.f114799OooO;
                    Stopwatch stopwatch = this.f114801OooO0O0;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    this.f114804OooO0o = scheduledExecutorService.schedule(o00o0o2, j - stopwatch.elapsed(timeUnit), timeUnit);
                }
            } else if (enumC32071OooO0o0 == EnumC32071OooO0o0.f114817OooOoOO) {
                this.f114803OooO0Oo = EnumC32071OooO0o0.f114815OooOoO;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
