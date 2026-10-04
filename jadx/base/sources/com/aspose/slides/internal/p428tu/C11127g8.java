package com.aspose.slides.internal.p428tu;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p132fj.C4037ne;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p543z9.C13482qm;

/* JADX INFO: renamed from: com.aspose.slides.internal.tu.g8 */
/* JADX INFO: loaded from: classes4.dex */
public class C11127g8 extends AbstractC11141rv {
    @Override // com.aspose.slides.internal.p428tu.AbstractC11141rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo53663k4(C4037ne[] c4037neArr, C3134k4 c3134k4) {
        C13482qm c13482qm = new C13482qm(c4037neArr[0]);
        if ((c13482qm.m16027x1() & 65535) != 2) {
            C6005k4.m24264to("Warning: Invalid ByteCount for WmfSetCopyCountEscape record. MUST be 0x0002");
        }
        c13482qm.m62667to(c3134k4.m13382u4());
        c4037neArr[0] = c13482qm;
        return true;
    }
}
