package com.aspose.slides.internal.p017a9;

import com.aspose.slides.internal.p359qf.AbstractC9858kk;
import com.aspose.slides.internal.p359qf.C9856du;
import com.aspose.slides.internal.p421tk.C10988bz;
import com.aspose.slides.internal.p421tk.C11041xw;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.a9.du */
/* JADX INFO: loaded from: classes3.dex */
public class C1309du extends AbstractC9858kk {
    @Override // com.aspose.slides.internal.p359qf.AbstractC9858kk
    /* JADX INFO: renamed from: x1 */
    public void mo7795x1(C10988bz c10988bz, C9856du c9856du) {
        C11041xw c11041xw = (C11041xw) c10988bz;
        c9856du.m48654kk(c11041xw.m53448to() & 255);
        C12018u4 c12018u4M56768x1 = c9856du.m48640jd().m56768x1();
        c12018u4M56768x1.m56771x1(c9856du.m48669yj());
        int iM53447kk = c11041xw.m53447kk() & 255;
        if (iM53447kk == 0) {
            c9856du.m48651k4(c12018u4M56768x1);
            return;
        }
        if (iM53447kk == 1) {
            c9856du.m48653kk().m56761kk(c12018u4M56768x1);
            return;
        }
        if (iM53447kk == 2) {
            c9856du.m48653kk().m56766to(c12018u4M56768x1);
            return;
        }
        if (iM53447kk == 3) {
            c9856du.m48653kk().m56746du(c12018u4M56768x1);
        } else if (iM53447kk == 4) {
            c9856du.m48653kk().m56774x1(c12018u4M56768x1);
        } else {
            if (iM53447kk != 5) {
                return;
            }
            c9856du.m48653kk().m56753k4(c12018u4M56768x1);
        }
    }
}
