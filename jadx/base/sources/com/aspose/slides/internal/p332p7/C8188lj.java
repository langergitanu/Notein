package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.lj */
/* JADX INFO: loaded from: classes4.dex */
public class C8188lj extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26341kk = new C7017h4("entityId", "geoChildTypes");

    /* JADX INFO: renamed from: k4 */
    private String f26342k4;

    /* JADX INFO: renamed from: x1 */
    private C8976ut f26343x1;

    public C8188lj() {
    }

    public C8188lj(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8188lj.f26341kk.m27428k4(str) != 0) {
                    return false;
                }
                C8188lj.this.f26342k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.lj.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8188lj.f26341kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                C8188lj.this.f26343x1 = new C8976ut(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("entityId", this.f26342k4);
        C8976ut c8976ut = this.f26343x1;
        if (c8976ut != null) {
            c8976ut.mo6846k4("cx", c3059ii, "geoChildTypes");
        }
        c3059ii.mo21898jd();
    }
}
