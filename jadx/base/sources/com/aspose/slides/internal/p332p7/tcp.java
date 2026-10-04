package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class tcp extends AbstractC7361bz {

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f30696up = new C7017h4("form:name", "form:control-implementation", "form:id", "xforms:bind", "form:for", "form:disabled", "form:label", "form:printable", "form:title", "form:multi-line", "properties", "event-listeners");

    /* JADX INFO: renamed from: c5 */
    private String f30697c5;

    /* JADX INFO: renamed from: ck */
    private eyu f30698ck;

    /* JADX INFO: renamed from: du */
    private String f30699du;

    /* JADX INFO: renamed from: dy */
    private boolean f30700dy;

    /* JADX INFO: renamed from: fa */
    private hec f30701fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f30702h4;

    /* JADX INFO: renamed from: jd */
    private boolean f30703jd;

    /* JADX INFO: renamed from: k4 */
    private String f30704k4;

    /* JADX INFO: renamed from: kk */
    private String f30705kk;

    /* JADX INFO: renamed from: m9 */
    private String f30706m9;

    /* JADX INFO: renamed from: to */
    private String f30707to;

    /* JADX INFO: renamed from: x1 */
    private String f30708x1;

    public tcp() {
        m41681x1();
    }

    public tcp(final AbstractC13912i5 abstractC13912i5) {
        m41681x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.tcp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (tcp.f30696up.m27428k4(str)) {
                    case 0:
                        tcp.this.f30704k4 = str2;
                        break;
                    case 1:
                        tcp.this.f30708x1 = str2;
                        break;
                    case 2:
                        tcp.this.f30705kk = str2;
                        break;
                    case 3:
                        tcp.this.f30707to = str2;
                        break;
                    case 4:
                        tcp.this.f30699du = str2;
                        break;
                    case 5:
                        tcp.this.f30702h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        tcp.this.f30706m9 = str2;
                        break;
                    case 7:
                        tcp.this.f30700dy = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        tcp.this.f30697c5 = str2;
                        break;
                    case 9:
                        tcp.this.f30703jd = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.tcp.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = tcp.f30696up.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 10) {
                    tcp.this.f30698ck = new eyu(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 11) {
                    return false;
                }
                tcp.this.f30701fa = new hec(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m41681x1() {
        this.f30702h4 = false;
        this.f30700dy = true;
        this.f30703jd = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f30704k4;
        if (str3 != null) {
            c3059ii.m12955x1("form:name", str3);
        }
        String str4 = this.f30708x1;
        if (str4 != null) {
            c3059ii.m12955x1("form:control-implementation", str4);
        }
        c3059ii.m12955x1("form:id", this.f30705kk);
        String str5 = this.f30707to;
        if (str5 != null) {
            c3059ii.m12955x1("xforms:bind", str5);
        }
        String str6 = this.f30699du;
        if (str6 != null) {
            c3059ii.m12955x1("form:for", str6);
        }
        boolean z = this.f30702h4;
        String str7 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("form:disabled", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str8 = this.f30706m9;
        if (str8 != null) {
            c3059ii.m12955x1("form:label", str8);
        }
        boolean z2 = this.f30700dy;
        if (!z2) {
            c3059ii.m12955x1("form:printable", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str9 = this.f30697c5;
        if (str9 != null) {
            c3059ii.m12955x1("form:title", str9);
        }
        boolean z3 = this.f30703jd;
        if (z3) {
            if (z3) {
                str7 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("form:multi-line", str7);
        }
        eyu eyuVar = this.f30698ck;
        if (eyuVar != null) {
            eyuVar.mo6846k4("form", c3059ii, "properties");
        }
        hec hecVar = this.f30701fa;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii, "event-listeners");
        }
        c3059ii.mo21898jd();
    }
}
