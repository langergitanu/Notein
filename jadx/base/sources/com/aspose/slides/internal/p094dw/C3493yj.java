package com.aspose.slides.internal.p094dw;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p349q3.C9658ix;
import com.aspose.slides.internal.p349q3.C9681ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.dw.yj */
/* JADX INFO: loaded from: classes3.dex */
public class C3493yj {
    /* JADX INFO: renamed from: k4 */
    public final boolean m14051k4(C9658ix[] c9658ixArr, AbstractC3150x6 abstractC3150x6) {
        boolean zM14042k4;
        C9681ne c9681ne;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C9681ne c9681ne2 = new C9681ne(c9658ixArr[0]);
        c9681ne2.m47499x1(c3134k4.m13384uz() & 4294967295L);
        c9681ne2.m47497kk(c3134k4.m13384uz() & 4294967295L);
        int iM47498m9 = (int) c9681ne2.m47498m9();
        if (iM47498m9 == -2147483647) {
            C9681ne[] c9681neArr = {c9681ne2};
            zM14042k4 = new C3484x6().m14042k4(c9681neArr, abstractC3150x6);
            c9681ne = c9681neArr[0];
        } else {
            if (iM47498m9 == 64 || iM47498m9 == 128) {
                throw new ArgumentOutOfRangeException("This comment record is reserved and MUST NOT be used in an EMF metafile.");
            }
            if (iM47498m9 == 1073741828) {
                C9681ne[] c9681neArr2 = {c9681ne2};
                zM14042k4 = new C3469up().m14027k4(c9681neArr2, abstractC3150x6);
                c9681ne = c9681neArr2[0];
            } else if (iM47498m9 == 2) {
                C9681ne[] c9681neArr3 = {c9681ne2};
                zM14042k4 = new C3391c5().m13949k4(c9681neArr3, abstractC3150x6);
                c9681ne = c9681neArr3[0];
            } else {
                if (iM47498m9 != 3) {
                    throw new ArgumentOutOfRangeException("identefier");
                }
                C9681ne[] c9681neArr4 = {c9681ne2};
                zM14042k4 = new C3409fa().m13967k4(c9681neArr4, abstractC3150x6);
                c9681ne = c9681neArr4[0];
            }
        }
        c9658ixArr[0] = c9681ne;
        return zM14042k4;
    }
}
