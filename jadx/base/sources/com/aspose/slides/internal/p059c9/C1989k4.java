package com.aspose.slides.internal.p059c9;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;

/* JADX INFO: renamed from: com.aspose.slides.internal.c9.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1989k4 {
    /* JADX INFO: renamed from: k4 */
    public static void m10118k4(C3149x1 c3149x1, long[] jArr) {
        if (jArr != null) {
            for (long j : jArr) {
                c3149x1.m13447k4(j);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m10119k4(String str, C3149x1 c3149x1) {
        c3149x1.m13450k4(AbstractC6747ar.m26643rv().mo26677to(str));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m10120k4(float[] fArr, C3149x1 c3149x1) {
        for (float f : fArr) {
            c3149x1.m13445k4(f);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m10121k4(int[] iArr, C3149x1 c3149x1) {
        if (iArr == null) {
            return;
        }
        for (int i : iArr) {
            c3149x1.m13446k4(i & 65535);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m10122k4(short[] sArr, C3149x1 c3149x1) {
        if (sArr == null) {
            return;
        }
        for (short s : sArr) {
            c3149x1.m13448k4(s);
        }
    }
}
