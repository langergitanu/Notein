package com.aspose.slides.internal.p442uj;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p183ij.C5054um;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p319ok.C7105h4;
import com.aspose.slides.internal.p509xs.AbstractC12603k4;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.uz */
/* JADX INFO: loaded from: classes4.dex */
public class C11414uz extends AbstractC12603k4 {
    @Override // com.aspose.slides.internal.p509xs.AbstractC12603k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo54490k4(C5061vw[] c5061vwArr, AbstractC3150x6 abstractC3150x6) {
        long position = abstractC3150x6.getPosition() - 8;
        C5054um c5054um = new C5054um(c5061vwArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c5054um.m21518k4(c3134k4.m13384uz());
        c5054um.m21527x1(c3134k4.m13384uz() & 4294967295L);
        c5054um.m21522kk(c3134k4.m13384uz());
        c5054um.m21525to(c3134k4.m13384uz());
        c5054um.m21513du(c3134k4.m13384uz());
        c5054um.m21516h4(c3134k4.m13384uz());
        c5054um.m21519k4(new C7105h4(position, c5054um.m21560lr(), c5054um.m21521kk(), c5054um.m21524to(), c5054um.m21515h4(), c5054um.m21523m9(), (int) (c5054um.m21526x1() & C18177fb.f54859s)).m27627k4(c3134k4));
        c5061vwArr[0] = c5054um;
        return true;
    }
}
