package com.aspose.slides.internal.p415t9;

import com.aspose.slides.internal.p042bn.C1742ne;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p197j1.C5141ak;
import com.aspose.slides.internal.p243l6.C6005k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.t9.xk */
/* JADX INFO: loaded from: classes4.dex */
public class C10889xk extends AbstractC10873rv {
    @Override // com.aspose.slides.internal.p415t9.AbstractC10873rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo52417k4(C1742ne[] c1742neArr, C3134k4 c3134k4) {
        C5141ak c5141ak = new C5141ak(c1742neArr[0]);
        if ((c5141ak.m9365x1() & 65535) != 0) {
            C6005k4.m24260k4("Warning: Invalid ByteCount=0x{0:X4} for WmfPostScriptIgnoreEscape record. MUST be 0x0000", Integer.valueOf(c5141ak.m9365x1()));
            c3134k4.m13371ck().seek(c5141ak.m9365x1() & 65535, 1);
        }
        c1742neArr[0] = c5141ak;
        return true;
    }
}
