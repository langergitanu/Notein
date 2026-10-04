package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class gau extends AbstractC7361bz {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f23296fa = new C7017h4("form:name", "form:control-implementation", "form:id", "xforms:bind", "form:disabled", "form:for", "form:label", "form:printable", "form:title", "properties", "event-listeners");

    /* JADX INFO: renamed from: c5 */
    private String f23297c5;

    /* JADX INFO: renamed from: ck */
    private hec f23298ck;

    /* JADX INFO: renamed from: du */
    private boolean f23299du;

    /* JADX INFO: renamed from: dy */
    private boolean f23300dy;

    /* JADX INFO: renamed from: h4 */
    private String f23301h4;

    /* JADX INFO: renamed from: jd */
    private eyu f23302jd;

    /* JADX INFO: renamed from: k4 */
    private String f23303k4;

    /* JADX INFO: renamed from: kk */
    private String f23304kk;

    /* JADX INFO: renamed from: m9 */
    private String f23305m9;

    /* JADX INFO: renamed from: to */
    private String f23306to;

    /* JADX INFO: renamed from: x1 */
    private String f23307x1;

    public gau() {
        m32379x1();
    }

    public gau(final AbstractC13912i5 abstractC13912i5) {
        m32379x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.gau.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (gau.f23296fa.m27428k4(str)) {
                    case 0:
                        gau.this.f23303k4 = str2;
                        break;
                    case 1:
                        gau.this.f23307x1 = str2;
                        break;
                    case 2:
                        gau.this.f23304kk = str2;
                        break;
                    case 3:
                        gau.this.f23306to = str2;
                        break;
                    case 4:
                        gau.this.f23299du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        gau.this.f23301h4 = str2;
                        break;
                    case 6:
                        gau.this.f23305m9 = str2;
                        break;
                    case 7:
                        gau.this.f23300dy = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        gau.this.f23297c5 = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gau.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = gau.f23296fa.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 9) {
                    gau.this.f23302jd = new eyu(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 10) {
                    return false;
                }
                gau.this.f23298ck = new hec(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m32379x1() {
        this.f23299du = false;
        this.f23300dy = true;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f23303k4;
        if (str3 != null) {
            c3059ii.m12955x1("form:name", str3);
        }
        String str4 = this.f23307x1;
        if (str4 != null) {
            c3059ii.m12955x1("form:control-implementation", str4);
        }
        c3059ii.m12955x1("form:id", this.f23304kk);
        String str5 = this.f23306to;
        if (str5 != null) {
            c3059ii.m12955x1("xforms:bind", str5);
        }
        boolean z = this.f23299du;
        String str6 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("form:disabled", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str7 = this.f23301h4;
        if (str7 != null) {
            c3059ii.m12955x1("form:for", str7);
        }
        String str8 = this.f23305m9;
        if (str8 != null) {
            c3059ii.m12955x1("form:label", str8);
        }
        boolean z2 = this.f23300dy;
        if (!z2) {
            if (z2) {
                str6 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("form:printable", str6);
        }
        String str9 = this.f23297c5;
        if (str9 != null) {
            c3059ii.m12955x1("form:title", str9);
        }
        eyu eyuVar = this.f23302jd;
        if (eyuVar != null) {
            eyuVar.mo6846k4("form", c3059ii, "properties");
        }
        hec hecVar = this.f23298ck;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii, "event-listeners");
        }
        c3059ii.mo21898jd();
    }
}
