package com.aspose.slides.internal.p344pt;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p132fj.C4040qm;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.qm */
/* JADX INFO: loaded from: classes4.dex */
public class C9526qm extends AbstractC9530rv {
    @Override // com.aspose.slides.internal.p344pt.AbstractC9530rv
    /* JADX INFO: renamed from: x1 */
    public void mo46684x1(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C4040qm c4040qm = (C4040qm) c4047sv;
        short sM16035k4 = c4040qm.m16035k4();
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, sM16035k4);
        for (int i = 0; i < sM16035k4; i++) {
            c4040qm.m16038x1()[i].m57706kk().CloneTo(c12025x6Arr[i]);
        }
        if (c3856h4.m15464c5() != null) {
            abstractC12008jd.mo17602x1(c3856h4.m15464c5(), c12025x6Arr);
        }
    }
}
