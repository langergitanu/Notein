package com.aspose.slides.internal.p290n3;

import com.aspose.slides.internal.p040bg.AbstractC1692du;
import com.aspose.slides.internal.p040bg.AbstractC1701up;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p349q3.C9737y2;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.n3.yj */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6738yj extends AbstractC1692du {
    public AbstractC6738yj(AbstractC1701up abstractC1701up) {
        super(abstractC1701up);
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: h4 */
    public void mo7733h4(C9723vw c9723vw, C3585h4 c3585h4) {
        AbstractC12024x1 abstractC12024x1M14479c5;
        C9737y2 c9737y2 = (C9737y2) c9723vw;
        C12014ne c12014neClone = c9737y2.m47853k4().m57842dy().Clone();
        C12018u4 c12018u4M56768x1 = c3585h4.m14544s7().m56768x1();
        c12018u4M56768x1.m56773x1(c12014neClone.Clone());
        if (mo7770k4(c12018u4M56768x1, c3585h4) || (abstractC12024x1M14479c5 = c3585h4.m14479c5()) == null) {
            return;
        }
        mo7769k4(abstractC12024x1M14479c5, c9737y2.m47858kk().m25634kk(), c3585h4);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo7769k4(AbstractC12024x1 abstractC12024x1, C12018u4 c12018u4, C3585h4 c3585h4);

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo7770k4(C12018u4 c12018u4, C3585h4 c3585h4);

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: m9 */
    public boolean mo9136m9(C9723vw c9723vw, C3585h4 c3585h4) {
        return true;
    }
}
