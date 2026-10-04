package com.aspose.slides.internal.p462vj;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.OooO00o;
import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p048bv.InterfaceC1870up;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.internal.p486wy.C12314dy;
import com.aspose.slides.internal.p513xw.AbstractC12727to;
import com.aspose.slides.internal.p513xw.C12681ak;
import com.aspose.slides.internal.p513xw.C12694e0;
import com.aspose.slides.internal.p513xw.C12699gi;
import com.aspose.slides.internal.p513xw.C12712m2;
import com.aspose.slides.internal.p513xw.C12717os;
import com.aspose.slides.internal.p513xw.C12718qm;
import com.aspose.slides.internal.p513xw.C12724ss;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.vj.yd */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11681yd extends AbstractC12727to implements InterfaceC11646ar {

    /* JADX INFO: renamed from: fa */
    protected C12314dy f39494fa;

    /* JADX INFO: renamed from: ks */
    protected boolean f39495ks;

    /* JADX INFO: renamed from: rv */
    protected k4 f39496rv;

    /* JADX INFO: renamed from: up */
    protected C4265c5 f39497up;

    /* JADX INFO: renamed from: yj */
    protected C11662kk f39498yj;

    /* JADX INFO: renamed from: com.aspose.slides.internal.vj.yd$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public short f39499k4;

        /* JADX INFO: renamed from: kk */
        public boolean f39500kk;

        /* JADX INFO: renamed from: to */
        public C11662kk f39501to;

        /* JADX INFO: renamed from: x1 */
        public C1375h4 f39502x1;

        public k4(short s, C1375h4 c1375h4, boolean z, C11662kk c11662kk) {
            this.f39499k4 = s;
            this.f39502x1 = c1375h4;
            this.f39500kk = z;
            this.f39501to = c11662kk;
        }
    }

    public AbstractC11681yd() {
        this.f39494fa = null;
        this.f39497up = null;
        this.f39498yj = null;
        this.f39495ks = false;
        this.f39496rv = null;
    }

    /* JADX INFO: renamed from: b3 */
    public C12314dy mo54821b3() {
        return this.f39494fa;
    }

    /* JADX INFO: renamed from: du */
    public String mo54798du(C12717os c12717os) {
        return C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: h4 */
    public C1375h4 mo54911h4(int i) {
        return C1375h4.m8145k4(this.f39494fa.m8678x1());
    }

    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo54799k4(List<InterfaceC1861h4> list) {
        return list;
    }

    /* JADX INFO: renamed from: kk */
    public void mo54951kk(List<InterfaceC1861h4> list) {
        C4265c5 c4265c5 = this.f39497up;
        if (c4265c5 != null) {
            int iM17166x1 = this.f39497up.m17166x1(false, this) + c4265c5.m17165x1(false);
            if (iM17166x1 > 0) {
                list.addItem(new C12718qm(0, 1000, false, new C12699gi(this, -1), true));
                list.addItem(new C12694e0(iM17166x1, 0, 0, new C12699gi(this, -1), true));
            }
        }
    }

    /* JADX INFO: renamed from: to */
    public void mo54953to(List<InterfaceC1861h4> list) {
        C4265c5 c4265c5 = this.f39497up;
        if (c4265c5 != null) {
            int iM17154k4 = this.f39497up.m17154k4(false, (InterfaceC1981h4) this) + c4265c5.m17153k4(false);
            if (iM17154k4 > 0) {
                list.addItem(new C12718qm(0, 1000, false, new C12699gi(this, -1), true));
                list.addItem(new C12694e0(iM17154k4, 0, 0, new C12699gi(this, -1), true));
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public List<InterfaceC1861h4> mo54803x1(List<InterfaceC1861h4> list, int i) {
        return mo54799k4(list);
    }

    public AbstractC11681yd(AbstractC3524ks abstractC3524ks) {
        super(abstractC3524ks);
        this.f39494fa = null;
        this.f39497up = null;
        this.f39498yj = null;
        this.f39495ks = false;
        this.f39496rv = null;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo54772k4(List<InterfaceC1861h4> list, int i) {
        if (mo54980wl()) {
            return null;
        }
        List<InterfaceC1861h4> list2 = new List<>();
        mo54953to(list2);
        list2.addItem(new C11675v4(this.f39496rv.f39502x1.m8163x1(), this.f39496rv.f39501to, mo54973k4(new C12699gi(this, 0)), true));
        mo54951kk(list2);
        m59229kk(true);
        return list2;
    }

    /* JADX INFO: renamed from: kk */
    public boolean mo54802kk(List<InterfaceC1861h4> list, int i) {
        return mo54804x1(list);
    }

    /* JADX INFO: renamed from: x1 */
    public C12314dy mo54818x1(C12724ss c12724ss) {
        return this.f39494fa;
    }

    @Override // com.aspose.slides.internal.p462vj.InterfaceC11646ar
    /* JADX INFO: renamed from: k4 */
    public final List<InterfaceC1861h4> mo54800k4(List<InterfaceC1861h4> list, int i, int i2) {
        return mo54772k4(list, i);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x1 */
    public void mo48960x1(C1606x1 c1606x1) {
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo48950k4(C12724ss c12724ss, int i) {
        C12314dy c12314dyMo54818x1 = mo54818x1(c12724ss);
        this.f39494fa = c12314dyMo54818x1;
        if (c12314dyMo54818x1 == null) {
            m59229kk(true);
            return null;
        }
        this.f39498yj = mo54822k4(c12724ss);
        this.f39496rv = new k4((short) 0, mo54911h4(c12724ss.m59153ix()), false, this.f39498yj);
        C12681ak c12681ak = new C12681ak();
        mo54953to(c12681ak);
        c12681ak.addItem(new C11675v4(this.f39496rv.f39502x1.m8163x1(), this.f39498yj, mo54973k4(new C12699gi(this, 0)), false));
        mo54951kk(c12681ak);
        m59229kk(true);
        List<InterfaceC1861h4> list = new List<>();
        list.addItem(c12681ak);
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m55032x1(C12314dy c12314dy, C12724ss c12724ss) {
        int iOooO00o;
        int iM8149du;
        double dM59174qq = c12724ss.m59174qq();
        if (dM59174qq < 0.0d) {
            iM8149du = this.f39496rv.f39502x1.m8161to();
        } else {
            if (dM59174qq <= 0.0d) {
                iOooO00o = 0;
                c12314dy.m8679x1(this.f39496rv.f39502x1.m8163x1() + iOooO00o);
                c12314dy.m57578up(iOooO00o);
            }
            iM8149du = this.f39496rv.f39502x1.m8149du();
        }
        iOooO00o = OooO00o.OooO00o(dM59174qq, iM8149du, 14);
        c12314dy.m8679x1(this.f39496rv.f39502x1.m8163x1() + iOooO00o);
        c12314dy.m57578up(iOooO00o);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public C1606x1 mo48951k4(C1606x1 c1606x1) {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public C11662kk mo54822k4(C12724ss c12724ss) {
        return c12724ss.m59137ar();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public void mo49023k4(InterfaceC1870up<C12717os> interfaceC1870up, C12724ss c12724ss) {
        mo54817v4();
        C12314dy c12314dyMo54821b3 = mo54821b3();
        if (c12314dyMo54821b3.m8659f_() > 0 || c12314dyMo54821b3.m8654du() > 0) {
            m55031k4(c12314dyMo54821b3, c12724ss);
            m55032x1(c12314dyMo54821b3, c12724ss);
            C4265c5 c4265c5 = this.f39497up;
            if (c4265c5 != null) {
                C12712m2.m59041k4((C1606x1) c12314dyMo54821b3, c4265c5, false, false, (InterfaceC1981h4) this);
                C12712m2.m59037k4(c12314dyMo54821b3, this.f39497up, this);
            }
            this.f42381to.mo48960x1(c12314dyMo54821b3);
        }
        while (interfaceC1870up.mo9764x1()) {
            interfaceC1870up.mo9760kk();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55029k4(C4265c5 c4265c5) {
        this.f39497up = c4265c5;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean mo54804x1(List<InterfaceC1861h4> list) {
        m59229kk(false);
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55030k4(C12314dy c12314dy) {
        this.f39494fa = c12314dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55031k4(C12314dy c12314dy, C12724ss c12724ss) {
        c12314dy.m57573ks(this.f39498yj.m54898m9());
    }

    /* JADX INFO: renamed from: k4 */
    public void mo54801k4(C12717os c12717os, C11666ne c11666ne) {
    }
}
