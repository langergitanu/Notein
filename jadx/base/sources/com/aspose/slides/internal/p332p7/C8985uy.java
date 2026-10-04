package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.uy */
/* JADX INFO: loaded from: classes4.dex */
public class C8985uy extends AbstractC7361bz {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f31459ck = new C7017h4("w", "cap", "cmpd", "algn", "noFill", "solidFill", "gradFill", "pattFill", "prstDash", "custDash", "round", "bevel", "miter", "headEnd", "tailEnd", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C8305n2 f31460c5;

    /* JADX INFO: renamed from: du */
    private C7394ca f31461du;

    /* JADX INFO: renamed from: dy */
    private C8305n2 f31462dy;

    /* JADX INFO: renamed from: h4 */
    private C7394ca f31463h4;

    /* JADX INFO: renamed from: jd */
    private C8397nz f31464jd;

    /* JADX INFO: renamed from: k4 */
    private double f31465k4;

    /* JADX INFO: renamed from: kk */
    private byte f31466kk;

    /* JADX INFO: renamed from: m9 */
    private C7394ca f31467m9;

    /* JADX INFO: renamed from: to */
    private byte f31468to;

    /* JADX INFO: renamed from: x1 */
    private byte f31469x1;

    public C8985uy() {
        m42619yj();
    }

    /* JADX INFO: renamed from: yj */
    private void m42619yj() {
        this.f31465k4 = Double.NaN;
        this.f31469x1 = (byte) -1;
        this.f31466kk = (byte) -1;
        this.f31468to = (byte) -1;
    }

    /* JADX INFO: renamed from: c5 */
    public final C7394ca m42620c5() {
        return this.f31467m9;
    }

    /* JADX INFO: renamed from: ck */
    public final C8305n2 m42621ck() {
        return this.f31460c5;
    }

    /* JADX INFO: renamed from: du */
    public final byte m42622du() {
        return this.f31466kk;
    }

    /* JADX INFO: renamed from: dy */
    public final C7394ca m42623dy() {
        return this.f31463h4;
    }

    /* JADX INFO: renamed from: fa */
    public final AbstractC7414ck m42624fa() {
        return this.f31464jd;
    }

    /* JADX INFO: renamed from: h4 */
    public final byte m42625h4() {
        return this.f31468to;
    }

    /* JADX INFO: renamed from: jd */
    public final C8305n2 m42626jd() {
        return this.f31462dy;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7394ca m42635m9() {
        return this.f31461du;
    }

    /* JADX INFO: renamed from: to */
    public final byte m42636to() {
        return this.f31469x1;
    }

    public C8985uy(final AbstractC13912i5 abstractC13912i5) {
        m42619yj();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.uy.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8985uy.f31459ck.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8985uy.this.f31465k4 = C13850af.m65122ks(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8985uy.this.f31469x1 = C8614qn.m39595k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    C8985uy.this.f31466kk = C9156wz.m44128k4(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C8985uy.this.f31468to = C7376c4.m29409k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.uy.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8985uy c8985uy;
                C7394ca c7394ca;
                C8985uy c8985uy2;
                C7394ca c7394ca2;
                C8985uy c8985uy3;
                C7394ca c7394ca3;
                switch (C8985uy.f31459ck.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 4:
                        c8985uy = C8985uy.this;
                        c7394ca = new C7394ca("noFill", new C8130kt(abstractC13912i5));
                        c8985uy.f31461du = c7394ca;
                        return true;
                    case 5:
                        c8985uy = C8985uy.this;
                        c7394ca = new C7394ca("solidFill", new C8256md(abstractC13912i5));
                        c8985uy.f31461du = c7394ca;
                        return true;
                    case 6:
                        c8985uy = C8985uy.this;
                        c7394ca = new C7394ca("gradFill", new C8403o4(abstractC13912i5));
                        c8985uy.f31461du = c7394ca;
                        return true;
                    case 7:
                        c8985uy = C8985uy.this;
                        c7394ca = new C7394ca("pattFill", new C7416cl(abstractC13912i5));
                        c8985uy.f31461du = c7394ca;
                        return true;
                    case 8:
                        c8985uy2 = C8985uy.this;
                        c7394ca2 = new C7394ca("prstDash", new C7903i3(abstractC13912i5));
                        c8985uy2.f31463h4 = c7394ca2;
                        return true;
                    case 9:
                        c8985uy2 = C8985uy.this;
                        c7394ca2 = new C7394ca("custDash", new C8883tp(abstractC13912i5));
                        c8985uy2.f31463h4 = c7394ca2;
                        return true;
                    case 10:
                        c8985uy3 = C8985uy.this;
                        c7394ca3 = new C7394ca("round", new C7656fb(abstractC13912i5));
                        c8985uy3.f31467m9 = c7394ca3;
                        return true;
                    case 11:
                        c8985uy3 = C8985uy.this;
                        c7394ca3 = new C7394ca("bevel", new C8598qe(abstractC13912i5));
                        c8985uy3.f31467m9 = c7394ca3;
                        return true;
                    case 12:
                        c8985uy3 = C8985uy.this;
                        c7394ca3 = new C7394ca("miter", new C7371c1(abstractC13912i5));
                        c8985uy3.f31467m9 = c7394ca3;
                        return true;
                    case 13:
                        C8985uy.this.f31462dy = new C8305n2(abstractC13912i5);
                        return true;
                    case 14:
                        C8985uy.this.f31460c5 = new C8305n2(abstractC13912i5);
                        return true;
                    case 15:
                        C8985uy.this.f31464jd = new C8397nz(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final double m42632kk() {
        return this.f31465k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m42637x1(String str) {
        C7394ca c7394ca;
        if (this.f31461du != null) {
            throw new Exception("LineFillProperties already is initialized.");
        }
        int iM27428k4 = f31459ck.m27428k4(str);
        if (iM27428k4 == 4) {
            c7394ca = new C7394ca("noFill", new C8130kt());
        } else if (iM27428k4 == 5) {
            c7394ca = new C7394ca("solidFill", new C8256md());
        } else if (iM27428k4 == 6) {
            c7394ca = new C7394ca("gradFill", new C8403o4());
        } else {
            if (iM27428k4 != 7) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("pattFill", new C7416cl());
        }
        this.f31461du = c7394ca;
        return this.f31461du;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m42627k4(String str) {
        C7394ca c7394ca;
        if (this.f31463h4 != null) {
            throw new Exception("LineDashProperties already is initialized.");
        }
        int iM27428k4 = f31459ck.m27428k4(str);
        if (iM27428k4 == 8) {
            c7394ca = new C7394ca("prstDash", new C7903i3());
        } else {
            if (iM27428k4 != 9) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("custDash", new C8883tp());
        }
        this.f31463h4 = c7394ca;
        return this.f31463h4;
    }

    /* JADX INFO: renamed from: kk */
    public final C7394ca m42633kk(String str) {
        C7394ca c7394ca;
        if (this.f31467m9 != null) {
            throw new Exception("LineJoinProperties already is initialized.");
        }
        switch (f31459ck.m27428k4(str)) {
            case 10:
                c7394ca = new C7394ca("round", new C7656fb());
                break;
            case 11:
                c7394ca = new C7394ca("bevel", new C8598qe());
                break;
            case 12:
                c7394ca = new C7394ca("miter", new C7371c1());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f31467m9 = c7394ca;
        return this.f31467m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8305n2 m42638x1() {
        if (this.f31460c5 != null) {
            throw new Exception("Only one <tailEnd> element can be added.");
        }
        C8305n2 c8305n2 = new C8305n2();
        this.f31460c5 = c8305n2;
        return c8305n2;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8305n2 m42628k4() {
        if (this.f31462dy != null) {
            throw new Exception("Only one <headEnd> element can be added.");
        }
        C8305n2 c8305n2 = new C8305n2();
        this.f31462dy = c8305n2;
        return c8305n2;
    }

    /* JADX INFO: renamed from: kk */
    public final void m42634kk(byte b) {
        this.f31468to = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m42639x1(byte b) {
        this.f31466kk = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42629k4(byte b) {
        this.f31469x1 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42630k4(double d) {
        this.f31465k4 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42631k4(AbstractC7414ck abstractC7414ck) {
        this.f31464jd = (C8397nz) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, "a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main")) ? null : "http://schemas.openxmlformats.org/drawingml/2006/main");
        if (!C14044b3.m66437kk(this.f31465k4)) {
            c3059ii.m12955x1("w", C22238OooO0oO.OooO00o(this.f31465k4, 12700.0d, 14));
        }
        byte b = this.f31469x1;
        if (b != -1) {
            c3059ii.m12955x1("cap", C8614qn.m39596k4(b));
        }
        byte b2 = this.f31466kk;
        if (b2 != -1) {
            c3059ii.m12955x1("cmpd", C9156wz.m44129k4(b2));
        }
        byte b3 = this.f31468to;
        if (b3 != -1) {
            c3059ii.m12955x1("algn", C7376c4.m29410k4(b3));
        }
        C7394ca c7394ca = this.f31461du;
        if (c7394ca != null) {
            int iM27428k4 = f31459ck.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 4) {
                ((C8130kt) this.f31461du.m29541kk()).mo6846k4("a", c3059ii, this.f31461du.m29539k4());
            } else if (iM27428k4 == 5) {
                ((C8256md) this.f31461du.m29541kk()).mo6846k4("a", c3059ii, this.f31461du.m29539k4());
            } else if (iM27428k4 == 6) {
                ((C8403o4) this.f31461du.m29541kk()).mo6846k4("a", c3059ii, this.f31461du.m29539k4());
            } else if (iM27428k4 == 7) {
                ((C7416cl) this.f31461du.m29541kk()).mo6846k4("a", c3059ii, this.f31461du.m29539k4());
            }
        }
        C7394ca c7394ca2 = this.f31463h4;
        if (c7394ca2 != null) {
            int iM27428k42 = f31459ck.m27428k4(c7394ca2.m29539k4());
            if (iM27428k42 == 8) {
                ((C7903i3) this.f31463h4.m29541kk()).mo6846k4("a", c3059ii, this.f31463h4.m29539k4());
            } else if (iM27428k42 == 9) {
                ((C8883tp) this.f31463h4.m29541kk()).mo6846k4("a", c3059ii, this.f31463h4.m29539k4());
            }
        }
        C7394ca c7394ca3 = this.f31467m9;
        if (c7394ca3 != null) {
            switch (f31459ck.m27428k4(c7394ca3.m29539k4())) {
                case 10:
                    ((C7656fb) this.f31467m9.m29541kk()).mo6846k4("a", c3059ii, this.f31467m9.m29539k4());
                    break;
                case 11:
                    ((C8598qe) this.f31467m9.m29541kk()).mo6846k4("a", c3059ii, this.f31467m9.m29539k4());
                    break;
                case 12:
                    ((C7371c1) this.f31467m9.m29541kk()).mo6846k4("a", c3059ii, this.f31467m9.m29539k4());
                    break;
            }
        }
        C8305n2 c8305n2 = this.f31462dy;
        if (c8305n2 != null) {
            c8305n2.mo6846k4("a", c3059ii, "headEnd");
        }
        C8305n2 c8305n22 = this.f31460c5;
        if (c8305n22 != null) {
            c8305n22.mo6846k4("a", c3059ii, "tailEnd");
        }
        C8397nz c8397nz = this.f31464jd;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
