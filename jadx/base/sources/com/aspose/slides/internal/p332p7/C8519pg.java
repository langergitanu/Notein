package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.pg */
/* JADX INFO: loaded from: classes4.dex */
public class C8519pg extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f28405x1 = new C7017h4("val");

    /* JADX INFO: renamed from: k4 */
    private int f28406k4;

    public C8519pg() {
        m38895kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m38895kk() {
        this.f28406k4 = -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m38897k4() {
        return this.f28406k4;
    }

    public C8519pg(AbstractC13912i5 abstractC13912i5) {
        m38895kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.pg.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8519pg.f28405x1.m27428k4(str) != 0) {
                    return false;
                }
                C8519pg.this.f28406k4 = C9297yn.m45063k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38898k4(int i) {
        this.f28406k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("val", C9297yn.m45064k4(this.f28406k4));
        c3059ii.mo21898jd();
    }
}
