package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes4.dex */
public class hof extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f24247kk = new C7017h4(C18437z2.f56754h, "lvl");

    /* JADX INFO: renamed from: k4 */
    private byte f24248k4;

    /* JADX INFO: renamed from: x1 */
    private long f24249x1;

    public hof() {
        m33554to();
    }

    /* JADX INFO: renamed from: to */
    private void m33554to() {
        this.f24248k4 = (byte) 0;
        this.f24249x1 = 0L;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m33555k4() {
        return this.f24248k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m33558x1() {
        return this.f24249x1;
    }

    public hof(AbstractC13912i5 abstractC13912i5) {
        m33554to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hof.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = hof.f24247kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    hof.this.f24248k4 = C7740ga.m32366k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                hof.this.f24249x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33556k4(byte b) {
        this.f24248k4 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33557k4(long j) {
        this.f24249x1 = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1(C18437z2.f56754h, C7740ga.m32367k4(this.f24248k4));
        long j = this.f24249x1;
        if ((4294967295L & j) != 0) {
            c3059ii.m12955x1("lvl", C13850af.m65147x1(j));
        }
        c3059ii.mo21898jd();
    }
}
