package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.microsoft.identity.common.java.providers.oauth2.TokenRequest;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.z2 */
/* JADX INFO: loaded from: classes3.dex */
public class C2399z2 extends AbstractC2119hu {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f8329c5;

    /* JADX INFO: renamed from: m9 */
    private static final C2254q3 f8330m9;

    /* JADX INFO: renamed from: du */
    private C2015bq f8331du;

    /* JADX INFO: renamed from: dy */
    private final C2068ei f8332dy;

    /* JADX INFO: renamed from: h4 */
    private C2237p3 f8333h4;

    /* JADX INFO: renamed from: k4 */
    private C2032cc f8334k4;

    /* JADX INFO: renamed from: kk */
    private C2382y4 f8335kk;

    /* JADX INFO: renamed from: to */
    private C2317u4 f8336to;

    /* JADX INFO: renamed from: x1 */
    private C2355wt f8337x1;

    static {
        C2254q3 c2254q3 = new C2254q3();
        f8330m9 = c2254q3;
        c2254q3.m11259k4();
        f8329c5 = new C7017h4("hstem", "vstem", "vmoveto", "rlineto", "hlineto", "vlineto", "rrcurveto", "closepath", "callsubr", "return", "hsbw", "endchar", "rmoveto", "hmoveto", "vhcurveto", "hvcurveto", "dotsection", "vstem3", "hstem3", "seac", "sbw", "div", "callothersubr", TokenRequest.TokenType.POP, "setcurrentpoint");
    }

    public C2399z2(InterfaceC2416zz interfaceC2416zz, C2015bq c2015bq, C2068ei c2068ei) {
        super(interfaceC2416zz);
        this.f8336to = new C2317u4();
        this.f8331du = c2015bq;
        this.f8332dy = c2068ei;
        this.f8333h4 = new C2237p3(mo10370tq());
        m11786v4();
    }

    /* JADX INFO: renamed from: v4 */
    private void m11786v4() {
        this.f8334k4 = new C2032cc(this.f8332dy);
        this.f8337x1 = new C2355wt(this);
        this.f8335kk = new C2382y4();
        if (this.f8331du.m11470ks().m10340k4().m10491k4(C7019kk.m27443k4((Class<?>) C2301tb.class))) {
            return;
        }
        this.f8331du.m11470ks().m10340k4().m10490k4(new C2301tb(this.f8331du.mo10267k4().m11578m9().m10788x1(), this.f8331du.mo10267k4().m11578m9().m10779kk(), this.f8331du.mo10267k4().m11578m9().m10781to(), this.f8331du.mo10267k4().m11578m9().m10763du()));
    }

    /* JADX INFO: renamed from: ar */
    public final void m11787ar() {
        mo10370tq().m11121k4(mo10370tq().m11123to());
    }

    /* JADX INFO: renamed from: bv */
    public final void m11788bv() {
        mo10370tq().m11123to();
        mo10370tq().m11123to();
    }

