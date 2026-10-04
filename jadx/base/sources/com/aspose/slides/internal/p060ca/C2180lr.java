package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14050ca;
import com.aspose.slides.p559ms.System.C14116yg;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2180lr extends AbstractC2119hu {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f7574fa;

    /* JADX INFO: renamed from: jd */
    private static final C2254q3 f7575jd;

    /* JADX INFO: renamed from: c5 */
    private final C2237p3 f7576c5;

    /* JADX INFO: renamed from: ck */
    private final C2068ei f7577ck;

    /* JADX INFO: renamed from: du */
    private final double[] f7578du;

    /* JADX INFO: renamed from: dy */
    private int f7579dy;

    /* JADX INFO: renamed from: h4 */
    private final double[] f7580h4;

    /* JADX INFO: renamed from: k4 */
    private final C2185m2 f7581k4;

    /* JADX INFO: renamed from: kk */
    private final C2286s7 f7582kk;

    /* JADX INFO: renamed from: m9 */
    private C14050ca f7583m9;

    /* JADX INFO: renamed from: to */
    private final C2097gf f7584to;

    /* JADX INFO: renamed from: x1 */
    private final C2317u4 f7585x1;

    static {
        C2254q3 c2254q3 = new C2254q3();
        f7575jd = c2254q3;
        c2254q3.m11259k4();
        f7574fa = new C7017h4("hstem", "vstem", "vmoveto", "rlineto", "hlineto", "vlineto", "rrcurveto", "callsubr", "return", "endchar", "hstemhm", "hintmask", "cntrmask", "rmoveto", "hmoveto", "vstemhm", "rcurveline", "rlinecurve", "vvcurveto", "hhcurveto", "callgsubr", "vhcurveto", "hvcurveto", "and", "or", "not", "abs", "add", "sub", "div", "neg", "eq", "drop", "put", "get", "ifelse", "random", "mul", "sqrt", "dup", "exch", FirebaseAnalytics.Param.INDEX, "roll", "hflex", "flex", "hflex1", "flex1", "pickupyourfreakingmask");
    }

    public C2180lr(InterfaceC2416zz interfaceC2416zz, C2286s7 c2286s7, C2097gf c2097gf, C2068ei c2068ei) {
        super(interfaceC2416zz);
        this.f7585x1 = new C2317u4();
        this.f7582kk = c2286s7;
        this.f7584to = c2097gf;
        this.f7577ck = c2068ei;
        mo10369qw().m10583k4().m10864k4(new C2148jn(0.0d, 0.0d));
        this.f7581k4 = new C2185m2(c2068ei);
        this.f7578du = new double[48];
        this.f7580h4 = new double[32];
        this.f7579dy = 0;
        this.f7576c5 = new C2237p3(mo10370tq());
    }

    /* JADX INFO: renamed from: os */
    private int m11024os() {
        int iM11120k4 = mo10370tq().m11120k4();
        while (mo10370tq().m11120k4() > 0) {
            this.f7578du[mo10370tq().m11120k4() - 1] = mo10370tq().m11123to();
        }
        return iM11120k4;
    }

    /* JADX INFO: renamed from: ak */
    public final void m11026ak() {
        if (!this.f7576c5.m11224k4()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
        } else {
            mo10370tq().m11121k4(C2389yj.m11769x1(mo10370tq().m11123to()));
        }
    }

    /* JADX INFO: renamed from: ar */
    public final void m11027ar() {
        if (this.f7576c5.m11226x1()) {
            do {
                mo10370tq().m11123to();
                mo10370tq().m11123to();
                this.f7579dy++;
            } while (mo10370tq().m11120k4() >= 2);
        }
        if (mo10370tq().m11120k4() == 1) {
            m11023k4(mo10370tq().m11123to());
        }
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: b3 */
    public final void m11028b3() {
        if (!this.f7576c5.m11226x1()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
            return;
        }
        mo10370tq().m11121k4(C2389yj.m11770x1(mo10370tq().m11123to(), mo10370tq().m11123to()));
    }

    /* JADX INFO: renamed from: bv */
    public final void m11029bv() {
        while (mo10370tq().m11120k4() > 1) {
            mo10370tq().m11123to();
            mo10370tq().m11123to();
            this.f7579dy++;
        }
        if (mo10370tq().m11120k4() == 1) {
            m11023k4(mo10370tq().m11123to());
        }
        mo10370tq().m11124x1();
        mo10370tq().m11121k4((this.f7579dy + 7) >> 3);
    }

    /* JADX INFO: renamed from: bz */
    public final void m11030bz() {
        long jM27438h4 = C7019kk.m27438h4(Double.valueOf(mo10370tq().m11123to()), 14);
        if (jM27438h4 >= mo10370tq().m11120k4()) {
            mo10370tq().m11121k4(0.0d);
            return;
        }
        int iM11024os = m11024os();
        double[] dArr = this.f7578du;
        double d = dArr[(int) (((long) (iM11024os - 1)) - jM27438h4)];
        for (double d2 : dArr) {
            mo10370tq().m11121k4(d2);
        }
        mo10370tq().m11121k4(d);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m11031c5() {
        m11025x1(false);
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: c6 */
    public final void m11032c6() {
        if (!this.f7576c5.m11224k4()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
        } else {
            mo10370tq().m11121k4(C2389yj.m11766kk(mo10370tq().m11123to()));
        }
    }

    /* JADX INFO: renamed from: ck */
    public final void m11033ck() {
        double d;
        int iM11024os = m11024os();
        int i = 0;
        while (i < iM11024os) {
            if (i != 0 || iM11024os % 4 <= 0) {
                d = 0.0d;
            } else {
                int i2 = i + 1;
                double d2 = this.f7578du[i];
                i = i2;
                d = d2;
            }
            double[] dArr = this.f7578du;
            this.f7581k4.m11102k4(C2308tp.m11450k4(this, dArr[i], d, dArr[i + 1], dArr[i + 2], dArr[i + 3], 0.0d));
            i += 4;
        }
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: dq */
    public final void m11034dq() {
        if (this.f7583m9 == null) {
            this.f7583m9 = new C14050ca();
        }
        double dM66551x1 = 0.0d;
        while (dM66551x1 == 0.0d) {
            dM66551x1 = this.f7583m9.m66551x1();
        }
        mo10370tq().m11121k4(dM66551x1);
    }

    /* JADX INFO: renamed from: du */
    public final void m11035du() {
        m11068vh();
        if (this.f7576c5.m11224k4()) {
            double dM11123to = mo10370tq().m11123to();
            if (mo10370tq().m11120k4() == 1) {
                m11023k4(mo10370tq().m11123to());
            }
            this.f7581k4.m11101k4(C2308tp.m11449k4(this, dM11123to, 0.0d));
        } else {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
        }
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: dy */
    public final void m11036dy() {
        m11025x1(true);
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m11037e0() {
        double dM11123to = mo10370tq().m11123to();
        double dM11123to2 = mo10370tq().m11123to();
        mo10370tq().m11121k4(dM11123to);
        mo10370tq().m11121k4(dM11123to2);
    }

    /* JADX INFO: renamed from: f9 */
    public final void m11038f9() {
        if (!this.f7576c5.m11225k4(4)) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
            return;
        }
        double dM11123to = mo10370tq().m11123to();
        double dM11123to2 = mo10370tq().m11123to();
        double dM11123to3 = mo10370tq().m11123to();
        double dM11123to4 = mo10370tq().m11123to();
        if (dM11123to2 <= dM11123to) {
            mo10370tq().m11121k4(dM11123to4);
        } else {
            mo10370tq().m11121k4(dM11123to3);
        }
    }

    /* JADX INFO: renamed from: fa */
    public final void m11039fa() {
        m11047k4(true);
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: g8 */
    public final void m11040g8() {
        double dM11123to = mo10370tq().m11123to();
        mo10370tq().m11121k4(dM11123to);
        mo10370tq().m11121k4(dM11123to);
    }

    /* JADX INFO: renamed from: gi */
    public final void m11041gi() {
        if (!this.f7576c5.m11224k4()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
        } else if (mo10370tq().m11123to() != 0.0d) {
            mo10370tq().m11121k4(0.0d);
        } else {
            mo10370tq().m11121k4(1.0d);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m11042h4() {
        m11068vh();
        if (this.f7576c5.m11224k4()) {
            double dM11123to = mo10370tq().m11123to();
            if (mo10370tq().m11120k4() == 1) {
                m11023k4(mo10370tq().m11123to());
            }
            this.f7581k4.m11101k4(C2308tp.m11449k4(this, 0.0d, dM11123to));
        } else {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
        }
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: ix */
    public final void m11043ix() {
        if (this.f7576c5.m11225k4(9)) {
            double dM11123to = mo10370tq().m11123to();
            double dM11123to2 = mo10370tq().m11123to();
            double dM11123to3 = mo10370tq().m11123to();
            double dM11123to4 = mo10370tq().m11123to();
            double dM11123to5 = mo10370tq().m11123to();
            double dM11123to6 = mo10370tq().m11123to();
            double dM11123to7 = mo10370tq().m11123to();
            this.f7581k4.m11102k4(C2308tp.m11450k4(this, mo10370tq().m11123to(), mo10370tq().m11123to(), dM11123to7, dM11123to6, dM11123to5, 0.0d));
            this.f7581k4.m11102k4(C2308tp.m11450k4(this, dM11123to4, 0.0d, dM11123to3, dM11123to2, dM11123to, 0.0d));
        } else {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
        }
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: jd */
    public final void m11044jd() {
        m11074x1(0);
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final C2068ei m11045k4() {
        return this.f7577ck;
    }

    /* JADX INFO: renamed from: kk */
    public final void m11048kk() {
        double d;
        double dM10466dy;
        int iM27462to = C7019kk.m27462to(Double.valueOf(mo10370tq().m11123to()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(mo10370tq().m11123to()), 14);
        double dM11123to = mo10370tq().m11123to();
        double dM11123to2 = mo10370tq().m11123to();
        if (this.f7582kk.m11387to().containsItem(Integer.valueOf(iM27462to)) || this.f7582kk.m11387to().containsItem(Integer.valueOf(iM27462to2))) {
            return;
        }
        this.f7582kk.m11387to().addItem(Integer.valueOf(iM27462to));
        this.f7582kk.m11387to().addItem(Integer.valueOf(iM27462to2));
        try {
            C2254q3 c2254q3 = f7575jd;
            C2068ei c2068eiMo10265k4 = this.f7582kk.mo10265k4(new C2319ub(c2254q3.m11258k4((char) iM27462to)));
            C2068ei c2068eiMo10265k42 = this.f7582kk.mo10265k4(new C2319ub(c2254q3.m11258k4((char) iM27462to2)));
            if (c2068eiMo10265k42 != null) {
                double dM10479m9 = m11045k4().m10479m9() + dM11123to2;
                dM10466dy = m11045k4().m10466dy() + dM11123to;
                d = dM10479m9;
            } else {
                d = 0.0d;
                dM10466dy = 0.0d;
            }
            if (c2068eiMo10265k4 != null) {
                this.f7581k4.m11099k4(c2068eiMo10265k4.m10468h4(), d, dM10466dy);
            }
            if (c2068eiMo10265k42 != null) {
                this.f7581k4.m11098k4(c2068eiMo10265k42.m10468h4());
            }
            this.f7582kk.m11387to().removeItem(Integer.valueOf(iM27462to));
            this.f7582kk.m11387to().removeItem(Integer.valueOf(iM27462to2));
        } catch (Throwable th) {
            this.f7582kk.m11387to().removeItem(Integer.valueOf(iM27462to));
            this.f7582kk.m11387to().removeItem(Integer.valueOf(iM27462to2));
            throw th;
        }
    }

    /* JADX INFO: renamed from: kp */
    public final void m11049kp() {
        if (!this.f7576c5.m11226x1()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
            return;
        }
        double dM11123to = mo10370tq().m11123to();
        if (mo10370tq().m11123to() == 0.0d && dM11123to == 0.0d) {
            mo10370tq().m11121k4(0.0d);
        } else {
            mo10370tq().m11121k4(1.0d);
        }
    }

    /* JADX INFO: renamed from: ks */
    public final void m11050ks() {
        m11047k4(false);
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: lr */
    public final void m11051lr() {
        if (!this.f7576c5.m11224k4()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
        } else {
            mo10370tq().m11121k4(C2389yj.m11764k4(mo10370tq().m11123to()));
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final void m11052m9() {
        m11046k4(0);
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: ne */
    public final void m11053ne() {
        if (this.f7576c5.m11225k4(7)) {
            double dM11123to = mo10370tq().m11123to();
            double dM11123to2 = mo10370tq().m11123to();
            double dM11123to3 = mo10370tq().m11123to();
            double dM11123to4 = mo10370tq().m11123to();
            double dM11123to5 = mo10370tq().m11123to();
            this.f7581k4.m11102k4(C2308tp.m11450k4(this, mo10370tq().m11123to(), 0.0d, mo10370tq().m11123to(), dM11123to5, dM11123to4, 0.0d));
            this.f7581k4.m11102k4(C2308tp.m11450k4(this, dM11123to3, 0.0d, dM11123to2, 0.0d, dM11123to, 0.0d));
        } else {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
        }
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: qm */
    public final void m11054qm() {
        long jM27438h4 = C7019kk.m27438h4(Double.valueOf(mo10370tq().m11123to()), 14);
        long jM27438h42 = C7019kk.m27438h4(Double.valueOf(mo10370tq().m11123to()), 14);
        long j = 0;
        if (jM27438h42 <= 0) {
            return;
        }
        int iM11024os = m11024os();
        long j2 = iM11024os - 1;
        long j3 = j2 - jM27438h42;
        long j4 = 0;
        while (j4 < j3) {
            mo10370tq().m11121k4(this.f7578du[(int) j4]);
            j4++;
            j = j;
        }
        if (jM27438h4 < j) {
            long jM67485k4 = ((long) ((int) C14116yg.m67485k4(jM27438h4))) + j3;
            while (true) {
                jM67485k4++;
                if (jM67485k4 >= iM11024os) {
                    break;
                } else {
                    mo10370tq().m11121k4(this.f7578du[(int) jM67485k4]);
                }
            }
            for (long j5 = j3 + 1; j5 < ((long) ((int) C14116yg.m67485k4(jM27438h4))) + j3 + 1; j5++) {
                mo10370tq().m11121k4(this.f7578du[(int) j5]);
            }
            return;
        }
        long j6 = j2 - jM27438h4;
        for (long j7 = j6; j7 < iM11024os; j7++) {
            mo10370tq().m11121k4(this.f7578du[(int) j7]);
        }
        while (true) {
            j3++;
            if (j3 >= j6) {
                return;
            } else {
                mo10370tq().m11121k4(this.f7578du[(int) j3]);
            }
        }
    }

    /* JADX INFO: renamed from: qq */
    public final void m11055qq() {
        if (this.f7576c5.m11226x1()) {
            do {
                mo10370tq().m11123to();
                mo10370tq().m11123to();
                this.f7579dy++;
            } while (mo10370tq().m11120k4() >= 2);
        }
        if (mo10370tq().m11120k4() == 1) {
            m11023k4(mo10370tq().m11123to());
        }
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: rv */
    public final void m11056rv() {
        double d;
        int iM11024os = m11024os();
        int i = 0;
        while (i < iM11024os) {
            if (i != 0 || iM11024os % 4 <= 0) {
                d = 0.0d;
            } else {
                int i2 = i + 1;
                double d2 = this.f7578du[i];
                i = i2;
                d = d2;
            }
            double[] dArr = this.f7578du;
            int i3 = i + 4;
            this.f7581k4.m11102k4(C2308tp.m11450k4(this, d, dArr[i], dArr[i + 1], dArr[i + 2], 0.0d, dArr[i + 3]));
            i = i3;
        }
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: s7 */
    public final void m11057s7() {
        if (!this.f7576c5.m11226x1()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
            return;
        }
        if (mo10370tq().m11123to() == mo10370tq().m11123to()) {
            mo10370tq().m11121k4(1.0d);
        } else {
            mo10370tq().m11121k4(0.0d);
        }
    }

    /* JADX INFO: renamed from: ss */
    public final void m11058ss() {
        if (!this.f7576c5.m11226x1()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
            return;
        }
        double dM11123to = mo10370tq().m11123to();
        if (mo10370tq().m11123to() == 0.0d || dM11123to == 0.0d) {
            mo10370tq().m11121k4(0.0d);
        } else {
            mo10370tq().m11121k4(1.0d);
        }
    }

    /* JADX INFO: renamed from: sv */
    public final void m11059sv() {
        if (this.f7576c5.m11224k4()) {
            this.f7580h4[C7019kk.m27462to(Double.valueOf(mo10370tq().m11123to()), 14)] = mo10370tq().m11123to();
        }
    }

    /* JADX INFO: renamed from: t6 */
    public final void m11060t6() {
        int iM27462to;
        if (!this.f7576c5.m11224k4() || (iM27462to = C7019kk.m27462to(Double.valueOf(mo10370tq().m11123to()), 14) + this.f7584to.m10585kk().m10715k4()) >= this.f7584to.m10586to().m11210kk()) {
            return;
        }
        try {
            int[] iArr = {0};
            int[] iArr2 = {0};
            this.f7584to.m10586to().m11206k4(iM27462to, iArr, iArr2);
            this.f7585x1.m11476k4(this.f7584to.m10586to().m11202h4(), iArr[0], iArr2[0]);
            mo10372x1(this.f7585x1);
        } finally {
            this.f7585x1.m11474k4();
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m11061to() {
        m11068vh();
        if (this.f7576c5.m11226x1()) {
            double dM11123to = mo10370tq().m11123to();
            double dM11123to2 = mo10370tq().m11123to();
            if (mo10370tq().m11120k4() == 1) {
                m11023k4(mo10370tq().m11123to());
            }
            this.f7581k4.m11101k4(C2308tp.m11449k4(this, dM11123to2, dM11123to));
        } else {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
        }
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: ts */
    public final void m11062ts() {
        mo10370tq().m11123to();
    }

    /* JADX INFO: renamed from: u4 */
    public final void m11063u4() {
        double d;
        double d2;
        double dM11123to = mo10370tq().m11123to();
        if (this.f7576c5.m11225k4(10)) {
            double dM11123to2 = mo10370tq().m11123to();
            double dM11123to3 = mo10370tq().m11123to();
            double dM11123to4 = mo10370tq().m11123to();
            double dM11123to5 = mo10370tq().m11123to();
            double dM11123to6 = mo10370tq().m11123to();
            double dM11123to7 = mo10370tq().m11123to();
            double dM11123to8 = mo10370tq().m11123to();
            double dM11123to9 = mo10370tq().m11123to();
            double dM11123to10 = mo10370tq().m11123to();
            double dM11123to11 = mo10370tq().m11123to();
            double d3 = 0.0d;
            if (C14116yg.m67475k4(dM11123to11 + dM11123to9 + dM11123to7 + dM11123to5 + dM11123to3) > C14116yg.m67475k4(dM11123to10 + dM11123to8 + dM11123to6 + dM11123to4 + dM11123to2)) {
                d3 = dM11123to;
                d2 = dM11123to11;
                d = 0.0d;
            } else {
                d = dM11123to;
                d2 = dM11123to11;
            }
            this.f7581k4.m11102k4(C2308tp.m11450k4(this, d2, dM11123to10, dM11123to9, dM11123to8, dM11123to7, dM11123to6));
            this.f7581k4.m11102k4(C2308tp.m11450k4(this, dM11123to5, dM11123to4, dM11123to3, dM11123to2, d3, d));
        } else {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
        }
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: um */
    public final void m11064um() {
        while (mo10370tq().m11120k4() > 1) {
            mo10370tq().m11123to();
            mo10370tq().m11123to();
            this.f7579dy++;
        }
        if (mo10370tq().m11120k4() == 1) {
            m11023k4(mo10370tq().m11123to());
        }
        mo10370tq().m11124x1();
        mo10370tq().m11121k4((this.f7579dy + 7) >> 3);
    }

    /* JADX INFO: renamed from: up */
    public final void m11065up() {
        m11074x1(2);
        m11046k4(0);
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: uz */
    public final void m11066uz() {
        if (this.f7576c5.m11226x1()) {
            do {
                mo10370tq().m11123to();
                mo10370tq().m11123to();
            } while (mo10370tq().m11120k4() >= 2);
        }
        if (mo10370tq().m11120k4() == 1) {
            m11023k4(mo10370tq().m11123to());
        }
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: v4 */
    public final void m11067v4() {
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: vh */
    public final void m11068vh() {
        C2141j8 c2141j8M11448k4 = C2308tp.m11448k4(this);
        if (c2141j8M11448k4 != null) {
            this.f7581k4.m11100k4(c2141j8M11448k4);
        }
    }

    /* JADX INFO: renamed from: vj */
    public final void m11069vj() {
    }

    /* JADX INFO: renamed from: wl */
    public final void m11070wl() {
        if (this.f7576c5.m11226x1()) {
            do {
                mo10370tq().m11123to();
                mo10370tq().m11123to();
            } while (mo10370tq().m11120k4() >= 2);
        }
        if (mo10370tq().m11120k4() == 1) {
            m11023k4(mo10370tq().m11123to());
        }
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: wp */
    public final void m11071wp() {
        if (this.f7576c5.m11224k4()) {
            mo10370tq().m11121k4(this.f7580h4[C7019kk.m27462to(Double.valueOf(mo10370tq().m11123to()), 14)]);
        }
    }

    /* JADX INFO: renamed from: wy */
    public final void m11072wy() {
        if (!this.f7576c5.m11226x1()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
            return;
        }
        mo10370tq().m11121k4(C2389yj.m11767kk(mo10370tq().m11123to(), mo10370tq().m11123to()));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11073x1() {
        m11068vh();
        if (mo10370tq().m11120k4() >= 4) {
            m11048kk();
        }
        if (mo10370tq().m11120k4() == 1) {
            m11023k4(mo10370tq().m11123to());
        }
        this.f7581k4.m11096k4();
    }

    /* JADX INFO: renamed from: x6 */
    public final void m11075x6() {
        if (this.f7576c5.m11225k4(13)) {
            mo10370tq().m11123to();
            double dM11123to = mo10370tq().m11123to();
            double dM11123to2 = mo10370tq().m11123to();
            double dM11123to3 = mo10370tq().m11123to();
            double dM11123to4 = mo10370tq().m11123to();
            double dM11123to5 = mo10370tq().m11123to();
            double dM11123to6 = mo10370tq().m11123to();
            double dM11123to7 = mo10370tq().m11123to();
            double dM11123to8 = mo10370tq().m11123to();
            double dM11123to9 = mo10370tq().m11123to();
            double dM11123to10 = mo10370tq().m11123to();
            this.f7581k4.m11102k4(C2308tp.m11450k4(this, mo10370tq().m11123to(), mo10370tq().m11123to(), dM11123to10, dM11123to9, dM11123to8, dM11123to7));
            this.f7581k4.m11102k4(C2308tp.m11450k4(this, dM11123to6, dM11123to5, dM11123to4, dM11123to3, dM11123to2, dM11123to));
        } else {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
        }
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: xk */
    public final void m11076xk() {
        if (!this.f7576c5.m11226x1()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
            return;
        }
        mo10370tq().m11121k4(C2389yj.m11768to(mo10370tq().m11123to(), mo10370tq().m11123to()));
    }

    /* JADX INFO: renamed from: xw */
    public final void m11077xw() {
        int iM27462to;
        if (!this.f7576c5.m11224k4() || (iM27462to = C7019kk.m27462to(Double.valueOf(mo10370tq().m11123to()), 14) + this.f7582kk.m11382k4().m11738k4().m10512k4()) >= this.f7582kk.m11382k4().m11736h4().m11210kk()) {
            return;
        }
        try {
            int[] iArr = {0};
            int[] iArr2 = {0};
            this.f7582kk.m11382k4().m11736h4().m11206k4(iM27462to, iArr, iArr2);
            this.f7585x1.m11476k4(this.f7582kk.m11382k4().m11736h4().m11202h4(), iArr[0], iArr2[0]);
            mo10372x1(this.f7585x1);
        } finally {
            this.f7585x1.m11474k4();
        }
    }

    /* JADX INFO: renamed from: yd */
    public final void m11078yd() {
        if (!this.f7576c5.m11226x1()) {
            mo10363j2().mo10504k4("PostScript error. Wrong operands for operator (see a stack for operator name).");
            return;
        }
        mo10370tq().m11121k4(C2389yj.m11765k4(mo10370tq().m11123to(), mo10370tq().m11123to()));
    }

    /* JADX INFO: renamed from: yj */
    public final void m11079yj() {
        m11046k4(6);
        m11074x1(0);
        mo10370tq().m11124x1();
    }

    /* JADX INFO: renamed from: k4 */
    private void m11023k4(double d) {
        this.f7581k4.m11097k4(this.f7584to.m10587x1().f7609x1 + d, 0.0d);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11074x1(int i) {
        int iM11024os = m11024os();
        for (int i2 = 0; i2 < iM11024os - i; i2 += 6) {
            double[] dArr = this.f7578du;
            this.f7581k4.m11102k4(C2308tp.m11450k4(this, dArr[i2], dArr[i2 + 1], dArr[i2 + 2], dArr[i2 + 3], dArr[i2 + 4], dArr[i2 + 5]));
        }
        if (i > 0) {
            for (int i3 = i; i3 > 0; i3--) {
                int i4 = iM11024os - i3;
                if (i4 >= 0) {
                    mo10370tq().m11121k4(this.f7578du[i4]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m11025x1(boolean z) {
        int iM11024os = m11024os();
        int i = 0;
        while (i < iM11024os) {
            int i2 = i + 1;
            double d = this.f7578du[i];
            this.f7581k4.m11103k4(z ? C2308tp.m11451x1(this, d, 0.0d) : C2308tp.m11451x1(this, 0.0d, d));
            z = !z;
            i = i2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11046k4(int i) {
        int iM11024os = m11024os();
        int i2 = 0;
        while (i2 < iM11024os - i) {
            double[] dArr = this.f7578du;
            int i3 = i2 + 1;
            double d = dArr[i2];
            i2 += 2;
            this.f7581k4.m11103k4(C2308tp.m11451x1(this, d, dArr[i3]));
        }
        if (i > 0) {
            while (i > 0) {
                int i4 = iM11024os - i;
                if (i4 >= 0) {
                    mo10370tq().m11121k4(this.f7578du[i4]);
                }
                i--;
            }
        }
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2119hu
    /* JADX INFO: renamed from: k4 */
    public void mo10395k4(String str) {
        switch (f7574fa.m27428k4(str)) {
            case 0:
                m11066uz();
                break;
            case 1:
                m11070wl();
                break;
            case 2:
                m11042h4();
                break;
            case 3:
                m11052m9();
                break;
            case 4:
                m11036dy();
                break;
            case 5:
                m11031c5();
                break;
            case 6:
                m11044jd();
                break;
            case 7:
                m11060t6();
                break;
            case 8:
                m11069vj();
                break;
            case 9:
                m11073x1();
                break;
            case 10:
                m11055qq();
                break;
            case 11:
                m11064um();
                break;
            case 12:
                m11029bv();
                break;
            case 13:
                m11061to();
                break;
            case 14:
                m11035du();
                break;
            case 15:
                m11027ar();
                break;
            case 16:
                m11065up();
                break;
            case 17:
                m11079yj();
                break;
            case 18:
                m11056rv();
                break;
            case 19:
                m11033ck();
                break;
            case 20:
                m11077xw();
                break;
            case 21:
                m11050ks();
                break;
            case 22:
                m11039fa();
                break;
            case 23:
                m11058ss();
                break;
            case 24:
                m11049kp();
                break;
            case 25:
                m11041gi();
                break;
            case 26:
                m11051lr();
                break;
            case 27:
                m11078yd();
                break;
            case 28:
                m11028b3();
                break;
            case 29:
                m11072wy();
                break;
            case 30:
                m11026ak();
                break;
            case 31:
                m11057s7();
                break;
            case 32:
                m11062ts();
                break;
            case 33:
                m11059sv();
                break;
            case 34:
                m11071wp();
                break;
            case 35:
                m11038f9();
                break;
            case 36:
                m11034dq();
                break;
            case 37:
                m11076xk();
                break;
            case 38:
                m11032c6();
                break;
            case 39:
                m11040g8();
                break;
            case 40:
                m11037e0();
                break;
            case 41:
                m11030bz();
                break;
            case 42:
                m11054qm();
                break;
            case 43:
                m11053ne();
                break;
            case 44:
                m11075x6();
                break;
            case 45:
                m11043ix();
                break;
            case 46:
                m11063u4();
                break;
            case 47:
                m11067v4();
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11047k4(boolean z) {
        double d;
        double d2;
        double d3;
        int i;
        double d4;
        double d5;
        int i2 = 0;
        if (mo10370tq().m11120k4() == 6) {
            double[] dArr = new double[5];
            for (int i3 = 0; i3 < 5; i3++) {
                dArr[i3] = mo10370tq().m11123to();
            }
            mo10370tq().m11123to();
            for (int i4 = 0; i4 < 5; i4++) {
                mo10370tq().m11121k4(dArr[i4]);
            }
        }
        int iM11024os = m11024os();
        while (i2 < iM11024os) {
            double d6 = 0.0d;
            int i5 = (i2 / 4) % 2;
            if (!z ? i5 != 0 : i5 == 0) {
                double[] dArr2 = this.f7578du;
                double d7 = dArr2[i2];
                double d8 = dArr2[i2 + 1];
                double d9 = dArr2[i2 + 2];
                int i6 = i2 + 4;
                double d10 = dArr2[i2 + 3];
                if (i6 != iM11024os - 1 || iM11024os % 4 <= 0) {
                    d = 0.0d;
                    d6 = d7;
                    d2 = d8;
                    d3 = 0.0d;
                    i = i6;
                    d4 = d9;
                    d5 = d10;
                } else {
                    i = i2 + 5;
                    d = 0.0d;
                    d6 = d7;
                    d4 = d9;
                    d5 = d10;
                    d2 = d8;
                    d3 = dArr2[i6];
                }
            } else {
                double[] dArr3 = this.f7578du;
                double d11 = dArr3[i2];
                double d12 = dArr3[i2 + 1];
                double d13 = dArr3[i2 + 2];
                int i7 = i2 + 4;
                double d14 = dArr3[i2 + 3];
                if (i7 != iM11024os - 1 || iM11024os % 4 <= 0) {
                    d = d11;
                    d2 = d12;
                    d3 = d14;
                    i = i7;
                    d4 = d13;
                    d5 = 0.0d;
                } else {
                    i = i2 + 5;
                    d = d11;
                    d2 = d12;
                    d3 = d14;
                    d4 = d13;
                    d5 = dArr3[i7];
                }
            }
            this.f7581k4.m11102k4(C2308tp.m11450k4(this, d6, d, d2, d4, d3, d5));
            i2 = i;
        }
    }
}
