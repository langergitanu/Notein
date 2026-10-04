package com.aspose.slides.internal.p415t9;

import com.aspose.slides.internal.p042bn.C1742ne;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3577up;
import com.aspose.slides.internal.p197j1.C5171ts;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.t9.bz */
/* JADX INFO: loaded from: classes4.dex */
public class C10850bz extends AbstractC10873rv {
    @Override // com.aspose.slides.internal.p415t9.AbstractC10873rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo52417k4(C1742ne[] c1742neArr, C3134k4 c3134k4) {
        C5171ts c5171ts = new C5171ts(c1742neArr[0]);
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3577up.class), iM13382u4)) {
            C6005k4.m24264to("Warning: Invalid Query value for WmfQueryEscSupportEscape.");
            return false;
        }
        c5171ts.m22070to(iM13382u4 & 65535);
        c1742neArr[0] = c5171ts;
        return true;
    }
}
