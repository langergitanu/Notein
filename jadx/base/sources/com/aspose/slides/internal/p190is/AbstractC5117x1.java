package com.aspose.slides.internal.p190is;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3572qq;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.is.x1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5117x1 {
    /* JADX INFO: renamed from: k4 */
    public static boolean m21975k4(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        boolean z;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c1752svArr[0].m9399kk(abstractC3150x6.getPosition() & 4294967295L);
        long jM13384uz = c3134k4.m13384uz();
        int iM13382u4 = c3134k4.m13382u4();
        if (AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3572qq.class), iM13382u4)) {
            c1752svArr[0].m9398kk(iM13382u4 & 65535);
            z = true;
        } else {
            z = false;
        }
        c1752svArr[0].m9403x1(jM13384uz);
        return z;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6);
}
