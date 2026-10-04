package com.aspose.slides.internal.p446uo;

import com.aspose.slides.internal.p018aa.C1319h4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p110ek.AbstractC3752x1;
import com.aspose.slides.internal.p132fj.C4025j2;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p377r9.C9981h4;
import com.aspose.slides.internal.p488x0.C12331c5;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.uo.qw */
/* JADX INFO: loaded from: classes4.dex */
public class C11498qw extends AbstractC3752x1 {
    @Override // com.aspose.slides.internal.p110ek.AbstractC3752x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo15061x1(C4047sv[] c4047svArr, AbstractC3150x6 abstractC3150x6) {
        C4025j2 c4025j2 = new C4025j2(c4047svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C9981h4.class), iM13382u4)) {
            C6005k4.m24265x1("Invalid ColorUsage value for WmfSetDibToDev");
            return false;
        }
        c4025j2.m15967k4(iM13382u4 & 65535);
        c4025j2.m15975x1(c3134k4.m13382u4());
        c4025j2.m15973to(c3134k4.m13382u4());
        c4025j2.m15959du(c3134k4.m13382u4());
        c4025j2.m15963h4(c3134k4.m13382u4());
        c4025j2.m15971m9(c3134k4.m13382u4());
        c4025j2.m15961dy(c3134k4.m13382u4());
        c4025j2.m15957c5(c3134k4.m13382u4());
        c4025j2.m15965jd(c3134k4.m13382u4());
        c4025j2.m15968k4((C12331c5) new C1319h4(c4025j2.m16065rv() & 4294967295L, (int) ((4294967295L & c4025j2.m16068yj()) * 2)).m7803x1(c3134k4));
        c4047svArr[0] = c4025j2;
        return true;
    }
}
