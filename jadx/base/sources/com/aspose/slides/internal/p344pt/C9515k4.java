package com.aspose.slides.internal.p344pt;

import com.aspose.slides.internal.p123f5.AbstractC3860to;
import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p132fj.C4029k4;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p488x0.C12354yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9515k4 extends AbstractC3860to {
    @Override // com.aspose.slides.internal.p123f5.AbstractC3860to
    /* JADX INFO: renamed from: k4 */
    public void mo15559k4(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C12354yj c12354yjM15986k4 = ((C4029k4) c4047sv).m15986k4();
        if (c3856h4.m15468ck() != null) {
            if ((c12354yjM15986k4.m57894x1() & 65535) != c3856h4.m15468ck().m58353kk()) {
                C6005k4.m24263kk("palette.NumberOfEntries != currentPalette.NumberOfEntries");
                return;
            }
            for (int i = 0; i < c3856h4.m15468ck().m58354x1().length; i++) {
                if ((c3856h4.m15468ck().m58352k4()[i] & 1) > 0) {
                    c12354yjM15986k4.m57893kk()[i].m57762h4().CloneTo(c3856h4.m15468ck().m58354x1()[i]);
                }
            }
        }
    }
}
