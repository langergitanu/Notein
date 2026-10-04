package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class ktk extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f25954x1 = new C7017h4("vector");

    /* JADX INFO: renamed from: k4 */
    private bf6 f25955k4;

    public ktk() {
        this.f25955k4 = new bf6();
    }

    /* JADX INFO: renamed from: k4 */
    public final bf6 m35703k4() {
        return this.f25955k4;
    }

    public ktk(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ktk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (ktk.f25954x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                ktk.this.f25955k4 = new bf6(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f25955k4.mo6846k4("vt", c3059ii, "vector");
        c3059ii.mo21898jd();
    }
}
