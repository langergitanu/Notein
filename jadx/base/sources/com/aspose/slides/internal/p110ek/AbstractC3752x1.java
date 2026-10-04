package com.aspose.slides.internal.p110ek;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p377r9.C9989qq;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.ek.x1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3752x1 {
    /* JADX INFO: renamed from: k4 */
    public static boolean m15060k4(C4047sv[] c4047svArr, AbstractC3150x6 abstractC3150x6) {
        boolean z;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c4047svArr[0].m16062kk(abstractC3150x6.getPosition() & 4294967295L);
        long jM13384uz = c3134k4.m13384uz();
        int iM13382u4 = c3134k4.m13382u4();
        if (AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C9989qq.class), iM13382u4)) {
            c4047svArr[0].m16061kk(iM13382u4 & 65535);
            z = true;
        } else {
            z = false;
        }
        c4047svArr[0].m16066x1(jM13384uz);
        return z;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract boolean mo15061x1(C4047sv[] c4047svArr, AbstractC3150x6 abstractC3150x6);
}
