package com.aspose.slides.internal.p424tp;

import com.aspose.slides.internal.p091dt.C3222dy;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p349q3.C9691qk;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10971um;

/* JADX INFO: renamed from: com.aspose.slides.internal.tp.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11075k4 extends C3222dy {
    @Override // com.aspose.slides.internal.p091dt.C3222dy, com.aspose.slides.internal.p040bg.AbstractC1691ck
    /* JADX INFO: renamed from: h4 */
    public void mo9135h4(C9723vw c9723vw, C3585h4 c3585h4) {
        int iM14560vh;
        C10951c5 c10951c5 = (C10951c5) c3585h4.m14502k4();
        int iM47574k4 = ((C9691qk) c9723vw).m47574k4();
        if (iM47574k4 < 0) {
            iM14560vh = -iM47574k4;
            if (iM14560vh > c3585h4.m14560vh()) {
                iM14560vh = c3585h4.m14560vh();
            }
        } else {
            iM14560vh = c3585h4.m14560vh() - iM47574k4;
        }
        while (iM14560vh > 0) {
            C10951c5 c10951c52 = c10951c5.mo52902du() != null ? (C10951c5) c10951c5.m53116um() : c10951c5;
            if (c10951c52.mo52902du() != null) {
                c10951c52.m52907k4((C10971um) null);
            }
            if (c10951c52.m53116um() == null) {
                break;
            }
            c10951c5 = (C10951c5) c10951c52.m53116um();
            iM14560vh--;
        }
        c3585h4.m14524k4(c10951c5);
        super.mo9135h4(c9723vw, c3585h4);
    }
}
