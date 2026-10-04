package com.aspose.slides.internal.p152gk;

import com.aspose.slides.internal.p181ig.AbstractC4830gf;
import com.aspose.slides.internal.p181ig.C4833h4;
import com.aspose.slides.internal.p181ig.C4861to;
import com.aspose.slides.internal.p181ig.C4880y9;
import com.aspose.slides.internal.p213jw.C5540dy;
import com.aspose.slides.internal.p435u5.C11283h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gk.ne */
/* JADX INFO: loaded from: classes.dex */
public class C4344ne extends AbstractC4331ar {
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110  */
    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo17426k4(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        int iM19946h4 = abstractC4830gf.m19946h4();
        if (iM19946h4 == 0) {
            C4880y9 c4880y9M19953yj = abstractC4830gf.m19953yj();
            String strM20090k4 = c4880y9M19953yj.m20090k4();
            if (C14113y2.m67363du(strM20090k4, "html")) {
                return AbstractC4331ar.f11841m9.mo17426k4(abstractC4830gf, c4833h4);
            }
            if (C14113y2.m67363du(strM20090k4, "option")) {
                if (C14113y2.m67363du(c4833h4.m20045to().m22719to().m22852x1(), "option")) {
                    c4833h4.m20016k4();
                }
                c4833h4.m20059x1(c4880y9M19953yj);
            } else if (C14113y2.m67363du(strM20090k4, "optgroup")) {
                if (c4833h4.m20045to().m22719to().m22850k4(C5540dy.x1.f15222kk)) {
                    c4833h4.m20016k4();
                }
                if (c4833h4.m20045to().m22719to().m22850k4(C5540dy.x1.f15224to)) {
                }
                c4833h4.m20059x1(c4880y9M19953yj);
            } else {
                if (!C14113y2.m67363du(strM20090k4, "select")) {
                    if (!C11283h4.m54243x1(strM20090k4, "input", "keygen", "textarea")) {
                        if (!C14113y2.m67363du(strM20090k4, "script") && !C14113y2.m67363du(strM20090k4, C5540dy.x1.f15215c5.m22852x1())) {
                            return mo17429x1(abstractC4830gf, c4833h4);
                        }
                        return AbstractC4331ar.f11845to.mo17426k4(abstractC4830gf, c4833h4);
                    }
                    c4833h4.m20062x1(this);
                    if (!c4833h4.m20071yj()) {
                        return false;
                    }
                    c4833h4.m20066x1("select");
                    c4833h4.m20032kk(false);
                    return c4833h4.m20025k4(abstractC4830gf);
                }
                c4833h4.m20062x1(this);
                c4833h4.m20066x1(strM20090k4);
                c4833h4.m20032kk(false);
            }
        } else if (iM19946h4 == 1) {
            String strM20090k42 = abstractC4830gf.m19948ks().m20090k4();
            if (C14113y2.m67363du(strM20090k42, "optgroup")) {
                if (c4833h4.m20045to().m22719to().m22850k4(C5540dy.x1.f15222kk) && c4833h4.m20058x1().m20083to(c4833h4.m20045to()).m22719to().m22850k4(C5540dy.x1.f15224to)) {
                    c4833h4.m20016k4();
                }
                if (c4833h4.m20045to().m22719to().m22850k4(C5540dy.x1.f15224to)) {
                    c4833h4.m20016k4();
                } else {
                    c4833h4.m20062x1(this);
                }
            } else if (C14113y2.m67363du(strM20090k42, "option")) {
                if (C14113y2.m67363du(c4833h4.m20045to().m22719to().m22852x1(), "option")) {
                }
            } else {
                if (!C14113y2.m67363du(strM20090k42, "select")) {
                    return C14113y2.m67363du(strM20090k42, C5540dy.x1.f15215c5.m22852x1()) ? AbstractC4331ar.f11845to.mo17426k4(abstractC4830gf, c4833h4) : mo17429x1(abstractC4830gf, c4833h4);
                }
                if (!c4833h4.m20071yj()) {
                    c4833h4.m20062x1(this);
                    return false;
                }
                c4833h4.m20066x1(strM20090k42);
                c4833h4.m20032kk(false);
            }
        } else if (iM19946h4 == 2) {
            C4861to c4861toM19952x6 = abstractC4830gf.m19952x6();
            if (c4861toM19952x6.m20144k4((char) 0)) {
                c4833h4.m20062x1(this);
                return false;
            }
            c4833h4.m20021k4(c4861toM19952x6);
        } else if (iM19946h4 == 3) {
            c4833h4.m20017k4(abstractC4830gf.m19950rv());
        } else {
            if (iM19946h4 == 4) {
                c4833h4.m20062x1(this);
                return false;
            }
            if (iM19946h4 == 5) {
                return AbstractC4331ar.f11841m9.mo17426k4(abstractC4830gf, c4833h4);
            }
        }
        return true;
    }

    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: x1 */
    public boolean mo17429x1(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        c4833h4.m20062x1(this);
        return true;
    }
}
