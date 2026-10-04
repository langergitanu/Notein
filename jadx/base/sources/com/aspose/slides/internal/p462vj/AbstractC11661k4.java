package com.aspose.slides.internal.p462vj;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p034b3.C1594m9;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.internal.p409sv.AbstractC10778k4;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p486wy.C12312ck;
import com.aspose.slides.internal.p486wy.C12314dy;
import com.aspose.slides.internal.p513xw.C12712m2;
import com.aspose.slides.internal.p513xw.C12724ss;

/* JADX INFO: renamed from: com.aspose.slides.internal.vj.k4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11661k4 extends AbstractC11681yd {
    public AbstractC11661k4(AbstractC10778k4 abstractC10778k4) {
        super(abstractC10778k4);
    }

    /* JADX INFO: renamed from: wy */
    private C12312ck m54878wy() {
        AbstractC10778k4 abstractC10778k4 = (AbstractC10778k4) this.f42282kk;
        C12023wl c12023wl = new C12023wl(abstractC10778k4.mo52262kp(), abstractC10778k4.mo52261gi());
        int iM14331wy = abstractC10778k4.m14331wy();
        C11659ix c11659ix = new C11659ix(abstractC10778k4, this, c12023wl.Clone());
        C12007ix c12007ixClone = c11659ix.m54877x1().Clone();
        C4265c5 c4265c5M52265e0 = abstractC10778k4.m52265e0();
        m55029k4(c4265c5M52265e0);
        c12007ixClone.m56572to(c12007ixClone.m56551ck() + c4265c5M52265e0.m17151k4(0, false) + c4265c5M52265e0.m17152k4(0, false, this));
        int i = (iM14331wy == -1 || (iM14331wy & 1) == 0) ? 2 : 3;
        c12007ixClone.m56566kk(c12007ixClone.m56557jd() + c4265c5M52265e0.m17151k4(i, false) + c4265c5M52265e0.m17152k4(i, false, this));
        C1606x1 c1606x1Mo54816yd = mo54816yd();
        C12712m2.m59048k4(c1606x1Mo54816yd, abstractC10778k4.mo14334yd());
        m59226k4((C1594m9) c1606x1Mo54816yd);
        C12312ck c12312ck = new C12312ck(c1606x1Mo54816yd, iM14331wy);
        C12712m2.m59047k4(c12312ck, abstractC10778k4.m52270wp());
        C12712m2.m59048k4(c12312ck, abstractC10778k4.mo14334yd());
        c12312ck.m8679x1(c11659ix.m54874kk().m56865x1());
        c12312ck.m8670kk(c11659ix.m54874kk().m56862kk());
        c12312ck.m57559k4(c12007ixClone.Clone());
        c12312ck.m57564x1(c11659ix.m54875to());
        c12312ck.m57573ks(0);
        C12712m2.m59042k4((C1606x1) c12312ck, c4265c5M52265e0, false, false, false, false, (InterfaceC1981h4) this);
        C12712m2.m59052x1(c12312ck, c4265c5M52265e0, false, false, false, false, this);
        C12712m2.m59037k4(c12312ck, c4265c5M52265e0, this);
        return c12312ck;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12707k4, com.aspose.slides.internal.p057c6.InterfaceC1981h4
    /* JADX INFO: renamed from: k4 */
    public int mo10099k4(int i, AbstractC3524ks abstractC3524ks) {
        return i != 7 ? i != 8 ? i != 12 ? super.mo10099k4(i, abstractC3524ks) : mo54818x1((C12724ss) null).mo8658e_() : ((AbstractC10778k4) abstractC3524ks).mo52261gi() : ((AbstractC10778k4) abstractC3524ks).mo52262kp();
    }

    /* JADX INFO: renamed from: yd */
    public abstract C1606x1 mo54816yd();

    @Override // com.aspose.slides.internal.p462vj.AbstractC11681yd, com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo48950k4(C12724ss c12724ss, int i) {
        m55030k4((C12314dy) m54878wy());
        return super.mo48950k4(c12724ss, i);
    }

    @Override // com.aspose.slides.internal.p462vj.AbstractC11681yd
    /* JADX INFO: renamed from: k4 */
    public C11662kk mo54822k4(C12724ss c12724ss) {
        AbstractC10778k4 abstractC10778k4 = (AbstractC10778k4) this.f42282kk;
        return new C11662kk(mo54818x1(c12724ss).m8654du(), abstractC10778k4.m52264bz(), abstractC10778k4.m52267qm(), abstractC10778k4.m52266g8(), abstractC10778k4.m52269sv(), c12724ss.m59137ar());
    }
}
