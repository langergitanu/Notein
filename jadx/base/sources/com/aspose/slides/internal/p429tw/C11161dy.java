package com.aspose.slides.internal.p429tw;

import com.aspose.slides.internal.p040bg.AbstractC1693dy;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p260ly.C6291yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p349q3.C9632d3;
import com.aspose.slides.internal.p349q3.C9723vw;

/* JADX INFO: renamed from: com.aspose.slides.internal.tw.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C11161dy extends AbstractC1693dy {
    @Override // com.aspose.slides.internal.p040bg.AbstractC1693dy
    /* JADX INFO: renamed from: h4 */
    public void mo9137h4(C9723vw c9723vw, C3585h4 c3585h4) {
        C9632d3 c9632d3 = (C9632d3) c9723vw;
        C6291yj c6291yj = (C6291yj) C7019kk.m27452k4((Object) c3585h4.m14577x6().m14595k4(c9632d3.m47069k4()), C6291yj.class);
        if (c6291yj != null) {
            int[] iArrM25734kk = c6291yj.m25734kk();
            for (int i = 0; i < ((int) c9632d3.m47073kk()); i++) {
                if (i < c6291yj.m25735to().length) {
                    iArrM25734kk[(int) (((c9632d3.m47076x1() & 4294967295L) + ((long) i)) & 4294967295L)] = c9632d3.m47075to()[i].m25582h4();
                }
            }
            c6291yj.m25732k4(iArrM25734kk);
        }
    }
}
