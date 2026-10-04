package com.aspose.slides.internal.p344pt;

import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p132fj.C4005bz;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.bz */
/* JADX INFO: loaded from: classes4.dex */
public class C9491bz extends AbstractC9530rv {
    @Override // com.aspose.slides.internal.p344pt.AbstractC9530rv
    /* JADX INFO: renamed from: x1 */
    public void mo46684x1(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C4005bz c4005bz = (C4005bz) c4047sv;
        C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), (int) c4005bz.m15835k4()));
        for (int i = 0; i < c12025x6Arr.length; i++) {
            c4005bz.m15838x1()[i].m57706kk().CloneTo(c12025x6Arr[i]);
        }
        if (c3856h4.m15472dy() != null) {
            abstractC12008jd.mo17535k4(c3856h4.m15472dy(), c12025x6Arr, c3856h4.m15513rv());
        }
        if (c3856h4.m15464c5() != null) {
            abstractC12008jd.mo17565kk(c3856h4.m15464c5(), c12025x6Arr);
        }
    }
}
