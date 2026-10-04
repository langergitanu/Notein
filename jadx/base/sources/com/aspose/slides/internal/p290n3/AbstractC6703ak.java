package com.aspose.slides.internal.p290n3;

import com.aspose.slides.internal.p040bg.AbstractC1692du;
import com.aspose.slides.internal.p040bg.AbstractC1701up;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p349q3.C9722vt;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.n3.ak */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6703ak extends AbstractC1692du {
    public AbstractC6703ak(AbstractC1701up abstractC1701up) {
        super(abstractC1701up);
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: h4 */
    public void mo7733h4(C9723vw c9723vw, C3585h4 c3585h4) {
        C12014ne c12014neClone = ((C9722vt) c9723vw).m47758k4().m57842dy().Clone();
        if (c3585h4.m14488dy() == null) {
            c12014neClone.m56684x1(c12014neClone.m56663c5() - 1);
            c12014neClone.m56671k4(c12014neClone.m56683x1() - 1);
        }
        if (c3585h4.m14582yj()) {
            c3585h4.m14556up().m55579x1(c12014neClone.Clone());
        } else {
            mo7737k4(c12014neClone.Clone(), c3585h4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo7737k4(C12014ne c12014ne, C3585h4 c3585h4);

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: m9 */
    public boolean mo9136m9(C9723vw c9723vw, C3585h4 c3585h4) {
        return !c3585h4.m14582yj();
    }
}
