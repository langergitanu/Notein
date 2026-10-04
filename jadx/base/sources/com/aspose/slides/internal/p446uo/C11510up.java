package com.aspose.slides.internal.p446uo;

import com.aspose.slides.internal.p018aa.C1319h4;
import com.aspose.slides.internal.p018aa.C1322k4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p110ek.AbstractC3752x1;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4071yj;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p377r9.C9981h4;
import com.aspose.slides.internal.p377r9.C9985kk;
import com.aspose.slides.internal.p488x0.C12331c5;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.uo.up */
/* JADX INFO: loaded from: classes4.dex */
public class C11510up extends AbstractC3752x1 {
    /* JADX INFO: renamed from: k4 */
    private C12331c5 m54517k4(C3134k4 c3134k4, int i, int i2) {
        try {
            return (C12331c5) new C1319h4(i, i2).m7803x1(c3134k4);
        } catch (RuntimeException unused) {
            c3134k4.m13371ck().seek(i, 0);
            return null;
        }
    }

    @Override // com.aspose.slides.internal.p110ek.AbstractC3752x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo15061x1(C4047sv[] c4047svArr, AbstractC3150x6 abstractC3150x6) {
        String str;
        C4071yj c4071yj = new C4071yj(c4047svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        int iM13382u4 = c3134k4.m13382u4();
        if (AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C9985kk.class), iM13382u4)) {
            c4071yj.m16222k4((iM13382u4 & 65535) != 3 ? 6 : 3);
            int iM13382u42 = c3134k4.m13382u4();
            if (AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C9981h4.class), iM13382u42)) {
                c4071yj.m16226x1(c4071yj.m16221k4() == 3 ? 0 : iM13382u42 & 65535);
                int position = (int) c3134k4.m13371ck().getPosition();
                C12331c5 c12331c5M54517k4 = m54517k4(c3134k4, position, (int) ((((c4071yj.m16068yj() & 4294967295L) * 2) & 4294967295L) - 10));
                if (c12331c5M54517k4 == null || c3134k4.m13371ck().getPosition() > (4294967295L & ((c4071yj.m16065rv() & 4294967295L) + (((c4071yj.m16068yj() & 4294967295L) * 2) & 4294967295L)))) {
                    c3134k4.m13371ck().seek(position, 0);
                    c4071yj.m16223k4(new C1322k4().m7806k4(c3134k4));
                } else {
                    c4071yj.m16223k4(c12331c5M54517k4);
                }
                c4047svArr[0] = c4071yj;
                return true;
            }
            str = "Invalid ColorUsage for WmfDibCreatePatternBrush";
        } else {
            str = "Invalid Style for WmfDibCreatePatternBrush";
        }
        C6005k4.m24264to(str);
        return false;
    }
}
