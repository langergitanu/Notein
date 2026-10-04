package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class bfq extends C14177nd {

    /* JADX INFO: renamed from: k4 */
    private boolean f4196k4;

    /* JADX INFO: renamed from: x1 */
    private final cdv f4197x1;

    public bfq(cdv cdvVar, C0886d8 c0886d8) {
        super(c0886d8, new jhr(c0886d8));
        this.f4197x1 = cdvVar;
    }

    /* JADX INFO: renamed from: ar */
    public final double m4192ar() {
        C12025x6 c12025x6Clone = m4197to().m73223ts().Clone();
        C12025x6 c12025x6Clone2 = m73223ts().Clone();
        return C14116yg.m67496rv(C14116yg.m67469du(c12025x6Clone.m56895kk() - c12025x6Clone2.m56895kk(), 2.0d) + C14116yg.m67469du(c12025x6Clone.m56897x1() - c12025x6Clone2.m56897x1(), 2.0d));
    }

    /* JADX INFO: renamed from: bv */
    public final boolean m4193bv() {
        return this.f4196k4;
    }

    @Override // com.aspose.slides.C14177nd
    /* JADX INFO: renamed from: dy */
    public int mo4194dy() {
        int iMo4194dy = super.mo4194dy();
        if (m67963ck().m5003ks().m4560fa()) {
            return iMo4194dy;
        }
        if (iMo4194dy == -1 || iMo4194dy == 1) {
            return 6;
        }
        return iMo4194dy;
    }

    /* JADX INFO: renamed from: kk */
    public final void m4195kk(boolean z) {
        this.f4196k4 = z;
    }

    /* JADX INFO: renamed from: qq */
    public final C12025x6[] m4196qq() {
        C12025x6 c12025x6Clone = m73223ts().Clone();
        if (!m67972m9()) {
            float fM67504x1 = C14116yg.m67504x1(4.0f, m73203ak() / 2.0f);
            return new C12025x6[]{new C12025x6(c12025x6Clone.m56897x1() - (m73225wy() / 2.0f), c12025x6Clone.m56895kk() - fM67504x1), new C12025x6((m73225wy() / 2.0f) + c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk() - fM67504x1)};
        }
        C12007ix[] c12007ixArrM73368yj = m67964fa().m73368yj();
        if (c12007ixArrM73368yj.length <= 2) {
            C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), c12007ixArrM73368yj.length > 1 ? 4 : 2));
            float fM64876c5 = m67964fa().m64876c5();
            float fM73206c6 = ((m73206c6() + fM64876c5) + c12007ixArrM73368yj[0].m56575x1()) - 4.0f;
            float fM56550c5 = (c12007ixArrM73368yj[0].m56550c5() + 4.0f) / 2.0f;
            c12025x6Arr[0] = new C12025x6(c12025x6Clone.m56897x1() - fM56550c5, fM73206c6);
            c12025x6Arr[1] = new C12025x6(c12025x6Clone.m56897x1() + fM56550c5, fM73206c6);
            if (c12007ixArrM73368yj.length > 1) {
                float fM73206c62 = ((m73206c6() + m73203ak()) - fM64876c5) - 4.0f;
                float fM56550c52 = (c12007ixArrM73368yj[c12007ixArrM73368yj.length - 1].m56550c5() + 2.0f) / 2.0f;
                c12025x6Arr[2] = new C12025x6(c12025x6Clone.m56897x1() - fM56550c52, fM73206c62);
                c12025x6Arr[3] = new C12025x6(c12025x6Clone.m56897x1() + fM56550c52, fM73206c62);
            }
            return c12025x6Arr;
        }
        List list = new List();
        float fM56575x1 = 0.0f;
        for (C12007ix c12007ix : c12007ixArrM73368yj) {
            fM56575x1 += c12007ix.m56575x1();
        }
        float fM56895kk = c12025x6Clone.m56895kk() - (fM56575x1 / 2.0f);
        for (C12007ix c12007ix2 : c12007ixArrM73368yj) {
            float fM56550c53 = (c12007ix2.m56550c5() + 2.0f) / 2.0f;
            fM56895kk += c12007ix2.m56575x1();
            list.addItem(new C12025x6(c12025x6Clone.m56897x1() + fM56550c53, fM56895kk));
            list.addItem(new C12025x6(c12025x6Clone.m56897x1() - fM56550c53, fM56895kk));
        }
        return (C12025x6[]) list.toArray(new C12025x6[0]);
    }

    /* JADX INFO: renamed from: to */
    public final eh0 m4197to() {
        return (eh0) C7019kk.m27452k4((Object) this.f4197x1, eh0.class);
    }

    /* JADX INFO: renamed from: u4 */
    public final C13709k1 m4198u4() {
        return (C13709k1) C7019kk.m27452k4((Object) this.f4197x1, C13709k1.class);
    }

    /* JADX INFO: renamed from: um */
    public final double m4199um() {
        C12025x6 c12025x6Clone = m4197to().m73223ts().Clone();
        C12025x6 c12025x6Clone2 = m73223ts().Clone();
        double dM67498to = C14116yg.m67498to(c12025x6Clone2.m56895kk() - c12025x6Clone.m56895kk(), c12025x6Clone2.m56897x1() - c12025x6Clone.m56897x1()) * 57.29577951308232d;
        if (dM67498to < 0.0d) {
            dM67498to += 360.0d;
        }
        return dM67498to < 0.0d ? dM67498to + 360.0d : dM67498to;
    }

    /* JADX INFO: renamed from: uz */
    public final C14407ro m4200uz() {
        return (C14407ro) C7019kk.m27452k4((Object) this.f4197x1, C14407ro.class);
    }

    /* JADX INFO: renamed from: wl */
    public final cdv m4201wl() {
        return this.f4197x1;
    }
}
