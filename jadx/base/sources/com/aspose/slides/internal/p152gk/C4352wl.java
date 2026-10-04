package com.aspose.slides.internal.p152gk;

import com.aspose.slides.internal.p149gf.C4256k4;
import com.aspose.slides.internal.p181ig.AbstractC4830gf;
import com.aspose.slides.internal.p181ig.C4833h4;
import com.aspose.slides.internal.p181ig.C4838j5;
import com.aspose.slides.internal.p181ig.C4839jd;
import com.aspose.slides.internal.p181ig.C4850nv;
import com.aspose.slides.internal.p213jw.C5540dy;
import com.aspose.slides.internal.p213jw.C5560wy;
import com.aspose.slides.internal.p435u5.C11283h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.gk.wl */
/* JADX INFO: loaded from: classes.dex */
public class C4352wl extends AbstractC4331ar {
    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: k4 */
    public boolean mo17426k4(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        int iM19946h4 = abstractC4830gf.m19946h4();
        if (iM19946h4 != 0) {
            if (iM19946h4 == 1) {
                C4839jd c4839jdM19948ks = abstractC4830gf.m19948ks();
                c4839jdM19948ks.m20090k4();
                if (C5540dy.x1.f15215c5.m22850k4(c4839jdM19948ks.m20100to())) {
                    return AbstractC4331ar.f11845to.mo17426k4(abstractC4830gf, c4833h4);
                }
                c4833h4.m20062x1(this);
                return false;
            }
            if (iM19946h4 == 2 || iM19946h4 == 3 || iM19946h4 == 4) {
                AbstractC4331ar.f11841m9.mo17426k4(abstractC4830gf, c4833h4);
            } else if (iM19946h4 == 5) {
                C4838j5 c4838j5M20058x1 = c4833h4.m20058x1();
                C5560wy c5560wy = C5540dy.x1.f15215c5;
                if (!c4838j5M20058x1.m20079k4(c5560wy)) {
                    c4833h4.m20069xk();
                    return false;
                }
                c4833h4.m20062x1(this);
                c4833h4.m20066x1(c5560wy.m22852x1());
                c4833h4.m20043rv();
                c4833h4.m20054v4().pop();
                c4833h4.m20032kk(false);
                return c4833h4.m20025k4(abstractC4830gf);
            }
            return true;
        }
        String strM20090k4 = abstractC4830gf.m19953yj().m20090k4();
        if (C11283h4.m54243x1(strM20090k4, C4256k4.k4.f11553ak)) {
            return AbstractC4331ar.f11845to.mo17426k4(abstractC4830gf, c4833h4);
        }
        if (C11283h4.m54243x1(strM20090k4, C4256k4.k4.f11559dq)) {
            c4833h4.m20054v4().pop();
            C4850nv c4850nvM20054v4 = c4833h4.m20054v4();
            AbstractC4331ar abstractC4331ar = AbstractC4331ar.f11830c5;
            c4850nvM20054v4.push(abstractC4331ar);
            c4833h4.m20020k4(abstractC4331ar);
            return c4833h4.m20025k4(abstractC4830gf);
        }
        if (C14113y2.m67363du(strM20090k4, "col")) {
            c4833h4.m20054v4().pop();
            C4850nv c4850nvM20054v42 = c4833h4.m20054v4();
            AbstractC4331ar abstractC4331ar2 = AbstractC4331ar.f11834fa;
            c4850nvM20054v42.push(abstractC4331ar2);
            c4833h4.m20020k4(abstractC4331ar2);
            return c4833h4.m20025k4(abstractC4830gf);
        }
        if (C14113y2.m67363du(strM20090k4, TranslateLanguage.TURKISH)) {
            c4833h4.m20054v4().pop();
            C4850nv c4850nvM20054v43 = c4833h4.m20054v4();
            AbstractC4331ar abstractC4331ar3 = AbstractC4331ar.f11847up;
            c4850nvM20054v43.push(abstractC4331ar3);
            c4833h4.m20020k4(abstractC4331ar3);
            return c4833h4.m20025k4(abstractC4830gf);
        }
        if (!C11283h4.m54243x1(strM20090k4, "td", TranslateLanguage.THAI)) {
            return mo17427kk(abstractC4830gf, c4833h4);
        }
        c4833h4.m20054v4().pop();
        C4850nv c4850nvM20054v44 = c4833h4.m20054v4();
        AbstractC4331ar abstractC4331ar4 = AbstractC4331ar.f11852yj;
        c4850nvM20054v44.push(abstractC4331ar4);
        c4833h4.m20020k4(abstractC4331ar4);
        return c4833h4.m20025k4(abstractC4830gf);
    }

    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: kk */
    public boolean mo17427kk(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        c4833h4.m20054v4().pop();
        C4850nv c4850nvM20054v4 = c4833h4.m20054v4();
        AbstractC4331ar abstractC4331ar = AbstractC4331ar.f11841m9;
        c4850nvM20054v4.push(abstractC4331ar);
        c4833h4.m20020k4(abstractC4331ar);
        return c4833h4.m20025k4(abstractC4830gf);
    }
}
