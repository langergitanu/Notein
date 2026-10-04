package com.aspose.slides.internal.p415t9;

import com.aspose.slides.internal.p042bn.C1742ne;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p197j1.C5147c6;
import com.aspose.slides.internal.p243l6.C6005k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.t9.e0 */
/* JADX INFO: loaded from: classes4.dex */
public class C10857e0 extends AbstractC10873rv {
    @Override // com.aspose.slides.internal.p415t9.AbstractC10873rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo52417k4(C1742ne[] c1742neArr, C3134k4 c3134k4) {
        C5147c6 c5147c6 = new C5147c6(c1742neArr[0]);
        if ((c5147c6.m9365x1() & 65535) != 0) {
            C6005k4.m24264to("Warning: Invalid ByteCount for WmfQueryDibSupportEscape record. MUST be 0x0000");
            c3134k4.m13371ck().seek(c5147c6.m9365x1() & 65535, 1);
        }
        c1742neArr[0] = c5147c6;
        return true;
    }
}
