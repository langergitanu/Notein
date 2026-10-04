package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes4.dex */
public class omh extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f28016k4 = izn.m34521k4("normal");

    /* JADX INFO: renamed from: rv */
    private static final C7017h4 f28017rv = new C7017h4("field", C18437z2.f56754h, "dataOnly", "labelOnly", "grandRow", "grandCol", "cacheIndex", "outline", "offset", "collapsedLevelsAreSubtotals", "axis", "fieldPosition", "references", "extLst");

    /* JADX INFO: renamed from: c5 */
    private boolean f28018c5;

    /* JADX INFO: renamed from: ck */
    private boolean f28019ck;

    /* JADX INFO: renamed from: du */
    private boolean f28020du;

    /* JADX INFO: renamed from: dy */
    private boolean f28021dy;

    /* JADX INFO: renamed from: fa */
    private int f28022fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f28023h4;

    /* JADX INFO: renamed from: jd */
    private String f28024jd;

    /* JADX INFO: renamed from: kk */
    private int f28025kk;

    /* JADX INFO: renamed from: ks */
    private g3j f28026ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f28027m9;

    /* JADX INFO: renamed from: to */
    private boolean f28028to;

    /* JADX INFO: renamed from: up */
    private long f28029up;

    /* JADX INFO: renamed from: x1 */
    private int f28030x1;

    /* JADX INFO: renamed from: yj */
    private jii f28031yj;

    public omh() {
        m38363x1();
    }

    public omh(final AbstractC13912i5 abstractC13912i5) {
        m38363x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.omh.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (omh.f28017rv.m27428k4(str)) {
                    case 0:
                        omh.this.f28030x1 = C13850af.m65151yj(str2);
                        break;
                    case 1:
                        omh.this.f28025kk = izn.m34521k4(str2);
                        break;
                    case 2:
                        omh.this.f28028to = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        omh.this.f28020du = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        omh.this.f28023h4 = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        omh.this.f28027m9 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        omh.this.f28021dy = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        omh.this.f28018c5 = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        omh.this.f28024jd = str2;
                        break;
                    case 9:
                        omh.this.f28019ck = C13850af.m65068c5(str2);
                        break;
                    case 10:
                        omh.this.f28022fa = o5d.m38012k4(str2);
                        break;
                    case 11:
                        omh.this.f28029up = AbstractC7361bz.m29295ne(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.omh.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = omh.f28017rv.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 12) {
                    omh.this.f28031yj = new jii(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 13) {
                    return false;
                }
                omh.this.f28026ks = new g3j(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m38363x1() {
        this.f28030x1 = 0;
        this.f28025kk = f28016k4;
        this.f28028to = true;
        this.f28020du = false;
        this.f28023h4 = false;
        this.f28027m9 = false;
        this.f28021dy = false;
        this.f28018c5 = true;
        this.f28019ck = false;
        this.f28022fa = 0;
        this.f28029up = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f28030x1;
        if (i != 0) {
            c3059ii.m12955x1("field", C13850af.m65103k4(i));
        }
        int i2 = this.f28025kk;
        if (i2 != f28016k4) {
            c3059ii.m12955x1(C18437z2.f56754h, izn.m34522k4(i2));
        }
        boolean z = this.f28028to;
        if (!z) {
            c3059ii.m12955x1("dataOnly", z ? "1" : "0");
        }
        boolean z2 = this.f28020du;
        if (z2) {
            c3059ii.m12955x1("labelOnly", z2 ? "1" : "0");
        }
        boolean z3 = this.f28023h4;
        if (z3) {
            c3059ii.m12955x1("grandRow", z3 ? "1" : "0");
        }
        boolean z4 = this.f28027m9;
        if (z4) {
            c3059ii.m12955x1("grandCol", z4 ? "1" : "0");
        }
        boolean z5 = this.f28021dy;
        if (z5) {
            c3059ii.m12955x1("cacheIndex", z5 ? "1" : "0");
        }
        boolean z6 = this.f28018c5;
        if (!z6) {
            c3059ii.m12955x1("outline", z6 ? "1" : "0");
        }
        String str3 = this.f28024jd;
        if (str3 != null) {
            c3059ii.m12955x1("offset", str3);
        }
        boolean z7 = this.f28019ck;
        if (z7) {
            c3059ii.m12955x1("collapsedLevelsAreSubtotals", z7 ? "1" : "0");
        }
        int i3 = this.f28022fa;
        if (i3 != 0) {
            c3059ii.m12955x1("axis", o5d.m38013k4(i3));
        }
        long j = this.f28029up;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("fieldPosition", C13850af.m65147x1(j));
        }
        jii jiiVar = this.f28031yj;
        if (jiiVar != null) {
            jiiVar.mo6846k4("ssml", c3059ii, "references");
        }
        g3j g3jVar = this.f28026ks;
        if (g3jVar != null) {
            g3jVar.mo6846k4("ssml", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
