package com.aspose.slides.internal.p290n3;

import com.aspose.slides.internal.p040bg.AbstractC1692du;
import com.aspose.slides.internal.p040bg.AbstractC1701up;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p349q3.C9710tq;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p475wh.C12016rv;

/* JADX INFO: renamed from: com.aspose.slides.internal.n3.up */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6729up extends AbstractC1692du {
    public AbstractC6729up(AbstractC1701up abstractC1701up) {
        super(abstractC1701up);
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: h4 */
    public void mo7733h4(C9723vw c9723vw, C3585h4 c3585h4) {
        C9710tq c9710tq = (C9710tq) c9723vw;
        if (c3585h4.m14582yj()) {
            c3585h4.m14556up().m55546k4(c3585h4.m14558uz().Clone(), c9710tq.m47680k4().m57781kk().Clone());
            c3585h4.m14573x1(c9710tq.m47680k4().m57781kk().Clone());
        } else {
            if (c3585h4.m14488dy() != null) {
                mo7763k4(c9710tq.m47680k4().m57781kk().Clone(), c3585h4);
            }
            c3585h4.m14518k4(c9710tq.m47680k4().m57781kk().Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo7763k4(C12016rv c12016rv, C3585h4 c3585h4);

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: m9 */
    public boolean mo9136m9(C9723vw c9723vw, C3585h4 c3585h4) {
        return !c3585h4.m14582yj();
    }
}
