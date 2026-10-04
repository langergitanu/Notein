package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.mf */
/* JADX INFO: loaded from: classes4.dex */
public class C8260mf extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private double f26824c5;

    /* JADX INFO: renamed from: du */
    private String f26825du;

    /* JADX INFO: renamed from: dy */
    private double f26826dy;

    /* JADX INFO: renamed from: h4 */
    private int f26827h4;

    /* JADX INFO: renamed from: jd */
    private C8397nz f26828jd;

    /* JADX INFO: renamed from: kk */
    private int f26829kk;

    /* JADX INFO: renamed from: m9 */
    private double f26830m9;

    /* JADX INFO: renamed from: to */
    private int f26831to;

    /* JADX INFO: renamed from: k4 */
    public static final int f26822k4 = C8371nq.m37813k4("self");

    /* JADX INFO: renamed from: x1 */
    public static final int f26823x1 = C7318bf.m28867k4("all");

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f26821ck = new C7017h4(C18437z2.f56754h, "for", "forName", "ptType", "val", "fact", "max", "extLst");

    public C8260mf() {
        m36897dy();
    }

    /* JADX INFO: renamed from: dy */
    private void m36897dy() {
        this.f26829kk = -1;
        this.f26831to = f26822k4;
        this.f26825du = "";
        this.f26827h4 = f26823x1;
        this.f26830m9 = Double.NaN;
        this.f26826dy = Double.NaN;
        this.f26824c5 = Double.NaN;
    }

    /* JADX INFO: renamed from: du */
    public final double m36907du() {
        return this.f26830m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final double m36908h4() {
        return this.f26826dy;
    }

    /* JADX INFO: renamed from: to */
    public final int m36911to() {
        return this.f26827h4;
    }

    public C8260mf(final AbstractC13912i5 abstractC13912i5) {
        m36897dy();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.mf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C8260mf.f26821ck.m27428k4(str)) {
                    case 0:
                        C8260mf.this.f26829kk = C8914u1.m42062k4(str2);
                        break;
                    case 1:
                        C8260mf.this.f26831to = C8371nq.m37813k4(str2);
                        break;
                    case 2:
                        C8260mf.this.f26825du = str2;
                        break;
                    case 3:
                        C8260mf.this.f26827h4 = C7318bf.m28867k4(str2);
                        break;
                    case 4:
                        C8260mf.this.f26830m9 = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 5:
                        C8260mf.this.f26826dy = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 6:
                        C8260mf.this.f26824c5 = AbstractC7361bz.m29300yj(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.mf.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8260mf.f26821ck.m27428k4(abstractC13912i5.mo65023fa()) != 7) {
                    return false;
                }
                C8260mf.this.f26828jd = new C8397nz(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final int m36909k4() {
        return this.f26829kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m36912x1() {
        return this.f26831to;
    }

    /* JADX INFO: renamed from: kk */
    public final String m36910kk() {
        return this.f26825du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1(C18437z2.f56754h, C8914u1.m42063k4(this.f26829kk));
        int i = this.f26831to;
        if (i != f26822k4) {
            c3059ii.m12955x1("for", C8371nq.m37814k4(i));
        }
        if (!"".equals(this.f26825du)) {
            c3059ii.m12955x1("forName", this.f26825du);
        }
        int i2 = this.f26827h4;
        if (i2 != f26823x1) {
            c3059ii.m12955x1("ptType", C7318bf.m28868k4(i2));
        }
        if (!C14044b3.m66437kk(this.f26830m9)) {
            c3059ii.m12955x1("val", C13850af.m65101k4(this.f26830m9));
        }
        if (!C14044b3.m66437kk(this.f26826dy)) {
            c3059ii.m12955x1("fact", C13850af.m65101k4(this.f26826dy));
        }
        if (!C14044b3.m66437kk(this.f26824c5)) {
            c3059ii.m12955x1("max", C13850af.m65101k4(this.f26824c5));
        }
        C8397nz c8397nz = this.f26828jd;
        if (c8397nz != null) {
            c8397nz.mo6846k4("dgm", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
