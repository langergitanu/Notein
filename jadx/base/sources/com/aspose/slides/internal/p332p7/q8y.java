package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class q8y extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f28787jd = new C7017h4("distT", "distB", "distL", "distR", "extent", "effectExtent", "docPr", "cNvGraphicFramePr", "graphic");

    /* JADX INFO: renamed from: c5 */
    private C7902i2 f28788c5;

    /* JADX INFO: renamed from: du */
    private C7258al f28789du;

    /* JADX INFO: renamed from: dy */
    private C8318n9 f28790dy;

    /* JADX INFO: renamed from: h4 */
    private foz f28791h4;

    /* JADX INFO: renamed from: k4 */
    private long f28792k4;

    /* JADX INFO: renamed from: kk */
    private long f28793kk;

    /* JADX INFO: renamed from: m9 */
    private C7632f3 f28794m9;

    /* JADX INFO: renamed from: to */
    private long f28795to;

    /* JADX INFO: renamed from: x1 */
    private long f28796x1;

    public q8y() {
        m39393x1();
        this.f28789du = new C7258al();
        this.f28794m9 = new C7632f3();
        this.f28788c5 = new C7902i2();
    }

    public q8y(final AbstractC13912i5 abstractC13912i5) {
        m39393x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.q8y.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = q8y.f28787jd.m27428k4(str);
                if (iM27428k4 == 0) {
                    q8y.this.f28792k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    q8y.this.f28796x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    q8y.this.f28793kk = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                q8y.this.f28795to = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.q8y.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (q8y.f28787jd.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 4:
                        q8y.this.f28789du = new C7258al(abstractC13912i5);
                        return true;
                    case 5:
                        q8y.this.f28791h4 = new foz(abstractC13912i5);
                        return true;
                    case 6:
                        q8y.this.f28794m9 = new C7632f3(abstractC13912i5);
                        return true;
                    case 7:
                        q8y.this.f28790dy = new C8318n9(abstractC13912i5);
                        return true;
                    case 8:
                        q8y.this.f28788c5 = new C7902i2(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m39393x1() {
        this.f28792k4 = 4294967295L;
        this.f28796x1 = 4294967295L;
        this.f28793kk = 4294967295L;
        this.f28795to = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f28792k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("distT", C13850af.m65147x1(j));
        }
        long j2 = this.f28796x1;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("distB", C13850af.m65147x1(j2));
        }
        long j3 = this.f28793kk;
        if ((j3 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("distL", C13850af.m65147x1(j3));
        }
        long j4 = this.f28795to;
        if ((j4 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("distR", C13850af.m65147x1(j4));
        }
        this.f28789du.mo6846k4("wp", c3059ii, "extent");
        foz fozVar = this.f28791h4;
        if (fozVar != null) {
            fozVar.mo6846k4("wp", c3059ii, "effectExtent");
        }
        this.f28794m9.mo6846k4("wp", c3059ii, "docPr");
        C8318n9 c8318n9 = this.f28790dy;
        if (c8318n9 != null) {
            c8318n9.mo6846k4("wp", c3059ii, "cNvGraphicFramePr");
        }
        this.f28788c5.mo6846k4("a", c3059ii, "graphic");
        c3059ii.mo21898jd();
    }
}
