package com.aspose.slides.internal.p152gk;

import com.aspose.slides.internal.p181ig.AbstractC4830gf;
import com.aspose.slides.internal.p181ig.C4833h4;
import com.aspose.slides.internal.p181ig.C4880y9;
import com.aspose.slides.internal.p213jw.C5540dy;
import com.aspose.slides.internal.p435u5.C11283h4;
import com.aspose.slides.internal.p493x5.AbstractC12411j5;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: renamed from: com.aspose.slides.internal.gk.yj */
/* JADX INFO: loaded from: classes.dex */
public class C4355yj extends AbstractC4331ar {
    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: k4 */
    public boolean mo17426k4(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        AbstractC4331ar abstractC4331ar;
        AbstractC12411j5 abstractC12411j5;
        if (abstractC4830gf.m19949m9() && abstractC4830gf.m19952x6().m20145x1()) {
            c4833h4.m20021k4(abstractC4830gf.m19952x6());
            return true;
        }
        int iM19946h4 = abstractC4830gf.m19946h4();
        if (iM19946h4 == 0) {
            C4880y9 c4880y9M19953yj = abstractC4830gf.m19953yj();
            String strM20090k4 = c4880y9M19953yj.m20090k4();
            if (C14113y2.m67363du(strM20090k4, "html")) {
                return AbstractC4331ar.f11841m9.mo17426k4(abstractC4830gf, c4833h4);
            }
            if (C11283h4.m54243x1(strM20090k4, "base", "basefont", "bgsound", "command", "link")) {
                c4833h4.m20059x1(c4880y9M19953yj);
                c4833h4.m20016k4();
                c4833h4.m20053uz();
            } else if (C14113y2.m67363du(strM20090k4, "meta")) {
                c4833h4.m20059x1(c4880y9M19953yj);
                c4833h4.m20016k4();
                c4833h4.m19993c6();
            } else {
                if (C14113y2.m67363du(strM20090k4, NoteMeta.PROPERTY_TITLE)) {
                    abstractC12411j5 = AbstractC12411j5.f41408g8;
                } else {
                    if (!C11283h4.m54243x1(strM20090k4, "noframes", "style")) {
                        if (C14113y2.m67363du(strM20090k4, "noscript")) {
                            if (!c4833h4.m19989bv()) {
                                c4833h4.m20059x1(c4880y9M19953yj);
                                abstractC4331ar = AbstractC4331ar.f11832du;
                            }
                        } else if (C14113y2.m67363du(strM20090k4, "script")) {
                            c4833h4.m20059x1(c4880y9M19953yj);
                            c4833h4.m20038m9().m19967k4(AbstractC12411j5.f41409gi);
                            c4833h4.m20001dy();
                            abstractC4331ar = AbstractC4331ar.f11833dy;
                        } else {
                            if (!C14113y2.m67363du(strM20090k4, "template")) {
                                if (!C14113y2.m67363du(strM20090k4, "head")) {
                                    return mo17429x1(abstractC4830gf, c4833h4);
                                }
                                c4833h4.m20062x1(this);
                                return false;
                            }
                            c4833h4.m20059x1(c4880y9M19953yj);
                            c4833h4.m20068x6();
                            c4833h4.m20024k4(false);
                            AbstractC4331ar abstractC4331ar2 = AbstractC4331ar.f11842ne;
                            c4833h4.m20020k4(abstractC4331ar2);
                            c4833h4.m20054v4().push(abstractC4331ar2);
                        }
                        c4833h4.m20020k4(abstractC4331ar);
                    }
                    abstractC12411j5 = AbstractC12411j5.f41411he;
                }
                c4833h4.m20023k4(abstractC12411j5);
            }
        } else if (iM19946h4 == 1) {
            String strM20090k42 = abstractC4830gf.m19948ks().m20090k4();
            if (C14113y2.m67363du(strM20090k42, "head")) {
                c4833h4.m20016k4();
                abstractC4331ar = AbstractC4331ar.f11835h4;
                c4833h4.m20020k4(abstractC4331ar);
            } else {
                if (C11283h4.m54243x1(strM20090k42, "body", "html", "br")) {
                    return mo17429x1(abstractC4830gf, c4833h4);
                }
                if (!C14113y2.m67363du(strM20090k42, "template")) {
                    c4833h4.m20062x1(this);
                    return false;
                }
                if (c4833h4.m20037lr() == null) {
                    c4833h4.m20062x1(this);
                    return true;
                }
                c4833h4.m20009ix();
                if (!c4833h4.m20045to().m22719to().m22850k4(C5540dy.x1.f15215c5)) {
                    c4833h4.m20062x1(this);
                }
                c4833h4.m20066x1("template");
                c4833h4.m20043rv();
                c4833h4.m20054v4().pop();
                c4833h4.m20032kk(false);
            }
        } else {
            if (iM19946h4 != 3) {
                if (iM19946h4 != 4) {
                    return mo17429x1(abstractC4830gf, c4833h4);
                }
                c4833h4.m20062x1(this);
                return false;
            }
            c4833h4.m20017k4(abstractC4830gf.m19950rv());
        }
        return true;
    }

    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: x1 */
    public boolean mo17429x1(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        c4833h4.m20016k4();
        c4833h4.m20020k4(AbstractC4331ar.f11835h4);
        return c4833h4.m20025k4(abstractC4830gf);
    }
}
