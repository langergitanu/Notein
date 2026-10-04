package com.aspose.slides.internal.p336pg;

import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p183ij.C5087zj;
import com.aspose.slides.internal.p191it.AbstractC5122fa;
import com.aspose.slides.internal.p472w8.C11913yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.pg.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9438k4 extends AbstractC5122fa {
    @Override // com.aspose.slides.internal.p191it.AbstractC5122fa
    /* JADX INFO: renamed from: du */
    public void mo21978du(C5061vw c5061vw, C4201h4 c4201h4) {
        C5087zj c5087zj = (C5087zj) c5061vw;
        int iM21732k4 = (int) c5087zj.m21732k4();
        if (iM21732k4 == 1) {
            c4201h4.m16728kk(new C11913yj());
            return;
        }
        if (iM21732k4 == 2) {
            c4201h4.m16747t6().m55769k4(c5087zj.m21090x1().m7988k4(), 0);
        } else if (iM21732k4 == 3) {
            c4201h4.m16747t6().m55769k4(c5087zj.m21090x1().m7988k4(), 1);
        } else {
            if (iM21732k4 != 4) {
                return;
            }
            c4201h4.m16728kk(c5087zj.m21090x1().m7988k4());
        }
    }
}
