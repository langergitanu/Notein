package com.aspose.slides.internal.p018aa;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p280ms.C6493x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p377r9.C9987m9;
import com.aspose.slides.internal.p377r9.C9997x1;
import com.aspose.slides.internal.p488x0.C12333du;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.aa.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C1323kk extends AbstractC1315ck {
    /* JADX INFO: renamed from: k4 */
    public C12535to m7808k4(C3134k4 c3134k4) {
        C12333du c12333du = new C12333du();
        c12333du.m57758k4(c3134k4.m13384uz());
        c12333du.m57659kk(c3134k4.m13386x6());
        c12333du.m57663to(c3134k4.m13386x6());
        c12333du.m57757k4(c3134k4.m13382u4());
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C9997x1.class), iM13382u4)) {
            throw new C6493x1("Invalid BitCount value for BitmapInfoHeader");
        }
        c12333du.m57761x1(iM13382u4 & 65535);
        long jM13384uz = c3134k4.m13384uz();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C9987m9.class), jM13384uz)) {
            throw new C6493x1("Invalid Compression value for BitmapInfoHeader");
        }
        c12333du.m57665x1(jM13384uz & 4294967295L);
        c12333du.m57660kk(c3134k4.m13384uz());
        c12333du.m57650du(c3134k4.m13386x6());
        c12333du.m57655h4(c3134k4.m13386x6());
        c12333du.m57664to(c3134k4.m13384uz());
        c12333du.m57651du(c3134k4.m13384uz());
        return c12333du;
    }
}
