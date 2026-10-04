package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.uv */
/* JADX INFO: loaded from: classes4.dex */
public class C8981uv extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31440kk = new C7017h4("geoLocationQuery", "geoLocations");

    /* JADX INFO: renamed from: k4 */
    private C7673fl f31441k4;

    /* JADX INFO: renamed from: x1 */
    private C9377zl f31442x1;

    public C8981uv() {
    }

    public C8981uv(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.uv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8981uv.f31440kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8981uv.this.f31441k4 = new C7673fl(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C8981uv.this.f31442x1 = new C9377zl(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7673fl c7673fl = this.f31441k4;
        if (c7673fl != null) {
            c7673fl.mo6846k4("cx", c3059ii, "geoLocationQuery");
        }
        C9377zl c9377zl = this.f31442x1;
        if (c9377zl != null) {
            c9377zl.mo6846k4("cx", c3059ii, "geoLocations");
        }
        c3059ii.mo21898jd();
    }
}
