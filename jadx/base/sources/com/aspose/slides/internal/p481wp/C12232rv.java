package com.aspose.slides.internal.p481wp;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p022ai.C1374fa;
import com.aspose.slides.internal.p022ai.C1376jd;
import com.aspose.slides.internal.p022ai.C1378kk;
import com.aspose.slides.internal.p022ai.C1381up;
import com.aspose.slides.internal.p022ai.InterfaceC1380to;
import com.aspose.slides.internal.p057c6.C1978ck;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p097e0.C3509b3;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p150gi.C4264bz;
import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.internal.p150gi.C4266c6;
import com.aspose.slides.internal.p150gi.C4270dy;
import com.aspose.slides.internal.p150gi.C4273fa;
import com.aspose.slides.internal.p150gi.C4289qw;
import com.aspose.slides.internal.p150gi.C4297ts;
import com.aspose.slides.internal.p150gi.InterfaceC4260ak;
import com.aspose.slides.internal.p150gi.InterfaceC4307wy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.wp.rv */
/* JADX INFO: loaded from: classes5.dex */
public class C12232rv extends AbstractC12235um implements InterfaceC1380to, InterfaceC4260ak, InterfaceC4307wy, InterfaceC12224jd {

    /* JADX INFO: renamed from: ak */
    private C12238v4 f40680ak;

    /* JADX INFO: renamed from: ar */
    private int f40681ar;

    /* JADX INFO: renamed from: b3 */
    private List<C12239wl> f40682b3;

    /* JADX INFO: renamed from: bv */
    private int f40683bv;

    /* JADX INFO: renamed from: bz */
    private boolean f40684bz;

    /* JADX INFO: renamed from: c5 */
    private C4264bz f40685c5;

    /* JADX INFO: renamed from: c6 */
    private boolean f40686c6;

    /* JADX INFO: renamed from: dq */
    private C12216bv f40687dq;

    /* JADX INFO: renamed from: dy */
    private C4273fa f40688dy;

    /* JADX INFO: renamed from: e0 */
    private boolean f40689e0;

    /* JADX INFO: renamed from: g8 */
    private AbstractC12244yj f40690g8;

    /* JADX INFO: renamed from: h4 */
    private C4270dy f40691h4;

    /* JADX INFO: renamed from: ix */
    private C4264bz f40692ix;

    /* JADX INFO: renamed from: jd */
    private int f40693jd;

    /* JADX INFO: renamed from: lr */
    private InterfaceC1984kk f40694lr;

    /* JADX INFO: renamed from: m9 */
    private C4265c5 f40695m9;

    /* JADX INFO: renamed from: ne */
    private int f40696ne;

    /* JADX INFO: renamed from: qm */
    private boolean f40697qm;

    /* JADX INFO: renamed from: qq */
    private int f40698qq;

    /* JADX INFO: renamed from: rv */
    private C4297ts f40699rv;

    /* JADX INFO: renamed from: sv */
    private AbstractC3533um f40700sv;

    /* JADX INFO: renamed from: ts */
    private boolean f40701ts;

    /* JADX INFO: renamed from: u4 */
    private C4266c6 f40702u4;

    /* JADX INFO: renamed from: um */
    private int f40703um;

    /* JADX INFO: renamed from: uz */
    private C4266c6 f40704uz;

    /* JADX INFO: renamed from: v4 */
    private C1381up f40705v4;

    /* JADX INFO: renamed from: wl */
    private C4266c6 f40706wl;

    /* JADX INFO: renamed from: wy */
    private C12226kk f40707wy;

    /* JADX INFO: renamed from: x6 */
    private int f40708x6;

    /* JADX INFO: renamed from: xk */
    private boolean f40709xk;

    /* JADX INFO: renamed from: yd */
    private InterfaceC1984kk f40710yd;

    public C12232rv(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f40682b3 = new List<>();
        this.f40707wy = new C12226kk();
        this.f40680ak = null;
        this.f40687dq = null;
        this.f40709xk = false;
        this.f40686c6 = false;
        this.f40701ts = false;
        this.f40689e0 = false;
        this.f40684bz = false;
        this.f40697qm = false;
    }

