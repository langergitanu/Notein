package com.aspose.slides.internal.p319ok;

import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3571ne;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p498xe.C12505dy;
import com.aspose.slides.internal.p498xe.C12508ix;
import com.aspose.slides.internal.p498xe.C12516rv;
import com.aspose.slides.internal.p501xj.C12540x1;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.ok.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C7121yj extends AbstractC7101ck {
    /* JADX INFO: renamed from: k4 */
    public C3023to m27645k4(C3134k4 c3134k4) {
        C12516rv c12516rv = new C12516rv();
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3571ne.class), iM13382u4)) {
            throw new C12540x1("Invalid PenStyle value for WmfPen");
        }
        c12516rv.m58212k4(iM13382u4 & 65535);
        c12516rv.m58214k4((C12508ix) new C7113rv().m27637k4(c3134k4));
        c12516rv.m58213k4((C12505dy) new C7102du().m27622k4(c3134k4));
        return c12516rv;
    }
}
