package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class yw9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f33552to = new C7017h4("id", "r:id", "extLst");

    /* JADX INFO: renamed from: k4 */
    private long f33553k4;

    /* JADX INFO: renamed from: kk */
    private ltr f33554kk;

    /* JADX INFO: renamed from: x1 */
    private String f33555x1;

    public yw9() {
    }

    /* JADX INFO: renamed from: k4 */
    public final long m45196k4() {
        return this.f33553k4;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC7414ck m45200kk() {
        return this.f33554kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m45201x1() {
        return this.f33555x1;
    }

    public yw9(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.yw9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = yw9.f33552to.m27428k4(str);
                if (iM27428k4 == 0) {
                    yw9.this.f33553k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                yw9.this.f33555x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yw9.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (yw9.f33552to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                yw9.this.f33554kk = new ltr(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45197k4(long j) {
        this.f33553k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45198k4(AbstractC7414ck abstractC7414ck) {
        this.f33554kk = (ltr) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45199k4(String str) {
        this.f33555x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("id", C13850af.m65147x1(this.f33553k4));
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("r:id", this.f33555x1);
        ltr ltrVar = this.f33554kk;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
