package com.aspose.slides.internal.p290n3;

import com.aspose.slides.internal.p040bg.AbstractC1692du;
import com.aspose.slides.internal.p040bg.AbstractC1701up;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p349q3.C9656ig;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p475wh.C12016rv;

/* JADX INFO: renamed from: com.aspose.slides.internal.n3.ix */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6715ix extends AbstractC1692du {
    public AbstractC6715ix(AbstractC1701up abstractC1701up) {
        super(abstractC1701up);
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: h4 */
    public void mo7733h4(C9723vw c9723vw, C3585h4 c3585h4) {
        C9656ig c9656ig = (C9656ig) c9723vw;
        if ((c9656ig.m47276x1() & 4294967295L) == 0) {
            return;
        }
        int iM47276x1 = (int) (((c9656ig.m47276x1() & 4294967295L) + 1) & 4294967295L);
        C12016rv[] c12016rvArr = new C12016rv[iM47276x1];
        int i = 0;
        for (int i2 = 0; i2 < iM47276x1; i2++) {
            c12016rvArr[i2] = new C12016rv();
        }
        C12016rv c12016rvM14558uz = c3585h4.m14582yj() ? c3585h4.m14558uz() : c3585h4.m14554u4();
        C12016rv c12016rv = c12016rvArr[0];
        while (true) {
            c12016rvM14558uz.CloneTo(c12016rv);
            if (i >= c9656ig.m47275kk().length) {
                break;
            }
            c12016rvM14558uz = c9656ig.m47275kk()[i].m57781kk();
            i++;
            c12016rv = c12016rvArr[i];
        }
        if (c3585h4.m14582yj()) {
            c3585h4.m14556up().m55553k4(c12016rvArr);
            c3585h4.m14573x1(c12016rvArr[iM47276x1 - 1].Clone());
        } else {
            if (c3585h4.m14488dy() != null) {
                mo7772k4(c12016rvArr, c3585h4);
            }
            c3585h4.m14518k4(c12016rvArr[iM47276x1 - 1].Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo7772k4(C12016rv[] c12016rvArr, C3585h4 c3585h4);

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: m9 */
    public boolean mo9136m9(C9723vw c9723vw, C3585h4 c3585h4) {
        return !c3585h4.m14582yj();
    }
}
