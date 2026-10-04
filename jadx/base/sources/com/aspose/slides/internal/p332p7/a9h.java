package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class a9h extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f19902kk = new C7017h4("st", "end");

    /* JADX INFO: renamed from: k4 */
    private long f19903k4;

    /* JADX INFO: renamed from: x1 */
    private long f19904x1;

    public a9h() {
    }

    /* JADX INFO: renamed from: k4 */
    public final long m28055k4() {
        return this.f19903k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m28057x1() {
        return this.f19904x1;
    }

    public a9h(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.a9h.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = a9h.f19902kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    a9h.this.f19903k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                a9h.this.f19904x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28056k4(long j) {
        this.f19903k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m28058x1(long j) {
        this.f19904x1 = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("st", C13850af.m65147x1(this.f19903k4));
        c3059ii.m12955x1("end", C13850af.m65147x1(this.f19904x1));
        c3059ii.mo21898jd();
    }
}
