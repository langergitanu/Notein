package com.aspose.slides.internal.p283mv;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1760uz;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p190is.C5114k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p319ok.C7112ne;
import com.aspose.slides.internal.p498xe.C12518u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.mv.u4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6598u4 extends AbstractC5117x1 {
    @Override // com.aspose.slides.internal.p190is.AbstractC5117x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo21976x1(C1752sv[] c1752svArr, AbstractC3150x6 abstractC3150x6) {
        C1760uz c1760uz = new C1760uz(c1752svArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c1760uz.m9470k4(c3134k4.m13381rv());
        c1760uz.m9478x1(c3134k4.m13381rv());
        c1760uz.m9474kk(c3134k4.m13381rv());
        c1760uz.m9467k4(c3134k4.m13382u4() & 65535);
        if ((c1760uz.m9476to() & 4) == 4 || (c1760uz.m9476to() & 2) == 2) {
            c1760uz.m9468k4((C12518u4) new C7112ne().m27636k4(c3134k4));
        }
        c1760uz.m9471k4(c3134k4.m13372dy((c1760uz.m9473kk() % 2) + c1760uz.m9473kk()));
        c1760uz.m9469k4(AbstractC6747ar.m26635ix().mo26682x1(c1760uz.m9475m9(), 0, c1760uz.m9473kk()));
        long jM9402up = (((c1760uz.m9402up() & 4294967295L) * 2) & 4294967295L) - (abstractC3150x6.getPosition() - (4294967295L & c1760uz.m9400ks()));
        if (jM9402up > 0 && jM9402up / 2 == c1760uz.m9473kk()) {
            c1760uz.m9472k4(C5114k4.m21964k4((int) c1760uz.m9473kk(), c3134k4));
        }
        c1752svArr[0] = c1760uz;
        return true;
    }
}
