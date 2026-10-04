package com.aspose.words.internal;

import androidx.core.location.LocationRequestCompat;
import com.huawei.hms.network.embedded.C18168f2;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZNF implements Comparable<Object> {
    long zzZVO;
    public static final zzZNF zzZVR = new zzZNF(0);
    public static final zzZNF zzZVQ = new zzZNF(LocationRequestCompat.PASSIVE_INTERVAL);
    public static final zzZNF zzZVP = new zzZNF(Long.MIN_VALUE);

    public zzZNF() {
        this.zzZVO = 0L;
    }

    public static long zzE(int i, int i2, int i3) {
        long j = (((long) i2) * 60) + (((long) i) * 3600) + ((long) i3);
        if (j > 922337203685L || j < -922337203685L) {
            throw new IndexOutOfBoundsException("Overflow_TimeSpanTooLong");
        }
        return j * 10000000;
    }

    private static zzZNF zzT(double d, int i) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Arg_CannotBeNaN");
        }
        double d2 = (((double) i) * d) + (d >= 0.0d ? 0.5d : -0.5d);
        if (d2 > 9.22337203685477E14d || d2 < -9.22337203685477E14d) {
            throw new IllegalStateException("Overflow_TimeSpanTooLong");
        }
        return new zzZNF(((long) d2) * 10000);
    }

    public static long zzV(zzZNF zzznf) {
        return zzznf.zzhC();
    }

    private zzZNF zzW(zzZNF zzznf) {
        long j = this.zzZVO;
        long j2 = zzznf.zzZVO;
        long j3 = j + j2;
        if ((j >> 63) != (j2 >> 63) || (j >> 63) == (j3 >> 63)) {
            return new zzZNF(j3);
        }
        throw new IllegalStateException("Overflow_TimeSpanTooLong");
    }

    private static boolean zzY(zzZNF zzznf, zzZNF zzznf2) {
        if (zzznf == zzznf2) {
            return true;
        }
        return (zzznf == null || zzznf2 == null || zzznf.zzZVO != zzznf2.zzZVO) ? false : true;
    }

    public static zzZNF zzYv(long j) {
        return new zzZNF(j * 10000);
    }

    public static zzZNF zzYw(long j) {
        return new zzZNF(j);
    }

    public static zzZNF zzZ(zzZNF zzznf, zzZNF zzznf2) {
        if (zzznf == null || zzznf2 == null) {
            return null;
        }
        return zzznf.zzW(zzznf2);
    }

    public static zzZNF zzZc(double d) {
        return zzT(d, 60000);
    }

    public static zzZNF zzZd(double d) {
        return zzT(d, 3600000);
    }

    public static zzZNF zzZe(double d) {
        return zzT(d, C18168f2.f54714c);
    }

    private long zzhC() {
        return this.zzZVO / 10000;
    }

    public static zzZNF zzhw() {
        return zzT(100.0d, 1000);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (obj == null) {
            return 1;
        }
        if (!(obj instanceof zzZNF)) {
            throw new IllegalArgumentException("Arg_MustBeTimeSpan");
        }
        long j = ((zzZNF) obj).zzZVO;
        long j2 = this.zzZVO;
        if (j2 > j) {
            return 1;
        }
        return j2 < j ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzZNF) && zzY(this, (zzZNF) obj);
    }

    public final int getDays() {
        return (int) (this.zzZVO / 864000000000L);
    }

    public final int getHours() {
        return (int) ((this.zzZVO / 36000000000L) % 24);
    }

    public final int getMinutes() {
        return (int) ((this.zzZVO / 600000000) % 60);
    }

    public final int hashCode() {
        long j = this.zzZVO;
        return ((int) (j >> 32)) ^ ((int) j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j = this.zzZVO;
        int i = (int) (j / 864000000000L);
        long j2 = j % 864000000000L;
        if (j < 0) {
            sb.append(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
            i = -i;
            j2 = -j2;
        }
        if (i != 0) {
            sb.append(i);
            sb.append(".");
        }
        sb.append(zzZHP.zzYH((int) ((j2 / 36000000000L) % 24), 2));
        sb.append(C18241k5.f55433h);
        sb.append(zzZHP.zzYH((int) ((j2 / 600000000) % 60), 2));
        sb.append(C18241k5.f55433h);
        sb.append(zzZHP.zzYH((int) ((j2 / 10000000) % 60), 2));
        int i2 = (int) (j2 % 10000000);
        if (i2 != 0) {
            sb.append(".");
            sb.append(zzZHP.zzYH(i2, 7));
        }
        return sb.toString();
    }

    public final double zzhA() {
        double d = this.zzZVO * 1.0E-4d;
        if (d > 9.22337203685477E14d) {
            return 9.22337203685477E14d;
        }
        if (d < -9.22337203685477E14d) {
            return -9.22337203685477E14d;
        }
        return d;
    }

    public final double zzhB() {
        return this.zzZVO * 1.1574074074074074E-12d;
    }

    public final zzZNF zzhx() {
        long j = this.zzZVO;
        if (j != zzZVP.zzZVO) {
            return new zzZNF(-j);
        }
        throw new IllegalStateException("Overflow_NegateTwosCompNum");
    }

    public final double zzhy() {
        return this.zzZVO * 1.0E-7d;
    }

    public final double zzhz() {
        return this.zzZVO * 1.6666666666666667E-9d;
    }

    public final long zzkP() {
        return this.zzZVO;
    }

    public zzZNF(long j) {
        this.zzZVO = j;
    }

    public zzZNF(int i, int i2) {
        this.zzZVO = zzE(i, i2, 0);
    }

    public zzZNF(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, (byte) 0);
    }

    private zzZNF(int i, int i2, int i3, int i4, byte b) {
        long j = (((long) i3) * 60) + (((long) i2) * 3600) + (((long) i) * 86400) + ((long) i4);
        long j2 = 1000 * j;
        if (j2 <= 922337203685477L && j2 >= -922337203685477L) {
            this.zzZVO = j * 10000000;
            return;
        }
        throw new IndexOutOfBoundsException("Overflow_TimeSpanTooLong");
    }
}
