package com.aspose.slides.internal.p442uj;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p183ij.C4962bv;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p319ok.C7105h4;
import com.aspose.slides.internal.p509xs.AbstractC12603k4;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.wl */
/* JADX INFO: loaded from: classes4.dex */
public class C11421wl extends AbstractC12603k4 {
    @Override // com.aspose.slides.internal.p509xs.AbstractC12603k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo54490k4(C5061vw[] c5061vwArr, AbstractC3150x6 abstractC3150x6) {
        long position = abstractC3150x6.getPosition() - 8;
        C4962bv c4962bv = new C4962bv(c5061vwArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c4962bv.m20825k4(c3134k4.m13384uz());
        c4962bv.m20834x1(c3134k4.m13384uz() & 4294967295L);
        c4962bv.m20829kk(c3134k4.m13384uz());
        c4962bv.m20832to(c3134k4.m13384uz());
        c4962bv.m20820du(c3134k4.m13384uz());
        c4962bv.m20823h4(c3134k4.m13384uz());
        c4962bv.m20826k4(new C7105h4(position, c4962bv.m21560lr(), c4962bv.m20828kk(), c4962bv.m20831to(), c4962bv.m20822h4(), c4962bv.m20830m9(), (int) (c4962bv.m20833x1() & C18177fb.f54859s)).m27627k4(c3134k4));
        c5061vwArr[0] = c4962bv;
        return true;
    }
}
