package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class ypz extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f33460kk = new C7017h4("docMk", "sldMk");

    /* JADX INFO: renamed from: k4 */
    private umg f33461k4;

    /* JADX INFO: renamed from: x1 */
    private hgg f33462x1;

    public ypz() {
        this.f33461k4 = new umg();
        this.f33462x1 = new hgg();
    }

    /* JADX INFO: renamed from: k4 */
    public final hgg m45082k4() {
        return this.f33462x1;
    }

    public ypz(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ypz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = ypz.f33460kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    ypz.this.f33461k4 = new umg(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    ypz.this.f33462x1 = new hgg(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("pc", str2, "http://schemas.microsoft.com/office/powerpoint/2013/main/command");
        this.f33461k4.mo6846k4("pc", c3059ii, "docMk");
        this.f33462x1.mo6846k4("pc", c3059ii, "sldMk");
        c3059ii.mo21898jd();
    }
}
