package com.aspose.slides.internal.p018aa;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p488x0.C12338jd;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.aa.m9 */
/* JADX INFO: loaded from: classes3.dex */
public class C1325m9 extends AbstractC1315ck {

    /* JADX INFO: renamed from: k4 */
    private long f5776k4;

    public C1325m9(long j) {
        this.f5776k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public C12535to m7810k4(C3134k4 c3134k4) {
        long position = c3134k4.m13371ck().getPosition();
        C12338jd c12338jd = new C12338jd();
        c12338jd.m57727k4(c3134k4.m13381rv());
        c12338jd.m57743x1(c3134k4.m13381rv());
        c12338jd.m57731kk(c3134k4.m13381rv());
        c12338jd.m57739to(c3134k4.m13381rv());
        c12338jd.m57716du(c3134k4.m13381rv());
        c12338jd.m57725k4(c3134k4.m13387yj());
        c12338jd.m57742x1(c3134k4.m13387yj());
        c12338jd.m57730kk(c3134k4.m13387yj());
        c12338jd.m57738to(c3134k4.m13387yj());
        c12338jd.m57715du(c3134k4.m13387yj());
        c12338jd.m57721h4(c3134k4.m13387yj());
        c12338jd.m57734m9(c3134k4.m13387yj());
        c12338jd.m57718dy(c3134k4.m13387yj());
        c12338jd.m57728k4(c3134k4.m13372dy((int) C14116yg.m67492kk((this.f5776k4 & 4294967295L) - (c3134k4.m13371ck().getPosition() - position), 32L)));
        int i = 0;
        while (i < c12338jd.m57736rv().length && (c12338jd.m57736rv()[i] & 255) != 0) {
            i++;
        }
        c12338jd.m57726k4(AbstractC6747ar.m26650yj().mo26682x1(c12338jd.m57736rv(), 0, i));
        return c12338jd;
    }
}
