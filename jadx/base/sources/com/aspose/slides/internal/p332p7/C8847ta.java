package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ta */
/* JADX INFO: loaded from: classes4.dex */
public class C8847ta extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f30634kk = new C7017h4("accPr", "e");

    /* JADX INFO: renamed from: k4 */
    private C7877hs f30635k4;

    /* JADX INFO: renamed from: x1 */
    private C9085w3 f30636x1;

    public C8847ta() {
        this.f30636x1 = new C9085w3();
    }

    /* JADX INFO: renamed from: k4 */
    public final C7877hs m41620k4() {
        return this.f30635k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9085w3 m41622x1() {
        return this.f30636x1;
    }

    public C8847ta(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ta.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8847ta.f30634kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8847ta.this.f30635k4 = new C7877hs(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C8847ta.this.f30636x1 = new C9085w3(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41621k4(C7877hs c7877hs) {
        this.f30635k4 = c7877hs;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7877hs c7877hs = this.f30635k4;
        if (c7877hs != null) {
            c7877hs.mo6846k4("m", c3059ii, "accPr");
        }
        this.f30636x1.mo6846k4("m", c3059ii, "e");
        c3059ii.mo21898jd();
    }
}
