package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.hi */
/* JADX INFO: loaded from: classes4.dex */
public class C7855hi extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f24146dy = new C7017h4("axis", "ptType", "hideLastTrans", "st", "cnt", "step", "extLst");

    /* JADX INFO: renamed from: du */
    private String f24147du;

    /* JADX INFO: renamed from: h4 */
    private String f24148h4;

    /* JADX INFO: renamed from: k4 */
    private String f24149k4;

    /* JADX INFO: renamed from: kk */
    private String f24150kk;

    /* JADX INFO: renamed from: m9 */
    private C8397nz f24151m9;

    /* JADX INFO: renamed from: to */
    private String f24152to;

    /* JADX INFO: renamed from: x1 */
    private String f24153x1;

    public C7855hi() {
        m33427dy();
    }

    /* JADX INFO: renamed from: dy */
    private void m33427dy() {
        this.f24149k4 = "none";
        this.f24153x1 = "all";
        this.f24150kk = TelemetryEventStrings.Value.TRUE;
        this.f24152to = "1";
        this.f24147du = "0";
        this.f24148h4 = "1";
    }

    /* JADX INFO: renamed from: du */
    public final String m33435du() {
        return this.f24147du;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m33436h4() {
        return this.f24148h4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m33439kk() {
        return this.f24150kk;
    }

    /* JADX INFO: renamed from: to */
    public final String m33440to() {
        return this.f24152to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m33441x1() {
        return this.f24153x1;
    }

    public C7855hi(final AbstractC13912i5 abstractC13912i5) {
        m33427dy();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hi.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7855hi.f24146dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7855hi.this.f24149k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7855hi.this.f24153x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C7855hi.this.f24150kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    C7855hi.this.f24152to = str2;
                    return true;
                }
                if (iM27428k4 == 4) {
                    C7855hi.this.f24147du = str2;
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                C7855hi.this.f24148h4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.hi.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7855hi.f24146dy.m27428k4(abstractC13912i5.mo65023fa()) != 6) {
                    return false;
                }
                C7855hi.this.f24151m9 = new C8397nz(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m33437k4() {
        return this.f24149k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33438k4(String str) {
        this.f24149k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!"none".equals(this.f24149k4)) {
            c3059ii.m12955x1("axis", this.f24149k4);
        }
        if (!"all".equals(this.f24153x1)) {
            c3059ii.m12955x1("ptType", this.f24153x1);
        }
        if (!TelemetryEventStrings.Value.TRUE.equals(this.f24150kk)) {
            c3059ii.m12955x1("hideLastTrans", this.f24150kk);
        }
        if (!"1".equals(this.f24152to)) {
            c3059ii.m12955x1("st", this.f24152to);
        }
        if (!"0".equals(this.f24147du)) {
            c3059ii.m12955x1("cnt", this.f24147du);
        }
        if (!"1".equals(this.f24148h4)) {
            c3059ii.m12955x1("step", this.f24148h4);
        }
        C8397nz c8397nz = this.f24151m9;
        if (c8397nz != null) {
            c8397nz.mo6846k4("dgm", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
