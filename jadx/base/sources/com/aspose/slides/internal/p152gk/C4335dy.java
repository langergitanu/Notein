package com.aspose.slides.internal.p152gk;

import com.aspose.slides.internal.p149gf.C4256k4;
import com.aspose.slides.internal.p181ig.AbstractC4830gf;
import com.aspose.slides.internal.p181ig.C4833h4;
import com.aspose.slides.internal.p181ig.C4839jd;
import com.aspose.slides.internal.p181ig.C4861to;
import com.aspose.slides.internal.p181ig.C4880y9;
import com.aspose.slides.internal.p213jw.C5540dy;
import com.aspose.slides.internal.p213jw.C5543ix;
import com.aspose.slides.internal.p213jw.C5560wy;
import com.aspose.slides.internal.p435u5.C11283h4;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.gk.dy */
/* JADX INFO: loaded from: classes.dex */
public class C4335dy extends AbstractC4331ar {
    /* JADX INFO: renamed from: du */
    private boolean m17430du(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        c4833h4.m20016k4();
        return true;
    }

    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: k4 */
    public boolean mo17426k4(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        int iM19946h4 = abstractC4830gf.m19946h4();
        if (iM19946h4 == 0) {
            C4880y9 c4880y9M19953yj = abstractC4830gf.m19953yj();
            if (!C11283h4.m54243x1(c4880y9M19953yj.m20090k4(), C4256k4.k4.f11581wy) && (!C5540dy.x1.f15218dy.m22850k4(c4880y9M19953yj.m20100to()) || !c4880y9M19953yj.m20098kk().m20110k4("color", OptionalModuleUtils.FACE, "size"))) {
                return mo17427kk(abstractC4830gf, c4833h4);
            }
            c4833h4.m20062x1(this);
            if (c4833h4.m20051um()) {
                return mo17427kk(abstractC4830gf, c4833h4);
            }
            c4833h4.m20033kk();
            return c4833h4.m20025k4(abstractC4830gf);
        }
        if (iM19946h4 == 1) {
            c4833h4.m20062x1(this);
            C4839jd c4839jdM19948ks = abstractC4830gf.m19948ks();
            C5560wy c5560wy = C5540dy.x1.f15225x1;
            return (c5560wy.m22850k4(c4839jdM19948ks.m20100to()) && c5560wy.m22849k4(c4833h4.m20045to()) && C14067j2.m66729x1("http://www.w3.org/2000/svg", c4833h4.m20045to().mo22634jd())) ? m17430du(abstractC4830gf, c4833h4) : mo17428to(abstractC4830gf, c4833h4);
        }
        if (iM19946h4 == 2) {
            C4861to c4861toM19952x6 = abstractC4830gf.m19952x6();
            if (c4861toM19952x6.m20144k4((char) 0)) {
                c4833h4.m20062x1(this);
                c4833h4.m20021k4(new C4861to((char) 65533));
            } else {
                boolean zM20145x1 = c4861toM19952x6.m20145x1();
                c4833h4.m20021k4(c4861toM19952x6);
                if (!zM20145x1) {
                    c4833h4.m20024k4(false);
                }
            }
        } else if (iM19946h4 == 3) {
            c4833h4.m20017k4(abstractC4830gf.m19950rv());
        } else if (iM19946h4 == 4) {
            c4833h4.m20062x1(this);
        } else if (iM19946h4 == 5) {
            c4833h4.m20069xk();
        }
        return true;
    }

    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: kk */
    public boolean mo17427kk(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        C5543ix c5543ixM19998du = c4833h4.m19998du();
        if (C14067j2.m66729x1(c5543ixM19998du.mo22634jd(), "http://www.w3.org/1998/Math/MathML")) {
            abstractC4830gf = c4833h4.m20030kk(abstractC4830gf);
        }
        if (C14067j2.m66729x1(c5543ixM19998du.mo22634jd(), "http://www.w3.org/2000/svg")) {
            abstractC4830gf = c4833h4.m20057x1(c4833h4.m20044to(abstractC4830gf));
        }
        AbstractC4830gf abstractC4830gfM19997du = c4833h4.m19997du(abstractC4830gf);
        c4833h4.m20060x1(abstractC4830gfM19997du.m19953yj(), c5543ixM19998du.mo22634jd());
        String strM20090k4 = abstractC4830gfM19997du.m19953yj().m20090k4();
        if (!abstractC4830gfM19997du.m19951up().m20102x1()) {
            return true;
        }
        if (C14113y2.m67363du(strM20090k4, "script")) {
            c4833h4.m20053uz();
            return m17430du(abstractC4830gfM19997du, c4833h4);
        }
        c4833h4.m20016k4();
        c4833h4.m20053uz();
        return true;
    }

    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: to */
    public boolean mo17428to(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        C5543ix c5543ixM20045to = c4833h4.m20045to();
        C5560wy c5560wyM20100to = abstractC4830gf.m19951up().m20100to();
        if (!c5543ixM20045to.m22719to().m22850k4(c5560wyM20100to)) {
            c4833h4.m20062x1(this);
        }
        while (c4833h4.m20058x1().m20082to() != c5543ixM20045to) {
            if (c5543ixM20045to.m22719to().m22850k4(c5560wyM20100to)) {
                c4833h4.m20026k4((InterfaceC12769ix) c5543ixM20045to);
                return true;
            }
            c5543ixM20045to = c4833h4.m20058x1().m20083to(c5543ixM20045to);
            if (C14067j2.m66729x1("http://www.w3.org/1999/xhtml", c5543ixM20045to.mo22634jd())) {
                return c4833h4.m20052up().mo17426k4(abstractC4830gf, c4833h4);
            }
        }
        return true;
    }
}
