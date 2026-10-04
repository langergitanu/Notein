package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p034b3.C1581c5;
import com.aspose.slides.internal.p034b3.C1589jd;
import com.aspose.slides.internal.p034b3.C1602uz;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p048bv.InterfaceC1866m9;
import com.aspose.slides.internal.p048bv.InterfaceC1870up;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p150gi.C4266c6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p371qw.C9951dy;
import com.aspose.slides.internal.p393s7.C10159m9;
import com.aspose.slides.internal.p393s7.C10161to;
import com.aspose.slides.internal.p409sv.C10782m9;
import com.aspose.slides.internal.p462vj.C11663ks;
import com.aspose.slides.internal.p462vj.C11668rv;
import com.aspose.slides.internal.p462vj.C11677wy;
import com.aspose.slides.internal.p462vj.InterfaceC11646ar;
import com.aspose.slides.internal.p513xw.AbstractC12732up;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.ck */
/* JADX INFO: loaded from: classes5.dex */
public class C12690ck extends AbstractC12732up implements InterfaceC12734v4 {

    /* JADX INFO: renamed from: ar */
    private int f42203ar;

    /* JADX INFO: renamed from: b3 */
    private C1375h4 f42204b3;

    /* JADX INFO: renamed from: bv */
    private boolean f42205bv;

    /* JADX INFO: renamed from: c5 */
    protected InterfaceC1866m9<InterfaceC12711lr> f42206c5;

    /* JADX INFO: renamed from: lr */
    private boolean f42207lr;

    /* JADX INFO: renamed from: qq */
    private InterfaceC1984kk f42208qq;

    /* JADX INFO: renamed from: um */
    private boolean f42209um;

    /* JADX INFO: renamed from: uz */
    private C1581c5 f42210uz;

    /* JADX INFO: renamed from: v4 */
    private boolean f42211v4;

    /* JADX INFO: renamed from: wl */
    private int f42212wl;

    /* JADX INFO: renamed from: yd */
    private C1375h4 f42213yd;

    /* JADX INFO: renamed from: com.aspose.slides.internal.xw.ck$k4 */
    public static class k4 extends C12739wp {

        /* JADX INFO: renamed from: kk */
        private C12690ck f42214kk;

        public k4(C12690ck c12690ck) {
            super(c12690ck);
            this.f42458k4 = new List<>(10);
            this.f42214kk = c12690ck;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m58904k4(int i) {
            List<InterfaceC12711lr> listM59225k4 = this.f42214kk.m59225k4((i + 1) - this.f42458k4.size());
            if (listM59225k4 != null) {
                this.f42458k4.addRange(listM59225k4);
            }
            return i < this.f42458k4.size();
        }

        @Override // com.aspose.slides.internal.p513xw.C12739wp, com.aspose.slides.internal.p048bv.InterfaceC1866m9, com.aspose.slides.internal.p048bv.InterfaceC1870up
        /* JADX INFO: renamed from: x1 */
        public boolean mo9764x1() {
            return this.f42460x1 < this.f42458k4.size() || m58904k4(this.f42460x1);
        }
    }

    public C12690ck(C10782m9 c10782m9) {
        super(c10782m9);
        this.f42212wl = 12000;
        this.f42203ar = 2000;
        this.f42206c5 = new k4(this);
    }

    /* JADX INFO: renamed from: to */
    private C11677wy m58899to(InterfaceC12711lr interfaceC12711lr) {
        C11677wy c11677wy = new C11677wy(m58901b3(), this.f42208qq, this.f42212wl, this.f42203ar);
        List<InterfaceC12711lr> list = new List<>();
        while (true) {
            list.addItem(interfaceC12711lr);
            if (!this.f42206c5.mo9764x1()) {
                break;
            }
            interfaceC12711lr = this.f42206c5.mo9760kk();
            if (!C7019kk.m27469x1(interfaceC12711lr, InterfaceC11646ar.class)) {
                this.f42206c5.mo9756du();
                break;
            }
        }
        c11677wy.m59223a_(list);
        return c11677wy;
    }

