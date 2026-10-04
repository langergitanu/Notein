package com.aspose.slides.internal.p513xw;

import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p513xw.AbstractC12742x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.dy */
/* JADX INFO: loaded from: classes5.dex */
public class C12693dy extends C12720qw {

    /* JADX INFO: renamed from: ix */
    private int f42225ix;

    /* JADX INFO: renamed from: ne */
    private int f42226ne;

    /* JADX INFO: renamed from: u4 */
    private int f42227u4;

    public C12693dy(InterfaceC12711lr interfaceC12711lr, C12728tq c12728tq, InterfaceC12683b3 interfaceC12683b3, int i, int i2, C1375h4 c1375h4, C1375h4 c1375h42, boolean z, int i3) {
        super(interfaceC12711lr, c12728tq, interfaceC12683b3, i, i2, c1375h4, c1375h42, z, false, false);
        this.f42226ne = i3;
        this.f42486h4 = true;
    }

    @Override // com.aspose.slides.internal.p513xw.C12720qw, com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    public double mo58928k4(AbstractC12742x6.kk kkVar, AbstractC12729ts abstractC12729ts, int i, double d) {
        super.mo58928k4(kkVar, abstractC12729ts, i, d);
        int i2 = this.f42226ne - kkVar.f42524x1;
        int iIndexOf = this.f42496to.indexOf(abstractC12729ts);
        if (this.f42225ix == 0) {
            int iM59060k4 = C12715ne.m59060k4(this.f42496to, kkVar.f42519k4, r14.size() - 1);
            this.f42225ix = iM59060k4;
            this.f42227u4 = iM59060k4 / this.f42226ne;
        }
        int i3 = iIndexOf - 1;
        int iM59060k42 = C12715ne.m59060k4(this.f42496to, kkVar.f42519k4, i3);
        int iM59060k43 = i2 > 0 ? C12715ne.m59060k4(this.f42496to, i3, r0.size() - 1) / i2 : 0;
        double d2 = (this.f42227u4 - iM59060k42) / 1000.0f;
        double dM67475k4 = C14116yg.m67475k4(d2);
        int i4 = this.f42226ne;
        if (i4 <= 2 ? d2 < 0.0d : d2 > 0.0d) {
            dM67475k4 *= 1.2000000476837158d;
        }
        double d3 = dM67475k4 + ((double) (iM59060k43 / 1000.0f));
        if (kkVar.f42524x1 >= i4) {
            return Double.MAX_VALUE;
        }
        return d3;
    }
}
