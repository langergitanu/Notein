package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: renamed from: com.aspose.slides.vr */
/* JADX INFO: loaded from: classes3.dex */
class C14699vr {

    /* JADX INFO: renamed from: du */
    private final int f49687du;

    /* JADX INFO: renamed from: h4 */
    private String f49688h4;

    /* JADX INFO: renamed from: k4 */
    private String f49689k4;

    /* JADX INFO: renamed from: kk */
    private final int f49690kk;

    /* JADX INFO: renamed from: m9 */
    private final IGenericList<InterfaceC0761as> f49691m9;

    /* JADX INFO: renamed from: to */
    private final int f49692to;

    /* JADX INFO: renamed from: x1 */
    private final C1219hp f49693x1;

    public C14699vr(C1219hp c1219hp, int i, int i2, int i3) {
        this.f49693x1 = c1219hp;
        this.f49690kk = i;
        this.f49692to = i2;
        this.f49687du = i3;
        this.f49691m9 = new List();
    }

    /* JADX INFO: renamed from: c5 */
    private InterfaceC0761as m72484c5(String str) {
        return this.f49687du == 0 ? C13712k4.m63639k4(str, this.f49692to, this.f49690kk) : dj6.m5112k4(str);
    }

    /* JADX INFO: renamed from: ck */
    private InterfaceC0761as m72486ck(String str) {
        C6005k4.m24261k4(!C14113y2.m67411k4(str));
        return this.f49687du == 0 ? C13712k4.m63647x1(str, this.f49690kk) : dj6.m5114kk(str);
    }

    /* JADX INFO: renamed from: du */
    private InterfaceC0782az m72488du() {
        C1196he c1196he;
        InterfaceC0782az interfaceC0782azM72494h4 = m72494h4();
        if (interfaceC0782azM72494h4 == null) {
            return null;
        }
        if (C7019kk.m27469x1(interfaceC0782azM72494h4, C1187h6.class)) {
            return interfaceC0782azM72494h4;
        }
        while (true) {
            int iM7276k4 = this.f49693x1.m7276k4();
            if (iM7276k4 == 6) {
                this.f49693x1.m7278to();
                InterfaceC0782az interfaceC0782azM72494h42 = m72494h4();
                if (interfaceC0782azM72494h42 == null) {
                    return null;
                }
                c1196he = new C1196he(0, interfaceC0782azM72494h4, interfaceC0782azM72494h42);
            } else {
                if (iM7276k4 != 7) {
                    return interfaceC0782azM72494h4;
                }
                this.f49693x1.m7278to();
                InterfaceC0782az interfaceC0782azM72494h43 = m72494h4();
                if (interfaceC0782azM72494h43 == null) {
                    return null;
                }
                c1196he = new C1196he(1, interfaceC0782azM72494h4, interfaceC0782azM72494h43);
            }
            interfaceC0782azM72494h4 = c1196he;
        }
    }

    /* JADX INFO: renamed from: dy */
    private InterfaceC0761as m72490dy(String str) {
        return this.f49687du == 0 ? C13712k4.m63640k4(str, this.f49692to, this.f49690kk, this.f49688h4) : dj6.m5113k4(str, this.f49688h4);
    }

    /* JADX INFO: renamed from: fa */
    private InterfaceC0782az m72492fa() {
        this.f49693x1.m7278to();
        InterfaceC0782az interfaceC0782azM72501to = m72501to();
        if (interfaceC0782azM72501to == null) {
            return null;
        }
        if (this.f49693x1.m7276k4() != 20) {
            m72497k4("The close parenthesis is missed.");
            return null;
        }
        this.f49693x1.m7278to();
        return new d4x(interfaceC0782azM72501to);
    }

    /* JADX INFO: renamed from: h4 */
    private InterfaceC0761as m72493h4(String str) {
        return this.f49687du == 0 ? C13712k4.m63641k4(str, this.f49690kk, this.f49688h4) : dj6.m5117x1(str, this.f49688h4);
    }

    /* JADX INFO: renamed from: jd */
    private InterfaceC0761as m72495jd(String str) {
        C6005k4.m24261k4(!C14113y2.m67411k4(str));
        return this.f49687du == 0 ? C13712k4.m63638k4(str, this.f49690kk) : dj6.m5116x1(str);
    }

