package com.aspose.slides.internal.p296nd;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.internal.p042bn.C1745qm;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.nd.bz */
/* JADX INFO: loaded from: classes4.dex */
public class C6803bz extends AbstractC6841rv {
    @Override // com.aspose.slides.internal.p296nd.AbstractC6841rv
    /* JADX INFO: renamed from: x1 */
    public void mo26875x1(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C1745qm c1745qm = (C1745qm) c1752sv;
        short sM9373k4 = c1745qm.m9373k4();
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, sM9373k4);
        for (int i = 0; i < sM9373k4; i++) {
            c1745qm.m9376x1()[i].m58124x1().CloneTo(c12025x6Arr[i]);
        }
        if (c11315h4.m54395c5() != null) {
            abstractC12008jd.mo17602x1(c11315h4.m54395c5(), c12025x6Arr);
        }
    }
}
