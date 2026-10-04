package com.aspose.slides.internal.p428tu;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p132fj.C4037ne;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p377r9.C9996wl;
import com.aspose.slides.internal.p543z9.C13486sv;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.tu.wp */
/* JADX INFO: loaded from: classes4.dex */
public class C11153wp extends AbstractC11141rv {
    @Override // com.aspose.slides.internal.p428tu.AbstractC11141rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo53663k4(C4037ne[] c4037neArr, C3134k4 c3134k4) {
        C13486sv c13486sv = new C13486sv(c4037neArr[0]);
        if ((c13486sv.m16027x1() & 65535) != 4) {
            C6005k4.m24264to("Warning: Invalid ByteCount for WmfSetLineJoinEscape record. MUST be 0x0004");
        }
        int iM13386x6 = c3134k4.m13386x6();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C9996wl.class), iM13386x6)) {
            C6005k4.m24264to("Invalid Join value for WmfSetLineJoinEscape.");
            return false;
        }
        c13486sv.m62675to(iM13386x6);
        c4037neArr[0] = c13486sv;
        return true;
    }
}
