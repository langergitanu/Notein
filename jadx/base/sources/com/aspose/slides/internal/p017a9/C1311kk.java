package com.aspose.slides.internal.p017a9;

import com.aspose.slides.internal.p359qf.AbstractC9858kk;
import com.aspose.slides.internal.p359qf.C9856du;
import com.aspose.slides.internal.p421tk.C10988bz;
import com.aspose.slides.internal.p421tk.C10998f9;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.a9.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C1311kk extends AbstractC9858kk {
    @Override // com.aspose.slides.internal.p359qf.AbstractC9858kk
    /* JADX INFO: renamed from: x1 */
    public void mo7795x1(C10988bz c10988bz, C9856du c9856du) {
        C10998f9 c10998f9 = (C10998f9) c10988bz;
        c9856du.m48664x1(c10998f9.m53256to() & 255);
        C12018u4 c12018u4 = new C12018u4(c9856du.m48631c5());
        c12018u4.m56771x1(c9856du.m48669yj());
        int iM53255kk = c10998f9.m53255kk() & 255;
        if (iM53255kk == 0) {
            c9856du.m48651k4(c12018u4);
            return;
        }
        if (iM53255kk == 1) {
            c9856du.m48653kk().m56761kk(c12018u4);
            return;
        }
        if (iM53255kk == 2) {
            c9856du.m48653kk().m56766to(c12018u4);
            return;
        }
        if (iM53255kk == 3) {
            c9856du.m48653kk().m56746du(c12018u4);
        } else if (iM53255kk == 4) {
            c9856du.m48653kk().m56774x1(c12018u4);
        } else {
            if (iM53255kk != 5) {
                return;
            }
            c9856du.m48653kk().m56753k4(c12018u4);
        }
    }
}
