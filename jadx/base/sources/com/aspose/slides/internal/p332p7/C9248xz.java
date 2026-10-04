package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.xz */
/* JADX INFO: loaded from: classes4.dex */
public class C9248xz extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f33159kk = new C7017h4("script", "typeface");

    /* JADX INFO: renamed from: k4 */
    private String f33160k4;

    /* JADX INFO: renamed from: x1 */
    private String f33161x1;

    public C9248xz() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m44754k4() {
        return this.f33160k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m44756x1() {
        return this.f33161x1;
    }

    public C9248xz(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.xz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9248xz.f33159kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9248xz.this.f33160k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C9248xz.this.f33161x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44755k4(String str) {
        this.f33160k4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m44757x1(String str) {
        this.f33161x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("script", this.f33160k4);
        c3059ii.m12955x1("typeface", this.f33161x1);
        c3059ii.mo21898jd();
    }
}