    /* JADX INFO: renamed from: kk */
    private double m72498kk(String str) {
        return C14080ne.m66906fa(str, (InterfaceC14073kp) C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: m9 */
    private InterfaceC0761as m72499m9(String str) {
        return this.f49687du == 0 ? C13712k4.m63648x1(str, this.f49692to, this.f49688h4) : dj6.m5115kk(str, this.f49688h4);
    }

    /* JADX INFO: renamed from: to */
    private InterfaceC0782az m72501to() {
        int i;
        InterfaceC0782az interfaceC0782azM72488du = m72488du();
        if (interfaceC0782azM72488du == null) {
            return null;
        }
        if (C7019kk.m27469x1(interfaceC0782azM72488du, C1187h6.class)) {
            return interfaceC0782azM72488du;
        }
        while (true) {
            switch (this.f49693x1.m7276k4()) {
                case 13:
                    i = 0;
                    break;
                case 14:
                    i = 1;
                    break;
                case 15:
                    i = 2;
                    break;
                case 16:
                    i = 3;
                    break;
                case 17:
                    i = 4;
                    break;
                case 18:
                    i = 5;
                    break;
                default:
                    return interfaceC0782azM72488du;
            }
            this.f49693x1.m7278to();
            InterfaceC0782az interfaceC0782azM72488du2 = m72488du();
            if (interfaceC0782azM72488du2 == null) {
                return null;
            }
            interfaceC0782azM72488du = new C14457si(i, interfaceC0782azM72488du, interfaceC0782azM72488du2);
        }
    }

    /* JADX INFO: renamed from: up */
    private InterfaceC0782az m72503up() {
        String strM67362du = C14113y2.m67362du(C14113y2.m67401k4(this.f49693x1.m7279x1(), "_xlfn.", ""), '(');
        C14456sh c14456sh = new C14456sh(strM67362du);
        this.f49693x1.m7278to();
        while (true) {
            InterfaceC0782az interfaceC0782azM72501to = null;
            while (this.f49693x1.m7276k4() != 20) {
                if (this.f49693x1.m7276k4() == 0) {
                    m72497k4(C14113y2.m67402k4("The close parenthesis is missed for the {0} function.", strM67362du));
                    return null;
                }
                if (this.f49693x1.m7276k4() == 22) {
                    if (interfaceC0782azM72501to == null) {
                        c14456sh.m70624k4(new C1245ia());
                    }
                    this.f49693x1.m7278to();
                    if (this.f49693x1.m7276k4() == 20) {
                        interfaceC0782azM72501to = new C1245ia();
                    }
                } else {
                    interfaceC0782azM72501to = m72501to();
                    if (interfaceC0782azM72501to == null) {
                        return null;
                    }
                }
                c14456sh.m70624k4(interfaceC0782azM72501to);
            }
            this.f49693x1.m7278to();
            return c14456sh;
        }
    }

    /* JADX INFO: renamed from: yj */
    private InterfaceC0782az m72505yj() {
        if (C14117yj.m67519h4(this.f49693x1.m7279x1().charAt(0))) {
            this.f49693x1.m7278to();
            return new C1187h6("#NAME?");
        }
        m72497k4(C14113y2.m67402k4("Undefined symbol sequence '{0}' is encountered at position {1}.", this.f49693x1.m7279x1(), Integer.valueOf(this.f49693x1.m7277kk())));
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m72506k4() {
        return this.f49689k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final IGenericList<InterfaceC0761as> m72508x1() {
        return this.f49691m9;
    }

    public C14699vr(C1219hp c1219hp, int i, int i2, int i3, String str) {
        this(c1219hp, i, i2, i3);
        this.f49688h4 = str;
    }

    /* JADX INFO: renamed from: c5 */
    private InterfaceC0782az m72485c5() {
        if (this.f49693x1.m7276k4() == 6) {
            this.f49693x1.m7278to();
            return m72485c5();
        }
        if (this.f49693x1.m7276k4() != 7) {
            return m72496jd();
        }
        this.f49693x1.m7278to();
        InterfaceC0782az interfaceC0782azM72485c5 = m72485c5();
        if (interfaceC0782azM72485c5 == null) {
            return null;
        }
        return new C14827y2(1, interfaceC0782azM72485c5);
    }

    /* JADX INFO: renamed from: ck */
    private InterfaceC0782az m72487ck() {
        InterfaceC0782az c13819m3;
        InterfaceC0761as interfaceC0761asM72490dy;
        rpr rprVar;
        int iM7276k4 = this.f49693x1.m7276k4();
        if (iM7276k4 == 1) {
            return m72505yj();
        }
        if (iM7276k4 == 2) {
            c13819m3 = new C13819m3(m72504x1(this.f49693x1.m7279x1()));
        } else if (iM7276k4 == 3) {
            c13819m3 = new fq4(m72498kk(this.f49693x1.m7279x1()));
        } else if (iM7276k4 == 4) {
            c13819m3 = new mai(m72502to(this.f49693x1.m7279x1()));
        } else {
            if (iM7276k4 != 5) {
                if (iM7276k4 == 19) {
                    return m72492fa();
                }
                if (iM7276k4 == 21) {
                    return m72503up();
                }
                switch (iM7276k4) {
                    case 24:
                        interfaceC0761asM72490dy = m72490dy(this.f49693x1.m7279x1());
                        rprVar = new rpr(interfaceC0761asM72490dy);
                        break;
                    case 25:
                        interfaceC0761asM72490dy = m72493h4(this.f49693x1.m7279x1());
                        rprVar = new rpr(interfaceC0761asM72490dy);
                        break;
                    case 26:
                        interfaceC0761asM72490dy = m72499m9(this.f49693x1.m7279x1());
                        rprVar = new rpr(interfaceC0761asM72490dy);
                        break;
                    case 27:
                        interfaceC0761asM72490dy = m72484c5(this.f49693x1.m7279x1());
                        rprVar = new rpr(interfaceC0761asM72490dy);
                        break;
                    case 28:
                        interfaceC0761asM72490dy = m72495jd(this.f49693x1.m7279x1());
                        rprVar = new rpr(interfaceC0761asM72490dy);
                        break;
                    case 29:
                        interfaceC0761asM72490dy = m72486ck(this.f49693x1.m7279x1());
                        rprVar = new rpr(interfaceC0761asM72490dy);
                        break;
                    case 30:
                        c13819m3 = new C1187h6(this.f49693x1.m7279x1());
                        break;
                    default:
                        m72497k4(this.f49693x1.m7276k4() == 0 ? "Unexpected end of the expression." : C14113y2.m67402k4("An unexpected token \"{0}\" is encountered at position {1}.", this.f49693x1.m7279x1(), Integer.valueOf(this.f49693x1.m7277kk())));
                        return null;
                }
                this.f49691m9.addItem(interfaceC0761asM72490dy);
                this.f49693x1.m7278to();
                return rprVar;
            }
            c13819m3 = new p8l(m72489du(this.f49693x1.m7279x1()));
        }
        this.f49693x1.m7278to();
        return c13819m3;
    }

    /* JADX INFO: renamed from: du */
    private String m72489du(String str) {
        return str;
    }

    /* JADX INFO: renamed from: dy */
    private InterfaceC0782az m72491dy() {
        InterfaceC0782az interfaceC0782azM72485c5 = m72485c5();
        if (interfaceC0782azM72485c5 == null) {
            return null;
        }
        if (C7019kk.m27469x1(interfaceC0782azM72485c5, C1187h6.class)) {
            return interfaceC0782azM72485c5;
        }
        while (this.f49693x1.m7276k4() == 11) {
            C14827y2 c14827y2 = new C14827y2(5, interfaceC0782azM72485c5);
            this.f49693x1.m7278to();
            interfaceC0782azM72485c5 = c14827y2;
        }
        return interfaceC0782azM72485c5;
    }

    /* JADX INFO: renamed from: h4 */
    private InterfaceC0782az m72494h4() {
        C1196he c1196he;
        InterfaceC0782az interfaceC0782azM72500m9 = m72500m9();
        if (interfaceC0782azM72500m9 == null) {
            return null;
        }
        if (C7019kk.m27469x1(interfaceC0782azM72500m9, C1187h6.class)) {
            return interfaceC0782azM72500m9;
        }
        while (true) {
            int iM7276k4 = this.f49693x1.m7276k4();
            if (iM7276k4 == 8) {
                this.f49693x1.m7278to();
                InterfaceC0782az interfaceC0782azM72500m92 = m72500m9();
                if (interfaceC0782azM72500m92 == null) {
                    return null;
                }
                c1196he = new C1196he(2, interfaceC0782azM72500m9, interfaceC0782azM72500m92);
            } else {
                if (iM7276k4 != 9) {
                    return interfaceC0782azM72500m9;
                }
                this.f49693x1.m7278to();
                InterfaceC0782az interfaceC0782azM72500m93 = m72500m9();
                if (interfaceC0782azM72500m93 == null) {
                    return null;
                }
                c1196he = new C1196he(3, interfaceC0782azM72500m9, interfaceC0782azM72500m93);
            }
            interfaceC0782azM72500m9 = c1196he;
        }
    }

    /* JADX INFO: renamed from: jd */
    private InterfaceC0782az m72496jd() {
        InterfaceC0782az interfaceC0782azM72487ck = m72487ck();
        int iM7276k4 = this.f49693x1.m7276k4();
        if (iM7276k4 != 12) {
            if (iM7276k4 != 23) {
                return interfaceC0782azM72487ck;
            }
            String strM7279x1 = this.f49693x1.m7279x1();
            this.f49693x1.m7278to();
            return C14816xs.m73602k4(interfaceC0782azM72487ck, m72488du(), strM7279x1);
        }
        if (interfaceC0782azM72487ck == null) {
            return null;
        }
        if (C7019kk.m27469x1(interfaceC0782azM72487ck, C1187h6.class)) {
            return interfaceC0782azM72487ck;
        }
        this.f49693x1.m7278to();
        InterfaceC0782az interfaceC0782azM72487ck2 = m72487ck();
        if (interfaceC0782azM72487ck2 == null) {
            return null;
        }
        if (!C7019kk.m27469x1(interfaceC0782azM72487ck, rpr.class) || !C7019kk.m27469x1(interfaceC0782azM72487ck2, rpr.class)) {
            m72497k4(C14113y2.m67402k4("An invalid range reference is encountered at position {0}.", Integer.valueOf(this.f49693x1.m7277kk())));
            return null;
        }
        InterfaceC0761as interfaceC0761asM70242k4 = ((rpr) interfaceC0782azM72487ck).m70242k4();
        xdd xddVar = new xdd(interfaceC0761asM70242k4, ((rpr) interfaceC0782azM72487ck2).m70242k4(), interfaceC0761asM70242k4.mo3720k4());
        rpr rprVar = new rpr(xddVar);
        this.f49691m9.addItem(xddVar);
        return rprVar;
    }

    /* JADX INFO: renamed from: k4 */
    private void m72497k4(String str) {
        this.f49689k4 = str;
    }

    /* JADX INFO: renamed from: m9 */
    private InterfaceC0782az m72500m9() {
        InterfaceC0782az interfaceC0782azM72491dy = m72491dy();
        if (interfaceC0782azM72491dy == null) {
            return null;
        }
        if (C7019kk.m27469x1(interfaceC0782azM72491dy, C1187h6.class)) {
            return interfaceC0782azM72491dy;
        }
        while (this.f49693x1.m7276k4() == 10) {
            this.f49693x1.m7278to();
            InterfaceC0782az interfaceC0782azM72491dy2 = m72491dy();
            if (interfaceC0782azM72491dy2 == null) {
                return null;
            }
            interfaceC0782azM72491dy = new C1196he(4, interfaceC0782azM72491dy, interfaceC0782azM72491dy2);
        }
        return interfaceC0782azM72491dy;
    }

    /* JADX INFO: renamed from: to */
    private String m72502to(String str) {
        return C14113y2.m67401k4(OooO0OO.OooO00o(2, 1, str, str), "\"\"", "\"");
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m72504x1(String str) {
        return "TRUE".equals(C14113y2.m67358c5(str));
    }

    /* JADX INFO: renamed from: kk */
    public final InterfaceC0782az m72507kk() {
        this.f49693x1.m7278to();
        InterfaceC0782az interfaceC0782azM72501to = m72501to();
        if (interfaceC0782azM72501to == null) {
            return null;
        }
        if (this.f49693x1.m7276k4() == 0) {
            return interfaceC0782azM72501to;
        }
        m72497k4(C14113y2.m67402k4("An unexpected token '{0}' is encountered at position {1}.", this.f49693x1.m7279x1(), Integer.valueOf(this.f49693x1.m7277kk())));
        return null;
    }
}
