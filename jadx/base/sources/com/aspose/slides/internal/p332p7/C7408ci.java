package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ci */
/* JADX INFO: loaded from: classes4.dex */
public class C7408ci extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f21081m9 = new C7017h4("Id", "Type", "URI", "Transforms", "DigestMethod", "DigestValue");

    /* JADX INFO: renamed from: du */
    private C7696fs f21082du;

    /* JADX INFO: renamed from: h4 */
    private String f21083h4;

    /* JADX INFO: renamed from: k4 */
    private String f21084k4;

    /* JADX INFO: renamed from: kk */
    private String f21085kk;

    /* JADX INFO: renamed from: to */
    private C8771sh f21086to;

    /* JADX INFO: renamed from: x1 */
    private String f21087x1;

    public C7408ci() {
        this.f21082du = new C7696fs();
    }

    /* JADX INFO: renamed from: du */
    public final String m29620du() {
        return this.f21083h4;
    }

    /* JADX INFO: renamed from: kk */
    public final C8771sh m29623kk() {
        return this.f21086to;
    }

    /* JADX INFO: renamed from: to */
    public final C7696fs m29625to() {
        return this.f21082du;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m29626x1() {
        return this.f21085kk;
    }

    public C7408ci(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ci.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7408ci.f21081m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7408ci.this.f21084k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7408ci.this.f21087x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C7408ci.this.f21085kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ci.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7408ci.f21081m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    C7408ci.this.f21086to = new C8771sh(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 4) {
                    C7408ci.this.f21082du = new C7696fs(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                C7408ci.this.f21083h4 = abstractC13912i5.mo65052v4();
                if (abstractC13912i5.mo65048u4()) {
                    return true;
                }
                while (abstractC13912i5.mo65028jd() != 15) {
                    abstractC13912i5.mo65026h4();
                    C7408ci c7408ci = C7408ci.this;
                    c7408ci.f21083h4 = C14113y2.m67400k4(c7408ci.f21083h4, abstractC13912i5.mo65052v4());
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8771sh m29621k4() {
        if (this.f21086to != null) {
            throw new Exception("Only one <transforms> element can be added.");
        }
        C8771sh c8771sh = new C8771sh();
        this.f21086to = c8771sh;
        return c8771sh;
    }

    /* JADX INFO: renamed from: kk */
    public final void m29624kk(String str) {
        this.f21083h4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m29627x1(String str) {
        this.f21085kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29622k4(String str) {
        this.f21087x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f21084k4;
        if (str3 != null) {
            c3059ii.m12955x1("Id", str3);
        }
        String str4 = this.f21087x1;
        if (str4 != null) {
            c3059ii.m12955x1("Type", str4);
        }
        String str5 = this.f21085kk;
        if (str5 != null) {
            c3059ii.m12955x1("URI", str5);
        }
        C8771sh c8771sh = this.f21086to;
        if (c8771sh != null) {
            c8771sh.mo6846k4("", c3059ii, "Transforms");
        }
        this.f21082du.mo6846k4("", c3059ii, "DigestMethod");
        m29301k4("", c3059ii, "DigestValue", this.f21083h4, false);
        c3059ii.mo21898jd();
    }
}
