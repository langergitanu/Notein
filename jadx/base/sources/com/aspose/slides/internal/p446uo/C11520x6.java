package com.aspose.slides.internal.p446uo;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p110ek.AbstractC3752x1;
import com.aspose.slides.internal.p132fj.C4037ne;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p377r9.C9994up;
import com.aspose.slides.internal.p428tu.AbstractC11141rv;
import com.aspose.slides.internal.p428tu.C11135ks;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.uo.x6 */
/* JADX INFO: loaded from: classes4.dex */
public class C11520x6 extends AbstractC3752x1 {
    @Override // com.aspose.slides.internal.p110ek.AbstractC3752x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo15061x1(C4047sv[] c4047svArr, AbstractC3150x6 abstractC3150x6) {
        String strM67408k4;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C4037ne c4037ne = new C4037ne(c4047svArr[0]);
        int iM13382u4 = c3134k4.m13382u4();
        if (AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C9994up.class), iM13382u4)) {
            c4037ne.m16026k4(iM13382u4 & 65535);
            AbstractC11141rv abstractC11141rvM53665k4 = C11135ks.m53665k4(c4037ne.m16025k4());
            C4037ne[] c4037neArr = {c4037ne};
            boolean zM53666x1 = abstractC11141rvM53665k4.m53666x1(c4037neArr, c3134k4);
            C4037ne c4037ne2 = c4037neArr[0];
            if (zM53666x1) {
                c4047svArr[0] = c4037ne2;
                return true;
            }
            strM67408k4 = C14113y2.m67408k4("Unable to read WmfEscapeRecord; WmfMetafileEscape:", C14042ak.m66410k4(C9994up.class, c4037ne2.m16025k4()));
        } else {
            strM67408k4 = "Invalid WmfMetafileEscape for WmfEscapeRecord";
        }
        C6005k4.m24264to(strM67408k4);
        return false;
    }
}
