package com.aspose.slides.internal.p290n3;

import com.aspose.slides.internal.p040bg.AbstractC1692du;
import com.aspose.slides.internal.p040bg.AbstractC1701up;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p349q3.C9650gf;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.n3.rv */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6724rv extends AbstractC1692du {
    public AbstractC6724rv(AbstractC1701up abstractC1701up) {
        super(abstractC1701up);
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: h4 */
    public void mo7733h4(C9723vw c9723vw, C3585h4 c3585h4) {
        C9650gf c9650gf = (C9650gf) c9723vw;
        C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), (int) c9650gf.m47247x1()));
        for (int i = 0; i < c12025x6Arr.length; i++) {
            c9650gf.m47246kk()[i].m57706kk().CloneTo(c12025x6Arr[i]);
        }
        if (c3585h4.m14582yj()) {
            c3585h4.m14556up().m55555k4(c12025x6Arr);
        } else if (c3585h4.m14488dy() != null) {
            mo7766k4(c12025x6Arr, c3585h4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo7766k4(C12025x6[] c12025x6Arr, C3585h4 c3585h4);

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: m9 */
    public boolean mo9136m9(C9723vw c9723vw, C3585h4 c3585h4) {
        return !c3585h4.m14582yj();
    }
}
