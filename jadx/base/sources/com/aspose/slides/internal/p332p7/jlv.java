package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class jlv extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f25235jd = new C7017h4("baseColWidth", "defaultColWidth", "defaultRowHeight", "customHeight", "zeroHeight", "thickTop", "thickBottom", "outlineLevelRow", "outlineLevelCol");

    /* JADX INFO: renamed from: c5 */
    private byte f25236c5;

    /* JADX INFO: renamed from: du */
    private boolean f25237du;

    /* JADX INFO: renamed from: dy */
    private byte f25238dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f25239h4;

    /* JADX INFO: renamed from: k4 */
    private long f25240k4;

    /* JADX INFO: renamed from: kk */
    private double f25241kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f25242m9;

    /* JADX INFO: renamed from: to */
    private boolean f25243to;

    /* JADX INFO: renamed from: x1 */
    private double f25244x1;

    public jlv() {
        m34821x1();
    }

    public jlv(AbstractC13912i5 abstractC13912i5) {
        m34821x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jlv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (jlv.f25235jd.m27428k4(str)) {
                    case 0:
                        jlv.this.f25240k4 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 1:
                        jlv.this.f25244x1 = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 2:
                        jlv.this.f25241kk = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 3:
                        jlv.this.f25243to = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        jlv.this.f25237du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        jlv.this.f25239h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        jlv.this.f25242m9 = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        jlv.this.f25238dy = C13850af.m65126rv(str2);
                        break;
                    case 8:
                        jlv.this.f25236c5 = C13850af.m65126rv(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m34821x1() {
        this.f25240k4 = 8L;
        this.f25244x1 = Double.NaN;
        this.f25241kk = Double.NaN;
        this.f25243to = false;
        this.f25237du = false;
        this.f25239h4 = false;
        this.f25242m9 = false;
        this.f25238dy = (byte) 0;
        this.f25236c5 = (byte) 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f25240k4;
        if ((4294967295L & j) != 8) {
            c3059ii.m12955x1("baseColWidth", C13850af.m65147x1(j));
        }
        if (!C14044b3.m66437kk(this.f25244x1)) {
            c3059ii.m12955x1("defaultColWidth", C13850af.m65101k4(this.f25244x1));
        }
        c3059ii.m12955x1("defaultRowHeight", C13850af.m65101k4(this.f25241kk));
        boolean z = this.f25243to;
        if (z) {
            c3059ii.m12955x1("customHeight", z ? "1" : "0");
        }
        boolean z2 = this.f25237du;
        if (z2) {
            c3059ii.m12955x1("zeroHeight", z2 ? "1" : "0");
        }
        boolean z3 = this.f25239h4;
        if (z3) {
            c3059ii.m12955x1("thickTop", z3 ? "1" : "0");
        }
        boolean z4 = this.f25242m9;
        if (z4) {
            c3059ii.m12955x1("thickBottom", z4 ? "1" : "0");
        }
        byte b = this.f25238dy;
        if ((b & 255) != 0) {
            c3059ii.m12955x1("outlineLevelRow", C13850af.m65145x1(b));
        }
        byte b2 = this.f25236c5;
        if ((b2 & 255) != 0) {
            c3059ii.m12955x1("outlineLevelCol", C13850af.m65145x1(b2));
        }
        c3059ii.mo21898jd();
    }
}
