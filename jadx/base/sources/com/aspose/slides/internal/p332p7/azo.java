package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class azo extends AbstractC7361bz {

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f20361up = new C7017h4("form:name", "form:control-implementation", "form:id", "xforms:bind", "form:disabled", "form:image-data", "form:printable", "form:readonly", "form:title", "form:data-field", "properties", "event-listeners");

    /* JADX INFO: renamed from: c5 */
    private String f20362c5;

    /* JADX INFO: renamed from: ck */
    private eyu f20363ck;

    /* JADX INFO: renamed from: du */
    private boolean f20364du;

    /* JADX INFO: renamed from: dy */
    private boolean f20365dy;

    /* JADX INFO: renamed from: fa */
    private hec f20366fa;

    /* JADX INFO: renamed from: h4 */
    private String f20367h4;

    /* JADX INFO: renamed from: jd */
    private String f20368jd;

    /* JADX INFO: renamed from: k4 */
    private String f20369k4;

    /* JADX INFO: renamed from: kk */
    private String f20370kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f20371m9;

    /* JADX INFO: renamed from: to */
    private String f20372to;

    /* JADX INFO: renamed from: x1 */
    private String f20373x1;

    public azo() {
        m28660x1();
    }

    public azo(final AbstractC13912i5 abstractC13912i5) {
        m28660x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.azo.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (azo.f20361up.m27428k4(str)) {
                    case 0:
                        azo.this.f20369k4 = str2;
                        break;
                    case 1:
                        azo.this.f20373x1 = str2;
                        break;
                    case 2:
                        azo.this.f20370kk = str2;
                        break;
                    case 3:
                        azo.this.f20372to = str2;
                        break;
                    case 4:
                        azo.this.f20364du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        azo.this.f20367h4 = str2;
                        break;
                    case 6:
                        azo.this.f20371m9 = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        azo.this.f20365dy = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        azo.this.f20362c5 = str2;
                        break;
                    case 9:
                        azo.this.f20368jd = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.azo.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = azo.f20361up.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 10) {
                    azo.this.f20363ck = new eyu(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 11) {
                    return false;
                }
                azo.this.f20366fa = new hec(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m28660x1() {
        this.f20364du = false;
        this.f20371m9 = true;
        this.f20365dy = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f20369k4;
        if (str3 != null) {
            c3059ii.m12955x1("form:name", str3);
        }
        String str4 = this.f20373x1;
        if (str4 != null) {
            c3059ii.m12955x1("form:control-implementation", str4);
        }
        c3059ii.m12955x1("form:id", this.f20370kk);
        String str5 = this.f20372to;
        if (str5 != null) {
            c3059ii.m12955x1("xforms:bind", str5);
        }
        boolean z = this.f20364du;
        String str6 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("form:disabled", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str7 = this.f20367h4;
        if (str7 != null) {
            c3059ii.m12955x1("form:image-data", str7);
        }
        boolean z2 = this.f20371m9;
        if (!z2) {
            c3059ii.m12955x1("form:printable", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z3 = this.f20365dy;
        if (z3) {
            if (z3) {
                str6 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("form:readonly", str6);
        }
        String str8 = this.f20362c5;
        if (str8 != null) {
            c3059ii.m12955x1("form:title", str8);
        }
        String str9 = this.f20368jd;
        if (str9 != null) {
            c3059ii.m12955x1("form:data-field", str9);
        }
        eyu eyuVar = this.f20363ck;
        if (eyuVar != null) {
            eyuVar.mo6846k4("form", c3059ii, "properties");
        }
        hec hecVar = this.f20366fa;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii, "event-listeners");
        }
        c3059ii.mo21898jd();
    }
}
