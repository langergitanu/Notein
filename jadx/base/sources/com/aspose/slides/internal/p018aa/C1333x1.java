package com.aspose.slides.internal.p018aa;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p280ms.C6493x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p377r9.C9997x1;
import com.aspose.slides.internal.p488x0.C12346to;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.aa.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1333x1 extends AbstractC1315ck {
    /* JADX INFO: renamed from: k4 */
    public C12535to m7818k4(C3134k4 c3134k4) {
        C12346to c12346to = new C12346to();
        c12346to.m57758k4(c3134k4.m13384uz());
        c12346to.m57804kk(c3134k4.m13382u4());
        c12346to.m57806to(c3134k4.m13382u4());
        c12346to.m57757k4(c3134k4.m13382u4());
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C9997x1.class), iM13382u4)) {
            throw new C6493x1("Invalid BitCount value for BitmapCoreHeader");
        }
        c12346to.m57761x1(iM13382u4 & 65535);
        return c12346to;
    }
}
