package com.aspose.words;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZ6 implements zzZA8 {
    private static zzZA8 zzXZk = new zzYZ6();
    private static final BigDecimal zzXZd = new BigDecimal(100);
    private BigDecimal zzXZj = BigDecimal.ZERO;
    private long zzXZi = 0;
    private Object zzXZh = new Object();
    private Object zzXZg = new Object();
    private long zzXZf = 0;
    private Object zzXZe = new Object();
    private Object zzXZ9 = new Object();
    private Object zzXZ8 = new Object();
    private long[] zzXZc = {-1};
    private long[] zzXZb = {-1};
    private int[] zzXZa = {0};

    public class zzZ extends Thread {
        private zzZ() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            zzYZ8 zzyz8ZzYDK = zzYZ8.zzYDK();
            if (zzyz8ZzYDK != null) {
                zzyz8ZzYDK.zzYDE();
            }
        }

        public /* synthetic */ zzZ(zzYZ6 zzyz6, byte b) {
            this();
        }
    }

    private zzYZ6() {
    }

    private void zzXz(long j) {
        synchronized (this.zzXZe) {
            this.zzXZf = j;
        }
    }

    private long zzYDw() {
        long j;
        synchronized (this.zzXZe) {
            j = this.zzXZf;
        }
        return j;
    }

    public static zzZA8 zzYDx() {
        return zzXZk;
    }

    @Override // com.aspose.words.zzZA8
    public final void zzQ(long j, boolean z) {
        long j2;
        if (zzYZ8.zzYDJ() == zzYZ0.zzYeD) {
            return;
        }
        synchronized (this.zzXZh) {
            j2 = this.zzXZi + j;
            this.zzXZi = j2;
        }
        if (z) {
            long jCurrentTimeMillis = System.currentTimeMillis() - zzYDw();
            if (jCurrentTimeMillis > 432000000000L || (jCurrentTimeMillis > 50000000 && j2 > 30)) {
                new zzZ(this, (byte) 0).start();
                zzXz(System.currentTimeMillis());
            }
        }
    }

    @Override // com.aspose.words.zzZA8
    public final void zzXH(long j) {
        zzQ(j, true);
    }

    @Override // com.aspose.words.zzZA8
    public final long zzYWb() {
        long j;
        synchronized (this.zzXZh) {
            j = this.zzXZi;
            this.zzXZi = 0L;
        }
        return j;
    }

    @Override // com.aspose.words.zzZA8
    public final BigDecimal zzYWc() {
        BigDecimal bigDecimal;
        synchronized (this.zzXZg) {
            bigDecimal = this.zzXZj;
            this.zzXZj = BigDecimal.ZERO;
        }
        return bigDecimal;
    }

    @Override // com.aspose.words.zzZA8
    public final Object zzYWd() {
        return this.zzXZ8;
    }

    @Override // com.aspose.words.zzZA8
    public final Object zzYWe() {
        return this.zzXZ9;
    }

    @Override // com.aspose.words.zzZA8
    public final int[] zzYWf() {
        return this.zzXZa;
    }

    @Override // com.aspose.words.zzZA8
    public final long[] zzYWg() {
        return this.zzXZb;
    }

    @Override // com.aspose.words.zzZA8
    public final long[] zzYWh() {
        return this.zzXZc;
    }

    @Override // com.aspose.words.zzZA8
    public final void zzZ(BigDecimal bigDecimal) {
        zzZ(bigDecimal, true);
    }

    @Override // com.aspose.words.zzZA8
    public final void zzZ(BigDecimal bigDecimal, boolean z) {
        BigDecimal bigDecimalAdd;
        if (zzYZ8.zzYDJ() == zzYZ0.zzYeD) {
            return;
        }
        synchronized (this.zzXZg) {
            bigDecimalAdd = this.zzXZj.add(bigDecimal);
            this.zzXZj = bigDecimalAdd;
        }
        if (z) {
            long jCurrentTimeMillis = System.currentTimeMillis() - zzYDw();
            if (jCurrentTimeMillis > 432000000000L || (jCurrentTimeMillis > 50000000 && bigDecimalAdd.compareTo(zzXZd) > 0)) {
                new zzZ(this, (byte) 0).start();
                zzXz(System.currentTimeMillis());
            }
        }
    }
}
