package com.aspose.slides.internal.p152gk;

import com.aspose.slides.internal.p149gf.C4256k4;
import com.aspose.slides.internal.p181ig.AbstractC4830gf;
import com.aspose.slides.internal.p181ig.C4833h4;
import com.aspose.slides.internal.p181ig.C4880y9;
import com.aspose.slides.internal.p213jw.C5540dy;
import com.aspose.slides.internal.p213jw.C5543ix;
import com.aspose.slides.internal.p435u5.C11283h4;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gk.u4 */
/* JADX INFO: loaded from: classes.dex */
public class C4348u4 extends AbstractC4331ar {
    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: k4 */
    public boolean mo17426k4(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        AbstractC4331ar abstractC4331ar;
        if (abstractC4830gf.m19949m9() && C11283h4.m54243x1(c4833h4.m20045to().m22719to().m22852x1(), C4256k4.k4.f11576um)) {
            c4833h4.m20055wl();
            c4833h4.m20001dy();
            c4833h4.m20020k4(AbstractC4331ar.f11837jd);
            return c4833h4.m20025k4(abstractC4830gf);
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
            if (C14113y2.m67363du(strM20090k4, "caption")) {
                c4833h4.m19988b3();
                c4833h4.m20068x6();
                c4833h4.m20059x1(c4880y9M19953yj);
                abstractC4331ar = AbstractC4331ar.f11831ck;
            } else if (C14113y2.m67363du(strM20090k4, "colgroup")) {
                c4833h4.m19988b3();
                c4833h4.m20059x1(c4880y9M19953yj);
                abstractC4331ar = AbstractC4331ar.f11834fa;
            } else {
                if (C14113y2.m67363du(strM20090k4, "col")) {
                    c4833h4.m19988b3();
                    c4833h4.m20015k4("colgroup");
                    c4833h4.m20020k4(AbstractC4331ar.f11834fa);
                    return c4833h4.m20025k4(abstractC4830gf);
                }
                if (C11283h4.m54243x1(strM20090k4, "tbody", "tfoot", "thead")) {
                    c4833h4.m19988b3();
                    c4833h4.m20059x1(c4880y9M19953yj);
                    abstractC4331ar = AbstractC4331ar.f11847up;
                } else {
                    if (C11283h4.m54243x1(strM20090k4, "td", TranslateLanguage.THAI, TranslateLanguage.TURKISH)) {
                        c4833h4.m19988b3();
                        c4833h4.m20015k4("tbody");
                        c4833h4.m20020k4(AbstractC4331ar.f11847up);
                        return c4833h4.m20025k4(abstractC4830gf);
                    }
                    if (C14113y2.m67363du(strM20090k4, "table")) {
                        c4833h4.m20062x1(this);
                        if (!c4833h4.m20000du(strM20090k4)) {
                            return false;
                        }
                        c4833h4.m20066x1("table");
                        c4833h4.m20032kk(false);
                        return c4833h4.m20025k4(abstractC4830gf);
                    }
                    if (C11283h4.m54243x1(strM20090k4, "style", "script", "template")) {
                        return AbstractC4331ar.f11845to.mo17426k4(abstractC4830gf, c4833h4);
                    }
                    if (C14113y2.m67363du(strM20090k4, "input")) {
                        if (!c4880y9M19953yj.m20098kk().m20109k4(C18437z2.f56754h) || !C14113y2.m67363du("hidden", c4880y9M19953yj.m20098kk().m20111x1(C18437z2.f56754h))) {
                            return mo17429x1(abstractC4830gf, c4833h4);
                        }
                        c4833h4.m20062x1(this);
                        c4833h4.m20059x1(c4880y9M19953yj);
                        c4833h4.m20016k4();
                        c4833h4.m20053uz();
                    } else {
                        if (!C14113y2.m67363du(strM20090k4, "form")) {
                            return mo17429x1(abstractC4830gf, c4833h4);
                        }
                        c4833h4.m20062x1(this);
                        if (c4833h4.m20058x1().m20079k4(C5540dy.x1.f15215c5) || c4833h4.m20005fa() != null) {
                            return false;
                        }
                        C5543ix c5543ixM20059x1 = c4833h4.m20059x1(c4880y9M19953yj);
                        c4833h4.m20046to(c5543ixM20059x1);
                        c4833h4.m20026k4((InterfaceC12769ix) c5543ixM20059x1);
                    }
                }
            }
            c4833h4.m20020k4(abstractC4331ar);
        } else {
            if (!abstractC4830gf.m19943ck()) {
                return abstractC4830gf.m19946h4() == 5 ? AbstractC4331ar.f11841m9.mo17426k4(abstractC4830gf, c4833h4) : mo17429x1(abstractC4830gf, c4833h4);
            }
            String strM20090k42 = abstractC4830gf.m19948ks().m20090k4();
            if (!C14113y2.m67363du(strM20090k42, "table")) {
                if (!C11283h4.m54243x1(strM20090k42, C4256k4.k4.f11579v4)) {
                    return C14113y2.m67363du(strM20090k42, "template") ? AbstractC4331ar.f11845to.mo17426k4(abstractC4830gf, c4833h4) : mo17429x1(abstractC4830gf, c4833h4);
                }
                c4833h4.m20062x1(this);
                return false;
            }
            if (!c4833h4.m20000du(strM20090k42)) {
                c4833h4.m20062x1(this);
                return false;
            }
            c4833h4.m20066x1("table");
            c4833h4.m20032kk(false);
        }
        return true;
    }

    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: x1 */
    public boolean mo17429x1(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        c4833h4.m20062x1(this);
        c4833h4.m20064x1(true);
        AbstractC4331ar.f11841m9.mo17426k4(abstractC4830gf, c4833h4);
        c4833h4.m20064x1(false);
        return true;
    }
}
