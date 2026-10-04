package com.aspose.slides.internal.p154gr;

import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: com.aspose.slides.internal.gr.jd */
/* JADX INFO: loaded from: classes.dex */
public class C4373jd {
    /* JADX INFO: renamed from: du */
    public static int m17608du(int i) {
        return ((i >> 3) & 31) | ((i >> 8) & 63488) | ((i >> 5) & 2016);
    }

    /* JADX INFO: renamed from: h4 */
    public static int m17609h4(int i) {
        int i2 = (i >> 11) & 31;
        int i3 = (i >> 5) & 63;
        int i4 = i & 31;
        return (i4 >> 2) | (i4 << 3) | (((i2 >> 2) | (i2 << 3)) << 16) | ViewCompat.MEASURED_STATE_MASK | (((i3 >> 4) | (i3 << 2)) << 8);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m17610k4(int i) {
        return ((i >> 3) & 31) | ((i >> 16) & 32768) | ((i >> 9) & 31744) | ((i >> 6) & 992);
    }

    /* JADX INFO: renamed from: kk */
    public static int m17611kk(int i) {
        return ((i >> 3) & 31) | ((i >> 9) & 31744) | ((i >> 6) & 992);
    }

    /* JADX INFO: renamed from: to */
    public static int m17612to(int i) {
        int i2 = (i >> 10) & 31;
        int i3 = (i >> 5) & 31;
        int i4 = i & 31;
        return (i4 >> 2) | (i4 << 3) | (((i2 >> 2) | (i2 << 3)) << 16) | ViewCompat.MEASURED_STATE_MASK | (((i3 >> 2) | (i3 << 3)) << 8);
    }

    /* JADX INFO: renamed from: x1 */
    public static int m17613x1(int i) {
        int i2 = (i >> 10) & 31;
        int i3 = (i >> 5) & 31;
        int i4 = i & 31;
        return ((((i >> 15) & 1) == 1 ? 255 : 0) << 24) | (((i2 >> 2) | (i2 << 3)) << 16) | (((i3 >> 2) | (i3 << 3)) << 8) | (i4 >> 2) | (i4 << 3);
    }
}
