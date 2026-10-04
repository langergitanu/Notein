package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.n9 */
/* JADX INFO: loaded from: classes4.dex */
public class C8318n9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f27181kk = new C7017h4("graphicFrameLocks", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C7964iv f27182k4;

    /* JADX INFO: renamed from: x1 */
    private C8397nz f27183x1;

    public C8318n9() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7964iv m37330k4() {
        if (this.f27182k4 != null) {
            throw new Exception("Only one <graphicFrameLocks> element can be added.");
        }
        C7964iv c7964iv = new C7964iv();
        this.f27182k4 = c7964iv;
        return c7964iv;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC7414ck m37332kk() {
        return this.f27183x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7964iv m37333x1() {
        return this.f27182k4;
    }

    public C8318n9(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.n9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8318n9.f27181kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8318n9.this.f27182k4 = new C7964iv(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C8318n9.this.f27183x1 = new C8397nz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37331k4(AbstractC7414ck abstractC7414ck) {
        this.f27183x1 = (C8397nz) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7964iv c7964iv = this.f27182k4;
        if (c7964iv != null) {
            c7964iv.mo6846k4("a", c3059ii, "graphicFrameLocks");
        }
        C8397nz c8397nz = this.f27183x1;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
