package com.aspose.slides.internal.p152gk;

import com.aspose.slides.internal.p181ig.AbstractC4830gf;
import com.aspose.slides.internal.p181ig.C4823du;
import com.aspose.slides.internal.p181ig.C4833h4;
import com.aspose.slides.internal.p181ig.C4880y9;
import com.aspose.slides.internal.p213jw.C5543ix;
import com.aspose.slides.internal.p435u5.C11283h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gk.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C4343m9 extends AbstractC4331ar {
    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: k4 */
    public boolean mo17426k4(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        if (abstractC4830gf.m19942c5()) {
            c4833h4.m20062x1(this);
        } else {
            if (!abstractC4830gf.m19944dy()) {
                if (abstractC4830gf.m19949m9() && abstractC4830gf.m19952x6().m20145x1()) {
                    return true;
                }
                if (abstractC4830gf.m19947jd() && C14113y2.m67363du(abstractC4830gf.m19951up().m20090k4(), "html")) {
                    C5543ix c5543ixM20012k4 = c4833h4.m20012k4(abstractC4830gf.m19953yj());
                    c4833h4.m20006h4().mo22643kk(c5543ixM20012k4);
                    c4833h4.m20058x1().m20078k4(c5543ixM20012k4);
                    c4833h4.m20020k4(AbstractC4331ar.f11839kk);
                    return true;
                }
                if ((!abstractC4830gf.m19943ck() || !C11283h4.m54243x1(abstractC4830gf.m19951up().m20090k4(), "head", "body", "html", "br")) && abstractC4830gf.m19943ck()) {
                    c4833h4.m20062x1(this);
                    return true;
                }
                return mo17429x1(abstractC4830gf, c4833h4);
            }
            c4833h4.m20018k4((C4823du) abstractC4830gf, c4833h4.m20006h4());
        }
        return true;
    }

    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: x1 */
    public boolean mo17429x1(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        C5543ix c5543ixM20012k4 = c4833h4.m20012k4(new C4880y9("html"));
        c4833h4.m20006h4().mo22643kk(c5543ixM20012k4);
        c4833h4.m20058x1().m20078k4(c5543ixM20012k4);
        c4833h4.m20020k4(AbstractC4331ar.f11839kk);
        return c4833h4.m20025k4(abstractC4830gf);
    }
}
