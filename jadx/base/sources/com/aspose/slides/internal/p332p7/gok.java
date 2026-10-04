package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public final class gok extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f23626to = new C7017h4("cViewPr", "sldLst", "extLst");

    /* JADX INFO: renamed from: k4 */
    private wzx f23627k4;

    /* JADX INFO: renamed from: kk */
    private ltr f23628kk;

    /* JADX INFO: renamed from: x1 */
    private xat f23629x1;

    public gok() {
        this.f23627k4 = new wzx();
    }

    public gok(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gok.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = gok.f23626to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    gok.this.f23627k4 = new wzx(abstractC13912i5);
                    return false;
                }
                if (iM27428k4 == 1) {
                    gok.this.f23629x1 = new xat(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    gok.this.f23628kk = new ltr(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final xat m32753k4() {
        return this.f23629x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32754k4(xat xatVar) {
        this.f23629x1 = xatVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f23627k4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cViewPr");
        xat xatVar = this.f23629x1;
        if (xatVar != null) {
            xatVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "sldLst");
        }
        ltr ltrVar = this.f23628kk;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
