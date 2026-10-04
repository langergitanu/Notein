package com.aspose.slides.internal.p283mv;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p042bn.C1756ts;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p319ok.C7112ne;
import com.aspose.slides.internal.p498xe.C12518u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.c6 */
/* JADX INFO: loaded from: classes4.dex */
public class C6553c6 {
    /* JADX INFO: renamed from: k4 */
    public final boolean m26381k4(C1756ts[] c1756tsArr, AbstractC3150x6 abstractC3150x6) {
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        long jM13384uz = c3134k4.m13384uz();
        if ((4294967295L & jM13384uz) != 2596720087L) {
            return false;
        }
        c1756tsArr[0].m9427k4(jM13384uz);
        c1756tsArr[0].m9429k4(c3134k4.m13381rv());
        c1756tsArr[0].m9428k4((C12518u4) new C7112ne().m27636k4(c3134k4));
        c1756tsArr[0].m9426k4(c3134k4.m13382u4());
        int iM13386x6 = c3134k4.m13386x6();
        if (iM13386x6 != 0) {
            throw new ArgumentException("MUST be 0x00000000");
        }
        c1756tsArr[0].m9432x1(iM13386x6);
        c1756tsArr[0].m9433x1(c3134k4.m13381rv());
        return true;
    }
}
