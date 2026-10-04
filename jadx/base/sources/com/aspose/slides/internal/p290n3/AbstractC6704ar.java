package com.aspose.slides.internal.p290n3;

import com.aspose.slides.internal.p040bg.AbstractC1692du;
import com.aspose.slides.internal.p040bg.AbstractC1701up;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p349q3.C9744yn;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.n3.ar */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6704ar extends AbstractC1692du {
    public AbstractC6704ar(AbstractC1701up abstractC1701up) {
        super(abstractC1701up);
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: h4 */
    public void mo7733h4(C9723vw c9723vw, C3585h4 c3585h4) {
        C9744yn c9744yn = (C9744yn) c9723vw;
        C12016rv[] c12016rvArr = (C12016rv[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12016rv.class), (int) (((c9744yn.m47896x1() & 4294967295L) + 1) & 4294967295L)));
        C12016rv c12016rvM14558uz = c3585h4.m14582yj() ? c3585h4.m14558uz() : c3585h4.m14554u4();
        int i = 0;
        C12016rv c12016rv = c12016rvArr[0];
        while (true) {
            c12016rvM14558uz.CloneTo(c12016rv);
            if (i >= c9744yn.m47895kk().length) {
                break;
            }
            c12016rvM14558uz = c9744yn.m47895kk()[i].m57707to();
            i++;
            c12016rv = c12016rvArr[i];
        }
        if (c3585h4.m14582yj()) {
            c3585h4.m14556up().m55581x1(c12016rvArr);
            c3585h4.m14573x1(c12016rvArr[c12016rvArr.length - 1].Clone());
        } else {
            if (c3585h4.m14488dy() != null) {
                mo7773k4(c12016rvArr, c3585h4);
            }
            c3585h4.m14518k4(c12016rvArr[c12016rvArr.length - 1].Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo7773k4(C12016rv[] c12016rvArr, C3585h4 c3585h4);

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: m9 */
    public boolean mo9136m9(C9723vw c9723vw, C3585h4 c3585h4) {
        return !c3585h4.m14582yj();
    }
}
