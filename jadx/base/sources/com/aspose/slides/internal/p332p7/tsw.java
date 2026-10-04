package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class tsw extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f30875kk = new C7017h4("r:id", "extLst");

    /* JADX INFO: renamed from: k4 */
    private String f30876k4;

    /* JADX INFO: renamed from: x1 */
    private ltr f30877x1;

    public tsw() {
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC7414ck m41897x1() {
        return this.f30877x1;
    }

    public tsw(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.tsw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (tsw.f30875kk.m27428k4(str) != 0) {
                    return false;
                }
                tsw.this.f30876k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.tsw.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (tsw.f30875kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                tsw.this.f30877x1 = new ltr(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m41894k4() {
        return this.f30876k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41895k4(AbstractC7414ck abstractC7414ck) {
        this.f30877x1 = (ltr) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41896k4(String str) {
        this.f30876k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("r:id", this.f30876k4);
        ltr ltrVar = this.f30877x1;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
