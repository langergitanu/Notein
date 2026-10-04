package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class g2y extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private long f23185c5;

    /* JADX INFO: renamed from: du */
    private boolean f23186du;

    /* JADX INFO: renamed from: dy */
    private long f23187dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f23188h4;

    /* JADX INFO: renamed from: kk */
    private boolean f23189kk;

    /* JADX INFO: renamed from: m9 */
    private int f23190m9;

    /* JADX INFO: renamed from: to */
    private boolean f23191to;

    /* JADX INFO: renamed from: x1 */
    private boolean f23192x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f23184k4 = kiw.m35435k4("800x600");

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f23183jd = new C7017h4("css", "thicket", "longFileNames", "vml", "allowPng", "targetScreenSize", "dpi", "codePage");

    public g2y() {
        m32269x1();
    }

    public g2y(AbstractC13912i5 abstractC13912i5) {
        m32269x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.g2y.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (g2y.f23183jd.m27428k4(str)) {
                    case 0:
                        g2y.this.f23192x1 = C13850af.m65068c5(str2);
                        break;
                    case 1:
                        g2y.this.f23189kk = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        g2y.this.f23191to = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        g2y.this.f23186du = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        g2y.this.f23188h4 = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        g2y.this.f23190m9 = kiw.m35435k4(str2);
                        break;
                    case 6:
                        g2y.this.f23187dy = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 7:
                        g2y.this.f23185c5 = AbstractC7361bz.m29295ne(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m32269x1() {
        this.f23192x1 = true;
        this.f23189kk = true;
        this.f23191to = true;
        this.f23186du = false;
        this.f23188h4 = false;
        this.f23190m9 = f23184k4;
        this.f23187dy = 96L;
        this.f23185c5 = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f23192x1;
        if (!z) {
            c3059ii.m12955x1("css", z ? "1" : "0");
        }
        boolean z2 = this.f23189kk;
        if (!z2) {
            c3059ii.m12955x1("thicket", z2 ? "1" : "0");
        }
        boolean z3 = this.f23191to;
        if (!z3) {
            c3059ii.m12955x1("longFileNames", z3 ? "1" : "0");
        }
        boolean z4 = this.f23186du;
        if (z4) {
            c3059ii.m12955x1("vml", z4 ? "1" : "0");
        }
        boolean z5 = this.f23188h4;
        if (z5) {
            c3059ii.m12955x1("allowPng", z5 ? "1" : "0");
        }
        int i = this.f23190m9;
        if (i != f23184k4) {
            c3059ii.m12955x1("targetScreenSize", kiw.m35436k4(i));
        }
        long j = this.f23187dy;
        if ((j & 4294967295L) != 96) {
            c3059ii.m12955x1("dpi", C13850af.m65147x1(j));
        }
        long j2 = this.f23185c5;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("codePage", C13850af.m65147x1(j2));
        }
        c3059ii.mo21898jd();
    }
}
