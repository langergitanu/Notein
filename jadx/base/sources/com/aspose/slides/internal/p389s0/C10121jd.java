package com.aspose.slides.internal.p389s0;

import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.s0.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C10121jd {
    /* JADX INFO: renamed from: k4 */
    public static long m49714k4(long j, boolean z) {
        long j2;
        long j3 = j & 4294967295L;
        if (z) {
            j3 = (j3 + 1) & 4294967295L;
            j2 = 512;
        } else {
            j2 = 64;
        }
        return (j3 * j2) & 4294967295L;
    }

    /* JADX INFO: renamed from: x1 */
    public static long m49716x1(long j, boolean z) {
        return (z ? (j / 512) - 1 : j / 64) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m49715k4(C3149x1 c3149x1) {
        while (c3149x1.m13442k4().getPosition() % 512 != 0) {
            c3149x1.m13447k4(4294967295L);
        }
    }
}
