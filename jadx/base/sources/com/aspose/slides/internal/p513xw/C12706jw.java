package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p034b3.C1581c5;
import com.aspose.slides.internal.p034b3.C1593lr;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p048bv.InterfaceC1870up;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p406ss.AbstractC10346wl;
import com.aspose.slides.internal.p406ss.C10343um;
import com.aspose.slides.internal.p462vj.C11656e0;
import com.aspose.slides.internal.p513xw.AbstractC12741x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.jw */
/* JADX INFO: loaded from: classes5.dex */
public class C12706jw extends AbstractC12732up {

    /* JADX INFO: renamed from: ar */
    private int f42271ar;

    /* JADX INFO: renamed from: c5 */
    private C1593lr f42272c5;

    /* JADX INFO: renamed from: qq */
    private int f42273qq;

    /* JADX INFO: renamed from: uz */
    private C1581c5 f42274uz;

    /* JADX INFO: renamed from: wl */
    private AbstractC10346wl f42275wl;

    /* JADX INFO: renamed from: com.aspose.slides.internal.xw.jw$k4 */
    public static class k4 extends AbstractC12741x1 {

        /* JADX INFO: renamed from: du */
        private int f42276du;

        /* JADX INFO: renamed from: h4 */
        private int f42277h4;

        /* JADX INFO: renamed from: m9 */
        private int f42278m9 = 0;

        /* JADX INFO: renamed from: to */
        private C12706jw f42279to;

        /* JADX INFO: renamed from: com.aspose.slides.internal.xw.jw$k4$k4, reason: collision with other inner class name */
        public static class C19070k4 implements InterfaceC12683b3 {

            /* JADX INFO: renamed from: k4 */
            private k4 f42280k4;

            public C19070k4(k4 k4Var) {
                this.f42280k4 = k4Var;
            }

            @Override // com.aspose.slides.internal.p513xw.InterfaceC12683b3
            /* JADX INFO: renamed from: k4 */
            public final void mo58839k4(int i, int i2, AbstractC3524ks abstractC3524ks) {
                if (this.f42280k4.f42278m9 == 0) {
                    this.f42280k4.f42278m9 = i2;
                }
            }
        }

        public k4(C12706jw c12706jw, int i, int i2) {
            this.f42279to = c12706jw;
            this.f42277h4 = i;
            this.f42276du = i2;
        }

        @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
        /* JADX INFO: renamed from: ck */
        public C12724ss mo54956ck() {
            C12724ss c12724ssMo54956ck = super.mo54956ck();
            c12724ssMo54956ck.m59186x1(this.f42277h4);
            return c12724ssMo54956ck;
        }

        @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
        /* JADX INFO: renamed from: du */
        public boolean mo58884du() {
            return false;
        }

        @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
        /* JADX INFO: renamed from: dy */
        public InterfaceC12683b3 mo59003dy() {
            return new C19070k4(this);
        }

        /* JADX INFO: renamed from: fa */
        public final boolean m59004fa() {
            return this.f42278m9 != 0;
        }

        @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
        /* JADX INFO: renamed from: k4 */
        public int mo54957k4() {
            return this.f42276du;
        }

        @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
        /* JADX INFO: renamed from: kk */
        public InterfaceC12711lr mo58889kk() {
            return this.f42279to;
        }

        @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
        /* JADX INFO: renamed from: to */
        public InterfaceC12711lr mo58890to() {
            return null;
        }

        /* JADX INFO: renamed from: up */
        public final int m59005up() {
            return this.f42278m9;
        }

        @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
        /* JADX INFO: renamed from: x1 */
        public boolean mo58892x1() {
            return !this.f42279to.mo54980wl();
        }

        @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
        /* JADX INFO: renamed from: k4 */
        public List<InterfaceC1861h4> mo54958k4(C12724ss c12724ss, int i) {
            List<InterfaceC1861h4> list = new List<>();
            while (true) {
                InterfaceC12711lr interfaceC12711lrM59232ne = this.f42279to.m59232ne();
                if (interfaceC12711lrM59232ne == null) {
                    C12684bs.m58843k4(list);
                    this.f42279to.m59229kk(true);
                    return list;
                }
                C12724ss c12724ss2 = new C12724ss(0);
                c12724ss2.m59160k4(c12724ss.m59173ne());
                c12724ss2.m59186x1(c12724ss.m59153ix());
                c12724ss2.m59159k4(c12724ss.m59194yd());
                boolean zM27469x1 = C7019kk.m27469x1(interfaceC12711lrM59232ne, C11656e0.class);
                List<InterfaceC1861h4> listMo48950k4 = !interfaceC12711lrM59232ne.mo54980wl() ? interfaceC12711lrM59232ne.mo48950k4(c12724ss2, i) : null;
                if (listMo48950k4 != null && !zM27469x1) {
                    this.f42279to.m59273k4(listMo48950k4, list);
                }
            }
        }

        @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
        /* JADX INFO: renamed from: k4 */
        public void mo54959k4(InterfaceC1870up<C12717os> interfaceC1870up, C12724ss c12724ss) {
            C12714m9.m59058k4(this.f42279to, interfaceC1870up, c12724ss);
        }

