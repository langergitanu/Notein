package com.aspose.slides.internal.p283mv;

import com.aspose.slides.internal.p042bn.C1725gk;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3558bv;
import com.aspose.slides.internal.p100e4.C3564h4;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p319ok.C7105h4;
import com.aspose.slides.internal.p498xe.C12502c5;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.gf */
/* JADX INFO: loaded from: classes4.dex */
public class C6564gf extends AbstractC5117x1 {
    @Override // com.aspose.slides.internal.p190is.AbstractC5117x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        C1725gk c1725gk = new C1725gk(c1752svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        long[] jArr = {0};
        boolean zM14471k4 = C3558bv.m14471k4(jArr, c3134k4.m13384uz());
        long j = jArr[0];
        if (!zM14471k4) {
            C6005k4.m24263kk("Invalid RasterOperation value for WmfStretchDib");
            return false;
        }
        c1725gk.m9329k4(j);
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3564h4.class), iM13382u4)) {
            C6005k4.m24265x1("Invalid ColorUsage value for WmfStretchDib");
            return false;
        }
        c1725gk.m9270k4(iM13382u4 & 65535);
        c1725gk.m9265du(c3134k4.m13381rv());
        c1725gk.m9268h4(c3134k4.m13381rv());
        c1725gk.m9330k4(c3134k4.m13381rv());
        c1725gk.m9336x1(c3134k4.m13381rv());
        c1725gk.m9273m9(c3134k4.m13381rv());
        c1725gk.m9267dy(c3134k4.m13381rv());
        c1725gk.m9332kk(c3134k4.m13381rv());
        c1725gk.m9334to(c3134k4.m13381rv());
        c1725gk.m9271k4((C12502c5) new C7105h4(c1725gk.m9400ks() & 4294967295L, (int) ((4294967295L & c1725gk.m9402up()) * 2)).m27628x1(c3134k4));
        c1752svArr[0] = c1725gk;
        return true;
    }
}
