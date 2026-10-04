package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class kc0 extends AbstractC7361bz {

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f25585up = new C7017h4("syncHorizontal", "syncVertical", "syncRef", "transitionEvaluation", "transitionEntry", "published", "codeName", "filterMode", "enableFormatConditionsCalculation", "tabColor", "outlinePr", "pageSetUpPr");

    /* JADX INFO: renamed from: c5 */
    private boolean f25586c5;

    /* JADX INFO: renamed from: ck */
    private wpc f25587ck;

    /* JADX INFO: renamed from: du */
    private boolean f25588du;

    /* JADX INFO: renamed from: dy */
    private boolean f25589dy;

    /* JADX INFO: renamed from: fa */
    private sdr f25590fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f25591h4;

    /* JADX INFO: renamed from: jd */
    private bz0 f25592jd;

    /* JADX INFO: renamed from: k4 */
    private boolean f25593k4;

    /* JADX INFO: renamed from: kk */
    private String f25594kk;

    /* JADX INFO: renamed from: m9 */
    private String f25595m9;

    /* JADX INFO: renamed from: to */
    private boolean f25596to;

    /* JADX INFO: renamed from: x1 */
    private boolean f25597x1;

    public kc0() {
        m35291x1();
    }

    public kc0(final AbstractC13912i5 abstractC13912i5) {
        m35291x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kc0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (kc0.f25585up.m27428k4(str)) {
                    case 0:
                        kc0.this.f25593k4 = C13850af.m65068c5(str2);
                        break;
                    case 1:
                        kc0.this.f25597x1 = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        kc0.this.f25594kk = str2;
                        break;
                    case 3:
                        kc0.this.f25596to = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        kc0.this.f25588du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        kc0.this.f25591h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        kc0.this.f25595m9 = str2;
                        break;
                    case 7:
                        kc0.this.f25589dy = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        kc0.this.f25586c5 = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.kc0.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (kc0.f25585up.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 9:
                        kc0.this.f25592jd = new bz0(abstractC13912i5);
                        return true;
                    case 10:
                        kc0.this.f25587ck = new wpc(abstractC13912i5);
                        return true;
                    case 11:
                        kc0.this.f25590fa = new sdr(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m35291x1() {
        this.f25593k4 = false;
        this.f25597x1 = false;
        this.f25596to = false;
        this.f25588du = false;
        this.f25591h4 = true;
        this.f25589dy = false;
        this.f25586c5 = true;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f25593k4;
        if (z) {
            c3059ii.m12955x1("syncHorizontal", z ? "1" : "0");
        }
        boolean z2 = this.f25597x1;
        if (z2) {
            c3059ii.m12955x1("syncVertical", z2 ? "1" : "0");
        }
        String str3 = this.f25594kk;
        if (str3 != null) {
            c3059ii.m12955x1("syncRef", str3);
        }
        boolean z3 = this.f25596to;
        if (z3) {
            c3059ii.m12955x1("transitionEvaluation", z3 ? "1" : "0");
        }
        boolean z4 = this.f25588du;
        if (z4) {
            c3059ii.m12955x1("transitionEntry", z4 ? "1" : "0");
        }
        boolean z5 = this.f25591h4;
        if (!z5) {
            c3059ii.m12955x1("published", z5 ? "1" : "0");
        }
        String str4 = this.f25595m9;
        if (str4 != null) {
            c3059ii.m12955x1("codeName", str4);
        }
        boolean z6 = this.f25589dy;
        if (z6) {
            c3059ii.m12955x1("filterMode", z6 ? "1" : "0");
        }
        boolean z7 = this.f25586c5;
        if (!z7) {
            c3059ii.m12955x1("enableFormatConditionsCalculation", z7 ? "1" : "0");
        }
        bz0 bz0Var = this.f25592jd;
        if (bz0Var != null) {
            bz0Var.mo6846k4("ssml", c3059ii, "tabColor");
        }
        wpc wpcVar = this.f25587ck;
        if (wpcVar != null) {
            wpcVar.mo6846k4("ssml", c3059ii, "outlinePr");
        }
        sdr sdrVar = this.f25590fa;
        if (sdrVar != null) {
            sdrVar.mo6846k4("ssml", c3059ii, "pageSetUpPr");
        }
        c3059ii.mo21898jd();
    }
}
