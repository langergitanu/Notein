package com.aspose.slides.internal.p319ok;

import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p498xe.C12509jd;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.ok.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C7111m9 extends AbstractC7101ck {

    /* JADX INFO: renamed from: k4 */
    private long f19231k4;

    public C7111m9(long j) {
        this.f19231k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public C3023to m27635k4(C3134k4 c3134k4) {
        long position = c3134k4.m13371ck().getPosition();
        C12509jd c12509jd = new C12509jd();
        c12509jd.m58143k4(c3134k4.m13381rv());
        c12509jd.m58159x1(c3134k4.m13381rv());
        c12509jd.m58147kk(c3134k4.m13381rv());
        c12509jd.m58155to(c3134k4.m13381rv());
        c12509jd.m58132du(c3134k4.m13381rv());
        c12509jd.m58141k4(c3134k4.m13387yj());
        c12509jd.m58158x1(c3134k4.m13387yj());
        c12509jd.m58146kk(c3134k4.m13387yj());
        c12509jd.m58154to(c3134k4.m13387yj());
        c12509jd.m58131du(c3134k4.m13387yj());
        c12509jd.m58137h4(c3134k4.m13387yj());
        c12509jd.m58150m9(c3134k4.m13387yj());
        c12509jd.m58134dy(c3134k4.m13387yj());
        c12509jd.m58144k4(c3134k4.m13372dy((int) C14116yg.m67492kk((this.f19231k4 & 4294967295L) - (c3134k4.m13371ck().getPosition() - position), 32L)));
        int i = 0;
        while (i < c12509jd.m58152rv().length && (c12509jd.m58152rv()[i] & 255) != 0) {
            i++;
        }
        c12509jd.m58142k4(AbstractC6747ar.m26650yj().mo26682x1(c12509jd.m58152rv(), 0, i));
        return c12509jd;
    }
}
