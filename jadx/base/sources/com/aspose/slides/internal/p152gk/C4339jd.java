package com.aspose.slides.internal.p152gk;

import com.aspose.slides.internal.p149gf.C4256k4;
import com.aspose.slides.internal.p181ig.AbstractC4830gf;
import com.aspose.slides.internal.p181ig.C4833h4;
import com.aspose.slides.internal.p435u5.C11283h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gk.jd */
/* JADX INFO: loaded from: classes.dex */
public class C4339jd extends AbstractC4331ar {
    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: k4 */
    public boolean mo17426k4(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        if (abstractC4830gf.m19943ck() && C14113y2.m67363du(abstractC4830gf.m19951up().m20090k4(), "caption")) {
            if (!c4833h4.m20000du(abstractC4830gf.m19948ks().m20090k4())) {
                c4833h4.m20062x1(this);
                return false;
            }
            c4833h4.m20009ix();
            if (!C14113y2.m67363du(c4833h4.m20045to().m22719to().m22852x1(), "caption")) {
                c4833h4.m20062x1(this);
            }
            c4833h4.m20066x1("caption");
            c4833h4.m20043rv();
            c4833h4.m20020k4(AbstractC4331ar.f11830c5);
            return true;
        }
        if ((!abstractC4830gf.m19947jd() || !C11283h4.m54243x1(abstractC4830gf.m19953yj().m20090k4(), C4256k4.k4.f11569lr)) && (!abstractC4830gf.m19943ck() || !C14113y2.m67363du(abstractC4830gf.m19948ks().m20090k4(), "table"))) {
            if (!abstractC4830gf.m19943ck() || !C11283h4.m54243x1(abstractC4830gf.m19951up().m20090k4(), C4256k4.k4.f11584yd)) {
                return mo17429x1(abstractC4830gf, c4833h4);
            }
            c4833h4.m20062x1(this);
            return false;
        }
        c4833h4.m20062x1(this);
        if (!c4833h4.m20000du("caption")) {
            c4833h4.m20062x1(this);
            return false;
        }
        c4833h4.m20066x1("caption");
        c4833h4.m20043rv();
        c4833h4.m20020k4(AbstractC4331ar.f11830c5);
        return c4833h4.m20025k4(abstractC4830gf);
    }

    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: x1 */
    public boolean mo17429x1(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        return AbstractC4331ar.f11841m9.mo17426k4(abstractC4830gf, c4833h4);
    }
}
