package com.aspose.slides.internal.p017a9;

import com.aspose.slides.internal.p359qf.AbstractC9858kk;
import com.aspose.slides.internal.p359qf.C9856du;
import com.aspose.slides.internal.p421tk.C10988bz;
import com.aspose.slides.internal.p421tk.C11023t6;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.a9.to */
/* JADX INFO: loaded from: classes3.dex */
public class C1312to extends AbstractC9858kk {
    @Override // com.aspose.slides.internal.p359qf.AbstractC9858kk
    /* JADX INFO: renamed from: x1 */
    public void mo7795x1(C10988bz c10988bz, C9856du c9856du) {
        C11023t6 c11023t6 = (C11023t6) c10988bz;
        C12018u4 c12018u4 = new C12018u4(c11023t6.m53381to().mo62062k4().Clone().Clone());
        c12018u4.m56771x1(c9856du.m48669yj());
        int iM53380kk = c11023t6.m53380kk() & 255;
        if (iM53380kk == 0) {
            c9856du.m48651k4(c12018u4);
            return;
        }
        if (iM53380kk == 1) {
            c9856du.m48653kk().m56761kk(c12018u4);
            return;
        }
        if (iM53380kk == 2) {
            c9856du.m48653kk().m56766to(c12018u4);
            return;
        }
        if (iM53380kk == 3) {
            c9856du.m48653kk().m56746du(c12018u4);
        } else if (iM53380kk == 4) {
            c9856du.m48653kk().m56774x1(c12018u4);
        } else {
            if (iM53380kk != 5) {
                return;
            }
            c9856du.m48653kk().m56753k4(c12018u4);
        }
    }
}
