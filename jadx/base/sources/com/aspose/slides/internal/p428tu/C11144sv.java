package com.aspose.slides.internal.p428tu;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p132fj.C4037ne;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p377r9.C9992u4;
import com.aspose.slides.internal.p543z9.C13470g8;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.tu.sv */
/* JADX INFO: loaded from: classes4.dex */
public class C11144sv extends AbstractC11141rv {
    @Override // com.aspose.slides.internal.p428tu.AbstractC11141rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo53663k4(C4037ne[] c4037neArr, C3134k4 c3134k4) {
        C13470g8 c13470g8 = new C13470g8(c4037neArr[0]);
        if ((c13470g8.m16027x1() & 65535) != 4) {
            C6005k4.m24264to("Warning: Invalid ByteCount for WmfSetLineCapEscape record. MUST be 0x0004");
        }
        int iM13386x6 = c3134k4.m13386x6();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C9992u4.class), iM13386x6)) {
            C6005k4.m24264to("Warning: Invalid Cap value for WmfSetLineCapEscape.");
            return false;
        }
        c13470g8.m62653to(iM13386x6);
        c4037neArr[0] = c13470g8;
        return true;
    }
}
