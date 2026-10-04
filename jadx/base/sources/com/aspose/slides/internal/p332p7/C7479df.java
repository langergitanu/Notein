package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.df */
/* JADX INFO: loaded from: classes4.dex */
public class C7479df extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f21613du = new C7017h4("channel", "name", "value", "units");

    /* JADX INFO: renamed from: k4 */
    private String f21614k4;

    /* JADX INFO: renamed from: kk */
    private String f21615kk;

    /* JADX INFO: renamed from: to */
    private String f21616to;

    /* JADX INFO: renamed from: x1 */
    private String f21617x1;

    public C7479df() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m30322k4() {
        return this.f21614k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m30324kk() {
        return this.f21615kk;
    }

    /* JADX INFO: renamed from: to */
    public final String m30326to() {
        return this.f21616to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m30328x1() {
        return this.f21617x1;
    }

    public C7479df(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.df.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7479df.f21613du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7479df.this.f21614k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7479df.this.f21617x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C7479df.this.f21615kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C7479df.this.f21616to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30323k4(String str) {
        this.f21614k4 = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m30325kk(String str) {
        this.f21615kk = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m30327to(String str) {
        this.f21616to = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m30329x1(String str) {
        this.f21617x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("channel", this.f21614k4);
        c3059ii.m12955x1("name", this.f21617x1);
        c3059ii.m12955x1("value", this.f21615kk);
        String str3 = this.f21616to;
        if (str3 != null) {
            c3059ii.m12955x1("units", str3);
        }
        c3059ii.mo21898jd();
    }
}
