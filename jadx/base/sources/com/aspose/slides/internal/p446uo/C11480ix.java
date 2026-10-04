package com.aspose.slides.internal.p446uo;

import com.aspose.slides.internal.p018aa.C1316du;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p110ek.AbstractC3752x1;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4052u4;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p377r9.C9979dy;
import com.aspose.slides.internal.p488x0.C12334dy;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.uo.ix */
/* JADX INFO: loaded from: classes4.dex */
public class C11480ix extends AbstractC3752x1 {
    @Override // com.aspose.slides.internal.p110ek.AbstractC3752x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo15061x1(C4047sv[] c4047svArr, AbstractC3150x6 abstractC3150x6) {
        C4052u4 c4052u4 = new C4052u4(c4047svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C9979dy.class), iM13382u4)) {
            C6005k4.m24265x1("Invalid Mode value for WmfExtFloodFill");
            return false;
        }
        c4052u4.m16102k4(iM13382u4 & 65535);
        c4052u4.m16103k4((C12334dy) new C1316du().m7797k4(c3134k4));
        c4052u4.m16108x1(c3134k4.m13381rv());
        c4052u4.m16104k4(c3134k4.m13381rv());
        c4047svArr[0] = c4052u4;
        return true;
    }
}
