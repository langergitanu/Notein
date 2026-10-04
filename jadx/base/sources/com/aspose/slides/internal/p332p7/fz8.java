package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class fz8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f23131ck = new C7017h4("min", "max", "width", "style", "hidden", "bestFit", "customWidth", "phonetic", "outlineLevel", "collapsed");

    /* JADX INFO: renamed from: c5 */
    private byte f23132c5;

    /* JADX INFO: renamed from: du */
    private boolean f23133du;

    /* JADX INFO: renamed from: dy */
    private boolean f23134dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f23135h4;

    /* JADX INFO: renamed from: jd */
    private boolean f23136jd;

    /* JADX INFO: renamed from: k4 */
    private long f23137k4;

    /* JADX INFO: renamed from: kk */
    private double f23138kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f23139m9;

    /* JADX INFO: renamed from: to */
    private long f23140to;

    /* JADX INFO: renamed from: x1 */
    private long f23141x1;

    public fz8() {
        m32183du();
    }

    /* JADX INFO: renamed from: du */
    private void m32183du() {
        this.f23138kk = Double.NaN;
        this.f23140to = 0L;
        this.f23133du = false;
        this.f23135h4 = false;
        this.f23139m9 = false;
        this.f23134dy = false;
        this.f23132c5 = (byte) 0;
        this.f23136jd = false;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m32197x1() {
        return this.f23141x1;
    }

    public fz8(AbstractC13912i5 abstractC13912i5) {
        m32183du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.fz8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (fz8.f23131ck.m27428k4(str)) {
                    case 0:
                        fz8.this.f23137k4 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 1:
                        fz8.this.f23141x1 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 2:
                        fz8.this.f23138kk = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 3:
                        fz8.this.f23140to = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 4:
                        fz8.this.f23133du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        fz8.this.f23135h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        fz8.this.f23139m9 = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        fz8.this.f23134dy = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        fz8.this.f23132c5 = C13850af.m65126rv(str2);
                        break;
                    case 9:
                        fz8.this.f23136jd = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m32196kk() {
        return this.f23133du;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m32195k4() {
        return this.f23137k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("min", C13850af.m65147x1(this.f23137k4));
        c3059ii.m12955x1("max", C13850af.m65147x1(this.f23141x1));
        if (!C14044b3.m66437kk(this.f23138kk)) {
            c3059ii.m12955x1("width", C13850af.m65101k4(this.f23138kk));
        }
        long j = this.f23140to;
        if ((4294967295L & j) != 0) {
            c3059ii.m12955x1("style", C13850af.m65147x1(j));
        }
        boolean z = this.f23133du;
        if (z) {
            c3059ii.m12955x1("hidden", z ? "1" : "0");
        }
        boolean z2 = this.f23135h4;
        if (z2) {
            c3059ii.m12955x1("bestFit", z2 ? "1" : "0");
        }
        boolean z3 = this.f23139m9;
        if (z3) {
            c3059ii.m12955x1("customWidth", z3 ? "1" : "0");
        }
        boolean z4 = this.f23134dy;
        if (z4) {
            c3059ii.m12955x1("phonetic", z4 ? "1" : "0");
        }
        byte b = this.f23132c5;
        if ((b & 255) != 0) {
            c3059ii.m12955x1("outlineLevel", C13850af.m65145x1(b));
        }
        boolean z5 = this.f23136jd;
        if (z5) {
            c3059ii.m12955x1("collapsed", z5 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
