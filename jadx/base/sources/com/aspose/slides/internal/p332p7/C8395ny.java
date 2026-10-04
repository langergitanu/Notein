package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ny */
/* JADX INFO: loaded from: classes4.dex */
public class C8395ny extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f27632kk = new C7017h4("rad", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr");

    /* JADX INFO: renamed from: k4 */
    private double f27633k4;

    /* JADX INFO: renamed from: x1 */
    private C7394ca f27634x1;

    public C8395ny() {
        m37910to();
    }

    /* JADX INFO: renamed from: to */
    private void m37910to() {
        this.f27633k4 = 0.0d;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m37911k4() {
        return this.f27633k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m37914x1() {
        return this.f27634x1;
    }

    public C8395ny(final AbstractC13912i5 abstractC13912i5) {
        m37910to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ny.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8395ny.f27632kk.m27428k4(str) != 0) {
                    return false;
                }
                C8395ny.this.f27633k4 = C13850af.m65132uz(str2) / 12700.0d;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ny.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8395ny c8395ny;
                C7394ca c7394ca;
                switch (C8395ny.f27632kk.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 1:
                        c8395ny = C8395ny.this;
                        c7394ca = new C7394ca("scrgbClr", new C9395zr(abstractC13912i5));
                        break;
                    case 2:
                        c8395ny = C8395ny.this;
                        c7394ca = new C7394ca("srgbClr", new C7670fk(abstractC13912i5));
                        break;
                    case 3:
                        c8395ny = C8395ny.this;
                        c7394ca = new C7394ca("hslClr", new C9052vm(abstractC13912i5));
                        break;
                    case 4:
                        c8395ny = C8395ny.this;
                        c7394ca = new C7394ca("sysClr", new C7939il(abstractC13912i5));
                        break;
                    case 5:
                        c8395ny = C8395ny.this;
                        c7394ca = new C7394ca("schemeClr", new C8732s1(abstractC13912i5));
                        break;
                    case 6:
                        c8395ny = C8395ny.this;
                        c7394ca = new C7394ca("prstClr", new C8065k9(abstractC13912i5));
                        break;
                    default:
                        return false;
                }
                c8395ny.f27634x1 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m37912k4(String str) {
        C7394ca c7394ca;
        if (this.f27634x1 != null) {
            throw new Exception("Color already is initialized.");
        }
        switch (f27632kk.m27428k4(str)) {
            case 1:
                c7394ca = new C7394ca("scrgbClr", new C9395zr());
                break;
            case 2:
                c7394ca = new C7394ca("srgbClr", new C7670fk());
                break;
            case 3:
                c7394ca = new C7394ca("hslClr", new C9052vm());
                break;
            case 4:
                c7394ca = new C7394ca("sysClr", new C7939il());
                break;
            case 5:
                c7394ca = new C7394ca("schemeClr", new C8732s1());
                break;
            case 6:
                c7394ca = new C7394ca("prstClr", new C8065k9());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f27634x1 = c7394ca;
        return this.f27634x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37913k4(double d) {
        this.f27633k4 = d;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        double d = this.f27633k4;
        if (d != 0.0d) {
            c3059ii.m12955x1("rad", C22238OooO0oO.OooO00o(d, 12700.0d, 14));
        }
        C7394ca c7394ca = this.f27634x1;
        if (c7394ca != null) {
            switch (f27632kk.m27428k4(c7394ca.m29539k4())) {
                case 1:
                    ((C9395zr) this.f27634x1.m29541kk()).mo6846k4("a", c3059ii, this.f27634x1.m29539k4());
                    break;
                case 2:
                    ((C7670fk) this.f27634x1.m29541kk()).mo6846k4("a", c3059ii, this.f27634x1.m29539k4());
                    break;
                case 3:
                    ((C9052vm) this.f27634x1.m29541kk()).mo6846k4("a", c3059ii, this.f27634x1.m29539k4());
                    break;
                case 4:
                    ((C7939il) this.f27634x1.m29541kk()).mo6846k4("a", c3059ii, this.f27634x1.m29539k4());
                    break;
                case 5:
                    ((C8732s1) this.f27634x1.m29541kk()).mo6846k4("a", c3059ii, this.f27634x1.m29539k4());
                    break;
                case 6:
                    ((C8065k9) this.f27634x1.m29541kk()).mo6846k4("a", c3059ii, this.f27634x1.m29539k4());
                    break;
            }
        }
        c3059ii.mo21898jd();
    }
}
