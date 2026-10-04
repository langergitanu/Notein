package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class uan extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f31092k4 = xry.m44612k4("visible");

    /* JADX INFO: renamed from: rv */
    private static final C7017h4 f31093rv = new C7017h4("visibility", "minimized", "showHorizontalScroll", "showVerticalScroll", "showSheetTabs", "xWindow", "yWindow", "windowWidth", "windowHeight", "tabRatio", "firstSheet", "activeTab", "autoFilterDateGrouping", "extLst");

    /* JADX INFO: renamed from: c5 */
    private long f31094c5;

    /* JADX INFO: renamed from: ck */
    private long f31095ck;

    /* JADX INFO: renamed from: du */
    private boolean f31096du;

    /* JADX INFO: renamed from: dy */
    private int f31097dy;

    /* JADX INFO: renamed from: fa */
    private long f31098fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f31099h4;

    /* JADX INFO: renamed from: jd */
    private long f31100jd;

    /* JADX INFO: renamed from: kk */
    private boolean f31101kk;

    /* JADX INFO: renamed from: ks */
    private g3j f31102ks;

    /* JADX INFO: renamed from: m9 */
    private int f31103m9;

    /* JADX INFO: renamed from: to */
    private boolean f31104to;

    /* JADX INFO: renamed from: up */
    private long f31105up;

    /* JADX INFO: renamed from: x1 */
    private int f31106x1;

    /* JADX INFO: renamed from: yj */
    private boolean f31107yj;

    public uan() {
        m42179x1();
    }

    public uan(final AbstractC13912i5 abstractC13912i5) {
        m42179x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.uan.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (uan.f31093rv.m27428k4(str)) {
                    case 0:
                        uan.this.f31106x1 = xry.m44612k4(str2);
                        break;
                    case 1:
                        uan.this.f31101kk = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        uan.this.f31104to = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        uan.this.f31096du = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        uan.this.f31099h4 = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        uan.this.f31103m9 = C13850af.m65151yj(str2);
                        break;
                    case 6:
                        uan.this.f31097dy = C13850af.m65151yj(str2);
                        break;
                    case 7:
                        uan.this.f31094c5 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 8:
                        uan.this.f31100jd = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 9:
                        uan.this.f31095ck = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 10:
                        uan.this.f31098fa = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 11:
                        uan.this.f31105up = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 12:
                        uan.this.f31107yj = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.uan.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (uan.f31093rv.m27428k4(abstractC13912i5.mo65023fa()) != 13) {
                    return false;
                }
                uan.this.f31102ks = new g3j(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m42179x1() {
        this.f31106x1 = f31092k4;
        this.f31101kk = false;
        this.f31104to = true;
        this.f31096du = true;
        this.f31099h4 = true;
        this.f31103m9 = 0;
        this.f31097dy = 0;
        this.f31094c5 = 4294967295L;
        this.f31100jd = 4294967295L;
        this.f31095ck = 600L;
        this.f31098fa = 0L;
        this.f31105up = 0L;
        this.f31107yj = true;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f31106x1;
        if (i != f31092k4) {
            c3059ii.m12955x1("visibility", xry.m44613k4(i));
        }
        boolean z = this.f31101kk;
        if (z) {
            c3059ii.m12955x1("minimized", z ? "1" : "0");
        }
        boolean z2 = this.f31104to;
        if (!z2) {
            c3059ii.m12955x1("showHorizontalScroll", z2 ? "1" : "0");
        }
        boolean z3 = this.f31096du;
        if (!z3) {
            c3059ii.m12955x1("showVerticalScroll", z3 ? "1" : "0");
        }
        boolean z4 = this.f31099h4;
        if (!z4) {
            c3059ii.m12955x1("showSheetTabs", z4 ? "1" : "0");
        }
        int i2 = this.f31103m9;
        if (i2 != 0) {
            c3059ii.m12955x1("xWindow", C13850af.m65103k4(i2));
        }
        int i3 = this.f31097dy;
        if (i3 != 0) {
            c3059ii.m12955x1("yWindow", C13850af.m65103k4(i3));
        }
        long j = this.f31094c5;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("windowWidth", C13850af.m65147x1(j));
        }
        long j2 = this.f31100jd;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("windowHeight", C13850af.m65147x1(j2));
        }
        long j3 = this.f31095ck;
        if ((j3 & 4294967295L) != 600) {
            c3059ii.m12955x1("tabRatio", C13850af.m65147x1(j3));
        }
        long j4 = this.f31098fa;
        if ((j4 & 4294967295L) != 0) {
            c3059ii.m12955x1("firstSheet", C13850af.m65147x1(j4));
        }
        long j5 = this.f31105up;
        if ((4294967295L & j5) != 0) {
            c3059ii.m12955x1("activeTab", C13850af.m65147x1(j5));
        }
        boolean z5 = this.f31107yj;
        if (!z5) {
            c3059ii.m12955x1("autoFilterDateGrouping", z5 ? "1" : "0");
        }
        g3j g3jVar = this.f31102ks;
        if (g3jVar != null) {
            g3jVar.mo6846k4("ssml", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