    /* JADX INFO: renamed from: jw */
    private void m57078jw() {
        for (int i = 0; i < this.f40682b3.size(); i++) {
            if (this.f40682b3.get_Item(i) == null) {
                this.f40682b3.set_Item(i, m57080m9(i + 1));
            }
        }
    }

    /* JADX INFO: renamed from: m9 */
    private C12239wl m57080m9(int i) {
        C12239wl c12239wl = new C12239wl(this, true);
        c12239wl.mo14090k4(new C3509b3(c12239wl, this.f40700sv));
        c12239wl.m57153k4(new C4289qw(1.0d, c12239wl));
        c12239wl.m57149du(i);
        if (!m57102zj()) {
            c12239wl.m57154k4(this.f40733ks);
        }
        return c12239wl;
    }

    /* JADX INFO: renamed from: ai */
    public final C4297ts m57081ai() {
        return this.f40699rv;
    }

    /* JADX INFO: renamed from: bs */
    public final AbstractC12244yj m57082bs() {
        return this.f40690g8;
    }

    /* JADX INFO: renamed from: bz */
    public final boolean m57083bz() {
        return this.f40684bz;
    }

    /* JADX INFO: renamed from: ca */
    public final InterfaceC1984kk m57084ca() {
        return this.f40710yd;
    }

