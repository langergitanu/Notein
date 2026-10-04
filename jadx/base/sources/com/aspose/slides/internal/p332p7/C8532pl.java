package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.pl */
/* JADX INFO: loaded from: classes4.dex */
public class C8532pl extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f28465to = new C7017h4("radPr", "deg", "e");

    /* JADX INFO: renamed from: k4 */
    private C9106we f28466k4;

    /* JADX INFO: renamed from: kk */
    private C9085w3 f28467kk;

    /* JADX INFO: renamed from: x1 */
    private C9085w3 f28468x1;

    public C8532pl() {
        this.f28468x1 = new C9085w3();
        this.f28467kk = new C9085w3();
    }

    /* JADX INFO: renamed from: kk */
    public final C9085w3 m38972kk() {
        return this.f28467kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9085w3 m38973x1() {
        return this.f28468x1;
    }

    public C8532pl(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.pl.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8532pl.f28465to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8532pl.this.f28466k4 = new C9106we(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8532pl.this.f28468x1 = new C9085w3(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C8532pl.this.f28467kk = new C9085w3(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C9106we m38970k4() {
        return this.f28466k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38971k4(C9106we c9106we) {
        this.f28466k4 = c9106we;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C9106we c9106we = this.f28466k4;
        if (c9106we != null) {
            c9106we.mo6846k4("m", c3059ii, "radPr");
        }
        this.f28468x1.mo6846k4("m", c3059ii, "deg");
        this.f28467kk.mo6846k4("m", c3059ii, "e");
        c3059ii.mo21898jd();
    }
}
