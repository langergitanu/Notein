package com.aspose.slides.internal.p290n3;

import com.aspose.slides.internal.p040bg.AbstractC1692du;
import com.aspose.slides.internal.p040bg.AbstractC1701up;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p349q3.C9636dq;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.n3.m9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6721m9 extends AbstractC1692du {
    public AbstractC6721m9(AbstractC1701up abstractC1701up) {
        super(abstractC1701up);
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: h4 */
    public void mo7733h4(C9723vw c9723vw, C3585h4 c3585h4) {
        C9636dq c9636dq = (C9636dq) c9723vw;
        if (c3585h4.m14582yj()) {
            c3585h4.m14556up().m55544k4(c9636dq.m47121k4().m57842dy().Clone());
        } else {
            mo7765k4(c9636dq.m47121k4().m57842dy().Clone(), c3585h4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo7765k4(C12014ne c12014ne, C3585h4 c3585h4);

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: m9 */
    public boolean mo9136m9(C9723vw c9723vw, C3585h4 c3585h4) {
        return !c3585h4.m14582yj();
    }
}
