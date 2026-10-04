package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ra */
/* JADX INFO: loaded from: classes4.dex */
public class C8661ra extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f29212du = new C7017h4("idx", "mods", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr", "styleClr");

    /* JADX INFO: renamed from: k4 */
    private byte f29213k4;

    /* JADX INFO: renamed from: kk */
    private C7394ca f29214kk;

    /* JADX INFO: renamed from: to */
    private C7825h7 f29215to;

    /* JADX INFO: renamed from: x1 */
    private String f29216x1;

    public C8661ra() {
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m39923k4() {
        return this.f29213k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C7825h7 m39924kk() {
        return this.f29215to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m39925x1() {
        return this.f29214kk;
    }

    public C8661ra(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ra.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8661ra.f29212du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8661ra.this.f29213k4 = C7933ii.m34153k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8661ra.this.f29216x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ra.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8661ra c8661ra;
                C7394ca c7394ca;
                switch (C8661ra.f29212du.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 2:
                        c8661ra = C8661ra.this;
                        c7394ca = new C7394ca("scrgbClr", new C9395zr(abstractC13912i5));
                        break;
                    case 3:
                        c8661ra = C8661ra.this;
                        c7394ca = new C7394ca("srgbClr", new C7670fk(abstractC13912i5));
                        break;
                    case 4:
                        c8661ra = C8661ra.this;
                        c7394ca = new C7394ca("hslClr", new C9052vm(abstractC13912i5));
                        break;
                    case 5:
                        c8661ra = C8661ra.this;
                        c7394ca = new C7394ca("sysClr", new C7939il(abstractC13912i5));
                        break;
                    case 6:
                        c8661ra = C8661ra.this;
                        c7394ca = new C7394ca("schemeClr", new C8732s1(abstractC13912i5));
                        break;
                    case 7:
                        c8661ra = C8661ra.this;
                        c7394ca = new C7394ca("prstClr", new C8065k9(abstractC13912i5));
                        break;
                    case 8:
                        C8661ra.this.f29215to = new C7825h7(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                c8661ra.f29214kk = c7394ca;
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("idx", C7933ii.m34154k4(this.f29213k4));
        String str3 = this.f29216x1;
        if (str3 != null) {
            c3059ii.m12955x1("mods", str3);
        }
        C7394ca c7394ca = this.f29214kk;
        if (c7394ca != null) {
            switch (f29212du.m27428k4(c7394ca.m29539k4())) {
                case 2:
                    ((C9395zr) this.f29214kk.m29541kk()).mo6846k4("a", c3059ii, this.f29214kk.m29539k4());
                    break;
                case 3:
                    ((C7670fk) this.f29214kk.m29541kk()).mo6846k4("a", c3059ii, this.f29214kk.m29539k4());
                    break;
                case 4:
                    ((C9052vm) this.f29214kk.m29541kk()).mo6846k4("a", c3059ii, this.f29214kk.m29539k4());
                    break;
                case 5:
                    ((C7939il) this.f29214kk.m29541kk()).mo6846k4("a", c3059ii, this.f29214kk.m29539k4());
                    break;
                case 6:
                    ((C8732s1) this.f29214kk.m29541kk()).mo6846k4("a", c3059ii, this.f29214kk.m29539k4());
                    break;
                case 7:
                    ((C8065k9) this.f29214kk.m29541kk()).mo6846k4("a", c3059ii, this.f29214kk.m29539k4());
                    break;
            }
        }
        C7825h7 c7825h7 = this.f29215to;
        if (c7825h7 != null) {
            c7825h7.mo6846k4(TranslateLanguage.CZECH, c3059ii, "styleClr");
        }
        c3059ii.mo21898jd();
    }
}
