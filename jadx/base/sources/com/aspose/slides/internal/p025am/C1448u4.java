package com.aspose.slides.internal.p025am;

import com.aspose.slides.internal.p049bx.C1886ne;
import com.aspose.slides.internal.p059c9.AbstractC1992x1;
import com.aspose.slides.internal.p059c9.C1989k4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4055uz;

/* JADX INFO: renamed from: com.aspose.slides.internal.am.u4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1448u4 extends AbstractC1992x1 {
    @Override // com.aspose.slides.internal.p059c9.AbstractC1992x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo8293x1(C4047sv c4047sv, AbstractC3150x6 abstractC3150x6) {
        C4055uz c4055uz = (C4055uz) c4047sv;
        C3149x1 c3149x1 = new C3149x1(abstractC3150x6);
        c3149x1.m13448k4(c4055uz.m16134k4());
        c3149x1.m13448k4(c4055uz.m16145x1());
        c3149x1.m13448k4(c4055uz.m16141kk());
        c3149x1.m13446k4(c4055uz.m16144to() & 65535);
        if ((c4055uz.m16144to() & 4) == 4 || (c4055uz.m16144to() & 2) == 2) {
            new C1886ne().m9806k4(c3149x1, c4055uz.m16133h4());
        }
        c3149x1.m13450k4(c4055uz.m16143m9());
        if (c4055uz.m16132dy() == null) {
            return true;
        }
        C1989k4.m10122k4(c4055uz.m16132dy(), c3149x1);
        return true;
    }
}
