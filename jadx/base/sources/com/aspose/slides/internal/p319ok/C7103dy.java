package com.aspose.slides.internal.p319ok;

import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3566jd;
import com.aspose.slides.internal.p100e4.C3568kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p498xe.C12503ck;
import com.aspose.slides.internal.p498xe.C12505dy;
import com.aspose.slides.internal.p501xj.C12540x1;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.ok.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C7103dy extends AbstractC7101ck {
    /* JADX INFO: renamed from: k4 */
    public C3023to m27623k4(C3134k4 c3134k4) {
        C12503ck c12503ck = new C12503ck();
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3568kk.class), iM13382u4)) {
            throw new C12540x1("Invalid WmfBrushStyle for WmfLogBrush");
        }
        c12503ck.m58079k4(iM13382u4 & 65535);
        c12503ck.m58080k4((C12505dy) new C7102du().m27622k4(c3134k4));
        int iM13382u42 = c3134k4.m13382u4();
        if (c12503ck.m58078k4() != 2) {
            return c12503ck;
        }
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3566jd.class), iM13382u42)) {
            throw new C12540x1("Invalid WmfHatchStyle for WmfLogBrush");
        }
        c12503ck.m58084x1(iM13382u42 & 65535);
        return c12503ck;
    }
}
