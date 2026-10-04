package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p048bv.InterfaceC1870up;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10008c5;
import com.aspose.slides.internal.p513xw.C12684bs;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.framework.common.ExceptionCode;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.x1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12741x1 {

    /* JADX INFO: renamed from: du */
    private boolean f42461du = true;

    /* JADX INFO: renamed from: h4 */
    private int f42462h4;

    /* JADX INFO: renamed from: k4 */
    protected int f42463k4;

    /* JADX INFO: renamed from: kk */
    protected C1375h4 f42464kk;

    /* JADX INFO: renamed from: to */
    private List<k4> f42465to;

    /* JADX INFO: renamed from: x1 */
    protected C1375h4 f42466x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.xw.x1$k4 */
    public static class k4 extends C12705jd {

        /* JADX INFO: renamed from: du */
        private int f42467du;

        /* JADX INFO: renamed from: m9 */
        private AbstractC12741x1 f42469m9;

        /* JADX INFO: renamed from: to */
        private int f42470to;

        /* JADX INFO: renamed from: k4 */
        public int f42468k4 = 0;

        /* JADX INFO: renamed from: x1 */
        public int f42471x1 = 0;

        public k4(int i, int i2, AbstractC12741x1 abstractC12741x1) {
            this.f42470to = i;
            this.f42467du = i2;
            this.f42469m9 = abstractC12741x1;
        }

        /* JADX INFO: renamed from: du */
        public final int m59368du() {
            return this.f42470to;
        }

        /* JADX INFO: renamed from: h4 */
        public final int m59369h4() {
            return this.f42467du;
        }

        /* JADX INFO: renamed from: k4 */
        public final AbstractC12725sv m59370k4(C12717os c12717os) {
            int i;
            while (size() > this.f42468k4 && !((AbstractC12729ts) C10008c5.m49136k4(this)).mo58895yj()) {
                C10008c5.m49138x1(this);
            }
            if (size() <= this.f42468k4) {
                clear();
                return null;
            }
            if (m59369h4() == 163 && this.f42469m9.mo58886h4()) {
                addItem(new C12718qm(0, -1000, false, c12717os, false));
                i = 1;
            } else {
                addItem(new C12718qm(0, 1000, false, null, false));
                addItem(new C12694e0(0, ExceptionCode.CRASH_EXCEPTION, 0, null, false));
                addItem(new C12718qm(0, -1000, false, c12717os, false));
                i = 3;
            }
            this.f42471x1 = i;
            return this;
        }

        @Override // com.aspose.slides.internal.p513xw.C12705jd, com.aspose.slides.internal.p513xw.AbstractC12725sv
        /* JADX INFO: renamed from: m9 */
        public AbstractC12725sv mo55023m9() {
            return m59370k4((C12717os) null);
        }

        /* JADX INFO: renamed from: x1 */
        public final k4 m59371x1(C12717os c12717os) {
            AbstractC12725sv abstractC12725svM59370k4 = m59370k4(c12717os);
            if (abstractC12725svM59370k4 == null) {
                return null;
            }
            k4 k4Var = new k4(this.f42470to, this.f42467du, this.f42469m9);
            k4Var.addRange(abstractC12725svM59370k4);
            k4Var.f42471x1 = this.f42471x1;
            return k4Var;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.xw.x1$x1 */
    public static class x1 extends C12699gi {

        /* JADX INFO: renamed from: du */
        public int f42472du;

        /* JADX INFO: renamed from: dy */
        public int f42473dy;

        /* JADX INFO: renamed from: h4 */
        public int f42474h4;

        /* JADX INFO: renamed from: k4 */
        public double f42475k4;

        /* JADX INFO: renamed from: kk */
        public int f42476kk;

        /* JADX INFO: renamed from: m9 */
        public int f42477m9;

        /* JADX INFO: renamed from: to */
        public int f42478to;

        /* JADX INFO: renamed from: x1 */
        public int f42479x1;

        public x1(InterfaceC12711lr interfaceC12711lr, int i, int i2, int i3, int i4, int i5, int i6, int i7, double d, int i8) {
            super(interfaceC12711lr, i);
            this.f42475k4 = d;
            this.f42479x1 = i8;
            this.f42476kk = i2;
            this.f42478to = i3;
            this.f42472du = i4;
            this.f42474h4 = i5;
            this.f42477m9 = i6;
            this.f42473dy = i7;
        }
    }

    public AbstractC12741x1() {
        C1375h4 c1375h4 = C1375h4.f5962k4;
        this.f42466x1 = c1375h4;
        this.f42464kk = c1375h4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static int m59357k4(List<C12694e0> list, int i, int i2) {
        C1869to c1869to = new C1869to(list);
        int iMo48949k4 = 0;
        int iMo58931ne = 0;
        while (c1869to.mo9764x1()) {
            C12694e0 c12694e0 = (C12694e0) c1869to.mo9760kk();
            iMo58931ne += i > 0 ? c12694e0.mo58931ne() : c12694e0.mo58930ix();
            iMo48949k4 += ((InterfaceC12685bv) c12694e0.m59135wl()).mo48949k4(C7019kk.m27462to(Float.valueOf((iMo58931ne * i) / i2), 13) - iMo48949k4, c12694e0);
        }
        return iMo48949k4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    private static int m59363x1(List<C12694e0> list, int i, int i2) {
        C1869to c1869to = new C1869to(list);
        int iMo48949k4 = 0;
        int iMo58931ne = 0;
        while (c1869to.mo9764x1()) {
            C12694e0 c12694e0 = (C12694e0) c1869to.mo9760kk();
            iMo58931ne += i > 0 ? c12694e0.mo58931ne() : c12694e0.mo58930ix();
            iMo48949k4 += ((InterfaceC12685bv) c12694e0.m59135wl()).mo48949k4(C7019kk.m27462to(Float.valueOf((iMo58931ne * i) / i2), 13) - iMo48949k4, c12694e0);
        }
        return iMo48949k4;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m59364c5() {
        return this.f42461du;
    }

    /* JADX INFO: renamed from: ck */
    public C12724ss mo54956ck() {
        return new C12724ss(0);
    }

    /* JADX INFO: renamed from: du */
    public boolean mo58884du() {
        return true;
    }

    /* JADX INFO: renamed from: dy */
    public InterfaceC12683b3 mo59003dy() {
        return null;
    }

    /* JADX INFO: renamed from: h4 */
    public boolean mo58886h4() {
        return false;
    }

    /* JADX INFO: renamed from: jd */
    public void mo59322jd() {
    }

    /* JADX INFO: renamed from: k4 */
    public abstract int mo54957k4();

    /* JADX INFO: renamed from: k4 */
    public abstract List<InterfaceC1861h4> mo54958k4(C12724ss c12724ss, int i);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo54959k4(InterfaceC1870up<C12717os> interfaceC1870up, C12724ss c12724ss);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo58887k4(C12720qw c12720qw, int i, k4 k4Var, k4 k4Var2);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo58888k4(C12720qw c12720qw, x1 x1Var);

    /* JADX INFO: renamed from: kk */
    public int mo59327kk(C12724ss c12724ss, int i) {
        return mo59323k4(c12724ss, i, (C12717os) null, (InterfaceC12711lr) null, (List<InterfaceC1861h4>) null);
    }

    /* JADX INFO: renamed from: kk */
    public abstract InterfaceC12711lr mo58889kk();

    /* JADX INFO: renamed from: m9 */
    public C12728tq mo59328m9() {
        return null;
    }

    /* JADX INFO: renamed from: to */
    public abstract InterfaceC12711lr mo58890to();

    /* JADX INFO: renamed from: x1 */
    public abstract boolean mo58892x1();

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[PHI: r0
      0x008a: PHI (r0v4 int) = (r0v3 int), (r0v5 int), (r0v6 int) binds: [B:19:0x0061, B:21:0x0065, B:23:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo59323k4(C12724ss c12724ss, int i, C12717os c12717os, InterfaceC12711lr interfaceC12711lr, List<InterfaceC1861h4> list) {
        C12717os c12717osM59134uz;
        mo59325k4(c12724ss);
        c12724ss.m59152h4(0);
        if (list == null) {
            list = mo54958k4(c12724ss, this.f42463k4);
        } else if (c12717os == null) {
            C1869to c1869to = new C1869to(list, list.size());
            for (int i2 = 0; i2 < 3; i2++) {
                c1869to.mo9756du();
                c1869to.mo9758k4();
            }
        } else {
            List<InterfaceC1861h4> listMo59324k4 = mo59324k4(c12724ss, this.f42463k4, c12717os, interfaceC12711lr);
            listMo59324k4.insertRange(0, list);
            list = listMo59324k4;
        }
        if (list == null) {
            return i;
        }
        if (list.size() == 0) {
            return mo59329x1(c12724ss, i);
        }
        k4 k4Var = new k4(i, mo54957k4(), this);
        int iMo59329x1 = mo59329x1(c12724ss, i);
        if (C12715ne.m59066x1(list)) {
            C12718qm c12718qm = (C12718qm) C10008c5.m49138x1(list);
            c12717osM59134uz = c12718qm.m59134uz();
            int iM59081c5 = c12718qm.m59081c5();
            int i3 = 28;
            if (iM59081c5 != 28) {
                i3 = 44;
                if (iM59081c5 != 44) {
                    i3 = 100;
                    if (iM59081c5 == 100) {
                        iMo59329x1 = i3;
                    } else {
                        if (iM59081c5 != 104) {
                            throw new InvalidOperationException(C14113y2.m67408k4("Invalid break class: ", C14057f9.m66591x1(c12718qm.m59081c5())));
                        }
                        iMo59329x1 = 8;
                    }
                }
            }
        } else {
            c12717osM59134uz = null;
        }
        k4Var.addRange(list);
        k4 k4VarM59371x1 = k4Var.m59371x1(c12717osM59134uz);
        if (k4VarM59371x1 != null) {
            this.f42465to.addItem(k4VarM59371x1);
        }
        return iMo59329x1;
    }

    /* JADX INFO: renamed from: x1 */
    public int mo59329x1(C12724ss c12724ss, int i) {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private int m59358k4(C12724ss c12724ss, C12720qw c12720qw, k4 k4Var) {
        C12717os c12717os;
        C12717os c12717osM59134uz;
        InterfaceC12711lr interfaceC12711lrM59077to;
        int i = c12720qw.m59115ne().f42519k4;
        C12717os c12717osM59134uz2 = c12720qw.m59387to(i).m59134uz();
        if (!C7019kk.m27469x1(c12717osM59134uz2, C12684bs.k4.class)) {
            throw new NotSupportedException("Don't know how to restart at position " + c12717osM59134uz2);
        }
        C12717os c12717osMo58860kk = c12717osM59134uz2.mo58860kk();
        List<InterfaceC1861h4> list = new List<>();
        InterfaceC12711lr interfaceC12711lrM59077to2 = null;
        if (m59362k4(c12717osMo58860kk)) {
            if (c12720qw.mo59117to() > 0) {
                C12697fa.m58940k4(mo58890to().mo59012up().m14111q_().m59580u4()).mo53628k4(this);
            }
            list = new List<>();
            C1869to c1869to = new C1869to(k4Var, i + 1);
            boolean z = false;
            C12717os c12717os2 = null;
            while (c1869to.mo9764x1() && (c12717os2 == null || m59362k4(c12717os2))) {
                i++;
                AbstractC12729ts abstractC12729ts = (AbstractC12729ts) c1869to.mo9760kk();
                C12717os c12717osM59134uz3 = abstractC12729ts.m59134uz();
                if (abstractC12729ts.mo58895yj()) {
                    list.addItem(abstractC12729ts);
                    z = true;
                } else if (z) {
                    list.addItem(abstractC12729ts);
                }
                c12717os2 = c12717osM59134uz3;
            }
            if (C7019kk.m27469x1(c12717os2, C12684bs.k4.class)) {
                c12717osMo58860kk = c12717os2.mo58860kk();
                c12717os = c12717osMo58860kk;
            } else {
                c12717os = null;
            }
        } else {
            c12717os = c12717osMo58860kk;
        }
        if (c12717os != null && c12717os.m59073du() == -1) {
            C1869to c1869to2 = new C1869to(k4Var, i + 1);
            while (true) {
                c12717osM59134uz = ((AbstractC12729ts) c1869to2.mo9760kk()).m59134uz();
                if (c12717osM59134uz != null && !C7019kk.m27469x1(c12717osM59134uz, C12684bs.x1.class) && (!C7019kk.m27469x1(c12717osM59134uz, C12684bs.k4.class) || c12717osM59134uz.mo58860kk().m59073du() != -1)) {
                    break;
                }
            }
            InterfaceC12711lr interfaceC12711lrM59077to3 = c12717os.m59077to();
            do {
                interfaceC12711lrM59077to = c12717osM59134uz.m59077to();
                c12717osM59134uz = c12717osM59134uz.mo58860kk();
            } while (interfaceC12711lrM59077to != interfaceC12711lrM59077to3);
            interfaceC12711lrM59077to2 = c12717osM59134uz.m59077to();
        }
        return mo59323k4(c12724ss, 28, c12717os, interfaceC12711lrM59077to2, list);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59367x1(C12720qw c12720qw, int i, k4 k4Var, k4 k4Var2) {
        m59366k4(c12720qw, 0, i, k4Var, k4Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static int m59359k4(AbstractC12725sv abstractC12725sv, int i, int i2) {
        C1869to c1869to = new C1869to(abstractC12725sv, i);
        int iM59415up = 0;
        int i3 = 0;
        int iM8155k4 = 0;
        while (c1869to.mo9757h4() <= i2) {
            C12743xk c12743xk = (C12743xk) C7019kk.m27452k4(c1869to.mo9760kk(), C12743xk.class);
            if (c12743xk != null) {
                if (c12743xk.m59415up() > 0) {
                    i3++;
                    iM59415up += c12743xk.m59415up();
                }
                if (c12743xk.m59409fa().m8155k4() > iM8155k4) {
                    iM8155k4 = c12743xk.m59409fa().m8155k4();
                }
            }
        }
        if (iM59415up <= 0 || i3 <= 0) {
            return 0;
        }
        int i4 = iM59415up / i3;
        return i4 < iM8155k4 ? iM8155k4 : i4;
    }

    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo59324k4(C12724ss c12724ss, int i, C12717os c12717os, InterfaceC12711lr interfaceC12711lr) {
        throw new NotSupportedException("TODO: implement acceptable fallback");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private k4 m59360k4(k4 k4Var, C12720qw c12720qw, int i) {
        int i2;
        int i3;
        c12720qw.m59390x1(i);
        C1869to c1869to = new C1869to(k4Var);
        C1869to c1869to2 = new C1869to(c12720qw.m59113ks());
        AbstractC12729ts abstractC12729ts = null;
        while (c1869to2.mo9764x1()) {
            x1 x1Var = (x1) c1869to2.mo9760kk();
            while (c1869to.mo9764x1()) {
                AbstractC12729ts abstractC12729ts2 = (AbstractC12729ts) ((InterfaceC1861h4) c1869to.mo9760kk()).mo9727k4();
                if (abstractC12729ts2.mo58895yj()) {
                    break;
                }
                if (abstractC12729ts2.mo58932x_()) {
                    ((InterfaceC12685bv) abstractC12729ts2.m59135wl()).mo48952k4((C12694e0) abstractC12729ts2);
                }
            }
            c1869to.mo9756du();
            C1375h4 c1375h4M8158kk = C1375h4.f5962k4;
            List list = new List();
            List list2 = new List();
            List list3 = new List();
            boolean z = false;
            C1375h4 c1375h4M8158kk2 = c1375h4M8158kk;
            while (c1869to.mo9764x1() && c1869to.mo9757h4() <= x1Var.m58941k4()) {
                abstractC12729ts = (AbstractC12729ts) c1869to.mo9760kk();
                if (abstractC12729ts.mo58932x_()) {
                    C12694e0 c12694e0 = (C12694e0) abstractC12729ts;
                    C12700h4 c12700h4M58929h4 = c12694e0.m58929h4();
                    if (c12700h4M58929h4.equals(C12700h4.f42242x1) || c12700h4M58929h4.equals(C12700h4.f42240kk)) {
                        list2.addItem(c12694e0);
                    } else if (c12700h4M58929h4.equals(C12700h4.f42241to)) {
                        c1375h4M8158kk2 = c1375h4M8158kk2.m8162to(abstractC12729ts.mo58931ne()).m8158kk(abstractC12729ts.mo58930ix());
                        list3.addItem(c12694e0);
                    } else {
                        c12700h4M58929h4.equals(C12700h4.f42238du);
                    }
                } else if (abstractC12729ts.mo58895yj()) {
                    if (z) {
                        while (list2.size() != 0) {
                            C12694e0 c12694e02 = (C12694e0) list2.get_Item(0);
                            list2.removeAt(0);
                            c1375h4M8158kk = c1375h4M8158kk.m8162to(c12694e02.mo58931ne()).m8158kk(c12694e02.mo58930ix());
                            list.addItem(c12694e02);
                        }
                    } else {
                        z = true;
                    }
                }
            }
            if (abstractC12729ts.mo59086y_() && abstractC12729ts.m59252rv() > 0) {
                ((InterfaceC12685bv) abstractC12729ts.m59135wl()).mo48949k4(abstractC12729ts.m59252rv(), abstractC12729ts);
            }
            if ((x1Var.f42475k4 != 0.0d && (i3 = x1Var.f42479x1) > 0 && i3 <= c1375h4M8158kk.m8157kk()) || ((i2 = x1Var.f42479x1) < 0 && i2 >= c1375h4M8158kk.m8155k4())) {
                int i4 = x1Var.f42479x1;
                m59357k4((List<C12694e0>) list, i4, i4 > 0 ? c1375h4M8158kk.m8157kk() : -c1375h4M8158kk.m8155k4());
            } else if (x1Var.f42475k4 != 0.0d) {
                int i5 = x1Var.f42479x1;
                int iM59363x1 = m59363x1(list3, i5, i5 > 0 ? c1375h4M8158kk2.m8157kk() : -c1375h4M8158kk2.m8155k4());
                int i6 = x1Var.f42479x1;
                m59357k4((List<C12694e0>) list, i6 - iM59363x1, i6 - iM59363x1 > 0 ? c1375h4M8158kk.m8157kk() : -c1375h4M8158kk.m8155k4());
            }
        }
        k4 k4Var2 = new k4(k4Var.m59368du(), k4Var.m59369h4(), this);
        k4Var2.addRange(mo58890to().mo54772k4(k4Var.getRange(0, k4Var.size() - k4Var.f42471x1), 0));
        k4Var2.mo55023m9();
        c12720qw.m59113ks().clear();
        return k4Var2;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m59361k4(int i) {
        return i != 5 ? i != 28 ? i != 44 ? i != 75 ? i != 95 ? i != 100 ? i != 104 ? i != 8 ? i != 9 ? C14113y2.m67408k4("??? (", C14057f9.m66591x1(i), ")") : "AUTO" : "ANY" : "PAGE" : "ODD PAGE" : "NONE" : "LINE" : "EVEN PAGE" : "COLUMN" : "ALL";
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59365k4(int i, boolean z) {
        C12724ss c12724ssMo54956ck = mo54956ck();
        c12724ssMo54956ck.m59160k4(C1375h4.m8145k4(i));
        if (mo54957k4() != 162 && mo54957k4() != 163) {
            this.f42463k4 = 135;
        } else {
            this.f42463k4 = 70;
        }
        this.f42462h4 = 135;
        if (mo58886h4() && this.f42463k4 == 70) {
            this.f42462h4 = 70;
        }
        c12724ssMo54956ck.m59167kk(this.f42463k4);
        this.f42465to = new List<>();
        int iMo59327kk = 8;
        while (mo58892x1()) {
            this.f42465to.clear();
            iMo59327kk = mo59327kk(c12724ssMo54956ck, iMo59327kk);
            int i2 = 0;
            this.f42461du = this.f42461du && this.f42465to.size() == 0;
            while (i2 < this.f42465to.size()) {
                k4 k4Var = this.f42465to.get_Item(i2);
                C12720qw c12720qw = new C12720qw(mo58889kk(), mo59328m9(), mo59003dy(), this.f42463k4, this.f42462h4, this.f42466x1, this.f42464kk, mo58884du(), z, mo58886h4());
                k4 k4VarM59360k4 = mo54957k4() == 162 ? m59360k4(k4Var, c12720qw, i) : k4Var;
                c12720qw.m59390x1(i);
                int iM59378k4 = c12720qw.m59378k4((AbstractC12725sv) k4VarM59360k4, 1.0d, true, 0);
                if (c12720qw.mo59117to() != 0) {
                    m59367x1(c12720qw, iM59378k4, k4Var, k4VarM59360k4);
                    this.f42465to.clear();
                    iMo59327kk = m59358k4(c12724ssMo54956ck, c12720qw, k4VarM59360k4);
                    i2 = -1;
                } else {
                    mo58887k4(c12720qw, iM59378k4, k4Var, k4VarM59360k4);
                }
                i2++;
            }
        }
        this.f42465to = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m59366k4(C12720qw c12720qw, int i, int i2, k4 k4Var, k4 k4Var2) {
        int iM59081c5;
        int iM59359k4;
        int i3 = -1;
        int i4 = i;
        int i5 = 0;
        int iM58941k4 = 0;
        while (i4 < i + i2) {
            x1 x1Var = c12720qw.m59113ks().get_Item(i4);
            if (i4 == 0) {
                iM59081c5 = k4Var2.m59368du();
            } else {
                AbstractC12723s7 abstractC12723s7M59198k4 = k4Var2.m59198k4(i5);
                iM59081c5 = abstractC12723s7M59198k4.mo59086y_() ? ((C12718qm) abstractC12723s7M59198k4).m59081c5() : 28;
            }
            int iM58941k42 = x1Var.m58941k4();
            int i6 = iM58941k4 + (iM58941k4 == 0 ? k4Var2.f42468k4 : 0);
            mo59326k4(k4Var2, iM59081c5);
            int iMo54957k4 = mo54957k4();
            int i7 = iM58941k42 - (iM58941k42 == k4Var.size() + (-1) ? k4Var2.f42471x1 : 0);
            if (((AbstractC12729ts) k4Var2.get_Item(i7)).mo58932x_()) {
                i7--;
            }
            C1869to c1869to = new C1869to(k4Var2, i6);
            while (c1869to.mo9764x1() && !((AbstractC12729ts) c1869to.mo9760kk()).mo58895yj()) {
                i6++;
            }
            if (i6 <= i7) {
                C12724ss c12724ss = new C12724ss(0);
                c12724ss.m59156k4(x1Var.f42475k4);
                int i8 = x1Var.f42479x1;
                if (i8 == 0 || iMo54957k4 != 23) {
                    if (i8 == 0 || iMo54957k4 != 3) {
                        if (i8 != 0 && iMo54957k4 == 163 && i4 < i2 - 1) {
                            C1869to c1869to2 = new C1869to(k4Var2, i6);
                            int i9 = 0;
                            while (c1869to2.mo9757h4() <= i7) {
                                AbstractC12729ts abstractC12729ts = (AbstractC12729ts) ((InterfaceC1861h4) c1869to2.mo9760kk()).mo9727k4();
                                if (abstractC12729ts.mo58895yj() && abstractC12729ts.m59252rv() > 0) {
                                    i9++;
                                }
                            }
                            if (i9 >= 2) {
                                c12724ss.m59149dy(x1Var.f42479x1 / (i9 - 1));
                            }
                        }
                    }
                    if (iMo54957k4 == 162 && (iM59359k4 = m59359k4((AbstractC12725sv) k4Var2, i6, i7)) != 0) {
                        c12724ss.m59160k4(C1375h4.m8145k4(iM59359k4));
                    }
                    C12684bs.m58844k4(k4Var2, i6, iM58941k42, i3);
                    mo54959k4(new C12698g8(k4Var2, i6, i7 + 1), c12724ss);
                } else {
                    i8 /= 2;
                }
                c12724ss.m59172m9(i8);
                if (iMo54957k4 == 162) {
                    c12724ss.m59160k4(C1375h4.m8145k4(iM59359k4));
                }
                C12684bs.m58844k4(k4Var2, i6, iM58941k42, i3);
                mo54959k4(new C12698g8(k4Var2, i6, i7 + 1), c12724ss);
            } else {
                mo59322jd();
            }
            mo58888k4(c12720qw, x1Var);
            iM58941k4 = x1Var.m58941k4() + 1;
            i4++;
            i3 = i7;
            i5 = i3;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo59325k4(C12724ss c12724ss) {
    }

    /* JADX INFO: renamed from: k4 */
    public void mo59326k4(k4 k4Var, int i) {
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m59362k4(C12717os c12717os) {
        InterfaceC12711lr interfaceC12711lrM59077to = c12717os.m59077to();
        if (interfaceC12711lrM59077to != null && !interfaceC12711lrM59077to.mo55014rv()) {
            return true;
        }
        C12717os c12717osMo58860kk = c12717os.mo58860kk();
        return c12717osMo58860kk != null && m59362k4(c12717osMo58860kk);
    }
}
