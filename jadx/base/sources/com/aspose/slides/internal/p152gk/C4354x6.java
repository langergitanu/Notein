package com.aspose.slides.internal.p152gk;

import com.aspose.slides.internal.p181ig.AbstractC4830gf;
import com.aspose.slides.internal.p181ig.C4833h4;
import com.aspose.slides.internal.p435u5.C11283h4;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.gk.x6 */
/* JADX INFO: loaded from: classes.dex */
public class C4354x6 extends AbstractC4331ar {
    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: k4 */
    public boolean mo17426k4(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        if (abstractC4830gf.m19947jd() && C11283h4.m54243x1(abstractC4830gf.m19951up().m20090k4(), "caption", "table", "tbody", "tfoot", "thead", TranslateLanguage.TURKISH, "td", TranslateLanguage.THAI)) {
            c4833h4.m20062x1(this);
        } else {
            if (!abstractC4830gf.m19943ck() || !C11283h4.m54243x1(abstractC4830gf.m19951up().m20090k4(), "caption", "table", "tbody", "tfoot", "thead", TranslateLanguage.TURKISH, "td", TranslateLanguage.THAI)) {
                return mo17429x1(abstractC4830gf, c4833h4);
            }
            c4833h4.m20062x1(this);
            if (!c4833h4.m20000du(abstractC4830gf.m19951up().m20090k4())) {
                return false;
            }
        }
        c4833h4.m20066x1("select");
        c4833h4.m20032kk(false);
        return c4833h4.m20025k4(abstractC4830gf);
    }

    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: x1 */
    public boolean mo17429x1(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        return AbstractC4331ar.f11844rv.mo17426k4(abstractC4830gf, c4833h4);
    }
}
