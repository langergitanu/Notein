package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class dki extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f21690x1 = new C7017h4("val");

    /* JADX INFO: renamed from: k4 */
    private boolean f21691k4;

    public dki() {
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("p1710", str2, "http://schemas.microsoft.com/office/powerpoint/2017/10/main");
        c3059ii.m12955x1("val", this.f21691k4 ? "1" : "0");
        c3059ii.mo21898jd();
    }

    public dki(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dki.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (dki.f21690x1.m27428k4(str) != 0) {
                    return false;
                }
                dki.this.f21691k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m30395k4() {
        return this.f21691k4;
    }
}
