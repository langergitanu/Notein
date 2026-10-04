package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.p5 */
/* JADX INFO: loaded from: classes4.dex */
public class C8492p5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f28221kk = new C7017h4("name", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr");

    /* JADX INFO: renamed from: k4 */
    private String f28222k4;

    /* JADX INFO: renamed from: x1 */
    private C7394ca f28223x1;

    public C8492p5() {
        m38621x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m38621x1() {
        this.f28222k4 = "";
    }

    public C8492p5(final AbstractC13912i5 abstractC13912i5) {
        m38621x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.p5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8492p5.f28221kk.m27428k4(str) != 0) {
                    return false;
                }
                C8492p5.this.f28222k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.p5.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8492p5 c8492p5;
                C7394ca c7394ca;
                switch (C8492p5.f28221kk.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 1:
                        c8492p5 = C8492p5.this;
                        c7394ca = new C7394ca("scrgbClr", new C9395zr(abstractC13912i5));
                        break;
                    case 2:
                        c8492p5 = C8492p5.this;
                        c7394ca = new C7394ca("srgbClr", new C7670fk(abstractC13912i5));
                        break;
                    case 3:
                        c8492p5 = C8492p5.this;
                        c7394ca = new C7394ca("hslClr", new C9052vm(abstractC13912i5));
                        break;
                    case 4:
                        c8492p5 = C8492p5.this;
                        c7394ca = new C7394ca("sysClr", new C7939il(abstractC13912i5));
                        break;
                    case 5:
                        c8492p5 = C8492p5.this;
                        c7394ca = new C7394ca("schemeClr", new C8732s1(abstractC13912i5));
                        break;
                    case 6:
                        c8492p5 = C8492p5.this;
                        c7394ca = new C7394ca("prstClr", new C8065k9(abstractC13912i5));
                        break;
                    default:
                        return false;
                }
                c8492p5.f28223x1 = c7394ca;
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!"".equals(this.f28222k4)) {
            c3059ii.m12955x1("name", this.f28222k4);
        }
        C7394ca c7394ca = this.f28223x1;
        if (c7394ca != null) {
            switch (f28221kk.m27428k4(c7394ca.m29539k4())) {
                case 1:
                    ((C9395zr) this.f28223x1.m29541kk()).mo6846k4("a", c3059ii, this.f28223x1.m29539k4());
                    break;
                case 2:
                    ((C7670fk) this.f28223x1.m29541kk()).mo6846k4("a", c3059ii, this.f28223x1.m29539k4());
                    break;
                case 3:
                    ((C9052vm) this.f28223x1.m29541kk()).mo6846k4("a", c3059ii, this.f28223x1.m29539k4());
                    break;
                case 4:
                    ((C7939il) this.f28223x1.m29541kk()).mo6846k4("a", c3059ii, this.f28223x1.m29539k4());
                    break;
                case 5:
                    ((C8732s1) this.f28223x1.m29541kk()).mo6846k4("a", c3059ii, this.f28223x1.m29539k4());
                    break;
                case 6:
                    ((C8065k9) this.f28223x1.m29541kk()).mo6846k4("a", c3059ii, this.f28223x1.m29539k4());
                    break;
            }
        }
        c3059ii.mo21898jd();
    }
}
