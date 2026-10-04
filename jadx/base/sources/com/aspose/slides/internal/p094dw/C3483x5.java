package com.aspose.slides.internal.p094dw;

import OooO0O0.OooO0OO;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p260ly.C6288wl;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p349q3.C9750zm;
import com.aspose.slides.internal.p422tl.C11057ne;
import com.aspose.slides.internal.p488x0.C12350uz;

/* JADX INFO: renamed from: com.aspose.slides.internal.dw.x5 */
/* JADX INFO: loaded from: classes3.dex */
public class C3483x5 {
    /* JADX INFO: renamed from: k4 */
    public static boolean m14041k4(C9723vw[] c9723vwArr, AbstractC3150x6 abstractC3150x6) {
        long position = abstractC3150x6.getPosition() - 8;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C9750zm c9750zm = new C9750zm(c9723vwArr[0]);
        c9750zm.m47964k4((C12350uz) OooO0OO.OooO0O0(c3134k4));
        c9750zm.m47963k4(c3134k4.m13384uz() & 4294967295L);
        c9750zm.m47962k4(c3134k4.m13374ix());
        c9750zm.m47971x1(c3134k4.m13374ix());
        c9750zm.m47972x1(c3134k4.m13384uz());
        int iM47960h4 = (int) c9750zm.m47960h4();
        C6288wl[] c6288wlArr = new C6288wl[iM47960h4];
        for (int i = 0; i < iM47960h4; i++) {
            c6288wlArr[i] = (C6288wl) new C11057ne(position, false).m53489k4(c3134k4);
        }
        c9750zm.m47965k4(c6288wlArr);
        c9723vwArr[0] = c9750zm;
        return true;
    }
}
