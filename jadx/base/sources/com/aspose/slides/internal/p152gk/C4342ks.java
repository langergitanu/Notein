package com.aspose.slides.internal.p152gk;

import com.aspose.slides.internal.p181ig.AbstractC4830gf;
import com.aspose.slides.internal.p181ig.C4833h4;
import com.aspose.slides.internal.p435u5.C11283h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gk.ks */
/* JADX INFO: loaded from: classes.dex */
public class C4342ks extends AbstractC4331ar {
    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: k4 */
    public boolean mo17426k4(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        if (abstractC4830gf.m19942c5()) {
            c4833h4.m20062x1(this);
            return true;
        }
        if (abstractC4830gf.m19947jd() && C14113y2.m67363du(abstractC4830gf.m19953yj().m20090k4(), "html")) {
            return AbstractC4331ar.f11841m9.mo17426k4(abstractC4830gf, c4833h4);
        }
        if (abstractC4830gf.m19943ck() && C14113y2.m67363du(abstractC4830gf.m19948ks().m20090k4(), "noscript")) {
            c4833h4.m20016k4();
            c4833h4.m20020k4(AbstractC4331ar.f11845to);
            return true;
        }
        if ((abstractC4830gf.m19949m9() && abstractC4830gf.m19952x6().m20145x1()) || abstractC4830gf.m19944dy() || (abstractC4830gf.m19947jd() && C11283h4.m54243x1(abstractC4830gf.m19951up().m20090k4(), "basefont", "bgsound", "link", "meta", "noframes", "style"))) {
            return AbstractC4331ar.f11845to.mo17426k4(abstractC4830gf, c4833h4);
        }
        if (abstractC4830gf.m19943ck() && C14113y2.m67363du(abstractC4830gf.m19951up().m20090k4(), "br")) {
            return mo17429x1(abstractC4830gf, c4833h4);
        }
        if ((!abstractC4830gf.m19947jd() || !C11283h4.m54243x1(abstractC4830gf.m19951up().m20090k4(), "head", "noscript")) && !abstractC4830gf.m19943ck()) {
            return mo17429x1(abstractC4830gf, c4833h4);
        }
        c4833h4.m20062x1(this);
        return false;
    }

    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: x1 */
    public boolean mo17429x1(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        c4833h4.m20062x1(this);
        c4833h4.m20016k4();
        c4833h4.m20020k4(AbstractC4331ar.f11845to);
        return c4833h4.m20025k4(abstractC4830gf);
    }
}
