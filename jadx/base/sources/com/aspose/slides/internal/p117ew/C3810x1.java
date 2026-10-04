package com.aspose.slides.internal.p117ew;

import com.aspose.slides.internal.p102e8.AbstractC3589to;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p349q3.C9705sv;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.ew.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C3810x1 extends AbstractC3589to {
    /* JADX INFO: renamed from: h4 */
    public static void m15217h4(C9723vw c9723vw, C3585h4 c3585h4) {
        C9705sv c9705sv = (C9705sv) c9723vw;
        if (c9705sv.m47653kk() == null) {
            if (c9705sv.m47654x1() == 5) {
                c3585h4.m14542qw();
                return;
            }
            return;
        }
        C12018u4 c12018u4M25634kk = c9705sv.m47653kk().m25634kk();
        c12018u4M25634kk.m56771x1(c3585h4.m14565x1());
        int iM47654x1 = (int) c9705sv.m47654x1();
        if (iM47654x1 == 1) {
            c3585h4.m14544s7().m56761kk(c12018u4M25634kk);
            return;
        }
        if (iM47654x1 == 2) {
            c3585h4.m14544s7().m56766to(c12018u4M25634kk);
            return;
        }
        if (iM47654x1 == 3) {
            c3585h4.m14544s7().m56746du(c12018u4M25634kk);
        } else if (iM47654x1 == 4) {
            c3585h4.m14544s7().m56774x1(c12018u4M25634kk);
        } else {
            if (iM47654x1 != 5) {
                return;
            }
            c3585h4.m14532kk(c12018u4M25634kk);
        }
    }

    @Override // com.aspose.slides.internal.p102e8.AbstractC3589to
    /* JADX INFO: renamed from: to */
    public void mo9134to(C9723vw c9723vw, C3585h4 c3585h4) {
        m15217h4(c9723vw, c3585h4);
    }
}
