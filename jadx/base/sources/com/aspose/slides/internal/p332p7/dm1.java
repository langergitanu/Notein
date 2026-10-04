package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class dm1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private double f21707c5;

    /* JADX INFO: renamed from: ck */
    private boolean f21708ck;

    /* JADX INFO: renamed from: du */
    private boolean f21709du;

    /* JADX INFO: renamed from: dy */
    private long f21710dy;

    /* JADX INFO: renamed from: fa */
    private boolean f21711fa;

    /* JADX INFO: renamed from: h4 */
    private int f21712h4;

    /* JADX INFO: renamed from: jd */
    private boolean f21713jd;

    /* JADX INFO: renamed from: kk */
    private long f21714kk;

    /* JADX INFO: renamed from: ks */
    private byte f21715ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f21716m9;

    /* JADX INFO: renamed from: to */
    private int f21717to;

    /* JADX INFO: renamed from: up */
    private boolean f21718up;

    /* JADX INFO: renamed from: yj */
    private long f21719yj;

    /* JADX INFO: renamed from: k4 */
    public static final int f21704k4 = ike.m34192k4("auto");

    /* JADX INFO: renamed from: x1 */
    public static final int f21706x1 = hib.m33446k4("A1");

    /* JADX INFO: renamed from: rv */
    private static final C7017h4 f21705rv = new C7017h4("calcId", "calcMode", "fullCalcOnLoad", "refMode", "iterate", "iterateCount", "iterateDelta", "fullPrecision", "calcCompleted", "calcOnSave", "concurrentCalc", "concurrentManualCount", "forceFullCalc");

    public dm1() {
        m30422x1();
    }

    public dm1(AbstractC13912i5 abstractC13912i5) {
        m30422x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dm1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (dm1.f21705rv.m27428k4(str)) {
                    case 0:
                        dm1.this.f21714kk = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 1:
                        dm1.this.f21717to = ike.m34192k4(str2);
                        break;
                    case 2:
                        dm1.this.f21709du = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        dm1.this.f21712h4 = hib.m33446k4(str2);
                        break;
                    case 4:
                        dm1.this.f21716m9 = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        dm1.this.f21710dy = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 6:
                        dm1.this.f21707c5 = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 7:
                        dm1.this.f21713jd = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        dm1.this.f21708ck = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        dm1.this.f21711fa = C13850af.m65068c5(str2);
                        break;
                    case 10:
                        dm1.this.f21718up = C13850af.m65068c5(str2);
                        break;
                    case 11:
                        dm1.this.f21719yj = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 12:
                        dm1.this.f21715ks = AbstractC7361bz.m29296rv(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m30422x1() {
        this.f21714kk = 4294967295L;
        this.f21717to = f21704k4;
        this.f21709du = false;
        this.f21712h4 = f21706x1;
        this.f21716m9 = false;
        this.f21710dy = 100L;
        this.f21707c5 = 0.001d;
        this.f21713jd = true;
        this.f21708ck = true;
        this.f21711fa = true;
        this.f21718up = true;
        this.f21719yj = 4294967295L;
        this.f21715ks = (byte) -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f21714kk;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("calcId", C13850af.m65147x1(j));
        }
        int i = this.f21717to;
        if (i != f21704k4) {
            c3059ii.m12955x1("calcMode", ike.m34193k4(i));
        }
        boolean z = this.f21709du;
        if (z) {
            c3059ii.m12955x1("fullCalcOnLoad", z ? "1" : "0");
        }
        int i2 = this.f21712h4;
        if (i2 != f21706x1) {
            c3059ii.m12955x1("refMode", hib.m33447k4(i2));
        }
        boolean z2 = this.f21716m9;
        if (z2) {
            c3059ii.m12955x1("iterate", z2 ? "1" : "0");
        }
        long j2 = this.f21710dy;
        if ((j2 & 4294967295L) != 100) {
            c3059ii.m12955x1("iterateCount", C13850af.m65147x1(j2));
        }
        double d = this.f21707c5;
        if (d != 0.001d) {
            c3059ii.m12955x1("iterateDelta", C13850af.m65101k4(d));
        }
        boolean z3 = this.f21713jd;
        if (!z3) {
            c3059ii.m12955x1("fullPrecision", z3 ? "1" : "0");
        }
        boolean z4 = this.f21708ck;
        if (!z4) {
            c3059ii.m12955x1("calcCompleted", z4 ? "1" : "0");
        }
        boolean z5 = this.f21711fa;
        if (!z5) {
            c3059ii.m12955x1("calcOnSave", z5 ? "1" : "0");
        }
        boolean z6 = this.f21718up;
        if (!z6) {
            c3059ii.m12955x1("concurrentCalc", z6 ? "1" : "0");
        }
        long j3 = this.f21719yj;
        if ((j3 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("concurrentManualCount", C13850af.m65147x1(j3));
        }
        byte b = this.f21715ks;
        if (b != -1) {
            c3059ii.m12955x1("forceFullCalc", b == 1 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
