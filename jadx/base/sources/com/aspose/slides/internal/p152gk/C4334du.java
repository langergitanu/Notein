package com.aspose.slides.internal.p152gk;

import com.aspose.slides.internal.p181ig.AbstractC4830gf;
import com.aspose.slides.internal.p181ig.C4833h4;
import com.aspose.slides.internal.p181ig.C4880y9;
import com.aspose.slides.internal.p213jw.C5543ix;
import com.aspose.slides.internal.p435u5.C11283h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: renamed from: com.aspose.slides.internal.gk.du */
/* JADX INFO: loaded from: classes.dex */
public class C4334du extends AbstractC4331ar {
    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: k4 */
    public boolean mo17426k4(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        AbstractC4331ar abstractC4331ar;
        AbstractC4331ar abstractC4331ar2;
        if (abstractC4830gf.m19949m9() && abstractC4830gf.m19952x6().m20145x1()) {
            c4833h4.m20021k4(abstractC4830gf.m19952x6());
            return true;
        }
        if (abstractC4830gf.m19944dy()) {
            c4833h4.m20017k4(abstractC4830gf.m19950rv());
            return true;
        }
        if (abstractC4830gf.m19942c5()) {
            c4833h4.m20062x1(this);
            return true;
        }
        if (!abstractC4830gf.m19947jd()) {
            if (!abstractC4830gf.m19943ck()) {
                return mo17429x1(abstractC4830gf, c4833h4);
            }
            String strM20090k4 = abstractC4830gf.m19951up().m20090k4();
            if (C14113y2.m67363du(strM20090k4, "template")) {
                abstractC4331ar = AbstractC4331ar.f11845to;
                return abstractC4331ar.mo17426k4(abstractC4830gf, c4833h4);
            }
            if (!C11283h4.m54243x1(strM20090k4, "body", "html", "br")) {
                c4833h4.m20062x1(this);
                return false;
            }
            mo17429x1(abstractC4830gf, c4833h4);
            return true;
        }
        C4880y9 c4880y9M19953yj = abstractC4830gf.m19953yj();
        String strM20090k42 = c4880y9M19953yj.m20090k4();
        if (C14113y2.m67363du(strM20090k42, "html")) {
            abstractC4331ar = AbstractC4331ar.f11841m9;
            return abstractC4331ar.mo17426k4(abstractC4830gf, c4833h4);
        }
        if (C14113y2.m67363du(strM20090k42, "body")) {
            c4833h4.m20059x1(c4880y9M19953yj);
            c4833h4.m20024k4(false);
            abstractC4331ar2 = AbstractC4331ar.f11841m9;
        } else {
            if (!C14113y2.m67363du(strM20090k42, "frameset")) {
                if (!C11283h4.m54243x1(strM20090k42, "base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", NoteMeta.PROPERTY_TITLE)) {
                    if (C14113y2.m67363du(strM20090k42, "head")) {
                        c4833h4.m20062x1(this);
                        return false;
                    }
                    mo17429x1(abstractC4830gf, c4833h4);
                    return true;
                }
                c4833h4.m20062x1(this);
                C5543ix c5543ixM19994ck = c4833h4.m19994ck();
                c4833h4.m20063x1(c5543ixM19994ck);
                AbstractC4331ar.f11845to.mo17426k4(abstractC4830gf, c4833h4);
                c4833h4.m20058x1().m20087x1(c5543ixM19994ck);
                return true;
            }
            c4833h4.m20059x1(c4880y9M19953yj);
            abstractC4331ar2 = AbstractC4331ar.f11846u4;
        }
        c4833h4.m20020k4(abstractC4331ar2);
        return true;
    }

    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: x1 */
    public boolean mo17429x1(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        c4833h4.m20015k4("body");
        c4833h4.m20020k4(AbstractC4331ar.f11841m9);
        return c4833h4.m20025k4(abstractC4830gf);
    }
}
