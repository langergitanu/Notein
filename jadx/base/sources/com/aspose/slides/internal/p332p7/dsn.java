package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class dsn extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f21815dy = new C7017h4("form:name", "form:control-implementation", "form:id", "xforms:bind", "form:value", "properties", "event-listeners");

    /* JADX INFO: renamed from: du */
    private String f21816du;

    /* JADX INFO: renamed from: h4 */
    private eyu f21817h4;

    /* JADX INFO: renamed from: k4 */
    private String f21818k4;

    /* JADX INFO: renamed from: kk */
    private String f21819kk;

    /* JADX INFO: renamed from: m9 */
    private hec f21820m9;

    /* JADX INFO: renamed from: to */
    private String f21821to;

    /* JADX INFO: renamed from: x1 */
    private String f21822x1;

    public dsn() {
    }

    public dsn(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dsn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = dsn.f21815dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    dsn.this.f21818k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    dsn.this.f21822x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    dsn.this.f21819kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    dsn.this.f21821to = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                dsn.this.f21816du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.dsn.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = dsn.f21815dy.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 5) {
                    dsn.this.f21817h4 = new eyu(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 6) {
                    return false;
                }
                dsn.this.f21820m9 = new hec(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f21818k4;
        if (str3 != null) {
            c3059ii.m12955x1("form:name", str3);
        }
        String str4 = this.f21822x1;
        if (str4 != null) {
            c3059ii.m12955x1("form:control-implementation", str4);
        }
        c3059ii.m12955x1("form:id", this.f21819kk);
        String str5 = this.f21821to;
        if (str5 != null) {
            c3059ii.m12955x1("xforms:bind", str5);
        }
        c3059ii.m12955x1("form:value", this.f21816du);
        eyu eyuVar = this.f21817h4;
        if (eyuVar != null) {
            eyuVar.mo6846k4("form", c3059ii, "properties");
        }
        hec hecVar = this.f21820m9;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii, "event-listeners");
        }
        c3059ii.mo21898jd();
    }
}
