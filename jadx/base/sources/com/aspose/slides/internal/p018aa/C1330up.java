package com.aspose.slides.internal.p018aa;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p488x0.C12341ks;
import com.aspose.slides.internal.p488x0.C12354yj;
import com.aspose.slides.internal.p500xi.C12535to;

/* JADX INFO: renamed from: com.aspose.slides.internal.aa.up */
/* JADX INFO: loaded from: classes3.dex */
public class C1330up extends AbstractC1315ck {
    /* JADX INFO: renamed from: k4 */
    public C12535to m7815k4(C3134k4 c3134k4) {
        C12354yj c12354yj = new C12354yj();
        c12354yj.m57891k4(c3134k4.m13382u4());
        if ((c12354yj.m57890k4() & 65535) != 768) {
            c3134k4.m13371ck().seek(c12354yj.m57890k4() & 65535, 0);
        }
        c12354yj.m57895x1(c3134k4.m13382u4());
        c12354yj.m57892k4(new C12341ks[c12354yj.m57894x1()]);
        for (int i = 0; i < (c12354yj.m57894x1() & 65535); i++) {
            c12354yj.m57893kk()[i] = (C12341ks) new C1318fa().m7799k4(c3134k4);
        }
        return c12354yj;
    }
}
