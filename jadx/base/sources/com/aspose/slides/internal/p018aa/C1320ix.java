package com.aspose.slides.internal.p018aa;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p280ms.C6493x1;
import com.aspose.slides.internal.p488x0.C12344qq;
import com.aspose.slides.internal.p488x0.C12347u4;
import com.aspose.slides.internal.p488x0.C12351wl;
import com.aspose.slides.internal.p500xi.C12535to;

/* JADX INFO: renamed from: com.aspose.slides.internal.aa.ix */
/* JADX INFO: loaded from: classes3.dex */
public class C1320ix extends AbstractC1315ck {
    /* JADX INFO: renamed from: k4 */
    public C12535to m7804k4(C3134k4 c3134k4) {
        C12351wl c12351wl = new C12351wl();
        c12351wl.m57862k4(c3134k4.m13381rv());
        c12351wl.m57870x1(c3134k4.m13381rv());
        if (c12351wl.m57869x1() != 6) {
            throw new C6493x1("Invalid ObjectType for WmfRegion");
        }
        c12351wl.m57860k4(c3134k4.m13386x6());
        c12351wl.m57865kk(c3134k4.m13381rv());
        c12351wl.m57868to(c3134k4.m13381rv());
        c12351wl.m57855du(c3134k4.m13381rv());
        c12351wl.m57861k4((C12347u4) new C1326ne().m7811k4(c3134k4));
        c12351wl.m57863k4(new C12344qq[c12351wl.m57857h4()]);
        for (int i = 0; i < c12351wl.m57854c5().length; i++) {
            c12351wl.m57854c5()[i] = (C12344qq) new C1331uz().m7816k4(c3134k4);
        }
        return c12351wl;
    }
}
