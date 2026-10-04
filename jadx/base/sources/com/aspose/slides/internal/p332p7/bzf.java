package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class bzf extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private ltr f20829du;

    /* JADX INFO: renamed from: kk */
    private C14047bz f20830kk = new C14047bz();

    /* JADX INFO: renamed from: to */
    private q4s f20831to;

    /* JADX INFO: renamed from: x1 */
    private String f20832x1;

    /* JADX INFO: renamed from: k4 */
    public static final C14047bz f20828k4 = C14047bz.f47172k4.Clone();

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f20827h4 = new C7017h4("name", "id", "sldIdLst", "extLst");

    public bzf() {
        m29326du();
        this.f20831to = new q4s();
    }

    /* JADX INFO: renamed from: du */
    private void m29326du() {
        f20828k4.CloneTo(this.f20830kk);
    }

    /* JADX INFO: renamed from: kk */
    public final q4s m29335kk() {
        return this.f20831to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14047bz m29336x1() {
        return this.f20830kk;
    }

    public bzf(final AbstractC13912i5 abstractC13912i5) {
        m29326du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bzf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = bzf.f20827h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    bzf.this.f20832x1 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                bzf.this.f20830kk = new C14047bz(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.bzf.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = bzf.f20827h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    bzf.this.f20831to = new q4s(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                bzf.this.f20829du = new ltr(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m29332k4() {
        return this.f20832x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29333k4(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f20830kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29334k4(String str) {
        this.f20832x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f20832x1;
        if (str3 != null) {
            c3059ii.m12955x1("name", str3);
        }
        if (C14047bz.m66537x1(this.f20830kk, f20828k4)) {
            c3059ii.m12955x1("id", C14113y2.m67408k4("{", OooOO0.OooO00o(this.f20830kk), "}"));
        }
        this.f20831to.mo6846k4("p14", c3059ii, "sldIdLst");
        ltr ltrVar = this.f20829du;
        if (ltrVar != null) {
            ltrVar.mo6846k4("p14", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
