package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class bnn extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final byte f20631k4 = C9317yw.m45190k4("vert");

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f20632to = new C7017h4("orient", "pos");

    /* JADX INFO: renamed from: kk */
    private double f20633kk;

    /* JADX INFO: renamed from: x1 */
    private byte f20634x1;

    public bnn() {
        m29004x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m29004x1() {
        this.f20634x1 = f20631k4;
        this.f20633kk = 0.0d;
    }

    public bnn(AbstractC13912i5 abstractC13912i5) {
        m29004x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bnn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = bnn.f20632to.m27428k4(str);
                if (iM27428k4 == 0) {
                    bnn.this.f20634x1 = C9317yw.m45190k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                bnn.this.f20633kk = C13850af.m65132uz(str2) / 12700.0d;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f20634x1;
        if (b != f20631k4) {
            c3059ii.m12955x1("orient", C9317yw.m45191k4(b));
        }
        double d = this.f20633kk;
        if (d != 0.0d) {
            c3059ii.m12955x1("pos", C22238OooO0oO.OooO00o(d, 12700.0d, 14));
        }
        c3059ii.mo21898jd();
    }
}
