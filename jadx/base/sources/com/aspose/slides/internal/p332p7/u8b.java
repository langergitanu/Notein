package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class u8b extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f31060du = new C7017h4("colId", "hiddenButton", "showButton", "filters", "top10", "customFilters", "dynamicFilter", "colorFilter", "iconFilter", "extLst");

    /* JADX INFO: renamed from: k4 */
    private long f31061k4;

    /* JADX INFO: renamed from: kk */
    private boolean f31062kk;

    /* JADX INFO: renamed from: to */
    private C7394ca f31063to;

    /* JADX INFO: renamed from: x1 */
    private boolean f31064x1;

    public u8b() {
        m42138x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m42138x1() {
        this.f31064x1 = false;
        this.f31062kk = true;
    }

    public u8b(final AbstractC13912i5 abstractC13912i5) {
        m42138x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.u8b.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = u8b.f31060du.m27428k4(str);
                if (iM27428k4 == 0) {
                    u8b.this.f31061k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    u8b.this.f31064x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                u8b.this.f31062kk = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.u8b.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                u8b u8bVar;
                C7394ca c7394ca;
                switch (u8b.f31060du.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 3:
                        u8bVar = u8b.this;
                        c7394ca = new C7394ca("filters", new q6e(abstractC13912i5));
                        break;
                    case 4:
                        u8bVar = u8b.this;
                        c7394ca = new C7394ca("top10", new jmb(abstractC13912i5));
                        break;
                    case 5:
                        u8bVar = u8b.this;
                        c7394ca = new C7394ca("customFilters", new i8c(abstractC13912i5));
                        break;
                    case 6:
                        u8bVar = u8b.this;
                        c7394ca = new C7394ca("dynamicFilter", new c7y(abstractC13912i5));
                        break;
                    case 7:
                        u8bVar = u8b.this;
                        c7394ca = new C7394ca("colorFilter", new jha(abstractC13912i5));
                        break;
                    case 8:
                        u8bVar = u8b.this;
                        c7394ca = new C7394ca("iconFilter", new tst(abstractC13912i5));
                        break;
                    case 9:
                        u8bVar = u8b.this;
                        c7394ca = new C7394ca("extLst", new g3j(abstractC13912i5));
                        break;
                    default:
                        return false;
                }
                u8bVar.f31063to = c7394ca;
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("colId", C13850af.m65147x1(this.f31061k4));
        boolean z = this.f31064x1;
        if (z) {
            c3059ii.m12955x1("hiddenButton", z ? "1" : "0");
        }
        boolean z2 = this.f31062kk;
        if (!z2) {
            c3059ii.m12955x1("showButton", z2 ? "1" : "0");
        }
        C7394ca c7394ca = this.f31063to;
        if (c7394ca != null) {
            switch (f31060du.m27428k4(c7394ca.m29539k4())) {
                case 3:
                    ((q6e) this.f31063to.m29541kk()).mo6846k4("ssml", c3059ii, this.f31063to.m29539k4());
                    break;
                case 4:
                    ((jmb) this.f31063to.m29541kk()).mo6846k4("ssml", c3059ii, this.f31063to.m29539k4());
                    break;
                case 5:
                    ((i8c) this.f31063to.m29541kk()).mo6846k4("ssml", c3059ii, this.f31063to.m29539k4());
                    break;
                case 6:
                    ((c7y) this.f31063to.m29541kk()).mo6846k4("ssml", c3059ii, this.f31063to.m29539k4());
                    break;
                case 7:
                    ((jha) this.f31063to.m29541kk()).mo6846k4("ssml", c3059ii, this.f31063to.m29539k4());
                    break;
                case 8:
                    ((tst) this.f31063to.m29541kk()).mo6846k4("ssml", c3059ii, this.f31063to.m29539k4());
                    break;
                case 9:
                    ((g3j) this.f31063to.m29541kk()).mo6846k4("ssml", c3059ii, this.f31063to.m29539k4());
                    break;
            }
        }
        c3059ii.mo21898jd();
    }
}
