package com.aspose.slides.internal.p283mv;

import com.aspose.slides.internal.p042bn.C1742ne;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3577up;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p415t9.AbstractC10873rv;
import com.aspose.slides.internal.p415t9.C10867ks;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.x6 */
/* JADX INFO: loaded from: classes4.dex */
public class C6610x6 extends AbstractC5117x1 {
    @Override // com.aspose.slides.internal.p190is.AbstractC5117x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        String strM67408k4;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C1742ne c1742ne = new C1742ne(c1752svArr[0]);
        int iM13382u4 = c3134k4.m13382u4();
        if (AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3577up.class), iM13382u4)) {
            c1742ne.m9364k4(iM13382u4 & 65535);
            AbstractC10873rv abstractC10873rvM52419k4 = C10867ks.m52419k4(c1742ne.m9363k4());
            C1742ne[] c1742neArr = {c1742ne};
            boolean zM52420x1 = abstractC10873rvM52419k4.m52420x1(c1742neArr, c3134k4);
            C1742ne c1742ne2 = c1742neArr[0];
            if (zM52420x1) {
                c1752svArr[0] = c1742ne2;
                return true;
            }
            strM67408k4 = C14113y2.m67408k4("Unable to read WmfEscapeRecord; WmfMetafileEscape:", C14042ak.m66410k4(C3577up.class, c1742ne2.m9363k4()));
        } else {
            strM67408k4 = "Invalid WmfMetafileEscape for WmfEscapeRecord";
        }
        C6005k4.m24264to(strM67408k4);
        return false;
    }
}
