package com.aspose.slides.internal.p018aa;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p280ms.C6493x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p377r9.C9988ne;
import com.aspose.slides.internal.p488x0.C12334dy;
import com.aspose.slides.internal.p488x0.C12337ix;
import com.aspose.slides.internal.p488x0.C12345rv;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.aa.yj */
/* JADX INFO: loaded from: classes3.dex */
public class C1335yj extends AbstractC1315ck {
    /* JADX INFO: renamed from: k4 */
    public C12535to m7820k4(C3134k4 c3134k4) {
        C12345rv c12345rv = new C12345rv();
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C9988ne.class), iM13382u4)) {
            throw new C6493x1("Invalid PenStyle value for WmfPen");
        }
        c12345rv.m57796k4(iM13382u4 & 65535);
        c12345rv.m57798k4((C12337ix) new C1327rv().m7812k4(c3134k4));
        c12345rv.m57797k4((C12334dy) new C1316du().m7797k4(c3134k4));
        return c12345rv;
    }
}
