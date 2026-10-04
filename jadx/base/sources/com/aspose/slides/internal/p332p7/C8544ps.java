package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ps */
/* JADX INFO: loaded from: classes4.dex */
public class C8544ps extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f28549x1 = new C7017h4("spid");

    /* JADX INFO: renamed from: k4 */
    private String f28550k4;

    public C8544ps() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m39095k4() {
        return this.f28550k4;
    }

    public C8544ps(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ps.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8544ps.f28549x1.m27428k4(str) != 0) {
                    return false;
                }
                C8544ps.this.f28550k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39096k4(String str) {
        this.f28550k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("com", str2, "http://schemas.openxmlformats.org/drawingml/2006/compatibility");
        c3059ii.m12955x1("spid", this.f28550k4);
        c3059ii.mo21898jd();
    }
}
