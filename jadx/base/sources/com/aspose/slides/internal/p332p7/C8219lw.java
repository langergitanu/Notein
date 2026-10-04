package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.lw */
/* JADX INFO: loaded from: classes4.dex */
public class C8219lw extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f26557x1 = new C7017h4("m:val");

    /* JADX INFO: renamed from: k4 */
    private int f26558k4;

    public C8219lw() {
        m36478kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m36478kk() {
        this.f26558k4 = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m36480k4() {
        return this.f26558k4;
    }

    public C8219lw(AbstractC13912i5 abstractC13912i5) {
        m36478kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8219lw.f26557x1.m27428k4(str) != 0) {
                    return false;
                }
                C8219lw.this.f26558k4 = C7542e9.m30815k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36481k4(int i) {
        this.f26558k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("m:val", C7542e9.m30816k4(this.f26558k4));
        c3059ii.mo21898jd();
    }
}