    /* JADX INFO: renamed from: c5 */
    public final void m11789c5() {
        if (!this.f8333h4.m11225k4(4)) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
            return;
        }
        double dM11123to = mo10370tq().m11123to();
        double dM11123to2 = mo10370tq().m11123to();
        this.f8334k4.m10325k4(C2308tp.m11450k4(this, mo10370tq().m11123to(), 0.0d, mo10370tq().m11123to(), dM11123to2, 0.0d, dM11123to));
    }

    /* JADX INFO: renamed from: ck */
    public final void m11790ck() {
        if (!this.f8333h4.m11226x1()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
            return;
        }
        double dM11123to = mo10370tq().m11123to();
        double dM11123to2 = mo10370tq().m11123to();
        if (this.f8337x1.m11621k4()) {
            this.f8337x1.m11620k4(dM11123to2, dM11123to);
        } else {
            this.f8334k4.m10324k4(C2308tp.m11449k4(this, dM11123to2, dM11123to));
        }
    }

    /* JADX INFO: renamed from: du */
    public final void m11791du() {
        if (!this.f8333h4.m11225k4(4)) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
            return;
        }
        double dM11123to = mo10370tq().m11123to();
        double dM11123to2 = mo10370tq().m11123to();
        double dM11123to3 = mo10370tq().m11123to();
        m11786v4();
        mo10369qw().m10583k4().m10864k4(new C2148jn(mo10370tq().m11123to(), dM11123to3));
        this.f8334k4.m10320k4(mo10370tq().m11123to(), dM11123to3);
        this.f8334k4.m10332x1(dM11123to2, dM11123to);
    }

    /* JADX INFO: renamed from: dy */
    public final void m11792dy() {
        if (!this.f8333h4.m11224k4()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
            return;
        }
        double dM11123to = mo10370tq().m11123to();
        if (this.f8337x1.m11621k4()) {
            this.f8337x1.m11620k4(dM11123to, 0.0d);
        } else {
            this.f8334k4.m10324k4(C2308tp.m11449k4(this, dM11123to, 0.0d));
        }
    }

    /* JADX INFO: renamed from: fa */
    public final void m11793fa() {
        if (!this.f8333h4.m11225k4(6)) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
            return;
        }
        double dM11123to = mo10370tq().m11123to();
        double dM11123to2 = mo10370tq().m11123to();
        double dM11123to3 = mo10370tq().m11123to();
        double dM11123to4 = mo10370tq().m11123to();
        this.f8334k4.m10325k4(C2308tp.m11450k4(this, mo10370tq().m11123to(), mo10370tq().m11123to(), dM11123to4, dM11123to3, dM11123to2, dM11123to));
    }

    /* JADX INFO: renamed from: h4 */
    public final void m11794h4() {
        this.f8334k4.m10323k4(C2308tp.m11448k4(this));
    }

    /* JADX INFO: renamed from: ix */
    public final void m11795ix() {
        if (!this.f8333h4.m11226x1()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
            return;
        }
        double dM11123to = mo10370tq().m11123to();
        this.f8334k4.m10330to(mo10370tq().m11123to(), dM11123to);
    }

    /* JADX INFO: renamed from: jd */
    public final void m11796jd() {
        if (!this.f8333h4.m11226x1()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
            return;
        }
        this.f8334k4.m10326k4(C2308tp.m11451x1(this, mo10370tq().m11123to(), mo10370tq().m11123to()));
    }

    /* JADX INFO: renamed from: k4 */
    public final C2068ei m11797k4() {
        return this.f8332dy;
    }

    /* JADX INFO: renamed from: kk */
    public final void m11798kk() {
        if (!this.f8333h4.m11226x1()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
            return;
        }
        double dM11123to = mo10370tq().m11123to();
        double dM11123to2 = mo10370tq().m11123to();
        m11786v4();
        mo10369qw().m10583k4().m10864k4(new C2148jn(dM11123to2, 0.0d));
        this.f8334k4.m10320k4(dM11123to2, 0.0d);
        this.f8334k4.m10332x1(dM11123to, 0.0d);
    }

    /* JADX INFO: renamed from: ks */
    public final void m11799ks() {
        if (!this.f8333h4.m11224k4()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
        } else {
            this.f8334k4.m10324k4(C2308tp.m11449k4(this, 0.0d, mo10370tq().m11123to()));
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final void m11800m9() {
        if (!this.f8333h4.m11224k4()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
        } else {
            this.f8334k4.m10326k4(C2308tp.m11451x1(this, mo10370tq().m11123to(), 0.0d));
        }
    }

    /* JADX INFO: renamed from: ne */
    public final void m11801ne() {
        mo10370tq().m11123to();
        mo10370tq().m11123to();
        mo10370tq().m11123to();
        mo10370tq().m11123to();
        mo10370tq().m11123to();
        mo10370tq().m11123to();
    }

    /* JADX INFO: renamed from: qq */
    public final void m11802qq() {
        int iM27462to = C7019kk.m27462to(Double.valueOf(mo10370tq().m11123to()), 14);
        if (iM27462to < mo10371w6().f7079k4.length) {
            try {
                this.f8336to.m11475k4(mo10371w6().f7079k4[iM27462to].m10694k4());
                mo10372x1(this.f8336to);
            } finally {
                this.f8336to.m11474k4();
            }
        }
    }

    /* JADX INFO: renamed from: rv */
    public final void m11803rv() {
    }

    /* JADX INFO: renamed from: to */
    public final void m11804to() {
        double d;
        double dM10466dy;
        double dM11123to = mo10370tq().m11123to();
        double dM11123to2 = mo10370tq().m11123to();
        double dM11123to3 = mo10370tq().m11123to();
        double dM11123to4 = mo10370tq().m11123to();
        double dM11123to5 = mo10370tq().m11123to();
        if (this.f8331du.m10268x1().containsItem(Double.valueOf(dM11123to)) || this.f8331du.m10268x1().containsItem(Double.valueOf(dM11123to2))) {
            return;
        }
        this.f8331du.m10268x1().addItem(Double.valueOf(dM11123to));
        this.f8331du.m10268x1().addItem(Double.valueOf(dM11123to2));
        try {
            C2254q3 c2254q3 = f8330m9;
            C2068ei c2068eiMo10265k4 = this.f8331du.mo10265k4(new C2319ub(c2254q3.m11258k4(C7019kk.m27434ck(Double.valueOf(dM11123to), 14))));
            C2068ei c2068eiMo10265k42 = this.f8331du.mo10265k4(new C2319ub(c2254q3.m11258k4(C7019kk.m27434ck(Double.valueOf(dM11123to2), 14))));
            if (c2068eiMo10265k42 != null) {
                double dM10479m9 = (m11797k4().m10479m9() + dM11123to4) - dM11123to5;
                dM10466dy = m11797k4().m10466dy() + dM11123to3;
                d = dM10479m9;
            } else {
                d = 0.0d;
                dM10466dy = 0.0d;
            }
            if (c2068eiMo10265k4 != null) {
                this.f8334k4.m10322k4(c2068eiMo10265k4.m10468h4(), d, dM10466dy);
            }
            if (c2068eiMo10265k42 != null) {
                this.f8334k4.m10321k4(c2068eiMo10265k42.m10468h4());
            }
            this.f8331du.m10268x1().removeItem(Double.valueOf(dM11123to));
            this.f8331du.m10268x1().removeItem(Double.valueOf(dM11123to2));
        } catch (Throwable th) {
            this.f8331du.m10268x1().removeItem(Double.valueOf(dM11123to));
            this.f8331du.m10268x1().removeItem(Double.valueOf(dM11123to2));
            throw th;
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final void m11805u4() {
        mo10370tq().m11123to();
        mo10370tq().m11123to();
        mo10370tq().m11123to();
        mo10370tq().m11123to();
        mo10370tq().m11123to();
        mo10370tq().m11123to();
    }

    /* JADX INFO: renamed from: um */
    public final void m11806um() {
    }

    /* JADX INFO: renamed from: up */
    public final void m11807up() {
        if (!this.f8333h4.m11225k4(4)) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
            return;
        }
        double dM11123to = mo10370tq().m11123to();
        double dM11123to2 = mo10370tq().m11123to();
        this.f8334k4.m10325k4(C2308tp.m11450k4(this, 0.0d, mo10370tq().m11123to(), mo10370tq().m11123to(), dM11123to2, dM11123to, 0.0d));
    }

    /* JADX INFO: renamed from: uz */
    public final void m11808uz() {
        if (!this.f8333h4.m11226x1()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
            return;
        }
        mo10370tq().m11121k4(C2389yj.m11767kk(mo10370tq().m11123to(), mo10370tq().m11123to()));
    }

    /* JADX INFO: renamed from: wl */
    public final void m11809wl() {
        if (this.f8333h4.m11226x1()) {
            int iM27462to = C7019kk.m27462to(Double.valueOf(mo10370tq().m11123to()), 14);
            double dM11123to = mo10370tq().m11123to();
            if (iM27462to == 3) {
                this.f8334k4.m10328kk();
                return;
            }
            if (iM27462to == 1) {
                this.f8337x1.m11622kk();
                return;
            }
            if (iM27462to == 2) {
                return;
            }
            int i = 0;
            if (iM27462to == 0) {
                this.f8337x1.m11623to();
                C2305th[] c2305thArrM11624x1 = this.f8337x1.m11624x1();
                int length = c2305thArrM11624x1.length;
                while (i < length) {
                    this.f8334k4.m10325k4(c2305thArrM11624x1[i]);
                    i++;
                }
                return;
            }
            if (iM27462to == 12 || iM27462to == 13) {
                int iM27462to2 = C7019kk.m27462to(Double.valueOf(dM11123to), 14);
                while (i < iM27462to2) {
                    this.f8335kk.m11727k4(mo10370tq().m11123to());
                    i++;
                }
                if (iM27462to == 13) {
                    this.f8335kk.m11729kk();
                    this.f8334k4.m10327k4(this.f8335kk.m11730x1(), this.f8335kk.m11728k4());
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11810x1() {
        this.f8334k4.m10331x1();
    }

    /* JADX INFO: renamed from: x6 */
    public final void m11811x6() {
        if (!this.f8333h4.m11226x1()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
            return;
        }
        double dM11123to = mo10370tq().m11123to();
        this.f8334k4.m10329kk(mo10370tq().m11123to(), dM11123to);
    }

    /* JADX INFO: renamed from: yj */
    public final void m11812yj() {
        if (!this.f8333h4.m11224k4()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
        } else {
            this.f8334k4.m10326k4(C2308tp.m11451x1(this, 0.0d, mo10370tq().m11123to()));
        }
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2119hu
    /* JADX INFO: renamed from: k4 */
    public void mo10395k4(String str) {
        switch (f8329c5.m27428k4(str)) {
            case 0:
                m11811x6();
                break;
            case 1:
                m11795ix();
                break;
            case 2:
                m11799ks();
                break;
            case 3:
                m11796jd();
                break;
            case 4:
                m11800m9();
                break;
            case 5:
                m11812yj();
                break;
            case 6:
                m11793fa();
                break;
            case 7:
                m11794h4();
                break;
            case 8:
                m11802qq();
                break;
            case 9:
                m11806um();
                break;
            case 10:
                m11798kk();
                break;
            case 11:
                m11810x1();
                break;
            case 12:
                m11790ck();
                break;
            case 13:
                m11792dy();
                break;
            case 14:
                m11807up();
                break;
            case 15:
                m11789c5();
                break;
            case 16:
                m11803rv();
                break;
            case 17:
                m11805u4();
                break;
            case 18:
                m11801ne();
                break;
            case 19:
                m11804to();
                break;
            case 20:
                m11791du();
                break;
            case 21:
                m11808uz();
                break;
            case 22:
                m11809wl();
                break;
            case 23:
                m11787ar();
                break;
            case 24:
                m11788bv();
                break;
        }
    }
}
