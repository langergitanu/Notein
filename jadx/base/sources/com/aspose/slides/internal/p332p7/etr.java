package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class etr extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private pzs f22432c5;

    /* JADX INFO: renamed from: du */
    private boolean f22433du;

    /* JADX INFO: renamed from: dy */
    private boolean f22434dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f22435h4;

    /* JADX INFO: renamed from: jd */
    private rne f22436jd;

    /* JADX INFO: renamed from: kk */
    private boolean f22437kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f22438m9;

    /* JADX INFO: renamed from: to */
    private boolean f22439to;

    /* JADX INFO: renamed from: x1 */
    private int f22440x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f22431k4 = se2.m40990k4("document");

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f22430ck = new C7017h4("text:index-scope", "text:relative-tab-stop-position", "text:use-spreadsheet-objects", "text:use-math-objects", "text:use-draw-objects", "text:use-chart-objects", "text:use-other-objects", "index-title-template", "object-index-entry-template");

    public etr() {
        m31321x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m31321x1() {
        this.f22440x1 = f22431k4;
        this.f22437kk = true;
        this.f22439to = false;
        this.f22433du = false;
        this.f22435h4 = false;
        this.f22438m9 = false;
        this.f22434dy = false;
    }

    public etr(final AbstractC13912i5 abstractC13912i5) {
        m31321x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.etr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (etr.f22430ck.m27428k4(str)) {
                    case 0:
                        etr.this.f22440x1 = se2.m40990k4(str2);
                        break;
                    case 1:
                        etr.this.f22437kk = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        etr.this.f22439to = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        etr.this.f22433du = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        etr.this.f22435h4 = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        etr.this.f22438m9 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        etr.this.f22434dy = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.etr.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = etr.f22430ck.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 7) {
                    etr.this.f22432c5 = new pzs(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 8) {
                    return false;
                }
                etr.this.f22436jd = new rne(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f22440x1;
        if (i != f22431k4) {
            c3059ii.m12955x1("text:index-scope", se2.m40991k4(i));
        }
        boolean z = this.f22437kk;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (!z) {
            c3059ii.m12955x1("text:relative-tab-stop-position", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z2 = this.f22439to;
        if (z2) {
            c3059ii.m12955x1("text:use-spreadsheet-objects", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z3 = this.f22433du;
        if (z3) {
            c3059ii.m12955x1("text:use-math-objects", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z4 = this.f22435h4;
        if (z4) {
            c3059ii.m12955x1("text:use-draw-objects", z4 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z5 = this.f22438m9;
        if (z5) {
            c3059ii.m12955x1("text:use-chart-objects", z5 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z6 = this.f22434dy;
        if (z6) {
            if (z6) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("text:use-other-objects", str3);
        }
        pzs pzsVar = this.f22432c5;
        if (pzsVar != null) {
            pzsVar.mo6846k4("text", c3059ii, "index-title-template");
        }
        rne rneVar = this.f22436jd;
        if (rneVar != null) {
            rneVar.mo6846k4("text", c3059ii, "object-index-entry-template");
        }
        c3059ii.mo21898jd();
    }
}
