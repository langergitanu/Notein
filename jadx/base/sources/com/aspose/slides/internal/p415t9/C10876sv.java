package com.aspose.slides.internal.p415t9;

import com.aspose.slides.internal.p042bn.C1742ne;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3575u4;
import com.aspose.slides.internal.p197j1.C5165qm;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.t9.sv */
/* JADX INFO: loaded from: classes4.dex */
public class C10876sv extends AbstractC10873rv {
    @Override // com.aspose.slides.internal.p415t9.AbstractC10873rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo52417k4(C1742ne[] c1742neArr, C3134k4 c3134k4) {
        C5165qm c5165qm = new C5165qm(c1742neArr[0]);
        if ((c5165qm.m9365x1() & 65535) != 4) {
            C6005k4.m24264to("Warning: Invalid ByteCount for WmfSetLineCapEscape record. MUST be 0x0004");
        }
        int iM13386x6 = c3134k4.m13386x6();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3575u4.class), iM13386x6)) {
            C6005k4.m24264to("Warning: Invalid Cap value for WmfSetLineCapEscape.");
            return false;
        }
        c5165qm.m22060to(iM13386x6);
        c1742neArr[0] = c5165qm;
        return true;
    }
}
