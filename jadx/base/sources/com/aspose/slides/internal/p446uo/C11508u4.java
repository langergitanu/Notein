package com.aspose.slides.internal.p446uo;

import com.aspose.slides.internal.p018aa.C1326ne;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p110ek.AbstractC3752x1;
import com.aspose.slides.internal.p110ek.C3749k4;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4055uz;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p488x0.C12347u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.uo.u4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11508u4 extends AbstractC3752x1 {
    @Override // com.aspose.slides.internal.p110ek.AbstractC3752x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo15061x1(C4047sv[] c4047svArr, AbstractC3150x6 abstractC3150x6) {
        C4055uz c4055uz = new C4055uz(c4047svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c4055uz.m16138k4(c3134k4.m13381rv());
        c4055uz.m16146x1(c3134k4.m13381rv());
        c4055uz.m16142kk(c3134k4.m13381rv());
        c4055uz.m16135k4(c3134k4.m13382u4() & 65535);
        if ((c4055uz.m16144to() & 4) == 4 || (c4055uz.m16144to() & 2) == 2) {
            c4055uz.m16136k4((C12347u4) new C1326ne().m7811k4(c3134k4));
        }
        c4055uz.m16139k4(c3134k4.m13372dy((c4055uz.m16141kk() % 2) + c4055uz.m16141kk()));
        c4055uz.m16137k4(AbstractC6747ar.m26635ix().mo26682x1(c4055uz.m16143m9(), 0, c4055uz.m16141kk()));
        long jM16068yj = (((c4055uz.m16068yj() & 4294967295L) * 2) & 4294967295L) - (abstractC3150x6.getPosition() - (4294967295L & c4055uz.m16065rv()));
        if (jM16068yj > 0 && jM16068yj / 2 == c4055uz.m16141kk()) {
            c4055uz.m16140k4(C3749k4.m15049k4((int) c4055uz.m16141kk(), c3134k4));
        }
        c4047svArr[0] = c4055uz;
        return true;
    }
}
