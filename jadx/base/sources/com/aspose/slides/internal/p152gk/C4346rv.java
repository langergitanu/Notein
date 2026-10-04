package com.aspose.slides.internal.p152gk;

import com.aspose.slides.internal.p181ig.AbstractC4830gf;
import com.aspose.slides.internal.p181ig.C4833h4;
import com.aspose.slides.internal.p181ig.C4880y9;
import com.aspose.slides.internal.p435u5.C11283h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.gk.rv */
/* JADX INFO: loaded from: classes.dex */
public class C4346rv extends AbstractC4331ar {
    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: k4 */
    public boolean mo17426k4(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        if (abstractC4830gf.m19947jd()) {
            C4880y9 c4880y9M19953yj = abstractC4830gf.m19953yj();
            String strM20090k4 = c4880y9M19953yj.m20090k4();
            if (C11283h4.m54243x1(strM20090k4, TranslateLanguage.THAI, "td")) {
                c4833h4.m19986ak();
                c4833h4.m20059x1(c4880y9M19953yj);
                c4833h4.m20020k4(AbstractC4331ar.f11840ks);
                c4833h4.m20068x6();
                return true;
            }
            if (!C11283h4.m54243x1(strM20090k4, "caption", "col", "colgroup", "tbody", "tfoot", "thead", TranslateLanguage.TURKISH)) {
                return mo17429x1(abstractC4830gf, c4833h4);
            }
            if (!c4833h4.m20000du(TranslateLanguage.TURKISH)) {
                c4833h4.m20062x1(this);
                return false;
            }
        } else {
            if (!abstractC4830gf.m19943ck()) {
                return mo17429x1(abstractC4830gf, c4833h4);
            }
            String strM20090k42 = abstractC4830gf.m19948ks().m20090k4();
            if (C14113y2.m67363du(strM20090k42, TranslateLanguage.TURKISH)) {
                if (!c4833h4.m20000du(TranslateLanguage.TURKISH)) {
                    c4833h4.m20062x1(this);
                    return false;
                }
                c4833h4.m19986ak();
                c4833h4.m20016k4();
                c4833h4.m20020k4(AbstractC4331ar.f11847up);
                return true;
            }
            if (C14113y2.m67363du(strM20090k42, "table")) {
                if (!c4833h4.m20000du(TranslateLanguage.TURKISH)) {
                    c4833h4.m20062x1(this);
                    return false;
                }
            } else {
                if (!C11283h4.m54243x1(strM20090k42, "tbody", "tfoot", "thead")) {
                    if (!C11283h4.m54243x1(strM20090k42, "body", "caption", "col", "colgroup", "html", "td", TranslateLanguage.THAI)) {
                        return mo17429x1(abstractC4830gf, c4833h4);
                    }
                    c4833h4.m20062x1(this);
                    return false;
                }
                if (!c4833h4.m20000du(strM20090k42)) {
                    c4833h4.m20062x1(this);
                    return false;
                }
                if (!c4833h4.m20000du(TranslateLanguage.TURKISH)) {
                    c4833h4.m20062x1(this);
                    return false;
                }
            }
        }
        c4833h4.m19986ak();
        c4833h4.m20016k4();
        c4833h4.m20020k4(AbstractC4331ar.f11847up);
        return c4833h4.m20025k4(abstractC4830gf);
    }

    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: x1 */
    public boolean mo17429x1(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        return AbstractC4331ar.f11830c5.mo17426k4(abstractC4830gf, c4833h4);
    }
}
