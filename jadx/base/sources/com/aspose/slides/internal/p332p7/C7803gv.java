package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.gv */
/* JADX INFO: loaded from: classes4.dex */
public class C7803gv extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f23752kk = new C7017h4("idx", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr");

    /* JADX INFO: renamed from: k4 */
    private byte f23753k4;

    /* JADX INFO: renamed from: x1 */
    private C7394ca f23754x1;

    public C7803gv() {
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m32938k4() {
        return this.f23753k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m32942x1() {
        return this.f23754x1;
    }

    public C7803gv(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.gv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7803gv.f23752kk.m27428k4(str) != 0) {
                    return false;
                }
                C7803gv.this.f23753k4 = C7933ii.m34153k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gv.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C7803gv c7803gv;
                C7394ca c7394ca;
                switch (C7803gv.f23752kk.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 1:
                        c7803gv = C7803gv.this;
                        c7394ca = new C7394ca("scrgbClr", new C9395zr(abstractC13912i5));
                        break;
                    case 2:
                        c7803gv = C7803gv.this;
                        c7394ca = new C7394ca("srgbClr", new C7670fk(abstractC13912i5));
                        break;
                    case 3:
                        c7803gv = C7803gv.this;
                        c7394ca = new C7394ca("hslClr", new C9052vm(abstractC13912i5));
                        break;
                    case 4:
                        c7803gv = C7803gv.this;
                        c7394ca = new C7394ca("sysClr", new C7939il(abstractC13912i5));
                        break;
                    case 5:
                        c7803gv = C7803gv.this;
                        c7394ca = new C7394ca("schemeClr", new C8732s1(abstractC13912i5));
                        break;
                    case 6:
                        c7803gv = C7803gv.this;
                        c7394ca = new C7394ca("prstClr", new C8065k9(abstractC13912i5));
                        break;
                    default:
                        return false;
                }
                c7803gv.f23754x1 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m32939k4(String str) {
        C7394ca c7394ca;
        if (this.f23754x1 != null) {
            throw new Exception("Color already is initialized.");
        }
        switch (f23752kk.m27428k4(str)) {
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
        this.f23754x1 = c7394ca;
        return this.f23754x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32940k4(byte b) {
        this.f23753k4 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32941k4(C7394ca c7394ca) {
        this.f23754x1 = c7394ca;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, "a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main")) ? null : "http://schemas.openxmlformats.org/drawingml/2006/main");
        c3059ii.m12955x1("idx", C7933ii.m34154k4(this.f23753k4));
        C7394ca c7394ca = this.f23754x1;
        if (c7394ca != null) {
            switch (f23752kk.m27428k4(c7394ca.m29539k4())) {
                case 1:
                    ((C9395zr) this.f23754x1.m29541kk()).mo6846k4("a", c3059ii, this.f23754x1.m29539k4());
                    break;
                case 2:
                    ((C7670fk) this.f23754x1.m29541kk()).mo6846k4("a", c3059ii, this.f23754x1.m29539k4());
                    break;
                case 3:
                    ((C9052vm) this.f23754x1.m29541kk()).mo6846k4("a", c3059ii, this.f23754x1.m29539k4());
                    break;
                case 4:
                    ((C7939il) this.f23754x1.m29541kk()).mo6846k4("a", c3059ii, this.f23754x1.m29539k4());
                    break;
                case 5:
                    ((C8732s1) this.f23754x1.m29541kk()).mo6846k4("a", c3059ii, this.f23754x1.m29539k4());
                    break;
                case 6:
                    ((C8065k9) this.f23754x1.m29541kk()).mo6846k4("a", c3059ii, this.f23754x1.m29539k4());
                    break;
            }
        }
        c3059ii.mo21898jd();
    }
}
