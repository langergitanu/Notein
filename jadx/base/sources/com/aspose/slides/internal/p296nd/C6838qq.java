package com.aspose.slides.internal.p296nd;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1765wl;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.nd.qq */
/* JADX INFO: loaded from: classes4.dex */
public class C6838qq extends AbstractC6841rv {
    @Override // com.aspose.slides.internal.p296nd.AbstractC6841rv
    /* JADX INFO: renamed from: x1 */
    public void mo26875x1(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C1765wl c1765wl = (C1765wl) c1752sv;
        if ((c1765wl.m9490x1() & 65535) >= c11315h4.m54440m9().length || (c1765wl.m9488k4() & 65535) >= c11315h4.m54440m9().length) {
            return;
        }
        AbstractC12024x1 abstractC12024x1M54410jd = c11315h4.m54410jd(c1765wl.m9490x1());
        C12018u4 c12018u4M54399ck = c11315h4.m54399ck(c1765wl.m9488k4());
        if (abstractC12024x1M54410jd == null || c12018u4M54399ck == null) {
            return;
        }
        abstractC12008jd.mo17531k4(abstractC12024x1M54410jd, c12018u4M54399ck);
    }
}
