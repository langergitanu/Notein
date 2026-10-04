package com.aspose.slides.internal.p428tu;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p132fj.C4037ne;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p543z9.C13495wp;

/* JADX INFO: renamed from: com.aspose.slides.internal.tu.ss */
/* JADX INFO: loaded from: classes4.dex */
public class C11143ss extends AbstractC11141rv {
    @Override // com.aspose.slides.internal.p428tu.AbstractC11141rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo53663k4(C4037ne[] c4037neArr, C3134k4 c3134k4) {
        C13495wp c13495wp = new C13495wp(c4037neArr[0]);
        if ((c13495wp.m16027x1() & 65535) != 4) {
            C6005k4.m24264to("Warning: Invalid ByteCount for WmfSetMiterLimitEscape record. MUST be 0x0004");
        }
        c13495wp.m62679to(c3134k4.m13386x6());
        c4037neArr[0] = c13495wp;
        return true;
    }
}
