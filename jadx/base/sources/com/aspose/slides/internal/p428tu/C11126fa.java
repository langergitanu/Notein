package com.aspose.slides.internal.p428tu;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p132fj.C4037ne;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p543z9.C13491up;

/* JADX INFO: renamed from: com.aspose.slides.internal.tu.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C11126fa extends AbstractC11141rv {
    @Override // com.aspose.slides.internal.p428tu.AbstractC11141rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo53663k4(C4037ne[] c4037neArr, C3134k4 c3134k4) {
        C13491up c13491up = new C13491up(c4037neArr[0]);
        if ((c13491up.m16027x1() & 65535) != 0) {
            C6005k4.m24264to("Warning: Invalid ByteCount for WmfEndDocEscape record. MUST be 0x0000");
            c3134k4.m13371ck().seek(c13491up.m16027x1() & 65535, 1);
        }
        c4037neArr[0] = c13491up;
        return true;
    }
}
