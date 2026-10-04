package com.aspose.slides.internal.p442uj;

import com.aspose.slides.internal.p019ac.C1357wl;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p183ij.C4995ii;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p206jj.C5488ne;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.internal.p509xs.AbstractC12603k4;
import o00OoOo.C25068OooO00o;

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.yo */
/* JADX INFO: loaded from: classes4.dex */
public class C11439yo extends AbstractC12603k4 {
    @Override // com.aspose.slides.internal.p509xs.AbstractC12603k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo54490k4(C5061vw[] c5061vwArr, AbstractC3150x6 abstractC3150x6) {
        long position = abstractC3150x6.getPosition() - 8;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C4995ii c4995ii = new C4995ii(c5061vwArr[0]);
        c4995ii.m21101k4((C12521uz) C25068OooO00o.OooO00o(c3134k4));
        c4995ii.m21100k4(c3134k4.m13384uz() & 4294967295L);
        c4995ii.m21099k4(c3134k4.m13374ix());
        c4995ii.m21108x1(c3134k4.m13374ix());
        c4995ii.m21109x1(c3134k4.m13384uz());
        int iM21097h4 = (int) c4995ii.m21097h4();
        C1357wl[] c1357wlArr = new C1357wl[iM21097h4];
        for (int i = 0; i < iM21097h4; i++) {
            c1357wlArr[i] = (C1357wl) new C5488ne(position, 2).m22578k4(c3134k4);
        }
        c4995ii.m21102k4(c1357wlArr);
        c5061vwArr[0] = c4995ii;
        return true;
    }
}
