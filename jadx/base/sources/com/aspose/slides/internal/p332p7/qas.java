package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class qas extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f28821h4 = new C7017h4("r", "deleted", "undone", "val", "numFmtId");

    /* JADX INFO: renamed from: du */
    private long f28822du;

    /* JADX INFO: renamed from: k4 */
    private String f28823k4;

    /* JADX INFO: renamed from: kk */
    private boolean f28824kk;

    /* JADX INFO: renamed from: to */
    private String f28825to;

    /* JADX INFO: renamed from: x1 */
    private boolean f28826x1;

    public qas() {
        m39424x1();
    }

    public qas(AbstractC13912i5 abstractC13912i5) {
        m39424x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.qas.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = qas.f28821h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    qas.this.f28823k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    qas.this.f28826x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    qas.this.f28824kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    qas.this.f28825to = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                qas.this.f28822du = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m39424x1() {
        this.f28826x1 = false;
        this.f28824kk = false;
        this.f28822du = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("r", this.f28823k4);
        boolean z = this.f28826x1;
        if (z) {
            c3059ii.m12955x1("deleted", z ? "1" : "0");
        }
        boolean z2 = this.f28824kk;
        if (z2) {
            c3059ii.m12955x1("undone", z2 ? "1" : "0");
        }
        c3059ii.m12955x1("val", this.f28825to);
        long j = this.f28822du;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("numFmtId", C13850af.m65147x1(j));
        }
        c3059ii.mo21898jd();
    }
}
