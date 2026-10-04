package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.pv */
/* JADX INFO: loaded from: classes4.dex */
public class C8551pv extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private int f28592c5;

    /* JADX INFO: renamed from: du */
    private boolean f28593du;

    /* JADX INFO: renamed from: dy */
    private int f28594dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f28595h4;

    /* JADX INFO: renamed from: jd */
    private long f28596jd;

    /* JADX INFO: renamed from: kk */
    private long f28597kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f28598m9;

    /* JADX INFO: renamed from: to */
    private int f28599to;

    /* JADX INFO: renamed from: x1 */
    private long f28600x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f28591k4 = C9072vx.m43334k4("default");

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f28590ck = new C7017h4("paperSize", "firstPageNumber", "orientation", "blackAndWhite", "draft", "useFirstPageNumber", "horizontalDpi", "verticalDpi", "copies");

    public C8551pv() {
        m39151x1();
    }

    public C8551pv(AbstractC13912i5 abstractC13912i5) {
        m39151x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.pv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C8551pv.f28590ck.m27428k4(str)) {
                    case 0:
                        C8551pv.this.f28600x1 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 1:
                        C8551pv.this.f28597kk = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 2:
                        C8551pv.this.f28599to = C9072vx.m43334k4(str2);
                        break;
                    case 3:
                        C8551pv.this.f28593du = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        C8551pv.this.f28595h4 = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        C8551pv.this.f28598m9 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        C8551pv.this.f28594dy = C13850af.m65151yj(str2);
                        break;
                    case 7:
                        C8551pv.this.f28592c5 = C13850af.m65151yj(str2);
                        break;
                    case 8:
                        C8551pv.this.f28596jd = AbstractC7361bz.m29295ne(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m39151x1() {
        this.f28600x1 = 1L;
        this.f28597kk = 1L;
        this.f28599to = f28591k4;
        this.f28593du = false;
        this.f28595h4 = false;
        this.f28598m9 = false;
        this.f28594dy = 600;
        this.f28592c5 = 600;
        this.f28596jd = 1L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f28600x1;
        if ((j & 4294967295L) != 1) {
            c3059ii.m12955x1("paperSize", C13850af.m65147x1(j));
        }
        long j2 = this.f28597kk;
        if ((j2 & 4294967295L) != 1) {
            c3059ii.m12955x1("firstPageNumber", C13850af.m65147x1(j2));
        }
        int i = this.f28599to;
        if (i != f28591k4) {
            c3059ii.m12955x1("orientation", C9072vx.m43335k4(i));
        }
        boolean z = this.f28593du;
        if (z) {
            c3059ii.m12955x1("blackAndWhite", z ? "1" : "0");
        }
        boolean z2 = this.f28595h4;
        if (z2) {
            c3059ii.m12955x1("draft", z2 ? "1" : "0");
        }
        boolean z3 = this.f28598m9;
        if (z3) {
            c3059ii.m12955x1("useFirstPageNumber", z3 ? "1" : "0");
        }
        int i2 = this.f28594dy;
        if (i2 != 600) {
            c3059ii.m12955x1("horizontalDpi", C13850af.m65103k4(i2));
        }
        int i3 = this.f28592c5;
        if (i3 != 600) {
            c3059ii.m12955x1("verticalDpi", C13850af.m65103k4(i3));
        }
        long j3 = this.f28596jd;
        if ((4294967295L & j3) != 1) {
            c3059ii.m12955x1("copies", C13850af.m65147x1(j3));
        }
        c3059ii.mo21898jd();
    }
}
