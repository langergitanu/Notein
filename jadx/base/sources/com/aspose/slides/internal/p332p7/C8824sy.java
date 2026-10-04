package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.sy */
/* JADX INFO: loaded from: classes4.dex */
public class C8824sy extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f30504kk = new C7017h4("barPr", "e");

    /* JADX INFO: renamed from: k4 */
    private C7529e1 f30505k4;

    /* JADX INFO: renamed from: x1 */
    private C9085w3 f30506x1;

    public C8824sy() {
        this.f30506x1 = new C9085w3();
    }

    /* JADX INFO: renamed from: k4 */
    public final C7529e1 m41445k4() {
        return this.f30505k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9085w3 m41447x1() {
        return this.f30506x1;
    }

    public C8824sy(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.sy.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8824sy.f30504kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8824sy.this.f30505k4 = new C7529e1(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C8824sy.this.f30506x1 = new C9085w3(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41446k4(C7529e1 c7529e1) {
        this.f30505k4 = c7529e1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7529e1 c7529e1 = this.f30505k4;
        if (c7529e1 != null) {
            c7529e1.mo6846k4("m", c3059ii, "barPr");
        }
        this.f30506x1.mo6846k4("m", c3059ii, "e");
        c3059ii.mo21898jd();
    }
}
