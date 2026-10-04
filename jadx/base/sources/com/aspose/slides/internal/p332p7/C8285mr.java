package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.mr */
/* JADX INFO: loaded from: classes4.dex */
public class C8285mr extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f26958h4 = new C7017h4("name", "fillStyleLst", "lnStyleLst", "effectStyleLst", "bgFillStyleLst");

    /* JADX INFO: renamed from: du */
    private C7701fu f26959du;

    /* JADX INFO: renamed from: k4 */
    private String f26960k4;

    /* JADX INFO: renamed from: kk */
    private C8540pq f26961kk;

    /* JADX INFO: renamed from: to */
    private C7961iu f26962to;

    /* JADX INFO: renamed from: x1 */
    private C7863hl f26963x1;

    public C8285mr() {
        m37064m9();
        this.f26963x1 = new C7863hl();
        this.f26961kk = new C8540pq();
        this.f26962to = new C7961iu();
        this.f26959du = new C7701fu();
    }

    /* JADX INFO: renamed from: m9 */
    private void m37064m9() {
        this.f26960k4 = "";
    }

    /* JADX INFO: renamed from: du */
    public final C7701fu m37065du() {
        return this.f26959du;
    }

    /* JADX INFO: renamed from: kk */
    public final C8540pq m37068kk() {
        return this.f26961kk;
    }

    /* JADX INFO: renamed from: to */
    public final C7961iu m37069to() {
        return this.f26962to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7863hl m37070x1() {
        return this.f26963x1;
    }

    public C8285mr(final AbstractC13912i5 abstractC13912i5) {
        m37064m9();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.mr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8285mr.f26958h4.m27428k4(str) != 0) {
                    return false;
                }
                C8285mr.this.f26960k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.mr.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8285mr.f26958h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C8285mr.this.f26963x1 = new C7863hl(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C8285mr.this.f26961kk = new C8540pq(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    C8285mr.this.f26962to = new C7961iu(abstractC13912i5);
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    C8285mr.this.f26959du = new C7701fu(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m37066k4() {
        return this.f26960k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37067k4(String str) {
        this.f26960k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!"".equals(this.f26960k4)) {
            c3059ii.m12955x1("name", this.f26960k4);
        }
        this.f26963x1.mo6846k4("a", c3059ii, "fillStyleLst");
        this.f26961kk.mo6846k4("a", c3059ii, "lnStyleLst");
        this.f26962to.mo6846k4("a", c3059ii, "effectStyleLst");
        this.f26959du.mo6846k4("a", c3059ii, "bgFillStyleLst");
        c3059ii.mo21898jd();
    }
}
