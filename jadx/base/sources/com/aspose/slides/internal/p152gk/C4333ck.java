package com.aspose.slides.internal.p152gk;

import com.aspose.slides.internal.p181ig.AbstractC4830gf;
import com.aspose.slides.internal.p181ig.C4833h4;
import com.aspose.slides.internal.p435u5.C11283h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.gk.ck */
/* JADX INFO: loaded from: classes.dex */
public class C4333ck extends AbstractC4331ar {
    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: k4 */
    public boolean mo17426k4(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        if (abstractC4830gf.m19943ck()) {
            String strM20090k4 = abstractC4830gf.m19948ks().m20090k4();
            if (C11283h4.m54243x1(strM20090k4, "td", TranslateLanguage.THAI)) {
                if (!c4833h4.m20000du(strM20090k4)) {
                    c4833h4.m20062x1(this);
                    return false;
                }
                c4833h4.m20009ix();
                if (!C14113y2.m67363du(c4833h4.m20045to().m22719to().m22852x1(), strM20090k4)) {
                    c4833h4.m20062x1(this);
                }
                c4833h4.m20066x1(strM20090k4);
                c4833h4.m20043rv();
                c4833h4.m20020k4(AbstractC4331ar.f11852yj);
                return true;
            }
            if (C11283h4.m54243x1(strM20090k4, "body", "caption", "col", "colgroup", "html")) {
                c4833h4.m20062x1(this);
                return false;
            }
            if (!C11283h4.m54243x1(strM20090k4, "table", "tbody", "tfoot", "thead", TranslateLanguage.TURKISH)) {
                return mo17429x1(abstractC4830gf, c4833h4);
            }
            if (!c4833h4.m20000du(strM20090k4)) {
                c4833h4.m20062x1(this);
                return false;
            }
        } else {
            if (!abstractC4830gf.m19947jd() || !C11283h4.m54243x1(abstractC4830gf.m19951up().m20090k4(), "caption", "col", "colgroup", "tbody", "td", "tfoot", TranslateLanguage.THAI, "thead", TranslateLanguage.TURKISH)) {
                return mo17429x1(abstractC4830gf, c4833h4);
            }
            if (!c4833h4.m20048to("td", TranslateLanguage.THAI)) {
                c4833h4.m20062x1(this);
                return false;
            }
        }
        c4833h4.m19996dq();
        return c4833h4.m20025k4(abstractC4830gf);
    }

    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: x1 */
    public boolean mo17429x1(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        return AbstractC4331ar.f11841m9.mo17426k4(abstractC4830gf, c4833h4);
    }
}
