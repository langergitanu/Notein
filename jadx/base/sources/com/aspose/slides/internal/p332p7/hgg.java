package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class hgg extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f24063kk = new C7017h4("cId", "sldId");

    /* JADX INFO: renamed from: k4 */
    private long f24064k4;

    /* JADX INFO: renamed from: x1 */
    private long f24065x1;

    public hgg() {
        m33327x1();
    }

    public hgg(AbstractC13912i5 abstractC13912i5) {
        m33327x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hgg.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = hgg.f24063kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    hgg.this.f24064k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                hgg.this.f24065x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m33327x1() {
        this.f24064k4 = 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33328k4(long j) {
        this.f24064k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m33329x1(long j) {
        this.f24065x1 = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("pc", str2, "http://schemas.microsoft.com/office/powerpoint/2013/main/command");
        long j = this.f24064k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("cId", C13850af.m65147x1(j));
        }
        c3059ii.m12955x1("sldId", C13850af.m65147x1(this.f24065x1));
        c3059ii.mo21898jd();
    }
}
