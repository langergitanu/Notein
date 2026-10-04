package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class n0k extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f27075to = new C7017h4("id", "r:id", "extLst");

    /* JADX INFO: renamed from: k4 */
    private long f27076k4;

    /* JADX INFO: renamed from: kk */
    private ltr f27077kk;

    /* JADX INFO: renamed from: x1 */
    private String f27078x1;

    public n0k() {
        m37186du();
    }

    /* JADX INFO: renamed from: du */
    private void m37186du() {
        this.f27076k4 = 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m37191k4() {
        return this.f27076k4;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC7414ck m37195kk() {
        return this.f27077kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m37196x1() {
        return this.f27078x1;
    }

    public n0k(final AbstractC13912i5 abstractC13912i5) {
        m37186du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.n0k.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = n0k.f27075to.m27428k4(str);
                if (iM27428k4 == 0) {
                    n0k.this.f27076k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                n0k.this.f27078x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.n0k.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (n0k.f27075to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                n0k.this.f27077kk = new ltr(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37192k4(long j) {
        this.f27076k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37193k4(AbstractC7414ck abstractC7414ck) {
        this.f27077kk = (ltr) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37194k4(String str) {
        this.f27078x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f27076k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("id", C13850af.m65147x1(j));
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("r:id", this.f27078x1);
        ltr ltrVar = this.f27077kk;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
