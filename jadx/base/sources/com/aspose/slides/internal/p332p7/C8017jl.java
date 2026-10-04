package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.jl */
/* JADX INFO: loaded from: classes4.dex */
public class C8017jl extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private byte f25207c5;

    /* JADX INFO: renamed from: ck */
    private byte f25208ck;

    /* JADX INFO: renamed from: du */
    private double f25209du;

    /* JADX INFO: renamed from: dy */
    private byte f25210dy;

    /* JADX INFO: renamed from: fa */
    private C8985uy f25211fa;

    /* JADX INFO: renamed from: h4 */
    private double f25212h4;

    /* JADX INFO: renamed from: ix */
    private C7394ca f25213ix;

    /* JADX INFO: renamed from: jd */
    private boolean f25214jd;

    /* JADX INFO: renamed from: ks */
    private C8985uy f25215ks;

    /* JADX INFO: renamed from: m9 */
    private double f25216m9;

    /* JADX INFO: renamed from: ne */
    private C8785sl f25217ne;

    /* JADX INFO: renamed from: rv */
    private C8985uy f25218rv;

    /* JADX INFO: renamed from: to */
    private double f25219to;

    /* JADX INFO: renamed from: u4 */
    private C8397nz f25220u4;

    /* JADX INFO: renamed from: up */
    private C8985uy f25221up;

    /* JADX INFO: renamed from: x6 */
    private C8985uy f25222x6;

    /* JADX INFO: renamed from: yj */
    private C8985uy f25223yj;

    /* JADX INFO: renamed from: k4 */
    public static final byte f25203k4 = C9003v6.m42731k4("horz");

    /* JADX INFO: renamed from: x1 */
    public static final byte f25206x1 = C9186xb.m44283k4("t");

    /* JADX INFO: renamed from: kk */
    public static final byte f25204kk = C8650r5.m39865k4("clip");

    /* JADX INFO: renamed from: uz */
    private static final C7017h4 f25205uz = new C7017h4("marL", "marR", "marT", "marB", "vert", "anchor", "anchorCtr", "horzOverflow", "lnL", "lnR", "lnT", "lnB", "lnTlToBr", "lnBlToTr", "cell3D", "noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill", "extLst");

    public C8017jl() {
        m34764um();
    }

    /* JADX INFO: renamed from: um */
    private void m34764um() {
        this.f25219to = 7.2d;
        this.f25209du = 7.2d;
        this.f25212h4 = 3.6d;
        this.f25216m9 = 3.6d;
        this.f25210dy = f25203k4;
        this.f25207c5 = f25206x1;
        this.f25214jd = false;
        this.f25208ck = f25204kk;
    }

    /* JADX INFO: renamed from: c5 */
    public final double m34767c5() {
        return this.f25212h4;
    }

    /* JADX INFO: renamed from: ck */
    public final byte m34768ck() {
        return this.f25210dy;
    }

    /* JADX INFO: renamed from: du */
    public final C8985uy m34769du() {
        if (this.f25218rv != null) {
            throw new Exception("Only one <lnTlToBr> element can be added.");
        }
        C8985uy c8985uy = new C8985uy();
        this.f25218rv = c8985uy;
        return c8985uy;
    }

    /* JADX INFO: renamed from: dy */
    public final double m34770dy() {
        return this.f25209du;
    }

    /* JADX INFO: renamed from: fa */
    public final byte m34771fa() {
        return this.f25207c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8985uy m34772h4() {
        if (this.f25222x6 != null) {
            throw new Exception("Only one <lnBlToTr> element can be added.");
        }
        C8985uy c8985uy = new C8985uy();
        this.f25222x6 = c8985uy;
        return c8985uy;
    }

    /* JADX INFO: renamed from: ix */
    public final C8985uy m34773ix() {
        return this.f25218rv;
    }

    /* JADX INFO: renamed from: jd */
    public final double m34774jd() {
        return this.f25216m9;
    }

    /* JADX INFO: renamed from: ks */
    public final C8985uy m34785ks() {
        return this.f25211fa;
    }

    /* JADX INFO: renamed from: m9 */
    public final double m34786m9() {
        return this.f25219to;
    }

    /* JADX INFO: renamed from: ne */
    public final C8985uy m34787ne() {
        return this.f25215ks;
    }

    /* JADX INFO: renamed from: qq */
    public final AbstractC7414ck m34788qq() {
        return this.f25220u4;
    }

    /* JADX INFO: renamed from: rv */
    public final C8985uy m34789rv() {
        return this.f25221up;
    }

    /* JADX INFO: renamed from: u4 */
    public final C8985uy m34792u4() {
        return this.f25222x6;
    }

    /* JADX INFO: renamed from: up */
    public final boolean m34793up() {
        return this.f25214jd;
    }

    /* JADX INFO: renamed from: uz */
    public final C8785sl m34794uz() {
        return this.f25217ne;
    }

    /* JADX INFO: renamed from: wl */
    public final C7394ca m34795wl() {
        return this.f25213ix;
    }

    /* JADX INFO: renamed from: x6 */
    public final C8985uy m34799x6() {
        return this.f25223yj;
    }

    /* JADX INFO: renamed from: yj */
    public final byte m34800yj() {
        return this.f25208ck;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r4.f25213ix = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[LOOP:1: B:8:0x0020->B:62:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C8017jl(AbstractC13912i5 abstractC13912i5) {
        C7394ca c7394ca;
        m34764um();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jl.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C8017jl.f25205uz.m27428k4(str)) {
                    case 0:
                        C8017jl.this.f25219to = C13850af.m65132uz(str2) / 12700.0d;
                        break;
                    case 1:
                        C8017jl.this.f25209du = C13850af.m65132uz(str2) / 12700.0d;
                        break;
                    case 2:
                        C8017jl.this.f25212h4 = C13850af.m65132uz(str2) / 12700.0d;
                        break;
                    case 3:
                        C8017jl.this.f25216m9 = C13850af.m65132uz(str2) / 12700.0d;
                        break;
                    case 4:
                        C8017jl.this.f25210dy = C9003v6.m42731k4(str2);
                        break;
                    case 5:
                        C8017jl.this.f25207c5 = C9186xb.m44283k4(str2);
                        break;
                    case 6:
                        C8017jl.this.f25214jd = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        C8017jl.this.f25208ck = C8650r5.m39865k4(str2);
                        break;
                }
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    switch (f25205uz.m27428k4(abstractC13912i5.mo65023fa())) {
                        case 8:
                            this.f25211fa = new C8985uy(abstractC13912i5);
                            break;
                        case 9:
                            this.f25221up = new C8985uy(abstractC13912i5);
                            break;
                        case 10:
                            this.f25223yj = new C8985uy(abstractC13912i5);
                            break;
                        case 11:
                            this.f25215ks = new C8985uy(abstractC13912i5);
                            break;
                        case 12:
                            this.f25218rv = new C8985uy(abstractC13912i5);
                            break;
                        case 13:
                            this.f25222x6 = new C8985uy(abstractC13912i5);
                            break;
                        case 14:
                            this.f25217ne = new C8785sl(abstractC13912i5);
                            if (!abstractC13912i5.mo65015ar()) {
                            }
                            break;
                        case 15:
                            c7394ca = new C7394ca("noFill", new C8130kt(abstractC13912i5));
                            break;
                        case 16:
                            c7394ca = new C7394ca("solidFill", new C8256md(abstractC13912i5));
                            break;
                        case 17:
                            c7394ca = new C7394ca("gradFill", new C8403o4(abstractC13912i5));
                            break;
                        case 18:
                            c7394ca = new C7394ca("blipFill", new C9220xo(abstractC13912i5));
                            break;
                        case 19:
                            c7394ca = new C7394ca("pattFill", new C7416cl(abstractC13912i5));
                            break;
                        case 20:
                            c7394ca = new C7394ca("grpFill", new C9112wh(abstractC13912i5));
                            break;
                        case 21:
                            this.f25220u4 = new C8397nz(abstractC13912i5);
                            break;
                        default:
                            abstractC13912i5.mo65208bv();
                            if (!abstractC13912i5.mo65015ar()) {
                            }
                            break;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: to */
    public final C8985uy m34790to() {
        if (this.f25215ks != null) {
            throw new Exception("Only one <lnB> element can be added.");
        }
        C8985uy c8985uy = new C8985uy();
        this.f25215ks = c8985uy;
        return c8985uy;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m34775k4(String str) {
        C7394ca c7394ca;
        if (this.f25213ix != null) {
            throw new Exception("FillProperties already is initialized.");
        }
        switch (f25205uz.m27428k4(str)) {
            case 15:
                c7394ca = new C7394ca("noFill", new C8130kt());
                break;
            case 16:
                c7394ca = new C7394ca("solidFill", new C8256md());
                break;
            case 17:
                c7394ca = new C7394ca("gradFill", new C8403o4());
                break;
            case 18:
                c7394ca = new C7394ca("blipFill", new C9220xo());
                break;
            case 19:
                c7394ca = new C7394ca("pattFill", new C7416cl());
                break;
            case 20:
                c7394ca = new C7394ca("grpFill", new C9112wh());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f25213ix = c7394ca;
        return this.f25213ix;
    }

    /* JADX INFO: renamed from: kk */
    public final C8985uy m34782kk() {
        if (this.f25223yj != null) {
            throw new Exception("Only one <lnT> element can be added.");
        }
        C8985uy c8985uy = new C8985uy();
        this.f25223yj = c8985uy;
        return c8985uy;
    }

    /* JADX INFO: renamed from: to */
    public final void m34791to(double d) {
        this.f25216m9 = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8985uy m34796x1() {
        if (this.f25221up != null) {
            throw new Exception("Only one <lnR> element can be added.");
        }
        C8985uy c8985uy = new C8985uy();
        this.f25221up = c8985uy;
        return c8985uy;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8985uy m34776k4() {
        if (this.f25211fa != null) {
            throw new Exception("Only one <lnL> element can be added.");
        }
        C8985uy c8985uy = new C8985uy();
        this.f25211fa = c8985uy;
        return c8985uy;
    }

    /* JADX INFO: renamed from: kk */
    public final void m34783kk(byte b) {
        this.f25208ck = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m34797x1(byte b) {
        this.f25207c5 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34777k4(byte b) {
        this.f25210dy = b;
    }

    /* JADX INFO: renamed from: kk */
    public final void m34784kk(double d) {
        this.f25212h4 = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m34798x1(double d) {
        this.f25209du = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34778k4(double d) {
        this.f25219to = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34779k4(AbstractC7414ck abstractC7414ck) {
        this.f25220u4 = (C8397nz) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34780k4(C8785sl c8785sl) {
        this.f25217ne = c8785sl;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        double d = this.f25219to;
        if (d != 7.2d) {
            c3059ii.m12955x1("marL", C22238OooO0oO.OooO00o(d, 12700.0d, 14));
        }
        double d2 = this.f25209du;
        if (d2 != 7.2d) {
            c3059ii.m12955x1("marR", C22238OooO0oO.OooO00o(d2, 12700.0d, 14));
        }
        double d3 = this.f25212h4;
        if (d3 != 3.6d) {
            c3059ii.m12955x1("marT", C22238OooO0oO.OooO00o(d3, 12700.0d, 14));
        }
        double d4 = this.f25216m9;
        if (d4 != 3.6d) {
            c3059ii.m12955x1("marB", C22238OooO0oO.OooO00o(d4, 12700.0d, 14));
        }
        byte b = this.f25210dy;
        if (b != f25203k4) {
            c3059ii.m12955x1("vert", C9003v6.m42732k4(b));
        }
        byte b2 = this.f25207c5;
        if (b2 != f25206x1) {
            c3059ii.m12955x1("anchor", C9186xb.m44284k4(b2));
        }
        boolean z = this.f25214jd;
        if (z) {
            c3059ii.m12955x1("anchorCtr", z ? "1" : "0");
        }
        byte b3 = this.f25208ck;
        if (b3 != f25204kk) {
            c3059ii.m12955x1("horzOverflow", C8650r5.m39866k4(b3));
        }
        C8985uy c8985uy = this.f25211fa;
        if (c8985uy != null) {
            c8985uy.mo6846k4("a", c3059ii, "lnL");
        }
        C8985uy c8985uy2 = this.f25221up;
        if (c8985uy2 != null) {
            c8985uy2.mo6846k4("a", c3059ii, "lnR");
        }
        C8985uy c8985uy3 = this.f25223yj;
        if (c8985uy3 != null) {
            c8985uy3.mo6846k4("a", c3059ii, "lnT");
        }
        C8985uy c8985uy4 = this.f25215ks;
        if (c8985uy4 != null) {
            c8985uy4.mo6846k4("a", c3059ii, "lnB");
        }
        C8985uy c8985uy5 = this.f25218rv;
        if (c8985uy5 != null) {
            c8985uy5.mo6846k4("a", c3059ii, "lnTlToBr");
        }
        C8985uy c8985uy6 = this.f25222x6;
        if (c8985uy6 != null) {
            c8985uy6.mo6846k4("a", c3059ii, "lnBlToTr");
        }
        C8785sl c8785sl = this.f25217ne;
        if (c8785sl != null) {
            c8785sl.mo6846k4("a", c3059ii, "cell3D");
        }
        C7394ca c7394ca = this.f25213ix;
        if (c7394ca != null) {
            switch (f25205uz.m27428k4(c7394ca.m29539k4())) {
                case 15:
                    ((C8130kt) this.f25213ix.m29541kk()).mo6846k4("a", c3059ii, this.f25213ix.m29539k4());
                    break;
                case 16:
                    ((C8256md) this.f25213ix.m29541kk()).mo6846k4("a", c3059ii, this.f25213ix.m29539k4());
                    break;
                case 17:
                    ((C8403o4) this.f25213ix.m29541kk()).mo6846k4("a", c3059ii, this.f25213ix.m29539k4());
                    break;
                case 18:
                    ((C9220xo) this.f25213ix.m29541kk()).mo6846k4("a", c3059ii, this.f25213ix.m29539k4());
                    break;
                case 19:
                    ((C7416cl) this.f25213ix.m29541kk()).mo6846k4("a", c3059ii, this.f25213ix.m29539k4());
                    break;
                case 20:
                    ((C9112wh) this.f25213ix.m29541kk()).mo6846k4("a", c3059ii, this.f25213ix.m29539k4());
                    break;
            }
        }
        C8397nz c8397nz = this.f25220u4;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34781k4(boolean z) {
        this.f25214jd = z;
    }
}
