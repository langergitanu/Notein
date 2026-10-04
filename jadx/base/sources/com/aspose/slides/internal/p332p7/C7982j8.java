package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.j8 */
/* JADX INFO: loaded from: classes4.dex */
public class C7982j8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f25044kk = new C7017h4("id", "idx");

    /* JADX INFO: renamed from: k4 */
    private long f25045k4;

    /* JADX INFO: renamed from: x1 */
    private long f25046x1;

    public C7982j8() {
    }

    /* JADX INFO: renamed from: k4 */
    public final long m34596k4() {
        return this.f25045k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m34598x1() {
        return this.f25046x1;
    }

    public C7982j8(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.j8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7982j8.f25044kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7982j8.this.f25045k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C7982j8.this.f25046x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34597k4(long j) {
        this.f25045k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m34599x1(long j) {
        this.f25046x1 = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("id", C13850af.m65147x1(this.f25045k4));
        c3059ii.m12955x1("idx", C13850af.m65147x1(this.f25046x1));
        c3059ii.mo21898jd();
    }
}
