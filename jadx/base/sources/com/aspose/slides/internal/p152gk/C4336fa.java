package com.aspose.slides.internal.p152gk;

import com.aspose.slides.internal.p181ig.AbstractC4830gf;
import com.aspose.slides.internal.p181ig.C4833h4;
import com.aspose.slides.internal.p181ig.C4880y9;
import com.aspose.slides.internal.p213jw.C5540dy;
import com.aspose.slides.internal.p213jw.C5560wy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gk.fa */
/* JADX INFO: loaded from: classes.dex */
public class C4336fa extends AbstractC4331ar {
    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: k4 */
    public boolean mo17426k4(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        AbstractC4331ar abstractC4331ar;
        if (abstractC4830gf.m19949m9() && abstractC4830gf.m19952x6().m20145x1()) {
            c4833h4.m20021k4(abstractC4830gf.m19952x6());
            return true;
        }
        int iM19946h4 = abstractC4830gf.m19946h4();
        if (iM19946h4 != 0) {
            if (iM19946h4 == 1) {
                String strM20090k4 = abstractC4830gf.m19948ks().m20090k4();
                if (C14113y2.m67363du(strM20090k4, "colgroup")) {
                    if (!C14113y2.m67363du(c4833h4.m20045to().m22719to().m22852x1(), strM20090k4)) {
                        c4833h4.m20062x1(this);
                        return false;
                    }
                    c4833h4.m20016k4();
                    c4833h4.m20020k4(AbstractC4331ar.f11830c5);
                } else {
                    if (C14113y2.m67363du(strM20090k4, "col")) {
                        c4833h4.m20062x1(this);
                        return false;
                    }
                    if (!C14113y2.m67363du(strM20090k4, C5540dy.x1.f15215c5.m22852x1())) {
                        return mo17429x1(abstractC4830gf, c4833h4);
                    }
                    abstractC4331ar = AbstractC4331ar.f11845to;
                }
            } else if (iM19946h4 == 3) {
                c4833h4.m20017k4(abstractC4830gf.m19950rv());
            } else if (iM19946h4 != 4) {
                if (iM19946h4 != 5) {
                    return mo17429x1(abstractC4830gf, c4833h4);
                }
                abstractC4331ar = AbstractC4331ar.f11841m9;
            } else {
                c4833h4.m20062x1(this);
            }
            return true;
        }
        C4880y9 c4880y9M19953yj = abstractC4830gf.m19953yj();
        String strM20090k42 = c4880y9M19953yj.m20090k4();
        if (!C14113y2.m67363du(strM20090k42, "html")) {
            if (C14113y2.m67363du(strM20090k42, "col")) {
                c4833h4.m20059x1(c4880y9M19953yj);
                c4833h4.m20016k4();
                c4833h4.m20053uz();
                return true;
            }
            if (!C14113y2.m67363du(strM20090k42, C5540dy.x1.f15215c5.m22852x1())) {
                return mo17429x1(abstractC4830gf, c4833h4);
            }
            abstractC4331ar = AbstractC4331ar.f11845to;
        }
        abstractC4331ar = AbstractC4331ar.f11841m9;
        return abstractC4331ar.mo17426k4(abstractC4830gf, c4833h4);
    }

    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: x1 */
    public boolean mo17429x1(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        if (!c4833h4.m20045to().m22719to().m22850k4(C5560wy.m22847k4("colgroup"))) {
            c4833h4.m20062x1(this);
            return false;
        }
        c4833h4.m20016k4();
        c4833h4.m20020k4(AbstractC4331ar.f11830c5);
        return c4833h4.m20025k4(abstractC4830gf);
    }
}
