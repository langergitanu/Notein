package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class a4u extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f19827c5 = new C7017h4("table:case-sensitive", "table:precision-as-shown", "table:search-criteria-must-apply-to-whole-cell", "table:automatic-find-labels", "table:use-regular-expressions", "table:null-year", "null-date", "iteration");

    /* JADX INFO: renamed from: du */
    private boolean f19828du;

    /* JADX INFO: renamed from: dy */
    private zn7 f19829dy;

    /* JADX INFO: renamed from: h4 */
    private long f19830h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f19831k4;

    /* JADX INFO: renamed from: kk */
    private boolean f19832kk;

    /* JADX INFO: renamed from: m9 */
    private jyr f19833m9;

    /* JADX INFO: renamed from: to */
    private boolean f19834to;

    /* JADX INFO: renamed from: x1 */
    private boolean f19835x1;

    public a4u() {
        m27936x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m27936x1() {
        this.f19835x1 = false;
        this.f19832kk = true;
        this.f19834to = true;
        this.f19828du = true;
        this.f19830h4 = 1930L;
    }

    public a4u(final AbstractC13912i5 abstractC13912i5) {
        m27936x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.a4u.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = a4u.f19827c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    a4u.this.f19831k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    a4u.this.f19835x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    a4u.this.f19832kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    a4u.this.f19834to = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 4) {
                    a4u.this.f19828du = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                a4u.this.f19830h4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.a4u.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = a4u.f19827c5.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 6) {
                    a4u.this.f19833m9 = new jyr(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 7) {
                    return false;
                }
                a4u.this.f19829dy = new zn7(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f19831k4;
        String str3 = TelemetryEventStrings.Value.FALSE;
        c3059ii.m12955x1("table:case-sensitive", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        boolean z2 = this.f19835x1;
        if (z2) {
            c3059ii.m12955x1("table:precision-as-shown", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z3 = this.f19832kk;
        if (!z3) {
            c3059ii.m12955x1("table:search-criteria-must-apply-to-whole-cell", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z4 = this.f19834to;
        if (!z4) {
            c3059ii.m12955x1("table:automatic-find-labels", z4 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z5 = this.f19828du;
        if (!z5) {
            if (z5) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("table:use-regular-expressions", str3);
        }
        long j = this.f19830h4;
        if ((4294967295L & j) != 1930) {
            c3059ii.m12955x1("table:null-year", C13850af.m65147x1(j));
        }
        jyr jyrVar = this.f19833m9;
        if (jyrVar != null) {
            jyrVar.mo6846k4("table", c3059ii, "null-date");
        }
        zn7 zn7Var = this.f19829dy;
        if (zn7Var != null) {
            zn7Var.mo6846k4("table", c3059ii, "iteration");
        }
        c3059ii.mo21898jd();
    }
}