    /* JADX INFO: renamed from: wy */
    private void m58900wy() {
        this.f42209um = false;
        this.f42205bv = false;
        this.f42211v4 = false;
        this.f42207lr = false;
        this.f42213yd = null;
        this.f42204b3 = null;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: ak */
    public void mo58877ak() {
        C1581c5 c1581c5 = this.f42210uz;
        if (c1581c5 != null) {
            C12712m2.m59037k4(c1581c5, m58901b3().m52298bz(), this);
            super.mo58877ak();
        }
    }

    /* JADX INFO: renamed from: b3 */
    public final C10782m9 m58901b3() {
        return (C10782m9) this.f42282kk;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.AbstractC12707k4, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: c5 */
    public int mo48941c5() {
        C1581c5 c1581c5 = this.f42210uz;
        if (c1581c5 != null) {
            return c1581c5.mo8658e_();
        }
        return -1;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: c6 */
    public C4266c6 mo49020c6() {
        return m58901b3().m52304gi();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12707k4, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: ck */
    public boolean mo48943ck() {
        return true;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: dq */
    public C4266c6 mo49021dq() {
        return m58901b3().m52302f9();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.AbstractC12707k4, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: dy */
    public int mo48944dy() {
        C1581c5 c1581c5 = this.f42210uz;
        return c1581c5 != null ? c1581c5.m8678x1() : super.mo48944dy();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo58902k4(InterfaceC12711lr interfaceC12711lr, C12724ss c12724ss, C12724ss c12724ss2, int i, Stack<InterfaceC12711lr> stack, C12717os c12717os, InterfaceC12711lr interfaceC12711lr2) {
        c12724ss2.m59165k4(c12724ss);
        if (C7019kk.m27469x1(interfaceC12711lr, C11677wy.class)) {
            c12724ss2.m59186x1(m58901b3().m52311os().mo9884to() != 0 ? m58901b3().m52311os().mo9884to() : mo48944dy());
        }
        if (interfaceC12711lr == this.f42375du.get_Item(0)) {
            c12724ss2.m59157k4(16);
        }
        if (stack == null) {
            return interfaceC12711lr.mo48950k4(c12724ss2, i);
        }
        C11677wy c11677wy = (C11677wy) C7019kk.m27452k4((Object) interfaceC12711lr, C11677wy.class);
        return c11677wy != null ? c11677wy.m55013k4(c12724ss2, i, (C12699gi) c12717os) : interfaceC12711lr.mo58879k4(c12724ss2, i, stack, c12717os, interfaceC12711lr2);
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12734v4
    /* JADX INFO: renamed from: kk */
    public final void mo49026kk(C12721ri c12721ri, C1375h4 c1375h4) {
        if (c1375h4 == null) {
            if (C12721ri.f42330k4 == c12721ri) {
                this.f42211v4 = true;
            } else {
                this.f42207lr = true;
            }
        }
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12707k4, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: rv */
    public boolean mo55014rv() {
        return true;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x1 */
    public void mo48960x1(C1606x1 c1606x1) {
        if (this.f42210uz != null) {
            C1602uz c1602uz = (C1602uz) C7019kk.m27452k4((Object) c1606x1, C1602uz.class);
            if (c1602uz != null) {
                this.f42210uz.m8507k4(c1602uz);
            } else {
                this.f42210uz.mo8483x1((C1581c5) c1606x1);
            }
        }
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x6 */
    public void mo49031x6() {
        super.mo49031x6();
        C10782m9 c10782m9M58901b3 = m58901b3();
        C10159m9 c10159m9Mo14168c_ = c10782m9M58901b3.mo14107n_().mo14168c_();
        C10161to c10161toM49955k4 = c10159m9Mo14168c_.m49955k4(c10782m9M58901b3.m52303g8().m17246k4(c10159m9Mo14168c_)[0], m58901b3().m52303g8().f11682k4.mo9886x1(this), c10782m9M58901b3.m52303g8().m17248x1());
        this.f42212wl = c10161toM49955k4.m49969du();
        this.f42203ar = -c10161toM49955k4.m49972h4();
        this.f42208qq = c10782m9M58901b3.m52319vh().m17133to(this).mo9877dy();
        this.f42405ne = c10782m9M58901b3.m52300e0().f11654m9.mo9886x1(this);
        this.f42402ix = c10782m9M58901b3.m52300e0().f11650dy.mo9886x1(this);
        ((AbstractC12732up) this).f42401fa = c10782m9M58901b3.m52300e0().f11649du.mo17204rv().m17133to(this).mo9877dy().mo9886x1(this);
        this.f42408up = c10782m9M58901b3.m52300e0().f11651h4.mo17204rv().m17133to(this).mo9877dy().mo9886x1(this);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: xk */
    public C4266c6 mo49032xk() {
        return m58901b3().m52315s7();
    }

    /* JADX INFO: renamed from: yd */
    public final int m58903yd() {
        C1581c5 c1581c5 = this.f42210uz;
        if (c1581c5 == null || c1581c5.m8584v4() == null) {
            return 0;
        }
        return this.f42210uz.m8584v4().size();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo48950k4(C12724ss c12724ss, int i) {
        return mo58879k4(c12724ss, i, null, null, null);
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12734v4
    /* JADX INFO: renamed from: x1 */
    public final void mo49030x1(C12721ri c12721ri, C1375h4 c1375h4) {
        if (c1375h4 == null) {
            if (C12721ri.f42330k4 == c12721ri) {
                this.f42209um = true;
            } else {
                this.f42205bv = true;
            }
        }
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.AbstractC12707k4, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo58879k4(C12724ss c12724ss, int i, Stack<InterfaceC12711lr> stack, C12717os c12717os, InterfaceC12711lr interfaceC12711lr) {
        m58900wy();
        return super.mo58879k4(c12724ss, i, stack, c12717os, interfaceC12711lr);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087 A[PHI: r4
      0x0087: PHI (r4v5 com.aspose.slides.Collections.Generic.List<com.aspose.slides.internal.vj.ks>) = 
      (r4v3 com.aspose.slides.Collections.Generic.List<com.aspose.slides.internal.vj.ks>)
      (r4v4 com.aspose.slides.Collections.Generic.List<com.aspose.slides.internal.vj.ks>)
     binds: [B:30:0x0085, B:33:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[LOOP:0: B:3:0x0003->B:42:?, LOOP_END, SYNTHETIC] */
    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo54981x1(int i) {
        C12733uz c12733uz = null;
        C9951dy c9951dyM59311to = null;
        List list = null;
        while (this.f42206c5.mo9764x1()) {
            InterfaceC12711lr interfaceC12711lrMo9760kk = this.f42206c5.mo9760kk();
            if (!C7019kk.m27469x1(interfaceC12711lrMo9760kk, InterfaceC11646ar.class) || C7019kk.m27469x1(interfaceC12711lrMo9760kk, C11663ks.class)) {
                if (C7019kk.m27469x1(interfaceC12711lrMo9760kk, C11663ks.class)) {
                    C11663ks c11663ks = (C11663ks) C7019kk.m27452k4((Object) interfaceC12711lrMo9760kk, C11663ks.class);
                    if (c12733uz == null) {
                        c12733uz = new C12733uz(this);
                    }
                    if (c9951dyM59311to == null) {
                        c9951dyM59311to = c12733uz.m59311to();
                    }
                    if (c9951dyM59311to == null || C11668rv.m54919x1().m54929kk()) {
                        List<C11663ks> listM59303dy = c12733uz.m59303dy();
                        if (listM59303dy != null) {
                            listM59303dy.addItem(c11663ks);
                        } else {
                            listM59303dy = c12733uz.m59306k4(true);
                            c11663ks.mo54974k4(this);
                            if (listM59303dy != null) {
                            }
                        }
                    } else {
                        if (list == null) {
                            list = new List();
                        }
                        int iM54922k4 = C11668rv.m54919x1().m54922k4(c9951dyM59311to, c11663ks.mo59012up());
                        if (iM54922k4 == -1) {
                            C11668rv.m54919x1().m54924k4(c9951dyM59311to, c11663ks);
                        } else if (C11668rv.m54919x1().m54928k4(c9951dyM59311to, iM54922k4)) {
                            c11663ks.mo54974k4(this);
                            interfaceC12711lrMo9760kk = c11663ks.m59232ne();
                        }
                    }
                }
                if (i >= this.f42375du.size()) {
                    return true;
                }
            } else {
                interfaceC12711lrMo9760kk = m58899to(interfaceC12711lrMo9760kk);
            }
            mo54975kk(interfaceC12711lrMo9760kk);
            if (i >= this.f42375du.size()) {
            }
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public C1606x1 mo48951k4(C1606x1 c1606x1) {
        C12690ck c12690ck;
        if (this.f42210uz == null) {
            C1581c5 c1581c5 = new C1581c5();
            this.f42210uz = c1581c5;
            c1581c5.m8679x1(super.mo48944dy());
            this.f42210uz.m8676to(m58901b3().m14331wy());
            C12712m2.m59032k4(this.f42210uz, m58901b3().mo17279ss(), m58901b3().mo17280wp());
            this.f42381to.mo48951k4(this.f42210uz);
            C12712m2.m59034k4(this.f42210uz, m58901b3().m52314ri());
            C12712m2.m59048k4(this.f42210uz, m58901b3().mo14334yd());
            C12712m2.m59045k4(this.f42210uz, m58901b3().m52312qm(), this);
            C12712m2.m59049kk(this.f42210uz, m58901b3().m52309m2());
            C12712m2.m59042k4((C1606x1) this.f42210uz, m58901b3().m52298bz(), this.f42209um, this.f42205bv, false, false, (InterfaceC1981h4) this);
            C12712m2.m59052x1(this.f42210uz, m58901b3().m52298bz(), this.f42211v4, this.f42207lr, false, false, this);
            c12690ck = this;
            C12712m2.m59036k4(c12690ck.f42210uz, m58901b3().m52298bz(), c12690ck.f42405ne, c12690ck.f42402ix, this);
            m59277k4((C1589jd) c12690ck.f42210uz);
        } else {
            c12690ck = this;
        }
        return c12690ck.f42210uz;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public void mo49023k4(InterfaceC1870up<C12717os> interfaceC1870up, C12724ss c12724ss) {
        mo48951k4((C1606x1) null);
        if (c12724ss.m59138b3() > 0) {
            m59272k4(0.0d, C1375h4.m8145k4(c12724ss.m59138b3()));
        }
        C12724ss c12724ss2 = new C12724ss(0);
        c12724ss2.m59156k4(c12724ss.m59183wl());
        if (c12724ss.m59184wy() > 0) {
            c12724ss2.m59149dy(c12724ss.m59184wy());
        }
        List list = new List();
        C12717os c12717os = null;
        C12717os c12717os2 = null;
        InterfaceC12711lr interfaceC12711lrM59077to = null;
        while (interfaceC1870up.mo9764x1()) {
            C12717os c12717osMo9760kk = interfaceC1870up.mo9760kk();
            if (c12717osMo9760kk.m59073du() >= 0) {
                if (c12717os == null) {
                    c12717os = c12717osMo9760kk;
                }
                c12717os2 = c12717osMo9760kk;
            }
            if (C7019kk.m27469x1(c12717osMo9760kk, C12696f9.class)) {
                c12717osMo9760kk = c12717osMo9760kk.mo58860kk();
            }
            if (c12717osMo9760kk != null && (c12717osMo9760kk.m59077to() != this || C7019kk.m27469x1(c12717osMo9760kk, AbstractC12732up.x1.class))) {
                list.addItem(c12717osMo9760kk);
                interfaceC12711lrM59077to = c12717osMo9760kk.m59077to();
            }
        }
        mo54817v4();
        m59227k4(true, m59239x1(c12717os), m59230kk(c12717os2));
        C12695em c12695em = new C12695em(new C1869to(list));
        while (true) {
            InterfaceC12711lr interfaceC12711lrM58935h4 = c12695em.m58935h4();
            if (interfaceC12711lrM58935h4 == null) {
                m59227k4(false, m59239x1(c12717os), m59230kk(c12717os2));
                C12712m2.m59030k4(this.f42210uz, c12724ss.m59183wl(), this.f42213yd, this.f42204b3);
                mo58877ak();
                this.f42210uz = null;
                m58900wy();
                m59233to(c12717os2);
                return;
            }
            c12724ss2.m59158k4(128, c12724ss.m59168kk() && interfaceC12711lrM58935h4 == interfaceC12711lrM59077to);
            c12724ss2.m59160k4(c12724ss.m59173ne());
            interfaceC12711lrM58935h4.mo49023k4(c12695em, c12724ss2);
        }
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12734v4
    /* JADX INFO: renamed from: k4 */
    public final void mo49025k4(C12721ri c12721ri, C1375h4 c1375h4) {
        if (C12721ri.f42330k4 == c12721ri) {
            this.f42213yd = c1375h4;
        } else {
            this.f42204b3 = c1375h4;
        }
    }
}
