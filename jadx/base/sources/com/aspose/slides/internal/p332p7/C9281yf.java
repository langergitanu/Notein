package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.yf */
/* JADX INFO: loaded from: classes4.dex */
public class C9281yf extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f33367du = new C7017h4("sPrePr", "sub", "sup", "e");

    /* JADX INFO: renamed from: k4 */
    private C7234ad f33368k4;

    /* JADX INFO: renamed from: kk */
    private C9085w3 f33369kk;

    /* JADX INFO: renamed from: to */
    private C9085w3 f33370to;

    /* JADX INFO: renamed from: x1 */
    private C9085w3 f33371x1;

    public C9281yf() {
        this.f33371x1 = new C9085w3();
        this.f33369kk = new C9085w3();
        this.f33370to = new C9085w3();
    }

    /* JADX INFO: renamed from: du */
    public final C9085w3 m44986du() {
        return this.f33370to;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7234ad m44987k4() {
        if (this.f33368k4 != null) {
            throw new Exception("Only one <sPrePr> element can be added.");
        }
        C7234ad c7234ad = new C7234ad();
        this.f33368k4 = c7234ad;
        return c7234ad;
    }

    /* JADX INFO: renamed from: kk */
    public final C9085w3 m44988kk() {
        return this.f33371x1;
    }

    /* JADX INFO: renamed from: to */
    public final C9085w3 m44989to() {
        return this.f33369kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7234ad m44990x1() {
        return this.f33368k4;
    }

    public C9281yf(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9281yf.f33367du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9281yf.this.f33368k4 = new C7234ad(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C9281yf.this.f33371x1 = new C9085w3(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C9281yf.this.f33369kk = new C9085w3(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C9281yf.this.f33370to = new C9085w3(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7234ad c7234ad = this.f33368k4;
        if (c7234ad != null) {
            c7234ad.mo6846k4("m", c3059ii, "sPrePr");
        }
        this.f33371x1.mo6846k4("m", c3059ii, "sub");
        this.f33369kk.mo6846k4("m", c3059ii, "sup");
        this.f33370to.mo6846k4("m", c3059ii, "e");
        c3059ii.mo21898jd();
    }
}
