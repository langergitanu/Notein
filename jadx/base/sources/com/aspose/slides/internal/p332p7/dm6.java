package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class dm6 extends AbstractC8333ne {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f21721m9 = new C7017h4("useBgFill", "nvSpPr", "spPr", "style", "txBody", "extLst");

    /* JADX INFO: renamed from: du */
    private C8952ug f21722du;

    /* JADX INFO: renamed from: h4 */
    private dnu f21723h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f21724k4;

    /* JADX INFO: renamed from: kk */
    private C8087kh f21725kk;

    /* JADX INFO: renamed from: to */
    private C8601qh f21726to;

    /* JADX INFO: renamed from: x1 */
    private dls f21727x1;

    public dm6() {
        m30431rv();
        this.f21727x1 = new dls();
        this.f21725kk = new C8087kh();
    }

    /* JADX INFO: renamed from: rv */
    private void m30431rv() {
        this.f21724k4 = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: du */
    public C8952ug mo30432du() {
        return this.f21722du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: dy */
    public boolean mo30433dy() {
        return this.f21724k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: h4 */
    public C8952ug mo30434h4() {
        if (this.f21722du != null) {
            throw new Exception("Only one <txBody> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f21722du = c8952ug;
        return c8952ug;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: kk */
    public C8601qh mo30438kk() {
        return this.f21726to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: m9 */
    public AbstractC7414ck mo30439m9() {
        return this.f21723h4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: to */
    public C8601qh mo30440to() {
        if (this.f21726to != null) {
            throw new Exception("Only one <style> element can be added.");
        }
        C8601qh c8601qh = new C8601qh();
        this.f21726to = c8601qh;
        return c8601qh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: x1 */
    public C8087kh mo30441x1() {
        return this.f21725kk;
    }

    public dm6(final AbstractC13912i5 abstractC13912i5) {
        m30431rv();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dm6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (dm6.f21721m9.m27428k4(str) != 0) {
                    return false;
                }
                dm6.this.f21724k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.dm6.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = dm6.f21721m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    dm6.this.f21727x1 = new dls(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    dm6.this.f21725kk = new C8087kh(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    dm6.this.f21726to = new C8601qh(abstractC13912i5);
                } else if (iM27428k4 == 4) {
                    dm6.this.f21722du = new C8952ug(abstractC13912i5);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    dm6.this.f21723h4 = new dnu(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: k4 */
    public AbstractC7966ix mo30435k4() {
        return this.f21727x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: k4 */
    public void mo30436k4(AbstractC7414ck abstractC7414ck) {
        this.f21723h4 = (dnu) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, ContextChain.TAG_PRODUCT.equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/presentationml/2006/main")) ? null : "http://schemas.openxmlformats.org/presentationml/2006/main");
        boolean z = this.f21724k4;
        if (z) {
            c3059ii.m12955x1("useBgFill", z ? "1" : "0");
        }
        this.f21727x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "nvSpPr");
        this.f21725kk.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "spPr");
        C8601qh c8601qh = this.f21726to;
        if (c8601qh != null) {
            c8601qh.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "style");
        }
        C8952ug c8952ug = this.f21722du;
        if (c8952ug != null) {
            c8952ug.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "txBody");
        }
        dnu dnuVar = this.f21723h4;
        if (dnuVar != null) {
            dnuVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8333ne
    /* JADX INFO: renamed from: k4 */
    public void mo30437k4(boolean z) {
        this.f21724k4 = z;
    }
}
