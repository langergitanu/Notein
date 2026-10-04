package com.aspose.slides.internal.p152gk;

import com.aspose.slides.internal.p181ig.AbstractC4830gf;
import com.aspose.slides.internal.p181ig.C4833h4;
import com.aspose.slides.internal.p181ig.C4839jd;
import com.aspose.slides.internal.p181ig.C4880y9;
import com.aspose.slides.internal.p435u5.C11283h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.gk.ix */
/* JADX INFO: loaded from: classes.dex */
public class C4338ix extends AbstractC4331ar {
    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: k4 */
    public boolean mo17426k4(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        AbstractC4331ar abstractC4331ar;
        AbstractC4331ar abstractC4331ar2;
        AbstractC4830gf abstractC4830gf2;
        AbstractC4830gf abstractC4830gf3;
        int iM19946h4 = abstractC4830gf.m19946h4();
        if (iM19946h4 == 0) {
            C4880y9 c4880y9M19953yj = abstractC4830gf.m19953yj();
            String strM20090k4 = c4880y9M19953yj.m20090k4();
            if (C14113y2.m67363du(strM20090k4, TranslateLanguage.TURKISH)) {
                c4833h4.m20056wy();
                c4833h4.m20059x1(c4880y9M19953yj);
                abstractC4331ar2 = AbstractC4331ar.f11852yj;
                c4833h4.m20020k4(abstractC4331ar2);
                return true;
            }
            if (C11283h4.m54243x1(strM20090k4, TranslateLanguage.THAI, "td")) {
                c4833h4.m20062x1(this);
                c4833h4.m20056wy();
                c4833h4.m20015k4(TranslateLanguage.TURKISH);
                abstractC4331ar = AbstractC4331ar.f11852yj;
                abstractC4830gf2 = c4880y9M19953yj;
            } else {
                if (!C11283h4.m54243x1(strM20090k4, "caption", "col", "colgroup", "tbody", "tfoot", "thead")) {
                    return mo17429x1(abstractC4830gf, c4833h4);
                }
                abstractC4830gf3 = c4880y9M19953yj;
                if (!c4833h4.m20048to("tbody", "thead", "tfoot")) {
                    c4833h4.m20062x1(this);
                    return false;
                }
                c4833h4.m20056wy();
                abstractC4331ar = AbstractC4331ar.f11830c5;
                abstractC4830gf2 = abstractC4830gf3;
            }
        } else {
            if (iM19946h4 != 1) {
                return mo17429x1(abstractC4830gf, c4833h4);
            }
            C4839jd c4839jdM19948ks = abstractC4830gf.m19948ks();
            String strM20090k42 = c4839jdM19948ks.m20090k4();
            if (C11283h4.m54243x1(strM20090k42, "tbody", "tfoot", "thead")) {
                if (!c4833h4.m20000du(strM20090k42)) {
                    c4833h4.m20062x1(this);
                    return false;
                }
                c4833h4.m20056wy();
                c4833h4.m20016k4();
                abstractC4331ar2 = AbstractC4331ar.f11830c5;
                c4833h4.m20020k4(abstractC4331ar2);
                return true;
            }
            if (!C14113y2.m67363du(strM20090k42, "table")) {
                if (!C11283h4.m54243x1(strM20090k42, "body", "caption", "col", "colgroup", "html", "td", TranslateLanguage.THAI, TranslateLanguage.TURKISH)) {
                    return mo17429x1(abstractC4830gf, c4833h4);
                }
                c4833h4.m20062x1(this);
                return false;
            }
            abstractC4830gf3 = c4839jdM19948ks;
            if (!c4833h4.m20048to("tbody", "thead", "tfoot")) {
                c4833h4.m20062x1(this);
                return false;
            }
            c4833h4.m20056wy();
            abstractC4331ar = AbstractC4331ar.f11830c5;
            abstractC4830gf2 = abstractC4830gf3;
        }
        c4833h4.m20020k4(abstractC4331ar);
        return c4833h4.m20025k4(abstractC4830gf2);
    }

    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: x1 */
    public boolean mo17429x1(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        return AbstractC4331ar.f11830c5.mo17426k4(abstractC4830gf, c4833h4);
    }
}
