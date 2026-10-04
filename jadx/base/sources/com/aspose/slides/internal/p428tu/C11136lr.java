package com.aspose.slides.internal.p428tu;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p132fj.C4037ne;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p543z9.C13493v4;

/* JADX INFO: renamed from: com.aspose.slides.internal.tu.lr */
/* JADX INFO: loaded from: classes4.dex */
public class C11136lr extends AbstractC11141rv {
    @Override // com.aspose.slides.internal.p428tu.AbstractC11141rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo53663k4(C4037ne[] c4037neArr, C3134k4 c3134k4) {
        C13493v4 c13493v4 = new C13493v4(c4037neArr[0]);
        if ((c13493v4.m16027x1() & 65535) != 0) {
            C6005k4.m24264to("Warning: Invalid ByteCount for WmfNewFrameEscape record. MUST be 0x0000");
            c3134k4.m13371ck().seek(c13493v4.m16027x1() & 65535, 1);
        }
        c4037neArr[0] = c13493v4;
        return true;
    }
}
