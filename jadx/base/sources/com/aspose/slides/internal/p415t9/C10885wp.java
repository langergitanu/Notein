package com.aspose.slides.internal.p415t9;

import com.aspose.slides.internal.p042bn.C1742ne;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3579wl;
import com.aspose.slides.internal.p197j1.C5154g8;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.t9.wp */
/* JADX INFO: loaded from: classes4.dex */
public class C10885wp extends AbstractC10873rv {
    @Override // com.aspose.slides.internal.p415t9.AbstractC10873rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo52417k4(C1742ne[] c1742neArr, C3134k4 c3134k4) {
        C5154g8 c5154g8 = new C5154g8(c1742neArr[0]);
        if ((c5154g8.m9365x1() & 65535) != 4) {
            C6005k4.m24264to("Warning: Invalid ByteCount for WmfSetLineJoinEscape record. MUST be 0x0004");
        }
        int iM13386x6 = c3134k4.m13386x6();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3579wl.class), iM13386x6)) {
            C6005k4.m24264to("Invalid Join value for WmfSetLineJoinEscape.");
            return false;
        }
        c5154g8.m22037to(iM13386x6);
        c1742neArr[0] = c5154g8;
        return true;
    }
}
