package com.aspose.slides.internal.p505xn;

/* JADX INFO: renamed from: com.aspose.slides.internal.xn.du */
/* JADX INFO: loaded from: classes5.dex */
public class C12557du {
    /* JADX INFO: renamed from: k4 */
    public static int m58573k4(int i) {
        return (int) m58574k4(((long) i) & 4294967295L);
    }

    /* JADX INFO: renamed from: x1 */
    public static int m58576x1(int i) {
        return (((i & 65280) >> 8) | ((i & 255) << 8)) & 65535;
    }

    /* JADX INFO: renamed from: k4 */
    public static long m58574k4(long j) {
        return (((j & 4278190080L) >> 24) | ((255 & j) << 24) | ((65280 & j) << 8) | ((16711680 & j) >> 8)) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public static short m58575k4(short s) {
        return (short) m58576x1(s & 65535);
    }
}
