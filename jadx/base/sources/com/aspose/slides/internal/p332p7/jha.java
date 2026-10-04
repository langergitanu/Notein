package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class jha extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f25131kk = new C7017h4("dxfId", "cellColor");

    /* JADX INFO: renamed from: k4 */
    private long f25132k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f25133x1;

    public jha() {
        m34702x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m34702x1() {
        this.f25132k4 = 4294967295L;
        this.f25133x1 = true;
    }

    public jha(AbstractC13912i5 abstractC13912i5) {
        m34702x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jha.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = jha.f25131kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    jha.this.f25132k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                jha.this.f25133x1 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f25132k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("dxfId", C13850af.m65147x1(j));
        }
        boolean z = this.f25133x1;
        if (!z) {
            c3059ii.m12955x1("cellColor", z ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
