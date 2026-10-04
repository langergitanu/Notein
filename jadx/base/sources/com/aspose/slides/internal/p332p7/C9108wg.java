package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.wg */
/* JADX INFO: loaded from: classes4.dex */
public class C9108wg extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f32290du = new C7017h4("blurRad", "dist", "dir", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr");

    /* JADX INFO: renamed from: k4 */
    private double f32291k4;

    /* JADX INFO: renamed from: kk */
    private float f32292kk;

    /* JADX INFO: renamed from: to */
    private C7394ca f32293to;

    /* JADX INFO: renamed from: x1 */
    private double f32294x1;

    public C9108wg() {
        m43649h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m43649h4() {
        this.f32291k4 = 0.0d;
        this.f32294x1 = 0.0d;
        this.f32292kk = 0.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m43654k4() {
        return this.f32291k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m43658kk() {
        return this.f32292kk;
    }

    /* JADX INFO: renamed from: to */
    public final C7394ca m43659to() {
        return this.f32293to;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m43660x1() {
        return this.f32294x1;
    }

    public C9108wg(final AbstractC13912i5 abstractC13912i5) {
        m43649h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wg.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9108wg.f32290du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9108wg.this.f32291k4 = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C9108wg.this.f32294x1 = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C9108wg.this.f32292kk = C13850af.m65151yj(str2) / 60000.0f;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.wg.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C9108wg c9108wg;
                C7394ca c7394ca;
                switch (C9108wg.f32290du.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 3:
                        c9108wg = C9108wg.this;
                        c7394ca = new C7394ca("scrgbClr", new C9395zr(abstractC13912i5));
                        break;
                    case 4:
                        c9108wg = C9108wg.this;
                        c7394ca = new C7394ca("srgbClr", new C7670fk(abstractC13912i5));
                        break;
                    case 5:
                        c9108wg = C9108wg.this;
                        c7394ca = new C7394ca("hslClr", new C9052vm(abstractC13912i5));
                        break;
                    case 6:
                        c9108wg = C9108wg.this;
                        c7394ca = new C7394ca("sysClr", new C7939il(abstractC13912i5));
                        break;
                    case 7:
                        c9108wg = C9108wg.this;
                        c7394ca = new C7394ca("schemeClr", new C8732s1(abstractC13912i5));
                        break;
                    case 8:
                        c9108wg = C9108wg.this;
                        c7394ca = new C7394ca("prstClr", new C8065k9(abstractC13912i5));
                        break;
                    default:
                        return false;
                }
                c9108wg.f32293to = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final void m43661x1(double d) {
        this.f32294x1 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m43655k4(String str) {
        C7394ca c7394ca;
        if (this.f32293to != null) {
            throw new Exception("Color already is initialized.");
        }
        switch (f32290du.m27428k4(str)) {
            case 3:
                c7394ca = new C7394ca("scrgbClr", new C9395zr());
                break;
            case 4:
                c7394ca = new C7394ca("srgbClr", new C7670fk());
                break;
            case 5:
                c7394ca = new C7394ca("hslClr", new C9052vm());
                break;
            case 6:
                c7394ca = new C7394ca("sysClr", new C7939il());
                break;
            case 7:
                c7394ca = new C7394ca("schemeClr", new C8732s1());
                break;
            case 8:
                c7394ca = new C7394ca("prstClr", new C8065k9());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f32293to = c7394ca;
        return this.f32293to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43656k4(double d) {
        this.f32291k4 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43657k4(float f) {
        this.f32292kk = f;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        double d = this.f32291k4;
        if (d != 0.0d) {
            c3059ii.m12955x1("blurRad", C22238OooO0oO.OooO00o(d, 12700.0d, 14));
        }
        double d2 = this.f32294x1;
        if (d2 != 0.0d) {
            c3059ii.m12955x1("dist", C22238OooO0oO.OooO00o(d2, 12700.0d, 14));
        }
        if (this.f32292kk != 0.0f) {
            OooO00o.OooO00o(r7 * 60000.0f, 14, c3059ii, "dir");
        }
        C7394ca c7394ca = this.f32293to;
        if (c7394ca != null) {
            switch (f32290du.m27428k4(c7394ca.m29539k4())) {
                case 3:
                    ((C9395zr) this.f32293to.m29541kk()).mo6846k4("a", c3059ii, this.f32293to.m29539k4());
                    break;
                case 4:
                    ((C7670fk) this.f32293to.m29541kk()).mo6846k4("a", c3059ii, this.f32293to.m29539k4());
                    break;
                case 5:
                    ((C9052vm) this.f32293to.m29541kk()).mo6846k4("a", c3059ii, this.f32293to.m29539k4());
                    break;
                case 6:
                    ((C7939il) this.f32293to.m29541kk()).mo6846k4("a", c3059ii, this.f32293to.m29539k4());
                    break;
                case 7:
                    ((C8732s1) this.f32293to.m29541kk()).mo6846k4("a", c3059ii, this.f32293to.m29539k4());
                    break;
                case 8:
                    ((C8065k9) this.f32293to.m29541kk()).mo6846k4("a", c3059ii, this.f32293to.m29539k4());
                    break;
            }
        }
        c3059ii.mo21898jd();
    }
}
