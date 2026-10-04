package com.aspose.slides.internal.p290n3;

import com.aspose.slides.internal.p040bg.AbstractC1692du;
import com.aspose.slides.internal.p040bg.AbstractC1701up;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p349q3.C9730x1;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.n3.k4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6717k4 extends AbstractC1692du {
    public AbstractC6717k4(AbstractC1701up abstractC1701up) {
        super(abstractC1701up);
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: h4 */
    public void mo7733h4(C9723vw c9723vw, C3585h4 c3585h4) {
        C9730x1 c9730x1 = (C9730x1) c9723vw;
        if (c3585h4.m14488dy() != null) {
            C12014ne c12014ne = new C12014ne((int) ((((long) c9730x1.m47809k4().m57778k4()) - (c9730x1.m47816x1() & 4294967295L)) & 4294967295L), (int) ((((long) c9730x1.m47809k4().m57783x1()) - (c9730x1.m47816x1() & 4294967295L)) & 4294967295L), (int) ((c9730x1.m47816x1() & 4294967295L) * 2), (int) ((c9730x1.m47816x1() & 4294967295L) * 2));
            float fM47814kk = c9730x1.m47814kk();
            float fM47815to = c9730x1.m47815to();
            float f = 360.0f - (fM47814kk + fM47815to);
            double d = ((double) (f / 180.0f)) * 3.141592653589793d;
            C12025x6 c12025x6 = new C12025x6((float) ((C14116yg.m67495m9(d) * (c9730x1.m47816x1() & 4294967295L)) + ((double) c9730x1.m47809k4().m57778k4())), (float) ((C14116yg.m67470dy(d) * (c9730x1.m47816x1() & 4294967295L)) + ((double) c9730x1.m47809k4().m57783x1())));
            if (c3585h4.m14582yj()) {
                c3585h4.m14556up().m55545k4(c12014ne.Clone(), f, fM47815to);
            } else {
                mo7778k4(c12014ne.Clone(), c12025x6.Clone(), f, fM47815to, c3585h4);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo7778k4(C12014ne c12014ne, C12025x6 c12025x6, float f, float f2, C3585h4 c3585h4);

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: m9 */
    public boolean mo9136m9(C9723vw c9723vw, C3585h4 c3585h4) {
        return !c3585h4.m14582yj();
    }
}
