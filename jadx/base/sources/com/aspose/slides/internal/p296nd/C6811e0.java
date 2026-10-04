package com.aspose.slides.internal.p296nd;

import com.aspose.slides.internal.p042bn.C1710bz;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.nd.e0 */
/* JADX INFO: loaded from: classes4.dex */
public class C6811e0 extends AbstractC6841rv {
    @Override // com.aspose.slides.internal.p296nd.AbstractC6841rv
    /* JADX INFO: renamed from: x1 */
    public void mo26875x1(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C1710bz c1710bz = (C1710bz) c1752sv;
        C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), (int) c1710bz.m9182k4()));
        for (int i = 0; i < c12025x6Arr.length; i++) {
            c1710bz.m9185x1()[i].m58124x1().CloneTo(c12025x6Arr[i]);
        }
        if (c11315h4.m54403dy() != null) {
            abstractC12008jd.mo17535k4(c11315h4.m54403dy(), c12025x6Arr, c11315h4.m54443rv());
        }
        if (c11315h4.m54395c5() != null) {
            abstractC12008jd.mo17565kk(c11315h4.m54395c5(), c12025x6Arr);
        }
    }
}
