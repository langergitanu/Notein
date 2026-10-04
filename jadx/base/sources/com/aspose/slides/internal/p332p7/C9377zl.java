package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.zl */
/* JADX INFO: loaded from: classes4.dex */
public class C9377zl extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f33931x1 = new C7017h4("geoLocation");

    /* JADX INFO: renamed from: k4 */
    private C7824h6 f33932k4;

    public C9377zl() {
    }

    public C9377zl(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.zl.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C9377zl.f33931x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C9377zl.this.f33932k4 = new C7824h6(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7824h6 c7824h6 = this.f33932k4;
        if (c7824h6 != null) {
            c7824h6.mo6846k4("cx", c3059ii, "geoLocation");
        }
        c3059ii.mo21898jd();
    }
}
