package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes4.dex */
public class tsh extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f30855to = new C7017h4(C18437z2.f56754h, "size", "dxfId");

    /* JADX INFO: renamed from: k4 */
    private int f30856k4;

    /* JADX INFO: renamed from: kk */
    private long f30857kk;

    /* JADX INFO: renamed from: x1 */
    private long f30858x1;

    public tsh() {
        m41875x1();
    }

    public tsh(AbstractC13912i5 abstractC13912i5) {
        m41875x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.tsh.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = tsh.f30855to.m27428k4(str);
                if (iM27428k4 == 0) {
                    tsh.this.f30856k4 = ni1.m37568k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    tsh.this.f30858x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                tsh.this.f30857kk = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m41875x1() {
        this.f30856k4 = 0;
        this.f30858x1 = 1L;
        this.f30857kk = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1(C18437z2.f56754h, ni1.m37569k4(this.f30856k4));
        long j = this.f30858x1;
        if ((j & 4294967295L) != 1) {
            c3059ii.m12955x1("size", C13850af.m65147x1(j));
        }
        long j2 = this.f30857kk;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("dxfId", C13850af.m65147x1(j2));
        }
        c3059ii.mo21898jd();
    }
}
