package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes4.dex */
public class qy7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f29086k4 = C7927ig.m34093k4("normal");

    /* JADX INFO: renamed from: ks */
    private static final C7017h4 f29087ks = new C7017h4("t", "aca", "ref", "dt2D", "dtr", "del1", "del2", "r1", "r2", TranslateLanguage.CATALAN, "si", "bx");

    /* JADX INFO: renamed from: c5 */
    private String f29088c5;

    /* JADX INFO: renamed from: ck */
    private boolean f29089ck;

    /* JADX INFO: renamed from: du */
    private boolean f29090du;

    /* JADX INFO: renamed from: dy */
    private boolean f29091dy;

    /* JADX INFO: renamed from: fa */
    private long f29092fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f29093h4;

    /* JADX INFO: renamed from: jd */
    private String f29094jd;

    /* JADX INFO: renamed from: kk */
    private boolean f29095kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f29096m9;

    /* JADX INFO: renamed from: to */
    private String f29097to;

    /* JADX INFO: renamed from: up */
    private boolean f29098up;

    /* JADX INFO: renamed from: x1 */
    private int f29099x1;

    /* JADX INFO: renamed from: yj */
    private String f29100yj;

    public qy7() {
        m39774m9();
    }

    /* JADX INFO: renamed from: m9 */
    private void m39774m9() {
        this.f29099x1 = f29086k4;
        this.f29095kk = false;
        this.f29090du = false;
        this.f29093h4 = false;
        this.f29096m9 = false;
        this.f29091dy = false;
        this.f29089ck = false;
        this.f29092fa = 4294967295L;
        this.f29098up = false;
    }

    /* JADX INFO: renamed from: du */
    public final String m39779du() {
        return this.f29100yj;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m39780k4() {
        return this.f29099x1;
    }

    /* JADX INFO: renamed from: to */
    public final long m39786to() {
        return this.f29092fa;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m39787x1() {
        return this.f29097to;
    }

    public qy7(AbstractC13912i5 abstractC13912i5) {
        m39774m9();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.qy7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (qy7.f29087ks.m27428k4(str)) {
                    case 0:
                        qy7.this.f29099x1 = C7927ig.m34093k4(str2);
                        break;
                    case 1:
                        qy7.this.f29095kk = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        qy7.this.f29097to = str2;
                        break;
                    case 3:
                        qy7.this.f29090du = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        qy7.this.f29093h4 = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        qy7.this.f29096m9 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        qy7.this.f29091dy = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        qy7.this.f29088c5 = str2;
                        break;
                    case 8:
                        qy7.this.f29094jd = str2;
                        break;
                    case 9:
                        qy7.this.f29089ck = C13850af.m65068c5(str2);
                        break;
                    case 10:
                        qy7.this.f29092fa = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 11:
                        qy7.this.f29098up = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        abstractC13912i5.mo65026h4();
        this.f29100yj = abstractC13912i5.mo65042rv();
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m39785kk() {
        return this.f29089ck;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m39788x1(String str) {
        this.f29100yj = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39781k4(int i) {
        this.f29099x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39782k4(long j) {
        this.f29092fa = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39783k4(String str) {
        this.f29097to = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f29099x1;
        if (i != f29086k4) {
            c3059ii.m12955x1("t", C7927ig.m34094k4(i));
        }
        boolean z = this.f29095kk;
        if (z) {
            c3059ii.m12955x1("aca", z ? "1" : "0");
        }
        String str3 = this.f29097to;
        if (str3 != null) {
            c3059ii.m12955x1("ref", str3);
        }
        boolean z2 = this.f29090du;
        if (z2) {
            c3059ii.m12955x1("dt2D", z2 ? "1" : "0");
        }
        boolean z3 = this.f29093h4;
        if (z3) {
            c3059ii.m12955x1("dtr", z3 ? "1" : "0");
        }
        boolean z4 = this.f29096m9;
        if (z4) {
            c3059ii.m12955x1("del1", z4 ? "1" : "0");
        }
        boolean z5 = this.f29091dy;
        if (z5) {
            c3059ii.m12955x1("del2", z5 ? "1" : "0");
        }
        String str4 = this.f29088c5;
        if (str4 != null) {
            c3059ii.m12955x1("r1", str4);
        }
        String str5 = this.f29094jd;
        if (str5 != null) {
            c3059ii.m12955x1("r2", str5);
        }
        boolean z6 = this.f29089ck;
        if (z6) {
            c3059ii.m12955x1(TranslateLanguage.CATALAN, z6 ? "1" : "0");
        }
        long j = this.f29092fa;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("si", C13850af.m65147x1(j));
        }
        boolean z7 = this.f29098up;
        if (z7) {
            c3059ii.m12955x1("bx", z7 ? "1" : "0");
        }
        c3059ii.mo21918x1(this.f29100yj);
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39784k4(boolean z) {
        this.f29089ck = z;
    }
}
