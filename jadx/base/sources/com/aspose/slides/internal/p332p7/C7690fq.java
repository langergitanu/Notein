package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.fq */
/* JADX INFO: loaded from: classes4.dex */
public class C7690fq extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f22973k4 = C8479ow.m38490k4("one");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f22974kk = new C7017h4("val");

    /* JADX INFO: renamed from: x1 */
    private int f22975x1;

    public C7690fq() {
        m31989kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m31989kk() {
        this.f22975x1 = f22973k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m31991k4() {
        return this.f22975x1;
    }

    public C7690fq(AbstractC13912i5 abstractC13912i5) {
        m31989kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.fq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7690fq.f22974kk.m27428k4(str) != 0) {
                    return false;
                }
                C7690fq.this.f22975x1 = C8479ow.m38490k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f22975x1;
        if (i != f22973k4) {
            c3059ii.m12955x1("val", C8479ow.m38491k4(i));
        }
        c3059ii.mo21898jd();
    }
}
