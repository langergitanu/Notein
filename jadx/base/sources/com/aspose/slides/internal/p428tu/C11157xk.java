package com.aspose.slides.internal.p428tu;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p132fj.C4037ne;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p543z9.C13465dq;

/* JADX INFO: renamed from: com.aspose.slides.internal.tu.xk */
/* JADX INFO: loaded from: classes4.dex */
public class C11157xk extends AbstractC11141rv {
    @Override // com.aspose.slides.internal.p428tu.AbstractC11141rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo53663k4(C4037ne[] c4037neArr, C3134k4 c3134k4) {
        C13465dq c13465dq = new C13465dq(c4037neArr[0]);
        if ((c13465dq.m16027x1() & 65535) != 0) {
            C6005k4.m24260k4("Warning: Invalid ByteCount=0x{0:X4} for WmfPostScriptIgnoreEscape record. MUST be 0x0000", Integer.valueOf(c13465dq.m16027x1()));
            c3134k4.m13371ck().seek(c13465dq.m16027x1() & 65535, 1);
        }
        c4037neArr[0] = c13465dq;
        return true;
    }
}
