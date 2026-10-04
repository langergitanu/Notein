package com.aspose.slides.internal.p073d3;

import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p218k5.AbstractC5610dy;
import com.aspose.slides.internal.p218k5.AbstractC5612k4;
import com.aspose.slides.internal.p349q3.C9649ga;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.d3.m9 */
/* JADX INFO: loaded from: classes3.dex */
public class C3014m9 extends AbstractC5610dy {
    public C3014m9(AbstractC5612k4 abstractC5612k4) {
        super(abstractC5612k4);
    }

    @Override // com.aspose.slides.internal.p218k5.AbstractC5610dy
    /* JADX INFO: renamed from: k4 */
    public void mo12689k4(C9649ga c9649ga, C3585h4 c3585h4) {
        int i;
        C12009k4 c12009k4M57639x1 = c9649ga.m47239x6() != null ? c9649ga.m47239x6().m57639x1(c3585h4.m14482ck()) : null;
        C11913yj c11913yj = new C11913yj();
        int iM47229m9 = c9649ga.m47229m9();
        int iM47212dy = c9649ga.m47212dy();
        int iM47228ks = c9649ga.m47228ks();
        int iM47231rv = c9649ga.m47231rv();
        if (c12009k4M57639x1 != null) {
            boolean z = C14116yg.m67506x1(iM47229m9) != C14116yg.m67506x1(iM47228ks);
            boolean z2 = C14116yg.m67506x1(iM47212dy) != C14116yg.m67506x1(iM47231rv);
            if (z) {
                i = z2 ? 2 : 4;
            } else if (z2) {
                i = 6;
            }
            c12009k4M57639x1.m56342to(i);
        }
        m9145x1(c9649ga.m47240yj(), c12009k4M57639x1, m22996k4(c9649ga.m47232to(), c9649ga.m47215h4(), iM47229m9, iM47212dy).Clone().Clone(), m22996k4(c9649ga.m47236x1(), c9649ga.m47225kk(), iM47228ks, iM47231rv).Clone().Clone(), C12003du.f40505to.Clone(), c11913yj, c3585h4);
    }
}
