package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.x5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18414x5 extends C18427y5 {

    /* JADX INFO: renamed from: g */
    public static final long f56626g;

    /* JADX INFO: renamed from: h */
    public static final long f56627h;

    /* JADX INFO: renamed from: i */
    public static C18414x5 f56628i;

    /* JADX INFO: renamed from: d */
    public boolean f56629d;

    /* JADX INFO: renamed from: e */
    public C18414x5 f56630e;

    /* JADX INFO: renamed from: f */
    public long f56631f;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.x5$a */
    public static final class a extends Thread {

        /* JADX INFO: renamed from: a */
        public static final String f56632a = "Watchdog";

        public a() {
            super(f56632a);
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0017, code lost:
        
            r1.timedOut();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            while (true) {
                try {
                } catch (InterruptedException e) {
                    Logger.m76963i(f56632a, e.getMessage());
                }
                synchronized (C18414x5.class) {
                    try {
                        C18414x5 c18414x5M79896a = C18414x5.m79896a();
                        if (c18414x5M79896a != null) {
                            if (c18414x5M79896a == C18414x5.f56628i) {
                                C18414x5.f56628i = null;
                                return;
                            }
                            Logger.m76963i(f56632a, e.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f56626g = millis;
        f56627h = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: renamed from: a */
    private long m79895a(long j) {
        return this.f56631f - j;
    }

    public final void enter() {
        if (this.f56629d) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            this.f56629d = true;
            m79897a(this, jTimeoutNanos, zHasDeadline);
        }
    }

    public final boolean exit() {
        if (!this.f56629d) {
            return false;
        }
        this.f56629d = false;
        return m79898a(this);
    }

    public void timedOut() {
    }

    /* JADX INFO: renamed from: a */
    public static C18414x5 m79896a() throws InterruptedException {
        C18414x5 c18414x5 = f56628i.f56630e;
        long jNanoTime = System.nanoTime();
        if (c18414x5 == null) {
            C18414x5.class.wait(f56626g);
            if (f56628i.f56630e != null || System.nanoTime() - jNanoTime < f56627h) {
                return null;
            }
            return f56628i;
        }
        long jM79895a = c18414x5.m79895a(jNanoTime);
        if (jM79895a > 0) {
            long j = jM79895a / 1000000;
            C18414x5.class.wait(j, (int) (jM79895a - (1000000 * j)));
            return null;
        }
        f56628i.f56630e = c18414x5.f56630e;
        c18414x5.f56630e = null;
        return c18414x5;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x0019, B:12:0x0025, B:13:0x002e, B:18:0x003d, B:19:0x0043, B:21:0x0047, B:24:0x0050, B:25:0x0053, B:27:0x005d, B:17:0x0037, B:30:0x0064, B:31:0x0069), top: B:34:0x0003 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void m79897a(C18414x5 c18414x5, long j, boolean z) {
        C18414x5 c18414x52;
        C18414x5 c18414x53;
        try {
            if (f56628i == null) {
                f56628i = new C18414x5();
                new a().start();
            }
            long jNanoTime = System.nanoTime();
            if (j != 0 && z) {
                j = Math.min(j, c18414x5.deadlineNanoTime() - jNanoTime);
            } else if (j == 0) {
                if (!z) {
                    throw new AssertionError();
                }
                c18414x5.f56631f = c18414x5.deadlineNanoTime();
                long jM79895a = c18414x5.m79895a(jNanoTime);
                c18414x52 = f56628i;
                while (true) {
                    c18414x53 = c18414x52.f56630e;
                    if (c18414x53 != null || jM79895a < c18414x53.m79895a(jNanoTime)) {
                        break;
                    } else {
                        c18414x52 = c18414x52.f56630e;
                    }
                }
                c18414x5.f56630e = c18414x52.f56630e;
                c18414x52.f56630e = c18414x5;
                if (c18414x52 == f56628i) {
                    C18414x5.class.notifyAll();
                }
            }
            c18414x5.f56631f = j + jNanoTime;
            long jM79895a2 = c18414x5.m79895a(jNanoTime);
            c18414x52 = f56628i;
            while (true) {
                c18414x53 = c18414x52.f56630e;
                if (c18414x53 != null) {
                    break;
                    break;
                }
                c18414x52 = c18414x52.f56630e;
            }
            c18414x5.f56630e = c18414x52.f56630e;
            c18414x52.f56630e = c18414x5;
            if (c18414x52 == f56628i) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m79898a(C18414x5 c18414x5) {
        C18414x5 c18414x52 = f56628i;
        while (c18414x52 != null) {
            C18414x5 c18414x53 = c18414x52.f56630e;
            if (c18414x53 == c18414x5) {
                c18414x52.f56630e = c18414x5.f56630e;
                c18414x5.f56630e = null;
                return false;
            }
            c18414x52 = c18414x53;
        }
        return true;
    }
}
