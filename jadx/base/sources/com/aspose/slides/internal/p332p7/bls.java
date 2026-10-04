package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class bls extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f20622kk = new C7017h4("chart:repeated", "chart:style-name");

    /* JADX INFO: renamed from: k4 */
    private long f20623k4;

    /* JADX INFO: renamed from: x1 */
    private String f20624x1;

    public bls() {
        m28991kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m28991kk() {
        this.f20623k4 = 4294967295L;
    }

    public bls(AbstractC13912i5 abstractC13912i5) {
        m28991kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bls.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = bls.f20622kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    bls.this.f20623k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                bls.this.f20624x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m28993k4() {
        return this.f20624x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f20623k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("chart:repeated", C13850af.m65147x1(j));
        }
        String str3 = this.f20624x1;
        if (str3 != null) {
            c3059ii.m12955x1("chart:style-name", str3);
        }
        c3059ii.mo21898jd();
    }
}
