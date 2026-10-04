package com.aspose.slides.internal.p283mv;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1776yj;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3564h4;
import com.aspose.slides.internal.p100e4.C3568kk;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p319ok.C7105h4;
import com.aspose.slides.internal.p319ok.C7108k4;
import com.aspose.slides.internal.p498xe.C12502c5;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.up */
/* JADX INFO: loaded from: classes4.dex */
public class C6600up extends AbstractC5117x1 {
    /* JADX INFO: renamed from: k4 */
    private C12502c5 m26382k4(C3134k4 c3134k4, int i, int i2) {
        try {
            return (C12502c5) new C7105h4(i, i2).m27628x1(c3134k4);
        } catch (RuntimeException unused) {
            c3134k4.m13371ck().seek(i, 0);
            return null;
        }
    }

    @Override // com.aspose.slides.internal.p190is.AbstractC5117x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        String str;
        C1776yj c1776yj = new C1776yj(c1752svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        int iM13382u4 = c3134k4.m13382u4();
        if (AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3568kk.class), iM13382u4)) {
            c1776yj.m9552k4((iM13382u4 & 65535) != 3 ? 6 : 3);
            int iM13382u42 = c3134k4.m13382u4();
            if (AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3564h4.class), iM13382u42)) {
                c1776yj.m9555x1(c1776yj.m9551k4() == 3 ? 0 : iM13382u42 & 65535);
                int position = (int) c3134k4.m13371ck().getPosition();
                C12502c5 c12502c5M26382k4 = m26382k4(c3134k4, position, (int) ((((c1776yj.m9402up() & 4294967295L) * 2) & 4294967295L) - 10));
                if (c12502c5M26382k4 == null || c3134k4.m13371ck().getPosition() > (4294967295L & ((c1776yj.m9400ks() & 4294967295L) + (((c1776yj.m9402up() & 4294967295L) * 2) & 4294967295L)))) {
                    c3134k4.m13371ck().seek(position, 0);
                    c1776yj.m9553k4(new C7108k4().m27631k4(c3134k4));
                } else {
                    c1776yj.m9553k4(c12502c5M26382k4);
                }
                c1752svArr[0] = c1776yj;
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
