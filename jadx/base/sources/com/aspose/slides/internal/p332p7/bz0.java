package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class bz0 extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f20803h4 = new C7017h4("auto", "indexed", "rgb", "theme", "tint");

    /* JADX INFO: renamed from: du */
    private double f20804du;

    /* JADX INFO: renamed from: k4 */
    private byte f20805k4;

    /* JADX INFO: renamed from: kk */
    private long f20806kk;

    /* JADX INFO: renamed from: to */
    private long f20807to;

    /* JADX INFO: renamed from: x1 */
    private long f20808x1;

    public bz0() {
        m29309x1();
    }

    public bz0(AbstractC13912i5 abstractC13912i5) {
        m29309x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bz0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = bz0.f20803h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    bz0.this.f20805k4 = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    bz0.this.f20808x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    bz0.this.f20806kk = C14114y9.m67457k4(str2, 515);
                    return true;
                }
                if (iM27428k4 == 3) {
                    bz0.this.f20807to = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                bz0.this.f20804du = AbstractC7361bz.m29300yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m29309x1() {
        this.f20805k4 = (byte) -1;
        this.f20808x1 = 4294967295L;
        this.f20806kk = 4294967295L;
        this.f20807to = 4294967295L;
        this.f20804du = 0.0d;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f20805k4;
        if (b != -1) {
            c3059ii.m12955x1("auto", b == 1 ? "1" : "0");
        }
        long j = this.f20808x1;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("indexed", C13850af.m65147x1(j));
        }
        long j2 = this.f20806kk;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("rgb", C14114y9.m67460k4(j2 & 4294967295L, "X8"));
        }
        long j3 = this.f20807to;
        if ((j3 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("theme", C13850af.m65147x1(j3));
        }
        double d = this.f20804du;
        if (d != 0.0d) {
            c3059ii.m12955x1("tint", C13850af.m65101k4(d));
        }
        c3059ii.mo21898jd();
    }
}
