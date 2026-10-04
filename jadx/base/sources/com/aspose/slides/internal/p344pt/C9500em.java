package com.aspose.slides.internal.p344pt;

import com.aspose.slides.internal.p123f5.AbstractC3860to;
import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4073zj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p488x0.C12354yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.em */
/* JADX INFO: loaded from: classes4.dex */
public class C9500em extends AbstractC3860to {
    @Override // com.aspose.slides.internal.p123f5.AbstractC3860to
    /* JADX INFO: renamed from: k4 */
    public void mo15559k4(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C12354yj c12354yjM16227k4 = ((C4073zj) c4047sv).m16227k4();
        if (c3856h4.m15468ck() == null || c3856h4.m15468ck().m58353kk() != (c12354yjM16227k4.m57894x1() & 65535)) {
            return;
        }
        for (int i = 0; i < (c12354yjM16227k4.m57894x1() & 65535); i++) {
            c12354yjM16227k4.m57893kk()[i].m57762h4().CloneTo(c3856h4.m15468ck().m58354x1()[i]);
            c3856h4.m15468ck().m58352k4()[i] = c12354yjM16227k4.m57893kk()[i].m57763k4();
        }
    }
}
