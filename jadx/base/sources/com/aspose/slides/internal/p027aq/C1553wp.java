package com.aspose.slides.internal.p027aq;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4636jw;

/* JADX INFO: renamed from: com.aspose.slides.internal.aq.wp */
/* JADX INFO: loaded from: classes3.dex */
public class C1553wp extends AbstractC1559yd {
    /* JADX INFO: renamed from: k4 */
    public void m8341k4(AbstractC4623f9 abstractC4623f9, C3149x1 c3149x1) {
        C4636jw c4636jw = (C4636jw) abstractC4623f9;
        c3149x1.m13447k4(c4636jw.m19172x1() & 4294967295L);
        int iM19172x1 = (int) c4636jw.m19172x1();
        if (iM19172x1 == 1) {
            new C1526g8(0).m8314k4(c4636jw.m19168k4(), c3149x1);
            return;
        }
        if (iM19172x1 == 2) {
            new C1526g8(1).m8314k4(c4636jw.m19168k4(), c3149x1);
            return;
        }
        if (iM19172x1 == 3) {
            new C1526g8(2).m8314k4(c4636jw.m19168k4(), c3149x1);
            return;
        }
        if (iM19172x1 == 4) {
            new C1526g8(3).m8314k4(c4636jw.m19168k4(), c3149x1);
            return;
        }
        if (iM19172x1 == 5) {
            new C1526g8(4).m8314k4(c4636jw.m19168k4(), c3149x1);
        } else if (iM19172x1 == 268435456) {
            new C1516bz().m8304k4(c4636jw.m19168k4(), c3149x1);
        } else {
            if (iM19172x1 != 268435457) {
                return;
            }
            new C1543sv().m8331k4(c4636jw.m19168k4(), c3149x1);
        }
    }
}
