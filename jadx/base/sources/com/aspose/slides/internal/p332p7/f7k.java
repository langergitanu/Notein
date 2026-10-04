package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class f7k extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f22697m9 = new C7017h4("table:show-empty", "data-pilot-subtotals", "data-pilot-members", "data-pilot-display-info", "data-pilot-sort-info", "data-pilot-layout-info");

    /* JADX INFO: renamed from: du */
    private zvz f22698du;

    /* JADX INFO: renamed from: h4 */
    private ada f22699h4;

    /* JADX INFO: renamed from: k4 */
    private byte f22700k4;

    /* JADX INFO: renamed from: kk */
    private odu f22701kk;

    /* JADX INFO: renamed from: to */
    private agh f22702to;

    /* JADX INFO: renamed from: x1 */
    private yz8 f22703x1;

    public f7k() {
        m31655x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m31655x1() {
        this.f22700k4 = (byte) -1;
    }

    public f7k(final AbstractC13912i5 abstractC13912i5) {
        m31655x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.f7k.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (f7k.f22697m9.m27428k4(str) != 0) {
                    return false;
                }
                f7k.this.f22700k4 = AbstractC7361bz.m29296rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.f7k.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = f7k.f22697m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    f7k.this.f22703x1 = new yz8(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    f7k.this.f22701kk = new odu(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    f7k.this.f22702to = new agh(abstractC13912i5);
                } else if (iM27428k4 == 4) {
                    f7k.this.f22698du = new zvz(abstractC13912i5);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    f7k.this.f22699h4 = new ada(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f22700k4;
        if (b != -1) {
            c3059ii.m12955x1("table:show-empty", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        yz8 yz8Var = this.f22703x1;
        if (yz8Var != null) {
            yz8Var.mo6846k4("table", c3059ii, "data-pilot-subtotals");
        }
        odu oduVar = this.f22701kk;
        if (oduVar != null) {
            oduVar.mo6846k4("table", c3059ii, "data-pilot-members");
        }
        agh aghVar = this.f22702to;
        if (aghVar != null) {
            aghVar.mo6846k4("table", c3059ii, "data-pilot-display-info");
        }
        zvz zvzVar = this.f22698du;
        if (zvzVar != null) {
            zvzVar.mo6846k4("table", c3059ii, "data-pilot-sort-info");
        }
        ada adaVar = this.f22699h4;
        if (adaVar != null) {
            adaVar.mo6846k4("table", c3059ii, "data-pilot-layout-info");
        }
        c3059ii.mo21898jd();
    }
}
