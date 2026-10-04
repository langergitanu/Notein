package com.aspose.slides.internal.p094dw;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p349q3.C9658ix;
import com.aspose.slides.internal.p349q3.C9723vw;

/* JADX INFO: renamed from: com.aspose.slides.internal.dw.rv */
/* JADX INFO: loaded from: classes3.dex */
public class C3455rv {
    /* JADX INFO: renamed from: k4 */
    public static boolean m14013k4(C9723vw[] c9723vwArr, AbstractC3150x6 abstractC3150x6) {
        boolean zM13952k4;
        C9658ix c9658ix;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C9658ix c9658ix2 = new C9658ix(c9723vwArr[0]);
        c9658ix2.m47292to(c3134k4.m13384uz());
        long jM13384uz = c3134k4.m13384uz();
        c3134k4.m13371ck().seek(-4L, 1);
        int i = (int) jM13384uz;
        if (i == 0) {
            C9658ix[] c9658ixArr = {c9658ix2};
            zM13952k4 = new C3394ck().m13952k4(c9658ixArr, abstractC3150x6);
            c9658ix = c9658ixArr[0];
        } else if (i == 726027589) {
            C9658ix[] c9658ixArr2 = {c9658ix2};
            zM13952k4 = new C3421jd(c9658ixArr2[0].m47761bv().m13620fa()).m13979k4(c9658ixArr2, abstractC3150x6);
            c9658ix = c9658ixArr2[0];
        } else if (i != 1128875079) {
            C9658ix[] c9658ixArr3 = {c9658ix2};
            zM13952k4 = new C3428ks().m13986k4(c9658ixArr3, abstractC3150x6);
            c9658ix = c9658ixArr3[0];
        } else {
            C9658ix[] c9658ixArr4 = {c9658ix2};
            zM13952k4 = new C3493yj().m14051k4(c9658ixArr4, abstractC3150x6);
            c9658ix = c9658ixArr4[0];
        }
        c9723vwArr[0] = c9658ix;
        return zM13952k4;
    }
}
