package com.aspose.slides.internal.p319ok;

import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3580x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p498xe.C12517to;
import com.aspose.slides.internal.p501xj.C12540x1;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.ok.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C7119x1 extends AbstractC7101ck {
    /* JADX INFO: renamed from: k4 */
    public C3023to m27643k4(C3134k4 c3134k4) {
        C12517to c12517to = new C12517to();
        c12517to.m58174k4(c3134k4.m13384uz());
        c12517to.m58220kk(c3134k4.m13382u4());
        c12517to.m58222to(c3134k4.m13382u4());
        c12517to.m58173k4(c3134k4.m13382u4());
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3580x1.class), iM13382u4)) {
            throw new C12540x1("Invalid BitCount value for BitmapCoreHeader");
        }
        c12517to.m58177x1(iM13382u4 & 65535);
        return c12517to;
    }
}
