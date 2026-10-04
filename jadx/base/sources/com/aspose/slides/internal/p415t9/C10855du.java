package com.aspose.slides.internal.p415t9;

import com.aspose.slides.internal.p042bn.C1742ne;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3578uz;
import com.aspose.slides.internal.p197j1.C5150du;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.t9.du */
/* JADX INFO: loaded from: classes4.dex */
public class C10855du extends AbstractC10873rv {
    @Override // com.aspose.slides.internal.p415t9.AbstractC10873rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo52417k4(C1742ne[] c1742neArr, C3134k4 c3134k4) {
        C5150du c5150du = new C5150du(c1742neArr[0]);
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3578uz.class), iM13382u4)) {
            C6005k4.m24264to("Invalid ClipFunction for WmfClipToPathEscape");
            return false;
        }
        c5150du.m22035to(iM13382u4 & 65535);
        c1742neArr[0] = c5150du;
        return true;
    }
}
