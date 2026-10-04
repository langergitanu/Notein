package com.aspose.slides.internal.p064cj;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p349q3.C9658ix;
import com.aspose.slides.internal.p349q3.C9681ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.cj.yj */
/* JADX INFO: loaded from: classes3.dex */
public class C2550yj {
    /* JADX INFO: renamed from: k4 */
    public final boolean m11870k4(C9658ix c9658ix, C3149x1 c3149x1) {
        C9681ne c9681ne = (C9681ne) c9658ix;
        c3149x1.m13447k4(c9681ne.m47495h4() & 4294967295L);
        c3149x1.m13447k4(c9681ne.m47498m9() & 4294967295L);
        int iM47498m9 = (int) c9681ne.m47498m9();
        if (iM47498m9 == -2147483647) {
            return new C2512rv().m11867k4(c9681ne, c3149x1);
        }
        if (iM47498m9 == 64 || iM47498m9 == 128) {
            throw new ArgumentOutOfRangeException("This comment record is reserved and MUST NOT be used in an EMF metafile.");
        }
        if (iM47498m9 == 1073741828) {
            return new C2526up().m11868k4(c9681ne, c3149x1);
        }
        if (iM47498m9 == 2) {
            return new C2448c5().m11862k4(c9681ne, c3149x1);
        }
        if (iM47498m9 == 3) {
            return new C2466fa().m11864k4(c9681ne, c3149x1);
        }
        throw new ArgumentOutOfRangeException("identefier");
    }
}
