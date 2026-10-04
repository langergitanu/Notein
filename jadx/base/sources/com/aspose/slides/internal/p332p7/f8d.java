package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class f8d extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f22713to = new C7017h4("distT", "distB", "effectExtent");

    /* JADX INFO: renamed from: k4 */
    private long f22714k4;

    /* JADX INFO: renamed from: kk */
    private foz f22715kk;

    /* JADX INFO: renamed from: x1 */
    private long f22716x1;

    public f8d() {
        m31665x1();
    }

    public f8d(final AbstractC13912i5 abstractC13912i5) {
        m31665x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.f8d.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = f8d.f22713to.m27428k4(str);
                if (iM27428k4 == 0) {
                    f8d.this.f22714k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                f8d.this.f22716x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.f8d.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (f8d.f22713to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                f8d.this.f22715kk = new foz(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m31665x1() {
        this.f22714k4 = 4294967295L;
        this.f22716x1 = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f22714k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("distT", C13850af.m65147x1(j));
        }
        long j2 = this.f22716x1;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("distB", C13850af.m65147x1(j2));
        }
        foz fozVar = this.f22715kk;
        if (fozVar != null) {
            fozVar.mo6846k4("wp", c3059ii, "effectExtent");
        }
        c3059ii.mo21898jd();
    }
}
