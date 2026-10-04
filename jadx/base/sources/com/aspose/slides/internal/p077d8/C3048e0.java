package com.aspose.slides.internal.p077d8;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.e0 */
/* JADX INFO: loaded from: classes3.dex */
public class C3048e0 {

    /* JADX INFO: renamed from: h4 */
    private static C3048e0 f8986h4 = new C3048e0();

    /* JADX INFO: renamed from: m9 */
    private double f8996m9 = 0.0d;

    /* JADX INFO: renamed from: dy */
    private long f8990dy = 0;

    /* JADX INFO: renamed from: c5 */
    private Lock f8987c5 = new ReentrantLock();

    /* JADX INFO: renamed from: jd */
    private Lock f8992jd = new ReentrantLock();

    /* JADX INFO: renamed from: ck */
    private long f8988ck = 0;

    /* JADX INFO: renamed from: fa */
    private Lock f8991fa = new ReentrantLock();

    /* JADX INFO: renamed from: up */
    private final double f8999up = 100.0d;

    /* JADX INFO: renamed from: yj */
    private final long f9001yj = 30;

    /* JADX INFO: renamed from: ks */
    private final long f8995ks = 5000;

    /* JADX INFO: renamed from: rv */
    private final long f8997rv = 43200000;

    /* JADX INFO: renamed from: k4 */
    long f8993k4 = -1;

    /* JADX INFO: renamed from: x1 */
    int f9000x1 = 0;

    /* JADX INFO: renamed from: kk */
    Lock f8994kk = new ReentrantLock();

    /* JADX INFO: renamed from: to */
    long f8998to = -1;

    /* JADX INFO: renamed from: du */
    Lock f8989du = new ReentrantLock();

    /* JADX INFO: renamed from: com.aspose.slides.internal.d8.e0$k4 */
    public class k4 extends Thread {
        private k4() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C3041c6 c3041c6M12809k4 = C3041c6.m12809k4();
            if (c3041c6M12809k4 != null) {
                c3041c6M12809k4.m12823h4();
            }
        }
    }

    private C3048e0() {
    }

    /* JADX INFO: renamed from: k4 */
    public static C3048e0 m12897k4() {
        return f8986h4;
    }

    /* JADX INFO: renamed from: to */
    private long m12898to() {
        this.f8991fa.lock();
        try {
            return this.f8988ck;
        } finally {
            this.f8991fa.unlock();
        }
    }

    /* JADX INFO: renamed from: kk */
    public long m12904kk() {
        this.f8987c5.lock();
        try {
            long j = this.f8990dy;
            this.f8990dy = 0L;
            return j;
        } finally {
            this.f8987c5.unlock();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public double m12905x1() {
        this.f8992jd.lock();
        try {
            double d = this.f8996m9;
            this.f8996m9 = 0.0d;
            return d;
        } finally {
            this.f8992jd.unlock();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m12899x1(long j) {
        this.f8991fa.lock();
        try {
            this.f8988ck = j;
        } finally {
            this.f8991fa.unlock();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m12900k4(double d) {
        m12901k4(d, true);
    }

    /* JADX INFO: renamed from: k4 */
    public void m12901k4(double d, boolean z) {
        if (Arrays.equals(C3041c6.m12821x1(), C3052g8.f9069k4)) {
            return;
        }
        this.f8992jd.lock();
        try {
            double d2 = this.f8996m9 + d;
            this.f8996m9 = d2;
            if (z) {
                long jCurrentTimeMillis = System.currentTimeMillis() - m12898to();
                if (jCurrentTimeMillis > 43200000 || (jCurrentTimeMillis > 5000 && d2 > 100.0d)) {
                    new k4().start();
                    m12899x1(System.currentTimeMillis());
                }
            }
        } finally {
            this.f8992jd.unlock();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m12902k4(long j) {
        m12903k4(j, true);
    }

    /* JADX INFO: renamed from: k4 */
    public void m12903k4(long j, boolean z) {
        if (C3041c6.m12821x1() == C3052g8.f9069k4) {
            return;
        }
        this.f8987c5.lock();
        try {
            long j2 = this.f8990dy + j;
            this.f8990dy = j2;
            if (z) {
                long jCurrentTimeMillis = System.currentTimeMillis() - m12898to();
                if (jCurrentTimeMillis > 43200000 || (jCurrentTimeMillis > 5000 && j2 > 30)) {
                    new k4().start();
                    m12899x1(System.currentTimeMillis());
                }
            }
        } finally {
            this.f8987c5.unlock();
        }
    }
}
