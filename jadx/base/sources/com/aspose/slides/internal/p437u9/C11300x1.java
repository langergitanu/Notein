package com.aspose.slides.internal.p437u9;

/* JADX INFO: renamed from: com.aspose.slides.internal.u9.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C11300x1 {
    /* JADX INFO: renamed from: k4 */
    public static int m54284k4(int i) {
        return (int) m54285k4(((long) i) & 4294967295L);
    }

    /* JADX INFO: renamed from: x1 */
    public static int m54287x1(int i) {
        return (((i & 65280) >> 8) | ((i & 255) << 8)) & 65535;
    }

    /* JADX INFO: renamed from: k4 */
    public static long m54285k4(long j) {
        return (((j & 4278190080L) >> 24) | ((255 & j) << 24) | ((65280 & j) << 8) | ((16711680 & j) >> 8)) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public static short m54286k4(short s) {
        return (short) m54287x1(s & 65535);
    }
}