        @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
        /* JADX INFO: renamed from: k4 */
        public void mo58887k4(C12720qw c12720qw, int i, AbstractC12741x1.k4 k4Var, AbstractC12741x1.k4 k4Var2) {
            if (i > 1) {
                int iM59060k4 = C12715ne.m59060k4(k4Var2, k4Var2.f42468k4, c12720qw.m59113ks().get_Item(0).m58941k4());
                this.f42278m9 = (c12720qw.f42499up - iM59060k4) + this.f42278m9;
            }
            c12720qw.m59116rv();
            m59367x1(c12720qw, 1, k4Var, k4Var2);
        }

        @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
        /* JADX INFO: renamed from: k4 */
        public void mo58888k4(C12720qw c12720qw, AbstractC12741x1.x1 x1Var) {
        }
    }

    public C12706jw(C12703j2 c12703j2, C10343um c10343um, C1581c5 c1581c5) {
        super(c10343um);
        this.f42273qq = 0;
        this.f42271ar = -1;
        mo54974k4(c12703j2);
        this.f42274uz = c1581c5;
    }

    /* JADX INFO: renamed from: h4 */
    private void m58997h4(int i) {
        this.f42271ar = i;
    }

    /* JADX INFO: renamed from: b3 */
    public final C10343um m58998b3() {
        return (C10343um) this.f42282kk;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.AbstractC12707k4, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: c5 */
    public int mo48941c5() {
        return this.f42271ar;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: du */
    public void mo58999du(int i) {
        this.f42273qq = i;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.AbstractC12707k4, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: dy */
    public int mo48944dy() {
        return this.f42273qq;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: gi */
    public C12691dq mo48946gi() {
        return C12691dq.f42215k4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo48950k4(C12724ss c12724ss, int i) {
        throw new InvalidOperationException();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.InterfaceC12685bv
    /* JADX INFO: renamed from: kp */
    public C12691dq mo48954kp() {
        return C12691dq.f42215k4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: s7 */
    public C12691dq mo48956s7() {
        return C12691dq.f42215k4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x1 */
    public void mo48960x1(C1606x1 c1606x1) {
        if (C14113y2.m67363du(m58998b3().m50347ts(), "xsl-footnote-separator") || C14113y2.m67363du(m58998b3().m50347ts(), "xsl-before-float-separator")) {
            this.f42274uz.mo8483x1((C1581c5) c1606x1);
        } else {
            this.f42272c5.m8594k4((C1581c5) c1606x1);
        }
    }

    /* JADX INFO: renamed from: yd */
    public final void m59000yd() {
        int iM8678x1;
        int iMo8658e_;
        boolean z;
        int iM50339g8;
        boolean z2 = true;
        if (C14113y2.m67363du(m58998b3().m50347ts(), "xsl-footnote-separator") || C14113y2.m67363du(m58998b3().m50347ts(), "xsl-before-float-separator")) {
            iM8678x1 = this.f42274uz.m8678x1();
            iMo8658e_ = this.f42274uz.mo8658e_();
            z = iMo8658e_ == 0;
            iM50339g8 = 13;
        } else {
            iM8678x1 = this.f42272c5.m8678x1();
            iMo8658e_ = this.f42272c5.mo8658e_();
            iM50339g8 = this.f42275wl.m50339g8();
            z = false;
        }
        mo58999du(iM8678x1);
        m58997h4(iMo8658e_);
        k4 k4Var = new k4(this, iM8678x1, iM50339g8);
        k4Var.m59365k4(iMo8658e_, z);
        if (!k4Var.m59004fa() || z) {
            return;
        }
        String strM59338h4 = mo54979qq().mo58913ar().m59332x1().m59338h4();
        InterfaceC12731um interfaceC12731umM58940k4 = C12697fa.m58940k4(m58998b3().m14111q_().m59580u4());
        boolean z3 = this.f42275wl.m50343qm() != 42;
        if (this.f42275wl.m50343qm() != 57 && this.f42275wl.m50343qm() != 42) {
            z2 = false;
        }
        interfaceC12731umM58940k4.mo53634k4(this, this.f42275wl.m14105ks(), strM59338h4, k4Var.m59005up(), z2, z3, m58998b3().m14106m_());
    }

    public C12706jw(C12703j2 c12703j2, C10343um c10343um, AbstractC10346wl abstractC10346wl) {
        super(c10343um);
        this.f42273qq = 0;
        this.f42271ar = -1;
        mo54974k4(c12703j2);
        this.f42275wl = abstractC10346wl;
        this.f42272c5 = m59235um().m59350x1(this.f42275wl.mo14084ix());
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public C1606x1 mo48951k4(C1606x1 c1606x1) {
        return (C14113y2.m67363du(m58998b3().m50347ts(), "xsl-footnote-separator") || C14113y2.m67363du(m58998b3().m50347ts(), "xsl-before-float-separator")) ? this.f42274uz : this.f42272c5;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public void mo49023k4(InterfaceC1870up<C12717os> interfaceC1870up, C12724ss c12724ss) {
        C12714m9.m59058k4(this, interfaceC1870up, c12724ss);
        mo58877ak();
        this.f42272c5 = null;
    }
}
