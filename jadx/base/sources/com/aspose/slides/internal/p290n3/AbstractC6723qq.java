package com.aspose.slides.internal.p290n3;

import com.aspose.slides.internal.p040bg.AbstractC1692du;
import com.aspose.slides.internal.p040bg.AbstractC1701up;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p349q3.C9680na;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.n3.qq */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6723qq extends AbstractC1692du {
    public AbstractC6723qq(AbstractC1701up abstractC1701up) {
        super(abstractC1701up);
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: h4 */
    public void mo7733h4(C9723vw c9723vw, C3585h4 c3585h4) {
        C9680na c9680na = (C9680na) c9723vw;
        C12016rv[] c12016rvArr = (C12016rv[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12016rv.class), (int) c9680na.m47494x1()));
        for (int i = 0; i < c12016rvArr.length; i++) {
            c9680na.m47493kk()[i].m57781kk().CloneTo(c12016rvArr[i]);
        }
        if (c3585h4.m14582yj()) {
            c3585h4.m14556up().m55581x1(c12016rvArr);
        } else if (c3585h4.m14488dy() != null) {
            mo7734k4(c12016rvArr, c3585h4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo7734k4(C12016rv[] c12016rvArr, C3585h4 c3585h4);

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: m9 */
    public boolean mo9136m9(C9723vw c9723vw, C3585h4 c3585h4) {
        return !c3585h4.m14582yj();
    }
}
