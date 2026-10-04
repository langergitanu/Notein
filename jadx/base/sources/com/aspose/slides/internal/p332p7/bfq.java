package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class bfq extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f20545jd = new C7017h4("table:scenario-ranges", "table:is-active", "table:display-border", "table:border-color", "table:copy-back", "table:copy-styles", "table:copy-formulas", "table:comment", "table:protected");

    /* JADX INFO: renamed from: c5 */
    private byte f20546c5;

    /* JADX INFO: renamed from: du */
    private boolean f20547du;

    /* JADX INFO: renamed from: dy */
    private String f20548dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f20549h4;

    /* JADX INFO: renamed from: k4 */
    private String f20550k4;

    /* JADX INFO: renamed from: kk */
    private boolean f20551kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f20552m9;

    /* JADX INFO: renamed from: to */
    private String f20553to;

    /* JADX INFO: renamed from: x1 */
    private boolean f20554x1;

    public bfq() {
        m28889x1();
    }

    public bfq(AbstractC13912i5 abstractC13912i5) {
        m28889x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bfq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (bfq.f20545jd.m27428k4(str)) {
                    case 0:
                        bfq.this.f20550k4 = str2;
                        break;
                    case 1:
                        bfq.this.f20554x1 = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        bfq.this.f20551kk = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        bfq.this.f20553to = str2;
                        break;
                    case 4:
                        bfq.this.f20547du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        bfq.this.f20549h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        bfq.this.f20552m9 = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        bfq.this.f20548dy = str2;
                        break;
                    case 8:
                        bfq.this.f20546c5 = AbstractC7361bz.m29296rv(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m28889x1() {
        this.f20551kk = true;
        this.f20547du = true;
        this.f20549h4 = true;
        this.f20552m9 = true;
        this.f20546c5 = (byte) -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:scenario-ranges", this.f20550k4);
        boolean z = this.f20554x1;
        String str3 = TelemetryEventStrings.Value.FALSE;
        c3059ii.m12955x1("table:is-active", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        boolean z2 = this.f20551kk;
        if (!z2) {
            c3059ii.m12955x1("table:display-border", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str4 = this.f20553to;
        if (str4 != null) {
            c3059ii.m12955x1("table:border-color", str4);
        }
        boolean z3 = this.f20547du;
        if (!z3) {
            c3059ii.m12955x1("table:copy-back", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z4 = this.f20549h4;
        if (!z4) {
            c3059ii.m12955x1("table:copy-styles", z4 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z5 = this.f20552m9;
        if (!z5) {
            c3059ii.m12955x1("table:copy-formulas", z5 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str5 = this.f20548dy;
        if (str5 != null) {
            c3059ii.m12955x1("table:comment", str5);
        }
        byte b = this.f20546c5;
        if (b != -1) {
            if (b == 1) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("table:protected", str3);
        }
        c3059ii.mo21898jd();
    }
}
