package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.za */
/* JADX INFO: loaded from: classes4.dex */
public class C9354za extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f33812kk = new C7017h4("SourceId");

    /* JADX INFO: renamed from: k4 */
    private String f33813k4;

    /* JADX INFO: renamed from: x1 */
    private String f33814x1;

    public C9354za() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m45528k4() {
        return this.f33813k4;
    }

    public C9354za(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.za.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C9354za.f33812kk.m27428k4(str) != 0) {
                    return false;
                }
                C9354za.this.f33813k4 = str2;
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        abstractC13912i5.mo65026h4();
        this.f33814x1 = abstractC13912i5.mo65042rv();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45529k4(String str) {
        this.f33813k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("mdssi", str2, "http://schemas.openxmlformats.org/package/2006/digital-signature");
        c3059ii.m12955x1("SourceId", this.f33813k4);
        c3059ii.mo21918x1(this.f33814x1);
        c3059ii.mo21898jd();
    }
}
