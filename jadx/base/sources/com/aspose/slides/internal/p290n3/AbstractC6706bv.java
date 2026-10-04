package com.aspose.slides.internal.p290n3;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.internal.p040bg.AbstractC1692du;
import com.aspose.slides.internal.p040bg.AbstractC1701up;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p349q3.C9677my;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.n3.bv */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6706bv extends AbstractC1692du {
    public AbstractC6706bv(AbstractC1701up abstractC1701up) {
        super(abstractC1701up);
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: h4 */
    public void mo7733h4(C9723vw c9723vw, C3585h4 c3585h4) {
        C9677my c9677my = (C9677my) c9723vw;
        C11896dy c11896dy = new C11896dy();
        int i = 0;
        for (int i2 = 0; i2 < (c9677my.m47462x1() & 4294967295L); i2++) {
            int i3 = (int) c9677my.m47461to()[i2];
            C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, i3);
            for (int i4 = 0; i4 < i3; i4++) {
                c9677my.m47453h4()[i + i4].m57706kk().CloneTo(c12025x6Arr[i4]);
            }
            c11896dy.m55564kk(c12025x6Arr);
            i += i3;
        }
        if (c3585h4.m14582yj()) {
            c3585h4.m14556up().m55540k4(c11896dy, false);
        } else if (c3585h4.m14488dy() != null) {
            mo7776k4(c11896dy, c3585h4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo7776k4(C11896dy c11896dy, C3585h4 c3585h4);

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: m9 */
    public boolean mo9136m9(C9723vw c9723vw, C3585h4 c3585h4) {
        return !c3585h4.m14582yj();
    }
}
