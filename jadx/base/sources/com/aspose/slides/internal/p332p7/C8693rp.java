package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.rp */
/* JADX INFO: loaded from: classes4.dex */
public class C8693rp extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f29396kk = new C7017h4(C18437z2.f56754h, "startAt");

    /* JADX INFO: renamed from: k4 */
    private byte f29397k4;

    /* JADX INFO: renamed from: x1 */
    private int f29398x1;

    public C8693rp() {
        m40106to();
    }

    /* JADX INFO: renamed from: to */
    private void m40106to() {
        this.f29397k4 = (byte) 3;
        this.f29398x1 = 1;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m40107k4() {
        return this.f29397k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m40110x1() {
        return this.f29398x1;
    }

    public C8693rp(AbstractC13912i5 abstractC13912i5) {
        m40106to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.rp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8693rp.f29396kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8693rp.this.f29397k4 = C8520ph.m38901k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8693rp.this.f29398x1 = C13850af.m65151yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40108k4(byte b) {
        this.f29397k4 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40109k4(int i) {
        this.f29398x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1(C18437z2.f56754h, C8520ph.m38902k4(this.f29397k4));
        int i = this.f29398x1;
        if (i != 1) {
            c3059ii.m12955x1("startAt", C13850af.m65103k4(i));
        }
        c3059ii.mo21898jd();
    }
}
