package com.aspose.slides.internal.p442uj;

import com.aspose.slides.internal.p019ac.C1357wl;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p183ij.C5064wp;
import com.aspose.slides.internal.p206jj.C5488ne;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.internal.p509xs.AbstractC12603k4;
import o00OoOo.C25068OooO00o;

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.ts */
/* JADX INFO: loaded from: classes4.dex */
public class C11408ts extends AbstractC12603k4 {
    @Override // com.aspose.slides.internal.p509xs.AbstractC12603k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo54490k4(C5061vw[] c5061vwArr, AbstractC3150x6 abstractC3150x6) {
        long position = abstractC3150x6.getPosition() - 8;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C5064wp c5064wp = new C5064wp(c5061vwArr[0]);
        c5064wp.m21581k4((C12521uz) C25068OooO00o.OooO00o(c3134k4));
        c5064wp.m21579k4(c3134k4.m13384uz() & 4294967295L);
        c5064wp.m21578k4(c3134k4.m13384uz() & 4294967295L);
        c5064wp.m21586x1(c3134k4.m13384uz() & 4294967295L);
        c5064wp.m21580k4((C1357wl) new C5488ne(position, 1).m22578k4(c3134k4));
        c5061vwArr[0] = c5064wp;
        return true;
    }
}
