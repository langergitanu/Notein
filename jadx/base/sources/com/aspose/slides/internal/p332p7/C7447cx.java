package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.cx */
/* JADX INFO: loaded from: classes4.dex */
public class C7447cx extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f21357x1 = new C7017h4("scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f21358k4;

    public C7447cx() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m29964k4() {
        return this.f21358k4;
    }

    public C7447cx(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.cx.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C7447cx c7447cx;
                C7394ca c7394ca;
                int iM27428k4 = C7447cx.f21357x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    c7447cx = C7447cx.this;
                    c7394ca = new C7394ca("scrgbClr", new C9395zr(abstractC13912i5));
                } else if (iM27428k4 == 1) {
                    c7447cx = C7447cx.this;
                    c7394ca = new C7394ca("srgbClr", new C7670fk(abstractC13912i5));
                } else if (iM27428k4 == 2) {
                    c7447cx = C7447cx.this;
                    c7394ca = new C7394ca("hslClr", new C9052vm(abstractC13912i5));
                } else if (iM27428k4 == 3) {
                    c7447cx = C7447cx.this;
                    c7394ca = new C7394ca("sysClr", new C7939il(abstractC13912i5));
                } else if (iM27428k4 == 4) {
                    c7447cx = C7447cx.this;
                    c7394ca = new C7394ca("schemeClr", new C8732s1(abstractC13912i5));
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    c7447cx = C7447cx.this;
                    c7394ca = new C7394ca("prstClr", new C8065k9(abstractC13912i5));
                }
                c7447cx.f21358k4 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m29965k4(String str) {
        C7394ca c7394ca;
        if (this.f21358k4 != null) {
            throw new Exception("Color already is initialized.");
        }
        int iM27428k4 = f21357x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("scrgbClr", new C9395zr());
        } else if (iM27428k4 == 1) {
            c7394ca = new C7394ca("srgbClr", new C7670fk());
        } else if (iM27428k4 == 2) {
            c7394ca = new C7394ca("hslClr", new C9052vm());
        } else if (iM27428k4 == 3) {
            c7394ca = new C7394ca("sysClr", new C7939il());
        } else if (iM27428k4 == 4) {
            c7394ca = new C7394ca("schemeClr", new C8732s1());
        } else {
            if (iM27428k4 != 5) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("prstClr", new C8065k9());
        }
        this.f21358k4 = c7394ca;
        return this.f21358k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f21358k4;
        if (c7394ca != null) {
            int iM27428k4 = f21357x1.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 0) {
                ((C9395zr) this.f21358k4.m29541kk()).mo6846k4("a", c3059ii, this.f21358k4.m29539k4());
            } else if (iM27428k4 == 1) {
                ((C7670fk) this.f21358k4.m29541kk()).mo6846k4("a", c3059ii, this.f21358k4.m29539k4());
            } else if (iM27428k4 == 2) {
                ((C9052vm) this.f21358k4.m29541kk()).mo6846k4("a", c3059ii, this.f21358k4.m29539k4());
            } else if (iM27428k4 == 3) {
                ((C7939il) this.f21358k4.m29541kk()).mo6846k4("a", c3059ii, this.f21358k4.m29539k4());
            } else if (iM27428k4 == 4) {
                ((C8732s1) this.f21358k4.m29541kk()).mo6846k4("a", c3059ii, this.f21358k4.m29539k4());
            } else if (iM27428k4 == 5) {
                ((C8065k9) this.f21358k4.m29541kk()).mo6846k4("a", c3059ii, this.f21358k4.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
