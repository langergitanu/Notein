package com.aspose.slides.internal.p513xw;

import Oooo0.C20855OooooOO;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p034b3.C1581c5;
import com.aspose.slides.internal.p034b3.C1589jd;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p057c6.C1978ck;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.internal.p150gi.C4266c6;
import com.aspose.slides.internal.p150gi.C4272f9;
import com.aspose.slides.internal.p150gi.C4273fa;
import com.aspose.slides.internal.p150gi.C4292ss;
import com.aspose.slides.internal.p150gi.InterfaceC4307wy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p371qw.C9951dy;
import com.aspose.slides.internal.p371qw.C9959up;
import com.aspose.slides.internal.p380ri.C10008c5;
import com.aspose.slides.internal.p380ri.C10014k4;
import com.aspose.slides.internal.p409sv.C10773dy;
import com.aspose.slides.internal.p409sv.C10782m9;
import com.aspose.slides.internal.p409sv.C10787u4;
import com.aspose.slides.internal.p409sv.C10790uz;
import com.aspose.slides.internal.p462vj.C11674uz;
import com.aspose.slides.internal.p462vj.C11677wy;
import com.aspose.slides.internal.p481wp.C12232rv;
import com.aspose.slides.internal.p481wp.C12239wl;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.up */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12732up extends AbstractC12727to implements InterfaceC12685bv {

    /* JADX INFO: renamed from: c5 */
    private C12717os f42399c5;

    /* JADX INFO: renamed from: ck */
    protected int f42400ck;

    /* JADX INFO: renamed from: fa */
    protected int f42401fa;

    /* JADX INFO: renamed from: ix */
    protected int f42402ix;

    /* JADX INFO: renamed from: jd */
    protected C1589jd f42403jd;

    /* JADX INFO: renamed from: ks */
    protected boolean f42404ks;

    /* JADX INFO: renamed from: ne */
    protected int f42405ne;

    /* JADX INFO: renamed from: rv */
    protected boolean f42406rv;

    /* JADX INFO: renamed from: u4 */
    protected int f42407u4;

    /* JADX INFO: renamed from: up */
    protected int f42408up;

    /* JADX INFO: renamed from: uz */
    private int f42409uz;

    /* JADX INFO: renamed from: x6 */
    protected int f42410x6;

    /* JADX INFO: renamed from: yj */
    protected List<AbstractC12729ts> f42411yj;

    /* JADX INFO: renamed from: com.aspose.slides.internal.xw.up$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private C12689ca f42412k4;

        /* JADX INFO: renamed from: kk */
        private boolean f42413kk;

        /* JADX INFO: renamed from: x1 */
        private C12689ca f42414x1;

        private k4(List<InterfaceC1861h4> list) {
            this.f42413kk = true;
            C1869to c1869to = new C1869to(list);
            while (c1869to.mo9764x1()) {
                Object objMo9760kk = c1869to.mo9760kk();
                C12689ca c12689ca = (C12689ca) C7019kk.m27452k4(objMo9760kk, C12689ca.class);
                if (c12689ca == null) {
                    C12688c6 c12688c6 = (C12688c6) C7019kk.m27452k4(objMo9760kk, C12688c6.class);
                    if (c12688c6 != null) {
                        if (this.f42413kk && c12688c6.m59252rv() != 0) {
                            this.f42413kk = false;
                        }
                        this.f42414x1 = null;
                    }
                } else if (c12689ca.m59068ck().equals(C12721ri.f42330k4)) {
                    if (this.f42412k4 == null) {
                        this.f42412k4 = c12689ca;
                    }
                } else if (c12689ca.m59068ck().equals(C12721ri.f42333x1)) {
                    this.f42414x1 = c12689ca;
                }
            }
        }

        /* JADX INFO: renamed from: k4 */
        public static void m59292k4(List<InterfaceC1861h4> list, List<InterfaceC1861h4> list2) {
            C1375h4 c1375h4M59070jd;
            k4 k4Var = new k4(list2);
            k4 k4Var2 = new k4(list);
            if (k4Var.m59293k4()) {
                if (k4Var2.m59293k4()) {
                    C1375h4 c1375h4M59070jd2 = k4Var.f42412k4.m59070jd();
                    C1375h4 c1375h4M59070jd3 = k4Var.f42414x1.m59070jd();
                    if (c1375h4M59070jd2.m8163x1() < c1375h4M59070jd3.m8163x1()) {
                        c1375h4M59070jd2 = c1375h4M59070jd3;
                    }
                    C12689ca c12689ca = k4Var.f42412k4;
                    C1375h4 c1375h4 = C1375h4.f5962k4;
                    c12689ca.m59072x1(c1375h4);
                    k4Var.f42414x1.m59072x1(c1375h4M59070jd2);
                    c1375h4M59070jd = k4Var2.f42414x1.m59070jd();
                    C1375h4 c1375h4M59070jd4 = k4Var.f42414x1.m59070jd();
                    if (c1375h4M59070jd.m8163x1() < c1375h4M59070jd4.m8163x1()) {
                        c1375h4M59070jd = c1375h4M59070jd4;
                    }
                    k4Var2.f42414x1.m59072x1(c1375h4);
                } else {
                    C12689ca c12689ca2 = k4Var2.f42414x1;
                    if (c12689ca2 != null) {
                        c1375h4M59070jd = c12689ca2.m59070jd();
                        C1375h4 c1375h4M59070jd5 = k4Var.f42412k4.m59070jd();
                        if (c1375h4M59070jd.m8163x1() < c1375h4M59070jd5.m8163x1()) {
                            c1375h4M59070jd = c1375h4M59070jd5;
                        }
                        C1375h4 c1375h4M59070jd6 = k4Var.f42414x1.m59070jd();
                        if (c1375h4M59070jd.m8163x1() < c1375h4M59070jd6.m8163x1()) {
                            c1375h4M59070jd = c1375h4M59070jd6;
                        }
                        C12689ca c12689ca3 = k4Var2.f42414x1;
                        C1375h4 c1375h42 = C1375h4.f5962k4;
                        c12689ca3.m59072x1(c1375h42);
                        k4Var.f42412k4.m59072x1(c1375h42);
                    } else {
                        C1375h4 c1375h4M59070jd7 = k4Var.f42412k4.m59070jd();
                        C1375h4 c1375h4M59070jd8 = k4Var.f42414x1.m59070jd();
                        if (c1375h4M59070jd7.m8163x1() < c1375h4M59070jd8.m8163x1()) {
                            c1375h4M59070jd7 = c1375h4M59070jd8;
                        }
                        k4Var.f42412k4.m59072x1(C1375h4.f5962k4);
                        k4Var.f42414x1.m59072x1(c1375h4M59070jd7);
                    }
                }
                k4Var.f42414x1.m59072x1(c1375h4M59070jd);
            }
            C10008c5.m49137k4(list, list2);
        }

        /* JADX INFO: renamed from: k4 */
        private boolean m59293k4() {
            return (!this.f42413kk || this.f42412k4 == null || this.f42414x1 == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.xw.up$x1 */
    public static class x1 extends C12717os {

        /* JADX INFO: renamed from: k4 */
        private int f42415k4;

        /* JADX INFO: renamed from: x1 */
        private int f42416x1;

        /* JADX INFO: renamed from: k4 */
        public final int m59294k4() {
            return this.f42415k4;
        }

        /* JADX INFO: renamed from: x1 */
        public final int m59295x1() {
            return this.f42416x1;
        }
    }

    public AbstractC12732up(AbstractC3524ks abstractC3524ks) {
        super(abstractC3524ks);
        m59014x1(true);
    }

    /* JADX INFO: renamed from: b3 */
    private C12688c6 m59261b3() {
        return new C12688c6(0, new C12696f9(this, null), false);
    }

    /* JADX INFO: renamed from: h4 */
    private void m59262h4(int i) {
        this.f42409uz = i;
    }

    /* JADX INFO: renamed from: m9 */
    private C12718qm m59264m9(int i) {
        return new C12718qm(0, i, false, new C12696f9(this, null), false);
    }

    /* JADX INFO: renamed from: ts */
    private C4265c5 m59265ts() {
        if (C7019kk.m27469x1(this.f42282kk, C10782m9.class)) {
            return ((C10782m9) this.f42282kk).m52298bz();
        }
        if (C7019kk.m27469x1(this.f42282kk, C10773dy.class)) {
            return ((C10773dy) this.f42282kk).m52228bz();
        }
        if (C7019kk.m27469x1(this.f42282kk, C10787u4.class)) {
            return ((C10787u4) this.f42282kk).m52345bz();
        }
        if (C7019kk.m27469x1(this.f42282kk, C10790uz.class)) {
            return ((C10790uz) this.f42282kk).m52352bz();
        }
        if (C7019kk.m27469x1(this.f42282kk, C12232rv.class)) {
            return ((C12232rv) this.f42282kk).mo57067vj();
        }
        return null;
    }

    /* JADX INFO: renamed from: vj */
    private int m59266vj() {
        int iMo17279ss = C7019kk.m27469x1(this.f42282kk, InterfaceC4307wy.class) ? ((InterfaceC4307wy) this.f42282kk).mo17279ss() : 9;
        AbstractC12732up abstractC12732up = (AbstractC12732up) C7019kk.m27452k4((Object) m59232ne(), AbstractC12732up.class);
        return abstractC12732up != null ? C10014k4.m49148k4(iMo17279ss, abstractC12732up.m59266vj()) : iMo17279ss;
    }

    /* JADX INFO: renamed from: wy */
    private C12688c6 m59267wy() {
        return new C12688c6(0, mo54973k4(new C12717os(this)), true);
    }

    /* JADX INFO: renamed from: yd */
    private int m59268yd() {
        return this.f42409uz;
    }

    /* JADX INFO: renamed from: ak */
    public void mo58877ak() {
        if (m59269e0() != null) {
            this.f42381to.mo48960x1(m59269e0());
        }
    }

    /* JADX INFO: renamed from: bz */
    public C12717os mo49019bz() {
        C12717os c12717os = this.f42399c5;
        if (c12717os != null) {
            return c12717os;
        }
        C12696f9 c12696f9 = new C12696f9(this, null);
        this.f42399c5 = c12696f9;
        return c12696f9;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12707k4, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: c5 */
    public int mo48941c5() {
        return -1;
    }

    /* JADX INFO: renamed from: c6 */
    public C4266c6 mo49020c6() {
        throw new InvalidOperationException();
    }

    /* JADX INFO: renamed from: dq */
    public C4266c6 mo49021dq() {
        throw new InvalidOperationException();
    }

    /* JADX INFO: renamed from: du */
    public void mo58999du(int i) {
        m59262h4(i);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12707k4, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: dy */
    public int mo48944dy() {
        return m59268yd();
    }

    /* JADX INFO: renamed from: e0 */
    public final C1589jd m59269e0() {
        return this.f42403jd;
    }

    /* JADX INFO: renamed from: f9 */
    public final C4272f9 m59270f9() {
        C4273fa c4273faM57101xw;
        if (C7019kk.m27469x1(this.f42282kk, C10782m9.class)) {
            c4273faM57101xw = ((C10782m9) this.f42282kk).m52300e0();
        } else if (C7019kk.m27469x1(this.f42282kk, C10773dy.class)) {
            c4273faM57101xw = ((C10773dy) this.f42282kk).m52229e0();
        } else if (C7019kk.m27469x1(this.f42282kk, C10787u4.class)) {
            c4273faM57101xw = ((C10787u4) this.f42282kk).m52346e0();
        } else if (C7019kk.m27469x1(this.f42282kk, C10790uz.class)) {
            c4273faM57101xw = ((C10790uz) this.f42282kk).m52353e0();
        } else {
            if (!C7019kk.m27469x1(this.f42282kk, C12232rv.class)) {
                return null;
            }
            c4273faM57101xw = ((C12232rv) this.f42282kk).m57101xw();
        }
        return c4273faM57101xw.f11649du;
    }

    /* JADX INFO: renamed from: g8 */
    public final C12691dq m59271g8() {
        C12691dq c12691dq = C12691dq.f42215k4;
        return C7019kk.m27469x1(mo54977m9(), InterfaceC12685bv.class) ? ((InterfaceC12685bv) mo54977m9()).mo48954kp() : (C7019kk.m27469x1(mo54977m9(), C11674uz.class) && ((C11674uz) mo54977m9()).m54989xk()) ? C12691dq.f42216x1 : c12691dq;
    }

    /* JADX INFO: renamed from: gi */
    public C12691dq mo48946gi() {
        return C12691dq.m58907k4(mo49032xk());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public int mo48949k4(int i, AbstractC12729ts abstractC12729ts) {
        int iM59282kk;
        C12717os c12717osMo58860kk = abstractC12729ts.m59134uz().mo58860kk();
        if (c12717osMo58860kk == null && abstractC12729ts.mo58932x_()) {
            if (((C12694e0) abstractC12729ts).m58929h4() == C12700h4.f42242x1) {
                this.f42401fa += i;
                return i;
            }
            this.f42408up += i;
            return i;
        }
        int iMo48949k4 = 0;
        if (!C7019kk.m27469x1(c12717osMo58860kk, x1.class)) {
            if (c12717osMo58860kk == null || c12717osMo58860kk.m59077to() == this) {
                return 0;
            }
            C12696f9 c12696f9 = (C12696f9) abstractC12729ts.m59134uz();
            abstractC12729ts.m59132k4(c12717osMo58860kk);
            int iMo48949k42 = ((InterfaceC12685bv) abstractC12729ts.m59135wl()).mo48949k4(i, abstractC12729ts);
            abstractC12729ts.m59132k4(c12696f9);
            return iMo48949k42;
        }
        x1 x1Var = (x1) c12717osMo58860kk;
        if (!abstractC12729ts.mo58932x_()) {
            C12718qm c12718qm = (C12718qm) this.f42411yj.get_Item(x1Var.m59295x1());
            return c12718qm.m59252rv() > 0 ? ((InterfaceC12685bv) c12718qm.m59135wl()).mo48949k4(c12718qm.m59252rv(), c12718qm) : i;
        }
        C1869to c1869to = new C1869to(this.f42411yj, x1Var.m59294k4());
        while (c1869to.mo9757h4() <= x1Var.m59295x1()) {
            AbstractC12729ts abstractC12729ts2 = (AbstractC12729ts) c1869to.mo9760kk();
            if (abstractC12729ts2.mo58932x_()) {
                iMo48949k4 = ((InterfaceC12685bv) abstractC12729ts2.m59135wl()).mo48949k4(i - iMo48949k4, abstractC12729ts2) + iMo48949k4;
            }
        }
        int i2 = this.f42400ck;
        if (iMo48949k4 > 0) {
            iM59282kk = m59282kk(iMo48949k4);
        } else {
            i2 = -i2;
            iM59282kk = m59282kk(-iMo48949k4);
        }
        return iM59282kk * i2;
    }

    /* JADX INFO: renamed from: kk */
    public final int m59282kk(int i) {
        return C20855OooooOO.OooO0O0(i / this.f42400ck, 14);
    }

    /* JADX INFO: renamed from: kp */
    public C12691dq mo48954kp() {
        return C12691dq.m58907k4(mo49021dq()).m58909k4(m59271g8());
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.AbstractC12707k4, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: ks */
    public void mo49027ks() {
        super.mo49027ks();
        this.f42404ks = false;
        this.f42406rv = false;
    }

    /* JADX INFO: renamed from: qm */
    public final int m59284qm() {
        int i = this.f42410x6 - (this.f42405ne + this.f42402ix);
        if (i < 0) {
            C12697fa.m58940k4(mo59012up().m14111q_().m59580u4()).mo53631k4(this, mo59012up().m14105ks(), i, mo59012up().m14106m_());
            i = 0;
        }
        mo58999du(i);
        return i;
    }

    /* JADX INFO: renamed from: s7 */
    public C12691dq mo48956s7() {
        return C12691dq.m58907k4(mo49020c6());
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12685bv
    /* JADX INFO: renamed from: ss */
    public final boolean mo55015ss() {
        return !mo48956s7().m58910k4();
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12685bv
    /* JADX INFO: renamed from: sv */
    public final boolean mo55016sv() {
        return !mo48954kp().m58910k4();
    }

    /* JADX INFO: renamed from: t6 */
    public final C4272f9 m59285t6() {
        C4273fa c4273faM57101xw;
        if (C7019kk.m27469x1(this.f42282kk, C10782m9.class)) {
            c4273faM57101xw = ((C10782m9) this.f42282kk).m52300e0();
        } else if (C7019kk.m27469x1(this.f42282kk, C10773dy.class)) {
            c4273faM57101xw = ((C10773dy) this.f42282kk).m52229e0();
        } else if (C7019kk.m27469x1(this.f42282kk, C10787u4.class)) {
            c4273faM57101xw = ((C10787u4) this.f42282kk).m52346e0();
        } else if (C7019kk.m27469x1(this.f42282kk, C10790uz.class)) {
            c4273faM57101xw = ((C10790uz) this.f42282kk).m52353e0();
        } else {
            if (!C7019kk.m27469x1(this.f42282kk, C12232rv.class)) {
                return null;
            }
            c4273faM57101xw = ((C12232rv) this.f42282kk).m57101xw();
        }
        return c4273faM57101xw.f11651h4;
    }

    /* JADX INFO: renamed from: to */
    public final int m59286to(int i) {
        int i2 = this.f42410x6 - ((this.f42405ne + this.f42402ix) + i);
        if (i2 < 0) {
            C12697fa.m58940k4(mo59012up().m14111q_().m59580u4()).mo53631k4(this, mo59012up().m14105ks(), i2, mo59012up().m14106m_());
            this.f42402ix += i2;
        }
        mo58999du(i);
        return i;
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12685bv
    /* JADX INFO: renamed from: wp */
    public final boolean mo55017wp() {
        return !mo48946gi().m58910k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59287x1(List<InterfaceC1861h4> list, int i) {
        C4272f9 c4272f9M59270f9 = m59270f9();
        if (c4272f9M59270f9 != null) {
            if (c4272f9M59270f9.m17134x1(this).mo9877dy().mo9886x1(this) == 0 && c4272f9M59270f9.m17131kk(this).mo9877dy().mo9886x1(this) == 0) {
                return;
            }
            list.addItem(new C12689ca(mo49019bz(), c4272f9M59270f9, C12721ri.f42330k4, true, false, this));
        }
    }

    /* JADX INFO: renamed from: xk */
    public C4266c6 mo49032xk() {
        throw new InvalidOperationException();
    }

    /* JADX INFO: renamed from: xw */
    public int mo48961xw() {
        return this.f42405ne + this.f42402ix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo54772k4(List<InterfaceC1861h4> list, int i) {
        boolean zM17202ix;
        List.Enumerator<InterfaceC1861h4> it;
        C1869to c1869to = new C1869to(list);
        List list2 = new List();
        List<InterfaceC1861h4> list3 = new List<>();
        while (c1869to.mo9764x1()) {
            AbstractC12729ts abstractC12729ts = (AbstractC12729ts) c1869to.mo9760kk();
            C12717os c12717osMo58860kk = abstractC12729ts.m59134uz().mo58860kk();
            if (c12717osMo58860kk == null) {
                c12717osMo58860kk = new C12717os(this);
            }
            abstractC12729ts.m59132k4(c12717osMo58860kk);
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
                if (interfaceC12685bv != this) {
                    it = interfaceC12685bv.mo54772k4(list.getRange(iMo9761m9, (c1869to2.mo9761m9() - iMo9761m9) + 1), i).iterator();
                    while (it.hasNext()) {
                        try {
                            list2.addItem(it.next());
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                } else {
                    zM17202ix = false;
                }
                iMo9761m9 = c1869to2.mo9761m9();
                if ((zM17202ix && (mo55016sv() || interfaceC12685bv.mo55015ss() || interfaceC12685bv2.mo55017wp())) || (zM17202ix && !((AbstractC12729ts) C10008c5.m49136k4(list2)).mo58932x_())) {
                    list2.addItem(m59264m9(1000));
                }
            }
        }
        if (abstractC12729ts2 != null) {
            InterfaceC12711lr interfaceC12711lrM59135wl = abstractC12729ts2.m59135wl();
            if (interfaceC12711lrM59135wl != this) {
                List.Enumerator<InterfaceC1861h4> it2 = interfaceC12711lrM59135wl.mo54772k4(list.getRange(iMo9761m9, (list.size() - iMo9761m9) + 1), i).iterator();
                while (it2.hasNext()) {
                    try {
                        list2.addItem(it2.next());
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } else if (list2.size() != 0) {
                C10008c5.m49138x1(list2);
            }
        }
        boolean zM17202ix2 = C7019kk.m27469x1(this.f42282kk, C10782m9.class) ? m59270f9().m17202ix() : true;
        if (this.f42401fa != 0) {
            if (!zM17202ix2) {
                list3.addItem(m59261b3());
                list3.addItem(m59264m9(1000));
            }
            list3.addItem(m59263k4(this.f42401fa, C12700h4.f42242x1, false));
        }
        it = list3.iterator();
        while (it.hasNext()) {
            try {
                AbstractC12729ts abstractC12729ts4 = (AbstractC12729ts) it.next();
                abstractC12729ts4.m59132k4(new C12696f9(this, abstractC12729ts4.m59134uz()));
                list3.addItem(abstractC12729ts4);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        zM17202ix = C7019kk.m27469x1(this.f42282kk, C10782m9.class) ? m59285t6().m17202ix() : true;
        if (this.f42408up != 0) {
            if (!zM17202ix) {
                list3.addItem(m59264m9(1000));
            }
            list3.addItem(m59263k4(this.f42408up, C12700h4.f42240kk, zM17202ix));
            if (!zM17202ix) {
                list3.addItem(m59261b3());
            }
        }
        return list3;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59288x1(List<InterfaceC1861h4> list, C12724ss c12724ss, int i) {
        m59289x1(list, true);
        m59283kk(list, i);
        c12724ss.m59175rv();
    }

    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo58902k4(InterfaceC12711lr interfaceC12711lr, C12724ss c12724ss, C12724ss c12724ss2, int i, Stack<InterfaceC12711lr> stack, C12717os c12717os, InterfaceC12711lr interfaceC12711lr2) {
        if (interfaceC12711lr == this.f42375du.get_Item(0)) {
            c12724ss2.m59157k4(16);
        }
        return stack == null ? interfaceC12711lr.mo48950k4(c12724ss2, i) : interfaceC12711lr.mo58879k4(c12724ss2, i, stack, c12717os, interfaceC12711lr2);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59289x1(List<InterfaceC1861h4> list, boolean z) {
        C4265c5 c4265c5M59265ts = m59265ts();
        if (c4265c5M59265ts != null) {
            if (c4265c5M59265ts.m17162to(false, this) > 0) {
                list.addItem(new C12744xw(mo49019bz(), c4265c5M59265ts.m17148du(1), C12721ri.f42333x1, false, z, this));
            }
            if (c4265c5M59265ts.m17161to(false) > 0) {
                list.addItem(new C12747yj(mo49019bz(), c4265c5M59265ts.m17155k4(1).m17171kk(), C12721ri.f42333x1, false, z, this));
            }
        }
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo48950k4(C12724ss c12724ss, int i) {
        return mo58879k4(c12724ss, i, null, null, null);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x1 */
    public void mo48960x1(C1606x1 c1606x1) {
        m59278k4(c1606x1, m59269e0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e5, code lost:
    
        if (r0.mo48944dy() < r5) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f6  */
    @Override // com.aspose.slides.internal.p513xw.AbstractC12707k4, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<InterfaceC1861h4> mo58879k4(C12724ss c12724ss, int i, Stack<InterfaceC12711lr> stack, C12717os c12717os, InterfaceC12711lr interfaceC12711lr) {
        InterfaceC12711lr interfaceC12711lrM59232ne;
        C12722rv c12722rv;
        List<InterfaceC1861h4> listMo58902k4;
        boolean z;
        boolean z2;
        int iMo48944dy;
        Object objM49138x1;
        C12688c6 c12688c6;
        C12687c5 c12687c5;
        boolean z3;
        C9959up c9959up;
        int iM17166x1;
        AbstractC12732up abstractC12732up = this;
        C12724ss c12724ss2 = c12724ss;
        int i2 = i;
        abstractC12732up.f42410x6 = c12724ss2.m59153ix();
        abstractC12732up.m59284qm();
        boolean z4 = stack != null;
        boolean z5 = !z4 || stack.size() == 0;
        List<InterfaceC1861h4> list = new List<>();
        List<InterfaceC1861h4> list2 = new List<>();
        if (!abstractC12732up.m59281k4(c12724ss2, list2)) {
            return list2;
        }
        abstractC12732up.mo54773k4(list2, c12724ss2, i2);
        if (z4) {
            interfaceC12711lrM59232ne = z5 ? interfaceC12711lr : stack.pop();
            abstractC12732up.m59238x1(interfaceC12711lrM59232ne);
        } else {
            interfaceC12711lrM59232ne = abstractC12732up.m59232ne();
        }
        boolean z6 = z5;
        InterfaceC12711lr interfaceC12711lrM59232ne2 = interfaceC12711lrM59232ne;
        while (interfaceC12711lrM59232ne2 != null) {
            C12724ss c12724ssMo58880k4 = mo58880k4(c12724ss);
            if (!z4 || z6) {
                if (z4) {
                    interfaceC12711lrM59232ne2.mo49027ks();
                }
                abstractC12732up = this;
                c12724ss2 = c12724ss;
                i2 = i;
                boolean z7 = z6;
                listMo58902k4 = abstractC12732up.mo58902k4(interfaceC12711lrM59232ne2, c12724ss2, c12724ssMo58880k4, i2, null, null, null);
                z = z7;
            } else {
                listMo58902k4 = abstractC12732up.mo58902k4(interfaceC12711lrM59232ne2, c12724ss2, c12724ssMo58880k4, i2, stack, c12717os, interfaceC12711lr);
                abstractC12732up = this;
                c12724ss2 = c12724ss;
                i2 = i;
                z = true;
            }
            int iM59153ix = c12724ssMo58880k4.m59153ix();
            C1375h4 c1375h4M8159m9 = c12724ss2.m59142c6().m8153h4(c12724ssMo58880k4.m59142c6().m8155k4()).m8159m9(c12724ssMo58880k4.m59142c6().m8157kk());
            if (c12724ssMo58880k4.m59142c6().m8163x1() == -1 && c1375h4M8159m9.m8163x1() == 0) {
                c1375h4M8159m9 = c12724ssMo58880k4.m59142c6();
            }
            c12724ss2.m59187x1(c1375h4M8159m9);
            C9959up c9959up2 = (C9959up) C7019kk.m27452k4((Object) interfaceC12711lrM59232ne2, C9959up.class);
            if (c9959up2 != null) {
                if (c9959up2.m49028ts()) {
                    boolean zM57102zj = c9959up2.m49033yd().m57102zj();
                    int iM48922k4 = c9959up2.m49018b3().m48922k4();
                    C1375h4 c1375h4M8164x1 = C1375h4.f5962k4;
                    int i3 = 1;
                    while (i3 <= iM48922k4) {
                        C12239wl c12239wlM48925k4 = c9959up2.m49018b3().m48925k4(i3);
                        boolean z8 = z;
                        C1375h4 c1375h4M57148bz = c12239wlM48925k4.m57148bz();
                        if (c1375h4M57148bz != null) {
                            c1375h4M8164x1 = c1375h4M8164x1.m8156k4(c1375h4M57148bz);
                        }
                        if (zM57102zj) {
                            z3 = zM57102zj;
                            c9959up = c9959up2;
                            iM17166x1 = c12239wlM48925k4.mo57067vj().m17166x1(false, C1978ck.m10100k4()) + c12239wlM48925k4.mo57067vj().m17165x1(false) + c12239wlM48925k4.mo57067vj().m17154k4(false, C1978ck.m10100k4()) + c12239wlM48925k4.mo57067vj().m17153k4(false);
                        } else {
                            z3 = zM57102zj;
                            c9959up = c9959up2;
                            iM17166x1 = c12239wlM48925k4.f40756jd / 2;
                        }
                        c1375h4M8164x1 = c1375h4M8164x1.m8164x1(iM17166x1);
                        i3++;
                        z = z8;
                        zM57102zj = z3;
                        c9959up2 = c9959up;
                    }
                    z2 = z;
                    C9959up c9959up3 = c9959up2;
                    iMo48944dy = c1375h4M8164x1.m8157kk();
                    if (((C4292ss) C7019kk.m27452k4((Object) c9959up3.m49033yd().m57098t6().m17133to(abstractC12732up), C4292ss.class)) != null) {
                        InterfaceC12711lr interfaceC12711lrMo54977m9 = (InterfaceC12711lr) C7019kk.m27452k4((Object) abstractC12732up.mo54977m9(), C9951dy.class);
                        if (interfaceC12711lrMo54977m9 != null && interfaceC12711lrMo54977m9.mo48944dy() == 0) {
                            interfaceC12711lrMo54977m9 = interfaceC12711lrMo54977m9.mo54977m9();
                        }
                        if (interfaceC12711lrMo54977m9 != null && interfaceC12711lrMo54977m9.mo48944dy() != 0 && interfaceC12711lrMo54977m9.mo48944dy() < c1375h4M8164x1.m8163x1() && interfaceC12711lrMo54977m9.mo48944dy() > c1375h4M8164x1.m8155k4()) {
                            iMo48944dy = c1375h4M8164x1.m8155k4() + c9959up3.mo48961xw();
                        }
                    }
                    if (c9959up3.m49033yd().m57102zj()) {
                        iMo48944dy = c9959up3.m49033yd().mo57067vj().m17165x1(false) + c9959up3.m49033yd().mo57067vj().m17153k4(false) + iMo48944dy;
                    }
                } else {
                    z2 = z;
                    iMo48944dy = c9959up2.mo48944dy() - c9959up2.m49018b3().m48925k4(c9959up2.m49018b3().m48922k4()).f40756jd;
                }
                if (abstractC12732up.mo48963yj()) {
                }
            } else {
                z2 = z;
                if (C7019kk.m27469x1(interfaceC12711lrM59232ne2, C11677wy.class)) {
                    if (abstractC12732up.mo48944dy() < iM59153ix && abstractC12732up.mo48963yj()) {
                        iMo48944dy = abstractC12732up.f42405ne + iM59153ix + abstractC12732up.f42402ix;
                        abstractC12732up.f42410x6 = iMo48944dy;
                        abstractC12732up.m59284qm();
                        c12724ss2.m59186x1(abstractC12732up.f42410x6);
                    }
                } else if (abstractC12732up.f42410x6 < iM59153ix && abstractC12732up.mo48963yj()) {
                    abstractC12732up.f42410x6 = iM59153ix;
                    abstractC12732up.m59284qm();
                    c12724ss2.m59186x1(abstractC12732up.f42410x6);
                }
            }
            if (list.size() == 0) {
                c12724ss2.m59188x1(c12724ssMo58880k4.m59151h4());
            }
            if (listMo58902k4 != null && listMo58902k4.size() != 0) {
                if (list.size() != 0 && !C12715ne.m59064kk(listMo58902k4) && (listMo58902k4.size() != 1 || (c12688c6 = (C12688c6) C7019kk.m27452k4((Object) listMo58902k4.get_Item(0), C12688c6.class)) == null || c12688c6.m59252rv() != 0 || (c12687c5 = (C12687c5) C7019kk.m27452k4((Object) c12688c6.m59135wl(), C12687c5.class)) == null || !c12687c5.m58878b3())) {
                    abstractC12732up.m59275k4(list, c12724ss2, c12724ssMo58880k4);
                }
                if (listMo58902k4.size() != 1 || !C12715ne.m59064kk(listMo58902k4)) {
                    k4.m59292k4(list, listMo58902k4);
                    if (!C12715ne.m59066x1(listMo58902k4)) {
                        c12724ss2.m59162k4(c12724ssMo58880k4.m59146du());
                    } else {
                        if (!interfaceC12711lrM59232ne2.mo54980wl() || abstractC12732up.m59224ix()) {
                            abstractC12732up.m59273k4(list, list2);
                            return list2;
                        }
                        objM49138x1 = C10008c5.m49138x1(list);
                    }
                } else {
                    if (!interfaceC12711lrM59232ne2.mo54980wl() || abstractC12732up.m59224ix()) {
                        if (list.size() == 0) {
                            list2.addItem(abstractC12732up.m59267wy());
                        }
                        k4.m59292k4(list, listMo58902k4);
                        abstractC12732up.m59273k4(list, list2);
                        return list2;
                    }
                    objM49138x1 = listMo58902k4.get_Item(0);
                }
                c12722rv = (C12722rv) objM49138x1;
                c12724ss2.m59175rv();
                if (list.size() == 0) {
                    abstractC12732up.m59273k4(list, list2);
                } else if (c12722rv == null) {
                    list2.addItem(abstractC12732up.m59267wy());
                }
                abstractC12732up.m59288x1(list2, c12724ss2, i2);
                if (c12722rv != null) {
                    abstractC12732up.m59291x1(list2, c12724ss2);
                } else {
                    c12722rv.m59126fa();
                    list2.addItem(c12722rv);
                }
                c12724ss2.m59162k4(abstractC12732up.mo48956s7());
                abstractC12732up.m59229kk(true);
                return list2;
            }
            interfaceC12711lrM59232ne2 = abstractC12732up.m59232ne();
            z6 = z2;
        }
        c12722rv = null;
        if (list.size() == 0) {
        }
        abstractC12732up.m59288x1(list2, c12724ss2, i2);
        if (c12722rv != null) {
        }
        c12724ss2.m59162k4(abstractC12732up.mo48956s7());
        abstractC12732up.m59229kk(true);
        return list2;
    }

    /* JADX INFO: renamed from: kk */
    public final void m59283kk(List<InterfaceC1861h4> list, int i) {
        C4272f9 c4272f9M59285t6 = m59285t6();
        if (c4272f9M59285t6 != null) {
            if (c4272f9M59285t6.m17134x1(this).mo9877dy().mo9886x1(this) == 0 && c4272f9M59285t6.m17131kk(this).mo9877dy().mo9886x1(this) == 0) {
                return;
            }
            list.addItem(new C12689ca(mo49019bz(), c4272f9M59285t6, C12721ri.f42333x1, false, true, this));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59290x1(C12724ss c12724ss) {
        C4265c5 c4265c5M59265ts = m59265ts();
        if (c4265c5M59265ts != null) {
            if (c4265c5M59265ts.m17159kk(false) > 0) {
                c12724ss.m59190x1(new C12747yj(mo49019bz(), c4265c5M59265ts.m17155k4(0).m17171kk(), C12721ri.f42330k4, false, false, this));
            }
            if (c4265c5M59265ts.m17160kk(false, this) > 0) {
                c12724ss.m59190x1(new C12744xw(mo49019bz(), c4265c5M59265ts.m17148du(0), C12721ri.f42330k4, false, false, this));
            }
            if (c4265c5M59265ts.m17161to(false) > 0) {
                c12724ss.m59164k4(new C12747yj(mo49019bz(), c4265c5M59265ts.m17155k4(1).m17171kk(), C12721ri.f42333x1, false, false, this));
            }
            if (c4265c5M59265ts.m17162to(false, this) > 0) {
                c12724ss.m59164k4(new C12744xw(mo49019bz(), c4265c5M59265ts.m17148du(1), C12721ri.f42333x1, false, false, this));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C12694e0 m59263k4(int i, C12700h4 c12700h4, boolean z) {
        return new C12694e0(i, 0, 0, c12700h4, new C12696f9(this, null), z);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m59291x1(List<InterfaceC1861h4> list, C12724ss c12724ss) {
        int iMo17280wp = C7019kk.m27469x1(this.f42282kk, InterfaceC4307wy.class) ? ((InterfaceC4307wy) this.f42282kk).mo17280wp() : -1;
        if (iMo17280wp != 104 && iMo17280wp != 28 && iMo17280wp != 44 && iMo17280wp != 100) {
            return false;
        }
        list.addItem(new C12722rv(mo49019bz(), 0, -1000, iMo17280wp, c12724ss));
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public C12724ss mo58880k4(C12724ss c12724ss) {
        C12724ss c12724ss2 = new C12724ss(0);
        c12724ss2.m59165k4(c12724ss);
        c12724ss2.m59160k4(c12724ss.m59173ne());
        c12724ss2.m59186x1(this.f42410x6);
        return c12724ss2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59272k4(double d, C1375h4 c1375h4) {
        int iM59027k4 = C12712m2.m59027k4(d, c1375h4);
        if (iM59027k4 != 0) {
            C1581c5 c1581c5 = new C1581c5();
            c1581c5.m8670kk(iM59027k4);
            this.f42381to.mo48960x1(c1581c5);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59273k4(List<InterfaceC1861h4> list, List<InterfaceC1861h4> list2) {
        m59274k4(list, list2, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59274k4(List<InterfaceC1861h4> list, List<InterfaceC1861h4> list2, boolean z) {
        List.Enumerator<InterfaceC1861h4> it = list.iterator();
        while (it.hasNext()) {
            try {
                InterfaceC1861h4 next = it.next();
                if (next.mo9728kk()) {
                    m59279k4(next.mo9727k4(), list2, z);
                } else if (next.mo9729to()) {
                    m59274k4(next.mo9730x1(), list2, z);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo54773k4(List<InterfaceC1861h4> list, C12724ss c12724ss, int i) {
        if (!this.f42406rv) {
            m59287x1(list, i);
            c12724ss.m59188x1(mo48946gi());
        }
        m59276k4(list, !this.f42406rv);
        this.f42406rv = true;
        m59290x1(c12724ss);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59275k4(List<InterfaceC1861h4> list, C12724ss c12724ss, C12724ss c12724ss2) {
        C12722rv c12722rv;
        if (mo55016sv() || c12724ss.m59155jd() || c12724ss2.m59144ck()) {
            C12691dq c12691dqM58909k4 = mo48954kp().m58909k4(c12724ss.m59146du());
            c12724ss.m59171m9();
            C12691dq c12691dqM58909k42 = c12691dqM58909k4.m58909k4(c12724ss2.m59151h4());
            c12724ss2.m59148dy();
            c12722rv = new C12722rv(new C12717os(this), c12691dqM58909k42.m58911kk(), c12691dqM58909k42.m58912x1(), c12724ss);
        } else if (((AbstractC12723s7) C10008c5.m49136k4(list)).mo58932x_() || C12715ne.m59065to(list)) {
            return;
        } else {
            c12722rv = new C12722rv(new C12717os(this), 0, 9, c12724ss);
        }
        list.addItem(c12722rv);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59276k4(List<InterfaceC1861h4> list, boolean z) {
        AbstractC12732up abstractC12732up;
        C4265c5 c4265c5M59265ts = m59265ts();
        if (c4265c5M59265ts != null) {
            if (c4265c5M59265ts.m17159kk(false) > 0) {
                abstractC12732up = this;
                list.addItem(new C12747yj(mo49019bz(), c4265c5M59265ts.m17155k4(0).m17171kk(), C12721ri.f42330k4, z, false, abstractC12732up));
            } else {
                abstractC12732up = this;
            }
            if (c4265c5M59265ts.m17160kk(false, abstractC12732up) > 0) {
                list.addItem(new C12744xw(mo49019bz(), c4265c5M59265ts.m17148du(0), C12721ri.f42330k4, z, false, this));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59277k4(C1589jd c1589jd) {
        this.f42403jd = c1589jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59278k4(C1606x1 c1606x1, C1589jd c1589jd) {
        c1589jd.mo8483x1((C1581c5) c1606x1);
        mo58877ak();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo48952k4(C12694e0 c12694e0) {
        C12717os c12717osMo58860kk = c12694e0.m59134uz().mo58860kk();
        if (c12717osMo58860kk == null || c12717osMo58860kk.m59077to() == this) {
            if (c12694e0.m58929h4() == C12700h4.f42242x1) {
                this.f42401fa = 0;
                return;
            } else {
                this.f42408up = 0;
                return;
            }
        }
        C12696f9 c12696f9 = (C12696f9) c12694e0.m59134uz();
        c12694e0.m59132k4(c12717osMo58860kk);
        ((InterfaceC12685bv) c12694e0.m59135wl()).mo48952k4(c12694e0);
        c12694e0.m59132k4(c12696f9);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59279k4(AbstractC12723s7 abstractC12723s7, List<InterfaceC1861h4> list, boolean z) {
        if (z || abstractC12723s7.m59135wl() != this) {
            abstractC12723s7.m59132k4(mo54973k4(new C12696f9(this, abstractC12723s7.m59134uz())));
        }
        list.addItem(abstractC12723s7);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m59280k4(List<InterfaceC1861h4> list, C12724ss c12724ss) {
        int iM59266vj = m59266vj();
        if (iM59266vj != 104 && iM59266vj != 28 && iM59266vj != 44 && iM59266vj != 100) {
            return false;
        }
        list.addItem(new C12722rv(mo49019bz(), 0, -1000, iM59266vj, c12724ss));
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m59281k4(C12724ss c12724ss, List<InterfaceC1861h4> list) {
        if (!this.f42404ks) {
            this.f42404ks = true;
            if (!c12724ss.m59177to() && m59280k4(list, c12724ss)) {
                return false;
            }
        }
        return this.f42404ks;
    }
}
