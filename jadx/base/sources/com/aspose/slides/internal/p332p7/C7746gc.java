package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.gc */
/* JADX INFO: loaded from: classes4.dex */
public class C7746gc extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f23328kk = new C7017h4("geoDataEntityQuery", "geoData");

    /* JADX INFO: renamed from: k4 */
    private C8913u0 f23329k4;

    /* JADX INFO: renamed from: x1 */
    private C7389c8 f23330x1;

    public C7746gc() {
    }

    public C7746gc(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gc.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7746gc.f23328kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7746gc.this.f23329k4 = new C8913u0(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C7746gc.this.f23330x1 = new C7389c8(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8913u0 c8913u0 = this.f23329k4;
        if (c8913u0 != null) {
            c8913u0.mo6846k4("cx", c3059ii, "geoDataEntityQuery");
        }
        C7389c8 c7389c8 = this.f23330x1;
        if (c7389c8 != null) {
            c7389c8.mo6846k4("cx", c3059ii, "geoData");
        }
        c3059ii.mo21898jd();
    }
}
