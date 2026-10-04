package com.aspose.slides.internal.p415t9;

import com.aspose.slides.internal.p042bn.C1742ne;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p197j1.C5145bz;
import com.aspose.slides.internal.p243l6.C6005k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.t9.g8 */
/* JADX INFO: loaded from: classes4.dex */
public class C10859g8 extends AbstractC10873rv {
    @Override // com.aspose.slides.internal.p415t9.AbstractC10873rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo52417k4(C1742ne[] c1742neArr, C3134k4 c3134k4) {
        C5145bz c5145bz = new C5145bz(c1742neArr[0]);
        if ((c5145bz.m9365x1() & 65535) != 2) {
            C6005k4.m24264to("Warning: Invalid ByteCount for WmfSetCopyCountEscape record. MUST be 0x0002");
        }
        c5145bz.m22024to(c3134k4.m13382u4());
        c1742neArr[0] = c5145bz;
        return true;
    }
}
