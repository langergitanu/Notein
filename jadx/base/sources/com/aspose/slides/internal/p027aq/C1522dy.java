package com.aspose.slides.internal.p027aq;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4652rv;
import com.aspose.slides.internal.p292n5.C6743to;

/* JADX INFO: renamed from: com.aspose.slides.internal.aq.dy */
/* JADX INFO: loaded from: classes3.dex */
public class C1522dy extends AbstractC1559yd {

    /* JADX INFO: renamed from: k4 */
    private final int f6050k4;

    public C1522dy(int i) {
        this.f6050k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m8310k4(AbstractC4623f9 abstractC4623f9, C3149x1 c3149x1) {
        C4652rv c4652rv = (C4652rv) abstractC4623f9;
        C6743to.m26602k4(c4652rv.m19053c5(), c3149x1);
        c3149x1.m13447k4(c4652rv.m19334x1() & 4294967295L);
        int i = this.f6050k4 - 8;
        int iM19334x1 = (int) c4652rv.m19334x1();
        if (iM19334x1 == 0) {
            new C1533kp().m8321k4(c4652rv.m19330k4(), c3149x1);
            return;
        }
        if (iM19334x1 == 1) {
            new C1552wl().m8340k4(c4652rv.m19330k4(), c3149x1);
            return;
        }
        if (iM19334x1 == 2) {
            new C1524f9(i).m8312k4(c4652rv.m19330k4(), c3149x1);
        } else if (iM19334x1 == 3) {
            new C1554wy().m8342k4(c4652rv.m19330k4(), c3149x1);
        } else {
            if (iM19334x1 != 4) {
                return;
            }
            new C1515bv().m8303k4(c4652rv.m19330k4(), c3149x1);
        }
    }
}
