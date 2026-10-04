package com.aspose.slides.internal.p442uj;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p183ij.C4996ix;
import com.aspose.slides.internal.p183ij.C5019ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C11437yj {
    /* JADX INFO: renamed from: k4 */
    public final boolean m54498k4(C4996ix[] c4996ixArr, AbstractC3150x6 abstractC3150x6) {
        boolean zM54497k4;
        C5019ne c5019ne;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C5019ne c5019ne2 = new C5019ne(c4996ixArr[0]);
        c5019ne2.m21310x1(c3134k4.m13384uz() & 4294967295L);
        c5019ne2.m21308kk(c3134k4.m13384uz() & 4294967295L);
        int iM21307kk = (int) c5019ne2.m21307kk();
        if (iM21307kk == -2147483647) {
            C5019ne[] c5019neArr = {c5019ne2};
            zM54497k4 = new C11428x6().m54497k4(c5019neArr, abstractC3150x6);
            c5019ne = c5019neArr[0];
        } else {
            if (iM21307kk == 64 || iM21307kk == 128) {
                throw new ArgumentOutOfRangeException("This comment record is reserved and MUST NOT be used in an EMF metafile.");
            }
            if (iM21307kk == 1073741828) {
                C5019ne[] c5019neArr2 = {c5019ne2};
                zM54497k4 = new C11413up().m54496k4(c5019neArr2, abstractC3150x6);
                c5019ne = c5019neArr2[0];
            } else if (iM21307kk == 2) {
                C5019ne[] c5019neArr3 = {c5019ne2};
                zM54497k4 = new C11335c5().m54491k4(c5019neArr3, abstractC3150x6);
                c5019ne = c5019neArr3[0];
            } else {
                if (iM21307kk != 3) {
                    throw new ArgumentOutOfRangeException("identefier");
                }
                C5019ne[] c5019neArr4 = {c5019ne2};
                zM54497k4 = new C11353fa().m54493k4(c5019neArr4, abstractC3150x6);
                c5019ne = c5019neArr4[0];
            }
        }
        c4996ixArr[0] = c5019ne;
        return zM54497k4;
    }
}
