package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class wr8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f32493x1 = new C7017h4("restart");

    /* JADX INFO: renamed from: k4 */
    private long f32494k4;

    public wr8() {
        m43915x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m43915x1() {
        this.f32494k4 = 300000L;
    }

    public wr8(AbstractC13912i5 abstractC13912i5) {
        m43915x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wr8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (wr8.f32493x1.m27428k4(str) != 0) {
                    return false;
                }
                wr8.this.f32494k4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f32494k4;
        if ((4294967295L & j) != 300000) {
            c3059ii.m12955x1("restart", C13850af.m65147x1(j));
        }
        c3059ii.mo21898jd();
    }
}
