package com.aspose.slides.internal.p094dw;

import OooO0O0.OooO0OO;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p260ly.C6288wl;
import com.aspose.slides.internal.p349q3.C9657ii;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p422tl.C11057ne;
import com.aspose.slides.internal.p488x0.C12350uz;

/* JADX INFO: renamed from: com.aspose.slides.internal.dw.yo */
/* JADX INFO: loaded from: classes3.dex */
public class C3495yo {
    /* JADX INFO: renamed from: k4 */
    public static boolean m14053k4(C9723vw[] c9723vwArr, AbstractC3150x6 abstractC3150x6) {
        long position = abstractC3150x6.getPosition() - 8;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C9657ii c9657ii = new C9657ii(c9723vwArr[0]);
        c9657ii.m47281k4((C12350uz) OooO0OO.OooO0O0(c3134k4));
        c9657ii.m47280k4(c3134k4.m13384uz() & 4294967295L);
        c9657ii.m47279k4(c3134k4.m13374ix());
        c9657ii.m47288x1(c3134k4.m13374ix());
        c9657ii.m47289x1(c3134k4.m13384uz());
        int iM47277h4 = (int) c9657ii.m47277h4();
        C6288wl[] c6288wlArr = new C6288wl[iM47277h4];
        for (int i = 0; i < iM47277h4; i++) {
            c6288wlArr[i] = (C6288wl) new C11057ne(position, true).m53489k4(c3134k4);
        }
        c9657ii.m47282k4(c6288wlArr);
        c9723vwArr[0] = c9657ii;
        return true;
    }
}
