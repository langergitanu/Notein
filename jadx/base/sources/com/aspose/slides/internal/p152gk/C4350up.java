package com.aspose.slides.internal.p152gk;

import com.aspose.slides.internal.p181ig.AbstractC4830gf;
import com.aspose.slides.internal.p181ig.AbstractC4841k4;
import com.aspose.slides.internal.p181ig.C4833h4;
import com.aspose.slides.internal.p181ig.C4880y9;
import com.aspose.slides.internal.p213jw.C5540dy;
import com.aspose.slides.internal.p213jw.C5560wy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gk.up */
/* JADX INFO: loaded from: classes.dex */
public class C4350up extends AbstractC4331ar {
    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: k4 */
    public boolean mo17426k4(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        AbstractC4331ar abstractC4331ar;
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
            return false;
        }
        if (abstractC4830gf.m19947jd()) {
            C4880y9 c4880y9M19953yj = abstractC4830gf.m19953yj();
            String strM20090k4 = c4880y9M19953yj.m20090k4();
            if (C14113y2.m67363du(strM20090k4, "html")) {
                abstractC4331ar = AbstractC4331ar.f11841m9;
            } else {
                if (C14113y2.m67363du(strM20090k4, "frameset")) {
                    c4833h4.m20059x1(c4880y9M19953yj);
                    return true;
                }
                if (C14113y2.m67363du(strM20090k4, "frame")) {
                    c4833h4.m20059x1(c4880y9M19953yj);
                    c4833h4.m20016k4();
                    c4833h4.m20053uz();
                    return true;
                }
                if (!C14113y2.m67363du(strM20090k4, "noframes")) {
                    return mo17429x1(abstractC4830gf, c4833h4);
                }
                abstractC4331ar = AbstractC4331ar.f11845to;
            }
            return abstractC4331ar.mo17426k4(c4880y9M19953yj, c4833h4);
        }
        if (abstractC4830gf.m19943ck()) {
            AbstractC4841k4 abstractC4841k4M19951up = abstractC4830gf.m19951up();
            C5560wy c5560wy = C5540dy.x1.f15219h4;
            if (abstractC4841k4M19951up.m20097k4(c5560wy)) {
                if (C5540dy.x1.f15221k4.m22849k4(c4833h4.m20045to())) {
                    c4833h4.m20062x1(this);
                    return false;
                }
                c4833h4.m20016k4();
                if (c4833h4.m20051um() || c4833h4.m20045to().m22712k4(c5560wy)) {
                    return true;
                }
                c4833h4.m20020k4(AbstractC4331ar.f11848uz);
                return true;
            }
        }
        if (!abstractC4830gf.m19945fa()) {
            return mo17429x1(abstractC4830gf, c4833h4);
        }
        if (!c4833h4.m20045to().m22712k4(C5540dy.x1.f15221k4)) {
            c4833h4.m20062x1(this);
        }
        c4833h4.m20069xk();
        return true;
    }

    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: x1 */
    public boolean mo17429x1(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        c4833h4.m20062x1(this);
        return false;
    }
}
