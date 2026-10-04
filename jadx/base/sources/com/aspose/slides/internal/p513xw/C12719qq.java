package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p034b3.C1589jd;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p048bv.InterfaceC1870up;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10008c5;
import com.aspose.slides.internal.p406ss.C10328du;
import com.aspose.slides.internal.p462vj.C11663ks;
import com.aspose.slides.internal.p462vj.C11668rv;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.qq */
/* JADX INFO: loaded from: classes5.dex */
public class C12719qq extends AbstractC12732up {

    /* JADX INFO: renamed from: c5 */
    private C1589jd[] f42307c5;

    /* JADX INFO: renamed from: uz */
    private List<C11663ks> f42308uz;

    public C12719qq(C12703j2 c12703j2, C10328du c10328du) {
        super(c10328du);
        this.f42307c5 = new C1589jd[6];
        this.f42308uz = new List<>();
        mo54974k4(c12703j2);
        C11668rv.m54919x1().m54925k4(this);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.AbstractC12707k4, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: c5 */
    public int mo48941c5() {
        return m59235um().m59339jd().mo8658e_();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.AbstractC12707k4, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: dy */
    public int mo48944dy() {
        return m59235um().m59334ck().m8480uz();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: gi */
    public C12691dq mo48946gi() {
        return C12691dq.f42215k4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.InterfaceC12685bv
    /* JADX INFO: renamed from: k4 */
    public int mo48949k4(int i, AbstractC12729ts abstractC12729ts) {
        if (!C7019kk.m27469x1(abstractC12729ts.m59134uz(), C12696f9.class)) {
            return 0;
        }
        C12696f9 c12696f9 = (C12696f9) abstractC12729ts.m59134uz();
        abstractC12729ts.m59132k4(c12696f9.mo58860kk());
        int iMo48949k4 = ((InterfaceC12685bv) abstractC12729ts.m59135wl()).mo48949k4(i, abstractC12729ts);
        abstractC12729ts.m59132k4(c12696f9);
        return iMo48949k4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.InterfaceC12685bv
    /* JADX INFO: renamed from: kp */
    public C12691dq mo48954kp() {
        return C12691dq.f42215k4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12707k4, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: rv */
    public boolean mo55014rv() {
        return true;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: s7 */
    public C12691dq mo48956s7() {
        return C12691dq.f42215k4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x1 */
    public void mo48960x1(C1606x1 c1606x1) {
        mo48951k4(c1606x1);
        m59278k4(c1606x1, this.f42307c5[c1606x1.m8664k4()]);
    }

    /* JADX INFO: renamed from: yd */
    public final List<C11663ks> m59090yd() {
        return this.f42308uz;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo54772k4(List<InterfaceC1861h4> list, int i) {
        C1869to c1869to = new C1869to(list);
        List list2 = new List();
        List<InterfaceC1861h4> list3 = new List<>();
        while (c1869to.mo9764x1()) {
            AbstractC12729ts abstractC12729ts = (AbstractC12729ts) c1869to.mo9760kk();
            if (C7019kk.m27469x1(abstractC12729ts.m59134uz(), C12696f9.class)) {
                abstractC12729ts.m59132k4(abstractC12729ts.m59134uz().mo58860kk());
            } else {
                c1869to.mo9758k4();
            }
        }
        C1869to c1869to2 = new C1869to(list);
        AbstractC12729ts abstractC12729ts2 = null;
        int iMo9761m9 = 0;
        while (true) {
            AbstractC12729ts abstractC12729ts3 = abstractC12729ts2;
            if (!c1869to2.mo9764x1()) {
                break;
            }
            abstractC12729ts2 = (AbstractC12729ts) c1869to2.mo9760kk();
            if (abstractC12729ts3 != null && abstractC12729ts3.m59135wl() != abstractC12729ts2.m59135wl()) {
                InterfaceC12685bv interfaceC12685bv = (InterfaceC12685bv) abstractC12729ts3.m59135wl();
                InterfaceC12685bv interfaceC12685bv2 = (InterfaceC12685bv) abstractC12729ts2.m59135wl();
                list2.addRange(interfaceC12685bv.mo54772k4(list.getRange(iMo9761m9, c1869to2.mo9761m9()), i));
                iMo9761m9 = c1869to2.mo9761m9();
                if (interfaceC12685bv.mo55015ss() || interfaceC12685bv2.mo55017wp()) {
                    list2.addItem(new C12718qm(0, 1000, false, new C12717os(this), false));
                } else if (!((AbstractC12729ts) C10008c5.m49136k4(list2)).mo58932x_()) {
                    list2.addItem(new C12718qm(0, 0, false, new C12717os(this), false));
                }
            }
        }
        if (abstractC12729ts2 != null) {
            list2.addRange(((InterfaceC12685bv) abstractC12729ts2.m59135wl()).mo54772k4(list.getRange(iMo9761m9, list.size()), i));
        }
        C1869to c1869to3 = new C1869to(list2);
        while (c1869to3.mo9764x1()) {
            AbstractC12729ts abstractC12729ts4 = (AbstractC12729ts) c1869to3.mo9760kk();
            if (abstractC12729ts4.m59135wl() != this) {
                abstractC12729ts4.m59132k4(new C12696f9(this, abstractC12729ts4.m59134uz()));
            }
            list3.addItem(abstractC12729ts4);
        }
        return list3;
    }

    /* JADX INFO: renamed from: k4 */
    private List<InterfaceC1861h4> m59087k4(List<InterfaceC1861h4> list, InterfaceC12711lr interfaceC12711lr, C12724ss c12724ss, int i, Stack<InterfaceC12711lr> stack, C12717os c12717os, InterfaceC12711lr interfaceC12711lr2) {
        if (m59088k4(interfaceC12711lr, c12724ss)) {
            C12684bs.m58843k4(list);
            return list;
        }
        C12724ss c12724ssMo58880k4 = mo58880k4(c12724ss);
        List<InterfaceC1861h4> listMo58902k4 = mo58902k4(interfaceC12711lr, c12724ss, c12724ssMo58880k4, i, stack, c12717os, interfaceC12711lr2);
        if (list.size() == 0) {
            c12724ss.m59188x1(c12724ssMo58880k4.m59151h4());
        }
        if (list.size() != 0 && !C12715ne.m59064kk(listMo58902k4)) {
            m59275k4(list, c12724ss, c12724ssMo58880k4);
        }
        c12724ss.m59162k4(c12724ssMo58880k4.m59146du());
        list.addRange(listMo58902k4);
        if (!C12715ne.m59066x1(list)) {
            return null;
        }
        if (interfaceC12711lr.mo54980wl() && !m59224ix()) {
            m59229kk(true);
        }
        C12684bs.m58843k4(list);
        return list;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo58902k4(InterfaceC12711lr interfaceC12711lr, C12724ss c12724ss, C12724ss c12724ss2, int i, Stack<InterfaceC12711lr> stack, C12717os c12717os, InterfaceC12711lr interfaceC12711lr2) {
        List<InterfaceC1861h4> listMo48950k4 = stack == null ? interfaceC12711lr.mo48950k4(c12724ss2, i) : interfaceC12711lr.mo58879k4(c12724ss2, i, stack, c12717os, interfaceC12711lr2);
        List<InterfaceC1861h4> list = new List<>();
        m59273k4(listMo48950k4, list);
        return list;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo48950k4(C12724ss c12724ss, int i) {
        return m59089k4(c12724ss, i, null, null);
    }

    /* JADX INFO: renamed from: k4 */
    public final List<InterfaceC1861h4> m59089k4(C12724ss c12724ss, int i, C12717os c12717os, InterfaceC12711lr interfaceC12711lr) {
        InterfaceC12711lr interfaceC12711lrM59232ne;
        boolean z;
        C12724ss c12724ss2;
        int i2;
        C12717os c12717os2;
        InterfaceC12711lr interfaceC12711lr2;
        Stack<InterfaceC12711lr> stack;
        List<InterfaceC1861h4> list = new List<>();
        boolean z2 = false;
        boolean z3 = c12717os != null;
        Stack<InterfaceC12711lr> stack2 = new Stack<>();
        if (z3) {
            interfaceC12711lrM59232ne = c12717os.m59077to();
            if (interfaceC12711lrM59232ne == null) {
                throw new InvalidOperationException("Cannot find layout manager to restart from");
            }
            if (interfaceC12711lr == null || interfaceC12711lr.mo54977m9() != this) {
                while (interfaceC12711lrM59232ne.mo54977m9() != this) {
                    stack2.push(interfaceC12711lrM59232ne);
                    interfaceC12711lrM59232ne = interfaceC12711lrM59232ne.mo54977m9();
                }
            } else {
                interfaceC12711lrM59232ne = interfaceC12711lr;
                z2 = z3;
            }
            m59238x1(interfaceC12711lrM59232ne);
            z = z2;
        } else {
            interfaceC12711lrM59232ne = m59232ne();
            z = z3;
        }
        while (interfaceC12711lrM59232ne != null) {
            if (!z3 || z) {
                c12724ss2 = c12724ss;
                i2 = i;
                c12717os2 = c12717os;
                interfaceC12711lr2 = interfaceC12711lr;
                stack = stack2;
                if (z) {
                    interfaceC12711lrM59232ne.mo49027ks();
                }
                if (m59087k4(list, interfaceC12711lrM59232ne, c12724ss2, i2, (Stack<InterfaceC12711lr>) null, (C12717os) null, (InterfaceC12711lr) null) != null) {
                    return list;
                }
                interfaceC12711lrM59232ne = m59232ne();
                stack2 = stack;
                c12724ss = c12724ss2;
                interfaceC12711lr = interfaceC12711lr2;
                c12717os = c12717os2;
                i = i2;
            } else {
                c12724ss2 = c12724ss;
                i2 = i;
                C12717os c12717os3 = c12717os;
                InterfaceC12711lr interfaceC12711lr3 = interfaceC12711lr;
                stack = stack2;
                c12717os2 = c12717os3;
                interfaceC12711lr2 = interfaceC12711lr3;
                if (m59087k4(list, interfaceC12711lrM59232ne, c12724ss2, i2, stack2, c12717os3, interfaceC12711lr3) != null) {
                    return list;
                }
                z = true;
                interfaceC12711lrM59232ne = m59232ne();
                stack2 = stack;
                c12724ss = c12724ss2;
                interfaceC12711lr = interfaceC12711lr2;
                c12717os = c12717os2;
                i = i2;
            }
        }
        C12684bs.m58843k4(list);
        m59229kk(true);
        return list;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public C1606x1 mo48951k4(C1606x1 c1606x1) {
        C1589jd c1589jdM8567u4;
        int iM8664k4 = c1606x1.m8664k4();
        if (iM8664k4 == 0) {
            c1589jdM8567u4 = m59235um().m59337fa();
        } else if (iM8664k4 == 3) {
            c1589jdM8567u4 = m59235um().m59339jd().m8568um();
        } else if (iM8664k4 == 4) {
            c1589jdM8567u4 = m59235um().m59339jd().m8565bv();
        } else {
            if (iM8664k4 != 5) {
                throw new InvalidOperationException(C14113y2.m67408k4("(internal error) Invalid ", "area class (", C14057f9.m66591x1(iM8664k4), ") requested."));
            }
            c1589jdM8567u4 = m59235um().m59339jd().m8567u4();
        }
        this.f42307c5[iM8664k4] = c1589jdM8567u4;
        m59277k4(c1589jdM8567u4);
        return c1589jdM8567u4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: k4 */
    public C12724ss mo58880k4(C12724ss c12724ss) {
        C12724ss c12724ss2 = new C12724ss(0);
        c12724ss2.m59160k4(c12724ss.m59173ne());
        c12724ss2.m59186x1(c12724ss.m59153ix());
        c12724ss2.m59159k4(mo58913ar().m59331k4().m50389wp());
        return c12724ss2;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public void mo49023k4(InterfaceC1870up<C12717os> interfaceC1870up, C12724ss c12724ss) {
        C12714m9.m59058k4(this, interfaceC1870up, c12724ss);
        mo58877ak();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.InterfaceC12685bv
    /* JADX INFO: renamed from: k4 */
    public void mo48952k4(C12694e0 c12694e0) {
        if (C7019kk.m27469x1(c12694e0.m59134uz(), C12696f9.class)) {
            C12696f9 c12696f9 = (C12696f9) c12694e0.m59134uz();
            c12694e0.m59132k4(c12696f9.mo58860kk());
            ((InterfaceC12685bv) c12694e0.m59135wl()).mo48952k4(c12694e0);
            c12694e0.m59132k4(c12696f9);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m59088k4(InterfaceC12711lr interfaceC12711lr, C12724ss c12724ss) {
        int iM52243vj;
        int iM52242vh;
        if (C7019kk.m27469x1(interfaceC12711lr, C12690ck.class)) {
            C12690ck c12690ck = (C12690ck) interfaceC12711lr;
            iM52243vj = c12690ck.m58901b3().m52313qw();
            iM52242vh = c12690ck.m58901b3().m52310m4();
        } else if (C7019kk.m27469x1(interfaceC12711lr, C12687c5.class)) {
            C12687c5 c12687c5 = (C12687c5) interfaceC12711lr;
            iM52243vj = c12687c5.m58881ts().m52243vj();
            iM52242vh = c12687c5.m58881ts().m52242vh();
        } else {
            iM52243vj = 95;
            iM52242vh = 48;
        }
        if (c12724ss.m59170lr() == iM52243vj) {
            return false;
        }
        if (iM52243vj == 5) {
            c12724ss.m59143ck(iM52242vh);
        }
        c12724ss.m59152h4(iM52243vj);
        return true;
    }
}
