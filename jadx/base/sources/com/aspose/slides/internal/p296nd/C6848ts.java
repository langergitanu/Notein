package com.aspose.slides.internal.p296nd;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.internal.p042bn.C1718e0;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.nd.ts */
/* JADX INFO: loaded from: classes4.dex */
public class C6848ts extends AbstractC6841rv {
    @Override // com.aspose.slides.internal.p296nd.AbstractC6841rv
    /* JADX INFO: renamed from: x1 */
    public void mo26875x1(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C1718e0 c1718e0 = (C1718e0) c1752sv;
        C11896dy c11896dy = new C11896dy(c11315h4.m54443rv());
        int i = 0;
        for (int i2 = 0; i2 < (c1718e0.m9229k4() & 65535); i2++) {
            int i3 = c1718e0.m9234x1()[i2] & 65535;
            C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, i3);
            for (int i4 = 0; i4 < i3; i4++) {
                c1718e0.m9233kk()[i + i4].m58124x1().CloneTo(c12025x6Arr[i4]);
            }
            c11896dy.m55564kk(c12025x6Arr);
            c11896dy.m55567m9();
            i += i3;
        }
        if (c11315h4.m54403dy() != null) {
            abstractC12008jd.mo17527k4(c11315h4.m54403dy(), c11896dy);
        }
        if (c11315h4.m54395c5() != null) {
            abstractC12008jd.mo17540k4(c11315h4.m54395c5(), c11896dy);
        }
    }
}
