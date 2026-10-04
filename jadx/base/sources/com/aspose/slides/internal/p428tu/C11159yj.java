package com.aspose.slides.internal.p428tu;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p132fj.C4037ne;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p543z9.C13478ks;

/* JADX INFO: renamed from: com.aspose.slides.internal.tu.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C11159yj extends AbstractC11141rv {
    @Override // com.aspose.slides.internal.p428tu.AbstractC11141rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo53663k4(C4037ne[] c4037neArr, C3134k4 c3134k4) {
        C13478ks c13478ks = new C13478ks(c4037neArr[0]);
        if ((c13478ks.m16027x1() & 65535) != 2) {
            C6005k4.m24264to("Warning: Invalid ByteCount for WmfEpsPrintingEscape record. MUST be 0x0002");
        }
        c13478ks.m62665to(c3134k4.m13382u4());
        c4037neArr[0] = c13478ks;
        return true;
    }
}
