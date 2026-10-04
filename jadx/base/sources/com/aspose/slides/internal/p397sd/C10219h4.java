package com.aspose.slides.internal.p397sd;

import com.aspose.slides.internal.p107eg.C3684du;
import com.aspose.slides.internal.p107eg.C3685dy;
import com.aspose.slides.internal.p107eg.C3690m9;
import com.aspose.slides.internal.p107eg.C3691to;
import com.aspose.slides.internal.p284mx.C6618k4;
import com.aspose.slides.internal.p284mx.C6619kk;
import com.aspose.slides.internal.p558zz.C13637dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.sd.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10219h4 {
    /* JADX INFO: renamed from: k4 */
    public final C13637dy m50053k4(C6618k4 c6618k4) {
        C3684du c3684du = (C3684du) c6618k4.m26396x1(C6619kk.f18348v4);
        C3690m9 c3690m9 = (C3690m9) c6618k4.m26396x1(C6619kk.f18318du);
        C3685dy c3685dy = (C3685dy) c6618k4.m26396x1(C6619kk.f18325h4);
        int iM15000h4 = ((C3691to) c6618k4.m26396x1(C6619kk.f18329kk)).m15000h4();
        int iM14957du = c3684du.m14957du();
        int iM14964du = c3685dy.m14964du();
        C10214c5 c10214c5 = new C10214c5();
        for (int i = 0; i < iM14957du; i++) {
            int iM14959k4 = c3684du.m14959k4(i);
            for (int i2 = 0; i2 < iM14964du; i2++) {
                c10214c5.m50016k4(c3684du.m14960k4(i, i2) - (((((iM15000h4 / 2) + (c3690m9.m14993x1(i2) * (iM14959k4 * 64))) / iM15000h4) + 32) / 64));
            }
        }
        c10214c5.m50015k4();
        byte[] bArrM50017x1 = c10214c5.m50017x1();
        int i3 = iM14957du * 2;
        C13637dy c13637dyM62959fa = C13637dy.m62959fa(bArrM50017x1.length + 8 + i3);
        c13637dyM62959fa.m62968to(0, 0);
        c13637dyM62959fa.m62968to(2, iM14957du);
        c13637dyM62959fa.m62966kk(4, c3684du.m14958h4());
        for (int i4 = 0; i4 < iM14957du; i4++) {
            int i5 = i4 * 2;
            c13637dyM62959fa.m62961k4(i5 + 8, (byte) c3684du.m14959k4(i4));
            c13637dyM62959fa.m62961k4(i5 + 9, (byte) c3684du.m14961x1(i4));
        }
        c13637dyM62959fa.m62963k4(i3 + 8, bArrM50017x1);
        return c13637dyM62959fa;
    }
}
