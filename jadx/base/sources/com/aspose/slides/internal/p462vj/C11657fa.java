package com.aspose.slides.internal.p462vj;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p022ai.C1373dy;
import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.internal.p380ri.C10018x1;
import com.aspose.slides.internal.p393s7.C10149c5;
import com.aspose.slides.internal.p393s7.C10161to;
import com.aspose.slides.internal.p409sv.C10768c5;
import com.aspose.slides.internal.p462vj.AbstractC11681yd;
import com.aspose.slides.internal.p486wy.C12314dy;
import com.aspose.slides.internal.p486wy.C12320ks;
import com.aspose.slides.internal.p513xw.C12681ak;
import com.aspose.slides.internal.p513xw.C12694e0;
import com.aspose.slides.internal.p513xw.C12699gi;
import com.aspose.slides.internal.p513xw.C12712m2;
import com.aspose.slides.internal.p513xw.C12717os;
import com.aspose.slides.internal.p513xw.C12718qm;
import com.aspose.slides.internal.p513xw.C12724ss;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.vj.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C11657fa extends AbstractC11681yd {

    /* JADX INFO: renamed from: c5 */
    private C1375h4 f39337c5;

    /* JADX INFO: renamed from: ck */
    private C10161to f39338ck;

    /* JADX INFO: renamed from: jd */
    private int f39339jd;

    /* JADX INFO: renamed from: x6 */
    private C4265c5 f39340x6;

    public C11657fa(C10768c5 c10768c5) {
        super(c10768c5);
        this.f39340x6 = null;
    }

    @Override // com.aspose.slides.internal.p462vj.AbstractC11681yd, com.aspose.slides.internal.p462vj.InterfaceC11646ar
    /* JADX INFO: renamed from: du */
    public String mo54798du(C12717os c12717os) {
        return ((C12320ks) ((AbstractC11681yd) this).f39494fa).mo57603b3();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    @Override // com.aspose.slides.internal.p462vj.AbstractC11681yd, com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<InterfaceC1861h4> mo54772k4(List<InterfaceC1861h4> list, int i) {
        C12718qm c12718qm;
        if (mo54980wl()) {
            return null;
        }
        List<InterfaceC1861h4> list2 = new List<>();
        mo54953to(list2);
        if (!this.f39337c5.m8160m9()) {
            AbstractC11681yd.k4 k4Var = this.f39496rv;
            if (k4Var.f39499k4 == 0) {
                list2.addItem(new C11675v4(this.f39496rv.f39502x1.m8163x1(), this.f39496rv.f39501to, mo54973k4(new C12699gi(this, 0)), false));
                if (this.f39496rv.f39500kk) {
                    c12718qm = new C12718qm(this.f39339jd, 50, true, new C12699gi(this, -1), false);
                    list2.addItem(c12718qm);
                }
            } else {
                list2.addItem(new C11675v4(k4Var.f39502x1.m8163x1() - (this.f39337c5.m8163x1() * this.f39496rv.f39499k4), this.f39496rv.f39501to, mo54973k4(new C12699gi(this, 0)), false));
                list2.addItem(new C12718qm(0, 1000, false, new C12699gi(this, -1), true));
                list2.addItem(new C12694e0(this.f39337c5.m8150du(this.f39496rv.f39499k4), new C12699gi(this, -1), true));
                list2.addItem(new C11675v4(0, null, mo54973k4(new C12699gi(this, -1)), true));
                if (this.f39496rv.f39500kk) {
                    c12718qm = new C12718qm(this.f39339jd, 50, true, new C12699gi(this, -1), false);
                    list2.addItem(c12718qm);
                }
            }
        }
        mo54951kk(list2);
        m59229kk(true);
        return list2;
    }

    @Override // com.aspose.slides.internal.p462vj.AbstractC11681yd, com.aspose.slides.internal.p462vj.InterfaceC11646ar
    /* JADX INFO: renamed from: x1 */
    public boolean mo54804x1(List<InterfaceC1861h4> list) {
        m59229kk(false);
        return this.f39495ks;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x6 */
    public void mo49031x6() {
        C10768c5 c10768c5 = (C10768c5) this.f42282kk;
        this.f39338ck = C10149c5.m49925k4(c10768c5, this);
        this.f39337c5 = C1373dy.m8135k4(c10768c5.m52202gi()).m8140to();
        this.f39339jd = c10768c5.m52198bz().m17194x1(this.f39338ck);
        C4265c5 c4265c5M52208ts = c10768c5.m52208ts();
        this.f39340x6 = c4265c5M52208ts;
        m55029k4(c4265c5M52208ts);
        C12320ks c12320ksM54868k4 = m54868k4(c10768c5);
        c12320ksM54868k4.m57593fa(this.f39338ck.m49969du());
        m55030k4((C12314dy) c12320ksM54868k4);
    }

    @Override // com.aspose.slides.internal.p462vj.AbstractC11681yd, com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo48950k4(C12724ss c12724ss, int i) {
        ((AbstractC11681yd) this).f39494fa = mo54818x1(c12724ss);
        C12681ak c12681ak = new C12681ak();
        C12314dy c12314dy = ((AbstractC11681yd) this).f39494fa;
        if (c12314dy == null) {
            m59229kk(true);
            return null;
        }
        C10768c5 c10768c5 = (C10768c5) this.f42282kk;
        C1375h4 c1375h4M8145k4 = C1375h4.m8145k4(c12314dy.m8678x1());
        ((AbstractC11681yd) this).f39494fa.m8670kk(this.f39338ck.m49969du() - this.f39338ck.m49972h4());
        C12712m2.m59046k4(((AbstractC11681yd) this).f39494fa, this.f39338ck);
        ((AbstractC11681yd) this).f39494fa.m8667k4(7, c10768c5.m52201g8().Clone());
        C10161to c10161to = this.f39338ck;
        this.f39498yj = new C11662kk(c10161to, c10161to.m49967c5(), c10768c5.m52207sv(), c10768c5.m52209wp(), c10768c5.m52206ss(), c10768c5.m52203kp(), c12724ss.m59137ar());
        mo54953to(c12681ak);
        this.f39496rv = new AbstractC11681yd.k4((short) 0, c1375h4M8145k4, false, this.f39498yj);
        if (this.f39337c5.m8160m9()) {
            c12681ak.addItem(new C11675v4(this.f39496rv.f39502x1.m8163x1(), this.f39496rv.f39501to, mo54973k4(new C12699gi(this, 0)), false));
        } else {
            c12681ak.addItem(new C11675v4(this.f39496rv.f39502x1.m8163x1(), this.f39496rv.f39501to, mo54973k4(new C12699gi(this, 0)), false));
            c12681ak.addItem(new C12718qm(0, 1000, false, new C12699gi(this, -1), true));
            c12681ak.addItem(new C12694e0(0, 0, 0, new C12699gi(this, -1), true));
            c12681ak.addItem(new C11675v4(0, null, mo54973k4(new C12699gi(this, -1)), true));
        }
        mo54951kk(c12681ak);
        List<InterfaceC1861h4> list = new List<>();
        list.addItem(c12681ak);
        m59229kk(true);
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private C12320ks m54868k4(C10768c5 c10768c5) {
        C12320ks c12320ks = new C12320ks();
        char cM52204qm = c10768c5.m52204qm();
        int iM49984x1 = this.f39338ck.m49984x1(cM52204qm);
        int iM14331wy = c10768c5.m14331wy();
        if (!C10018x1.m49179m9(cM52204qm)) {
            c12320ks.m57607k4(C14117yj.m67537ne(cM52204qm), iM49984x1, null, iM14331wy >= 0 ? new int[]{iM14331wy} : null, null, 0);
        } else if (!C10018x1.m49178kk(cM52204qm)) {
            c12320ks.m57604k4(cM52204qm, iM49984x1, C10018x1.m49174h4(cM52204qm), 0, iM14331wy);
        }
        C12712m2.m59048k4(c12320ks, c10768c5.mo14334yd());
        C12712m2.m59044k4(c12320ks, c10768c5.m52205s7());
        C12712m2.m59047k4(c12320ks, c10768c5.m52200f9());
        return c12320ks;
    }

    @Override // com.aspose.slides.internal.p462vj.AbstractC11681yd, com.aspose.slides.internal.p462vj.InterfaceC11646ar
    /* JADX INFO: renamed from: k4 */
    public void mo54801k4(C12717os c12717os, C11666ne c11666ne) {
        if (c11666ne.m54915k4() == 1) {
            this.f39496rv.f39500kk = true;
            this.f39495ks = true;
        }
        c11666ne.m54916k4(1);
    }
}
