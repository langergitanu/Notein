package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ju */
/* JADX INFO: loaded from: classes4.dex */
public class C8039ju extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f25354x1 = new C7017h4("argSz");

    /* JADX INFO: renamed from: k4 */
    private C8864te f25355k4;

    public C8039ju() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C8864te m34966k4() {
        return this.f25355k4;
    }

    public C8039ju(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ju.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8039ju.f25354x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C8039ju.this.f25355k4 = new C8864te(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34967k4(C8864te c8864te) {
        this.f25355k4 = c8864te;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8864te c8864te = this.f25355k4;
        if (c8864te != null) {
            c8864te.mo6846k4("m", c3059ii, "argSz");
        }
        c3059ii.mo21898jd();
    }
}