    /* JADX INFO: renamed from: du */
    public final void m57085du(int i) {
        int size = this.f40682b3.size();
        while (true) {
            size++;
            if (size > i) {
                return;
            } else {
                this.f40682b3.addItem(m57080m9(size));
            }
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        super.mo14081dy();
        mo14107n_().mo14218x1(this);
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12235um
    /* JADX INFO: renamed from: e0 */
    public C12232rv mo57086e0() {
        return this;
    }

    /* JADX INFO: renamed from: em */
    public final int m57087em() {
        return this.f40693jd;
    }

    /* JADX INFO: renamed from: f9 */
    public final boolean m57088f9() {
        return this.f40681ar == 149;
    }

    /* JADX INFO: renamed from: g8 */
    public final List<C12239wl> m57089g8() {
        return this.f40682b3;
    }

    /* JADX INFO: renamed from: gi */
    public final C12216bv m57090gi() {
        return this.f40687dq;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12239wl m57091h4(int i) {
        return this.f40682b3.get_Item(i);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 71;
    }

    @Override // com.aspose.slides.internal.p022ai.InterfaceC1380to
    /* JADX INFO: renamed from: j2 */
    public final C1378kk mo8170j2() {
        return this.f40705v4.mo8170j2();
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public AbstractC3511c5 mo14087k4(AbstractC3511c5 abstractC3511c5, boolean z) {
        C12232rv c12232rv = (C12232rv) super.mo14087k4(abstractC3511c5, z);
        if (z) {
            c12232rv.f40682b3 = new List<>();
            c12232rv.f40697qm = false;
            c12232rv.f40707wy = new C12226kk();
            c12232rv.f40680ak = null;
            c12232rv.f40687dq = null;
            c12232rv.f40690g8 = null;
        }
        return c12232rv;
    }

    /* JADX INFO: renamed from: kp */
    public final C12238v4 m57092kp() {
        return this.f40680ak;
    }

    /* JADX INFO: renamed from: os */
    public final C4266c6 m57093os() {
        return this.f40702u4;
    }

    /* JADX INFO: renamed from: qm */
    public final boolean m57094qm() {
        return this.f40698qq == 9;
    }

    @Override // com.aspose.slides.internal.p022ai.InterfaceC1380to
    /* JADX INFO: renamed from: qw */
    public final C1378kk mo8171qw() {
        return this.f40705v4.mo8171qw();
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: r_ */
    public void mo14113r_() {
        if (!this.f40689e0) {
            m14123x1(C14113y2.m67408k4("(marker*,table-column*,table-header?,table-footer?", ",table-body+)"));
        }
        if (!m14329um()) {
            m14115s_().mo14121x1(this);
            return;
        }
        if (mo14110p_()) {
            return;
        }
        this.f40690g8.mo57075kk();
        int size = this.f40682b3.size();
        while (true) {
            size--;
            if (size < 0) {
                this.f40700sv = null;
                this.f40690g8 = null;
                return;
            } else {
                C12239wl c12239wl = this.f40682b3.get_Item(size);
                if (c12239wl != null) {
                    c12239wl.m57157ss();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public final InterfaceC1984kk m57095ri() {
        return this.f40694lr;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "table";
    }

    /* JADX INFO: renamed from: s7 */
    public final boolean m57096s7() {
        return this.f40703um == 149;
    }

    @Override // com.aspose.slides.internal.p150gi.InterfaceC4307wy
    /* JADX INFO: renamed from: ss */
    public final int mo17279ss() {
        return this.f40696ne;
    }

    /* JADX INFO: renamed from: sv */
    public final int m57097sv() {
        return this.f40682b3.size();
    }

    /* JADX INFO: renamed from: t6 */
    public final C4264bz m57098t6() {
        return this.f40692ix;
    }

    @Override // com.aspose.slides.internal.p022ai.InterfaceC1380to
    /* JADX INFO: renamed from: tq */
    public final C1376jd mo8172tq() {
        return this.f40705v4.mo8172tq();
    }

    @Override // com.aspose.slides.internal.p150gi.InterfaceC4260ak
    /* JADX INFO: renamed from: ts */
    public final C4270dy mo17117ts() {
        return this.f40691h4;
    }

    /* JADX INFO: renamed from: vh */
    public final C4266c6 m57099vh() {
        return this.f40704uz;
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12235um
    /* JADX INFO: renamed from: vj */
    public C4265c5 mo57067vj() {
        return this.f40695m9;
    }

    /* JADX INFO: renamed from: w6 */
    public final C4266c6 m57100w6() {
        return this.f40706wl;
    }

    @Override // com.aspose.slides.internal.p150gi.InterfaceC4307wy
    /* JADX INFO: renamed from: wp */
    public final int mo17280wp() {
        return this.f40708x6;
    }

    /* JADX INFO: renamed from: xw */
    public final C4273fa m57101xw() {
        return this.f40688dy;
    }

    /* JADX INFO: renamed from: zj */
    public final boolean m57102zj() {
        return m57087em() == 129;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        super.mo14083h4();
        mo14107n_().mo14192k4(this);
    }

    @Override // com.aspose.slides.internal.p481wp.InterfaceC12224jd
    /* JADX INFO: renamed from: k4 */
    public final C12226kk mo57053k4() {
        return this.f40707wy;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14089k4(AbstractC3511c5 abstractC3511c5) {
        AbstractC12244yj c12240wy;
        int iMo14084ix = abstractC3511c5.mo14084ix();
        if (iMo14084ix != 73) {
            switch (iMo14084ix) {
                case 76:
                    this.f40684bz = true;
                    if (!mo14110p_()) {
                        m57079k4((C12239wl) abstractC3511c5);
                    } else {
                        this.f40682b3.addItem((C12239wl) abstractC3511c5);
                    }
                    break;
                case 77:
                case 78:
                    break;
                default:
                    super.mo14089k4(abstractC3511c5);
                    break;
            }
            return;
        }
        if (!mo14110p_() && !this.f40697qm) {
            this.f40697qm = true;
            if (this.f40684bz) {
                m57078jw();
                c12240wy = new C12229m9(this);
            } else {
                c12240wy = new C12240wy(this);
            }
            this.f40690g8 = c12240wy;
        }
        if (iMo14084ix == 77) {
            this.f40687dq = (C12216bv) abstractC3511c5;
        } else if (iMo14084ix != 78) {
            super.mo14089k4(abstractC3511c5);
        } else {
            this.f40680ak = (C12238v4) abstractC3511c5;
        }
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12235um, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f40691h4 = C4270dy.m17199k4(abstractC3533um);
        this.f40695m9 = abstractC3533um.m14401to();
        this.f40688dy = abstractC3533um.m14399m9();
        this.f40685c5 = abstractC3533um.m14402to(17).mo17130k_();
        this.f40693jd = abstractC3533um.m14402to(31).mo17251du();
        this.f40699rv = abstractC3533um.m14402to(45).mo17255u_();
        this.f40708x6 = abstractC3533um.m14402to(58).mo17251du();
        this.f40696ne = abstractC3533um.m14402to(59).mo17251du();
        this.f40692ix = abstractC3533um.m14402to(127).mo17130k_();
        this.f40702u4 = abstractC3533um.m14402to(131).mo17190up();
        this.f40704uz = abstractC3533um.m14402to(132).mo17190up();
        this.f40706wl = abstractC3533um.m14402to(133).mo17190up();
        this.f40698qq = abstractC3533um.m14402to(239).mo17251du();
        this.f40681ar = abstractC3533um.m14402to(240).mo17251du();
        this.f40703um = abstractC3533um.m14402to(241).mo17251du();
        this.f40683bv = abstractC3533um.m14402to(StyleIdentifier.PLAIN_TABLE_1).mo17251du();
        this.f40705v4 = new C1381up(C1374fa.m8142k4(abstractC3533um.m14385du(StyleIdentifier.PLAIN_TABLE_1).mo17251du()), C1376jd.m8166k4(abstractC3533um.m14385du(255).mo17251du()));
        this.f40694lr = abstractC3533um.m14402to(StyleIdentifier.PLAIN_TABLE_5).mo9877dy();
        this.f40710yd = abstractC3533um.m14402to(StyleIdentifier.TABLE_GRID_LIGHT).mo9877dy();
        this.f40685c5.m17133to(null).m17256x6();
        if (!m57102zj() && mo57067vj().m17157k4(C1978ck.m10100k4())) {
            C12214ar.m56996k4(m14111q_().m59580u4()).mo57002k4(this, m14106m_());
        }
        this.f40700sv = abstractC3533um;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            if (C14113y2.m67363du(str2, RequestParameters.MARKER)) {
                if (this.f40709xk || this.f40686c6 || this.f40701ts || this.f40689e0) {
                    m14122x1(interfaceC3757h4, "fo:marker", "(table-column*,table-header?,table-footer?,table-body+)");
                    return;
                }
                return;
            }
            if (C14113y2.m67363du(str2, "table-column")) {
                this.f40709xk = true;
                if (this.f40686c6 || this.f40701ts || this.f40689e0) {
                    m14122x1(interfaceC3757h4, "fo:table-column", "(table-header?,table-footer?,table-body+)");
                    return;
                }
                return;
            }
            if (C14113y2.m67363du(str2, "table-header")) {
                if (this.f40686c6) {
                    m14093k4(interfaceC3757h4, "table-header");
                    return;
                }
                this.f40686c6 = true;
                if (this.f40701ts || this.f40689e0) {
                    m14122x1(interfaceC3757h4, "fo:table-header", "(table-footer?,table-body+)");
                    return;
                }
                return;
            }
            if (!C14113y2.m67363du(str2, "table-footer")) {
                if (C14113y2.m67363du(str2, "table-body")) {
                    this.f40689e0 = true;
                    return;
                } else {
                    m14103kk(interfaceC3757h4, str, str2);
                    return;
                }
            }
            if (this.f40701ts) {
                m14093k4(interfaceC3757h4, "table-footer");
                return;
            }
            this.f40701ts = true;
            if (this.f40689e0) {
                if (m14111q_().m59577rv()) {
                    m14096k4(interfaceC3757h4, "fo:table-footer", "(table-body+)", true);
                }
                if (m57102zj()) {
                    return;
                }
                C12214ar.m56996k4(m14111q_().m59580u4()).mo57012x1(this, m14105ks(), m14106m_());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m57079k4(C12239wl c12239wl) {
        int i;
        int iM57156qm = c12239wl.m57156qm();
        int iM57150g8 = c12239wl.m57150g8();
        while (true) {
            i = (iM57156qm + iM57150g8) - 1;
            if (this.f40682b3.size() >= i) {
                break;
            } else {
                this.f40682b3.addItem(null);
            }
        }
        for (int i2 = iM57156qm - 1; i2 < i; i2++) {
            this.f40682b3.set_Item(i2, c12239wl);
        }
        this.f40707wy.m57058k4(iM57156qm, i);
    }
}
