package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ko */
/* JADX INFO: loaded from: classes4.dex */
public class C8115ko extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f25844du = new C7017h4("prst", "dist", "dir", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr");

    /* JADX INFO: renamed from: k4 */
    private int f25845k4;

    /* JADX INFO: renamed from: kk */
    private float f25846kk;

    /* JADX INFO: renamed from: to */
    private C7394ca f25847to;

    /* JADX INFO: renamed from: x1 */
    private double f25848x1;

    public C8115ko() {
        m35577h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m35577h4() {
        this.f25848x1 = 0.0d;
        this.f25846kk = 0.0f;
    }

    /* JADX INFO: renamed from: kk */
    public final float m35587kk() {
        return this.f25846kk;
    }

    /* JADX INFO: renamed from: to */
    public final C7394ca m35588to() {
        return this.f25847to;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m35589x1() {
        return this.f25848x1;
    }

    public C8115ko(final AbstractC13912i5 abstractC13912i5) {
        m35577h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ko.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8115ko.f25844du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8115ko.this.f25845k4 = C8227ly.m36517k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8115ko.this.f25848x1 = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C8115ko.this.f25846kk = C13850af.m65151yj(str2) / 60000.0f;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ko.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8115ko c8115ko;
                C7394ca c7394ca;
                switch (C8115ko.f25844du.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 3:
                        c8115ko = C8115ko.this;
                        c7394ca = new C7394ca("scrgbClr", new C9395zr(abstractC13912i5));
                        break;
                    case 4:
                        c8115ko = C8115ko.this;
                        c7394ca = new C7394ca("srgbClr", new C7670fk(abstractC13912i5));
                        break;
                    case 5:
                        c8115ko = C8115ko.this;
                        c7394ca = new C7394ca("hslClr", new C9052vm(abstractC13912i5));
                        break;
                    case 6:
                        c8115ko = C8115ko.this;
                        c7394ca = new C7394ca("sysClr", new C7939il(abstractC13912i5));
                        break;
                    case 7:
                        c8115ko = C8115ko.this;
                        c7394ca = new C7394ca("schemeClr", new C8732s1(abstractC13912i5));
                        break;
                    case 8:
                        c8115ko = C8115ko.this;
                        c7394ca = new C7394ca("prstClr", new C8065k9(abstractC13912i5));
                        break;
                    default:
                        return false;
                }
                c8115ko.f25847to = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final int m35582k4() {
        return this.f25845k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m35583k4(String str) {
        C7394ca c7394ca;
        if (this.f25847to != null) {
            throw new Exception("Color already is initialized.");
        }
        switch (f25844du.m27428k4(str)) {
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
        this.f25847to = c7394ca;
        return this.f25847to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35584k4(double d) {
        this.f25848x1 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35585k4(float f) {
        this.f25846kk = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35586k4(int i) {
        this.f25845k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("prst", C8227ly.m36518k4(this.f25845k4));
        double d = this.f25848x1;
        if (d != 0.0d) {
            c3059ii.m12955x1("dist", C22238OooO0oO.OooO00o(d, 12700.0d, 14));
        }
        if (this.f25846kk != 0.0f) {
            OooO00o.OooO00o(r5 * 60000.0f, 14, c3059ii, "dir");
        }
        C7394ca c7394ca = this.f25847to;
        if (c7394ca != null) {
            switch (f25844du.m27428k4(c7394ca.m29539k4())) {
                case 3:
                    ((C9395zr) this.f25847to.m29541kk()).mo6846k4("a", c3059ii, this.f25847to.m29539k4());
                    break;
                case 4:
                    ((C7670fk) this.f25847to.m29541kk()).mo6846k4("a", c3059ii, this.f25847to.m29539k4());
                    break;
                case 5:
                    ((C9052vm) this.f25847to.m29541kk()).mo6846k4("a", c3059ii, this.f25847to.m29539k4());
                    break;
                case 6:
                    ((C7939il) this.f25847to.m29541kk()).mo6846k4("a", c3059ii, this.f25847to.m29539k4());
                    break;
                case 7:
                    ((C8732s1) this.f25847to.m29541kk()).mo6846k4("a", c3059ii, this.f25847to.m29539k4());
                    break;
                case 8:
                    ((C8065k9) this.f25847to.m29541kk()).mo6846k4("a", c3059ii, this.f25847to.m29539k4());
                    break;
            }
        }
        c3059ii.mo21898jd();
    }
}
