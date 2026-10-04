package com.aspose.slides.internal.p060ca;

import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.kn */
/* JADX INFO: loaded from: classes3.dex */
public class C2163kn {

    /* JADX INFO: renamed from: du */
    public long[] f7491du;

    /* JADX INFO: renamed from: h4 */
    public long[][] f7492h4;

    /* JADX INFO: renamed from: k4 */
    public long f7493k4;

    /* JADX INFO: renamed from: kk */
    public int f7494kk;

    /* JADX INFO: renamed from: to */
    public long f7495to;

    /* JADX INFO: renamed from: x1 */
    public long f7496x1;

    public C2163kn(long j, int i, long j2, long[] jArr, long[][] jArr2) {
        this.f7493k4 = j;
        this.f7496x1 = ((((j & 4294967295L) + (((long) jArr.length) & 4294967295L)) & 4294967295L) - 1) & 4294967295L;
        this.f7494kk = i;
        this.f7495to = j2;
        this.f7491du = jArr;
        this.f7492h4 = jArr2;
    }

    /* JADX INFO: renamed from: c5 */
    public static boolean m10934c5(long j) {
        long j2 = j & C18177fb.f54859s;
        return j2 >= 8 && j2 <= 11;
    }

    /* JADX INFO: renamed from: ck */
    public static boolean m10935ck(long j) {
        return (j & 67108864) != 0;
    }

    /* JADX INFO: renamed from: dy */
    public static boolean m10937dy(long j) {
        return (j & 536870912) != 0;
    }

    /* JADX INFO: renamed from: fa */
    public static boolean m10938fa(long j) {
        return (j & 402653184) != 0;
    }

    /* JADX INFO: renamed from: jd */
    public static boolean m10940jd(long j) {
        return (j & 983040) != 0;
    }

    /* JADX INFO: renamed from: up */
    public static boolean m10944up(long j) {
        return (j & 134217728) != 0;
    }

    /* JADX INFO: renamed from: yj */
    public static boolean m10946yj(long j) {
        return (j & 268435456) != 0;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m10947du(char c) {
        return m10936du(m10949k4(c));
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m10948h4(char c) {
        return m10942m9(m10949k4(c));
    }

    /* JADX INFO: renamed from: k4 */
    public final long m10949k4(char c) {
        long j = c;
        if (j == 8205) {
            return 2147483661L;
        }
        if (j == 8204) {
            return 13L;
        }
        long j2 = this.f7493k4;
        if (j < (j2 & 4294967295L) || j > (this.f7496x1 & 4294967295L)) {
            return 0L;
        }
        return this.f7491du[(int) (j - (j2 & 4294967295L))] & 4294967295L;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m10951kk(char c) {
        return m10941kk(m10949k4(c));
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m10952m9(char c) {
        return m10939h4(m10949k4(c));
    }

    /* JADX INFO: renamed from: to */
    public final boolean m10953to(char c) {
        return m10943to(m10949k4(c));
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m10954x1(char c) {
        return m10945x1(m10949k4(c));
    }

    /* JADX INFO: renamed from: du */
    public static boolean m10936du(long j) {
        return (j & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m10939h4(long j) {
        return (j & C18177fb.f54859s) == 7;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m10941kk(long j) {
        return (j & C18177fb.f54859s) == 2;
    }

    /* JADX INFO: renamed from: m9 */
    public static boolean m10942m9(long j) {
        return (j & C18177fb.f54859s) == 12;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m10943to(long j) {
        return (j & 2147483648L) != 0;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m10945x1(long j) {
        return (j & C18177fb.f54859s) == 1;
    }

    /* JADX INFO: renamed from: k4 */
    public final long[] m10950k4(long j) {
        return this.f7492h4[((((int) j) & 983040) >> 16) - 1];
    }
}
