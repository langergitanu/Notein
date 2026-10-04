package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class nhv extends AbstractC7361bz {

    /* JADX INFO: renamed from: rv */
    private static final C7017h4 f27322rv = new C7017h4("form:name", "form:control-implementation", "form:id", "xforms:bind", "form:current-value", "form:disabled", "form:max-length", "form:printable", "form:readonly", "form:tab-index", "form:tab-stop", "form:title", "form:value", "properties", "event-listeners");

    /* JADX INFO: renamed from: c5 */
    private boolean f27323c5;

    /* JADX INFO: renamed from: ck */
    private boolean f27324ck;

    /* JADX INFO: renamed from: du */
    private String f27325du;

    /* JADX INFO: renamed from: dy */
    private boolean f27326dy;

    /* JADX INFO: renamed from: fa */
    private String f27327fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f27328h4;

    /* JADX INFO: renamed from: jd */
    private long f27329jd;

    /* JADX INFO: renamed from: k4 */
    private String f27330k4;

    /* JADX INFO: renamed from: kk */
    private String f27331kk;

    /* JADX INFO: renamed from: ks */
    private hec f27332ks;

    /* JADX INFO: renamed from: m9 */
    private long f27333m9;

    /* JADX INFO: renamed from: to */
    private String f27334to;

    /* JADX INFO: renamed from: up */
    private String f27335up;

    /* JADX INFO: renamed from: x1 */
    private String f27336x1;

    /* JADX INFO: renamed from: yj */
    private eyu f27337yj;

    public nhv() {
        m37534x1();
    }

    public nhv(final AbstractC13912i5 abstractC13912i5) {
        m37534x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.nhv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (nhv.f27322rv.m27428k4(str)) {
                    case 0:
                        nhv.this.f27330k4 = str2;
                        break;
                    case 1:
                        nhv.this.f27336x1 = str2;
                        break;
                    case 2:
                        nhv.this.f27331kk = str2;
                        break;
                    case 3:
                        nhv.this.f27334to = str2;
                        break;
                    case 4:
                        nhv.this.f27325du = str2;
                        break;
                    case 5:
                        nhv.this.f27328h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        nhv.this.f27333m9 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 7:
                        nhv.this.f27326dy = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        nhv.this.f27323c5 = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        nhv.this.f27329jd = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 10:
                        nhv.this.f27324ck = C13850af.m65068c5(str2);
                        break;
                    case 11:
                        nhv.this.f27327fa = str2;
                        break;
                    case 12:
                        nhv.this.f27335up = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.nhv.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = nhv.f27322rv.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 13) {
                    nhv.this.f27337yj = new eyu(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 14) {
                    return false;
                }
                nhv.this.f27332ks = new hec(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m37534x1() {
        this.f27328h4 = false;
        this.f27333m9 = 4294967295L;
        this.f27326dy = true;
        this.f27323c5 = false;
        this.f27329jd = 0L;
        this.f27324ck = true;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f27330k4;
        if (str3 != null) {
            c3059ii.m12955x1("form:name", str3);
        }
        String str4 = this.f27336x1;
        if (str4 != null) {
            c3059ii.m12955x1("form:control-implementation", str4);
        }
        c3059ii.m12955x1("form:id", this.f27331kk);
        String str5 = this.f27334to;
        if (str5 != null) {
            c3059ii.m12955x1("xforms:bind", str5);
        }
        c3059ii.m12955x1("form:current-value", this.f27325du);
        boolean z = this.f27328h4;
        String str6 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("form:disabled", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j = this.f27333m9;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("form:max-length", C13850af.m65147x1(j));
        }
        boolean z2 = this.f27326dy;
        if (!z2) {
            c3059ii.m12955x1("form:printable", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z3 = this.f27323c5;
        if (z3) {
            c3059ii.m12955x1("form:readonly", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j2 = this.f27329jd;
        if ((j2 & 4294967295L) != 0) {
            c3059ii.m12955x1("form:tab-index", C13850af.m65147x1(j2));
        }
        boolean z4 = this.f27324ck;
        if (!z4) {
            if (z4) {
                str6 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("form:tab-stop", str6);
        }
        String str7 = this.f27327fa;
        if (str7 != null) {
            c3059ii.m12955x1("form:title", str7);
        }
        c3059ii.m12955x1("form:value", this.f27335up);
        eyu eyuVar = this.f27337yj;
        if (eyuVar != null) {
            eyuVar.mo6846k4("form", c3059ii, "properties");
        }
        hec hecVar = this.f27332ks;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii, "event-listeners");
        }
        c3059ii.mo21898jd();
    }
}
