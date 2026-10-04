package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.sm */
/* JADX INFO: loaded from: classes4.dex */
public class C8788sm extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f30236du = new C7017h4("idx", "mods", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr", "styleClr");

    /* JADX INFO: renamed from: k4 */
    private long f30237k4;

    /* JADX INFO: renamed from: kk */
    private C7394ca f30238kk;

    /* JADX INFO: renamed from: to */
    private C7825h7 f30239to;

    /* JADX INFO: renamed from: x1 */
    private String f30240x1;

    public C8788sm() {
    }

    /* JADX INFO: renamed from: k4 */
    public final long m41124k4() {
        return this.f30237k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C7825h7 m41125kk() {
        return this.f30239to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m41126x1() {
        return this.f30238kk;
    }

    public C8788sm(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.sm.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8788sm.f30236du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8788sm.this.f30237k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8788sm.this.f30240x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.sm.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8788sm c8788sm;
                C7394ca c7394ca;
                switch (C8788sm.f30236du.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 2:
                        c8788sm = C8788sm.this;
                        c7394ca = new C7394ca("scrgbClr", new C9395zr(abstractC13912i5));
                        break;
                    case 3:
                        c8788sm = C8788sm.this;
                        c7394ca = new C7394ca("srgbClr", new C7670fk(abstractC13912i5));
                        break;
                    case 4:
                        c8788sm = C8788sm.this;
                        c7394ca = new C7394ca("hslClr", new C9052vm(abstractC13912i5));
                        break;
                    case 5:
                        c8788sm = C8788sm.this;
                        c7394ca = new C7394ca("sysClr", new C7939il(abstractC13912i5));
                        break;
                    case 6:
                        c8788sm = C8788sm.this;
                        c7394ca = new C7394ca("schemeClr", new C8732s1(abstractC13912i5));
                        break;
                    case 7:
                        c8788sm = C8788sm.this;
                        c7394ca = new C7394ca("prstClr", new C8065k9(abstractC13912i5));
                        break;
                    case 8:
                        C8788sm.this.f30239to = new C7825h7(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                c8788sm.f30238kk = c7394ca;
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("idx", C13850af.m65147x1(this.f30237k4));
        String str3 = this.f30240x1;
        if (str3 != null) {
            c3059ii.m12955x1("mods", str3);
        }
        C7394ca c7394ca = this.f30238kk;
        if (c7394ca != null) {
            switch (f30236du.m27428k4(c7394ca.m29539k4())) {
                case 2:
                    ((C9395zr) this.f30238kk.m29541kk()).mo6846k4("a", c3059ii, this.f30238kk.m29539k4());
                    break;
                case 3:
                    ((C7670fk) this.f30238kk.m29541kk()).mo6846k4("a", c3059ii, this.f30238kk.m29539k4());
                    break;
                case 4:
                    ((C9052vm) this.f30238kk.m29541kk()).mo6846k4("a", c3059ii, this.f30238kk.m29539k4());
                    break;
                case 5:
                    ((C7939il) this.f30238kk.m29541kk()).mo6846k4("a", c3059ii, this.f30238kk.m29539k4());
                    break;
                case 6:
                    ((C8732s1) this.f30238kk.m29541kk()).mo6846k4("a", c3059ii, this.f30238kk.m29539k4());
                    break;
                case 7:
                    ((C8065k9) this.f30238kk.m29541kk()).mo6846k4("a", c3059ii, this.f30238kk.m29539k4());
                    break;
            }
        }
        C7825h7 c7825h7 = this.f30239to;
        if (c7825h7 != null) {
            c7825h7.mo6846k4(TranslateLanguage.CZECH, c3059ii, "styleClr");
        }
        c3059ii.mo21898jd();
    }
}
