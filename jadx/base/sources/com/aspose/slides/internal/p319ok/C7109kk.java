package com.aspose.slides.internal.p319ok;

import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3570m9;
import com.aspose.slides.internal.p100e4.C3580x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p498xe.C12504du;
import com.aspose.slides.internal.p501xj.C12540x1;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.ok.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C7109kk extends AbstractC7101ck {
    /* JADX INFO: renamed from: k4 */
    public C3023to m27633k4(C3134k4 c3134k4) {
        C12504du c12504du = new C12504du();
        c12504du.m58174k4(c3134k4.m13384uz());
        c12504du.m58092kk(c3134k4.m13386x6());
        c12504du.m58096to(c3134k4.m13386x6());
        c12504du.m58173k4(c3134k4.m13382u4());
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3580x1.class), iM13382u4)) {
            throw new C12540x1("Invalid BitCount value for BitmapInfoHeader");
        }
        c12504du.m58177x1(iM13382u4 & 65535);
        long jM13384uz = c3134k4.m13384uz();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C3570m9.class), jM13384uz)) {
            throw new C12540x1("Invalid Compression value for BitmapInfoHeader");
        }
        c12504du.m58098x1(jM13384uz & 4294967295L);
        c12504du.m58093kk(c3134k4.m13384uz());
        c12504du.m58085du(c3134k4.m13386x6());
        c12504du.m58089h4(c3134k4.m13386x6());
        c12504du.m58097to(c3134k4.m13384uz());
        c12504du.m58086du(c3134k4.m13384uz());
        return c12504du;
    }
}
