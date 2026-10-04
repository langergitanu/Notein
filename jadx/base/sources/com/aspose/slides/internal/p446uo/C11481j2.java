package com.aspose.slides.internal.p446uo;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p110ek.AbstractC3752x1;
import com.aspose.slides.internal.p132fj.C4039os;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p377r9.C9980fa;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.uo.j2 */
/* JADX INFO: loaded from: classes4.dex */
public class C11481j2 extends AbstractC3752x1 {
    @Override // com.aspose.slides.internal.p110ek.AbstractC3752x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo15061x1(C4047sv[] c4047svArr, AbstractC3150x6 abstractC3150x6) {
        C4039os c4039os = new C4039os(c4047svArr[0]);
        int iM13382u4 = new C3134k4(abstractC3150x6).m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C9980fa.class), iM13382u4)) {
            C6005k4.m24264to("Invalid MapMode for WmfSetMapMode");
            return false;
        }
        c4039os.m16034k4(iM13382u4 & 65535);
        c4047svArr[0] = c4039os;
        return true;
    }
}
