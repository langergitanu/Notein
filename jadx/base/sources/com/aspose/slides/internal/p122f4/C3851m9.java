package com.aspose.slides.internal.p122f4;

import com.aspose.slides.internal.p037b9.AbstractC1668dy;
import com.aspose.slides.internal.p037b9.AbstractC1670k4;
import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C4987ga;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.f4.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C3851m9 extends AbstractC1668dy {

    /* JADX INFO: renamed from: x1 */
    private final C3845c5 f10503x1 = new C3845c5(this);

    @Override // com.aspose.slides.internal.p191it.AbstractC5125k4
    /* JADX INFO: renamed from: k4 */
    public AbstractC1670k4 mo15407k4() {
        return this.f10503x1;
    }

    @Override // com.aspose.slides.internal.p037b9.AbstractC1668dy
    /* JADX INFO: renamed from: k4 */
    public void mo9061k4(C4987ga c4987ga, C4201h4 c4201h4) {
        int i;
        C12009k4 c12009k4M58076x1 = c4987ga.m21062x6() != null ? c4987ga.m21062x6().m58076x1(c4201h4.m16682ck()) : null;
        C11913yj c11913yj = new C11913yj();
        int iM21052m9 = c4987ga.m21052m9();
        int iM21035dy = c4987ga.m21035dy();
        int iM21051ks = c4987ga.m21051ks();
        int iM21054rv = c4987ga.m21054rv();
        if (c12009k4M58076x1 != null) {
            boolean z = C14116yg.m67506x1(iM21052m9) != C14116yg.m67506x1(iM21051ks);
            boolean z2 = C14116yg.m67506x1(iM21035dy) != C14116yg.m67506x1(iM21054rv);
            if (z) {
                i = z2 ? 2 : 4;
            } else if (z2) {
                i = 6;
            }
            c12009k4M58076x1.m56342to(i);
        }
        m21983k4(c4987ga.m21063yj(), c12009k4M58076x1, m9060k4(c4987ga.m21055to(), c4987ga.m21038h4(), iM21052m9, iM21035dy).Clone().Clone(), m9060k4(c4987ga.m21059x1(), c4987ga.m21048kk(), iM21051ks, iM21054rv).Clone().Clone(), C12003du.f40505to.Clone(), c11913yj, c4201h4);
    }
}
