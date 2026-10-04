package com.aspose.slides.internal.p147ga;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p260ly.AbstractC6280ne;
import com.aspose.slides.internal.p260ly.C6291yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ga.dy */
/* JADX INFO: loaded from: classes.dex */
public class C4235dy extends AbstractC4233ck {
    /* JADX INFO: renamed from: k4 */
    public void m17064k4(C3149x1 c3149x1, AbstractC6280ne abstractC6280ne) {
        C6291yj c6291yj = (C6291yj) abstractC6280ne;
        c3149x1.m13446k4(c6291yj.m25730k4() & 65535);
        c3149x1.m13446k4(c6291yj.m25736x1() & 65535);
        m17063k4(c3149x1, c6291yj.m25734kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m17063k4(C3149x1 c3149x1, int[] iArr) {
        for (int i : iArr) {
            c3149x1.m13455x1(((i >> 16) & 255) | ((i & 255) << 16) | (65280 & i));
        }
    }
}
