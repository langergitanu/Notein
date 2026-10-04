package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.lq */
/* JADX INFO: loaded from: classes4.dex */
public class C8206lq extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f26471du = new C7017h4("clrScheme", "fontScheme", "fmtScheme", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C7238ae f26472k4;

    /* JADX INFO: renamed from: kk */
    private C8285mr f26473kk;

    /* JADX INFO: renamed from: to */
    private C8397nz f26474to;

    /* JADX INFO: renamed from: x1 */
    private C7503dp f26475x1;

    public C8206lq() {
        this.f26472k4 = new C7238ae();
        this.f26475x1 = new C7503dp();
        this.f26473kk = new C8285mr();
    }

    /* JADX INFO: renamed from: k4 */
    public final C7238ae m36365k4() {
        return this.f26472k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C8285mr m36367kk() {
        return this.f26473kk;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC7414ck m36368to() {
        return this.f26474to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7503dp m36369x1() {
        return this.f26475x1;
    }

    public C8206lq(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.lq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8206lq.f26471du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8206lq.this.f26472k4 = new C7238ae(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8206lq.this.f26475x1 = new C7503dp(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C8206lq.this.f26473kk = new C8285mr(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C8206lq.this.f26474to = new C8397nz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36366k4(AbstractC7414ck abstractC7414ck) {
        this.f26474to = (C8397nz) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f26472k4.mo6846k4("a", c3059ii, "clrScheme");
        this.f26475x1.mo6846k4("a", c3059ii, "fontScheme");
        this.f26473kk.mo6846k4("a", c3059ii, "fmtScheme");
        C8397nz c8397nz = this.f26474to;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
