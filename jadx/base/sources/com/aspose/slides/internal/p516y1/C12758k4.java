package com.aspose.slides.internal.p516y1;

import com.aspose.slides.internal.p294n9.C6765kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.y1.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12758k4 {
    /* JADX INFO: renamed from: k4 */
    public static int m59432k4(int i) {
        return (i >> 16) & 65535;
    }

    /* JADX INFO: renamed from: kk */
    public static String m59434kk(int i) {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26805kk(m59432k4(i));
        c6765kp.m26792k4(".");
        c6765kp.m26805kk(m59435x1(i));
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public static int m59435x1(int i) {
        return i & 65535;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m59433k4(int i, int i2) {
        return ((i & 65535) << 16) | (i2 & 65535);
    }
}
