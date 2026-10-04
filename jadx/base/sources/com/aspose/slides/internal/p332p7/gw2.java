package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class gw2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f23761h4 = new C7017h4("draw:recreate-on-edit", "svg:width", "svg:height", "svg:viewBox", "svg:d");

    /* JADX INFO: renamed from: du */
    private String f23762du;

    /* JADX INFO: renamed from: k4 */
    private boolean f23763k4;

    /* JADX INFO: renamed from: kk */
    private String f23764kk;

    /* JADX INFO: renamed from: to */
    private String f23765to;

    /* JADX INFO: renamed from: x1 */
    private String f23766x1;

    public gw2() {
    }

    public gw2(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.gw2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = gw2.f23761h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    gw2.this.f23763k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    gw2.this.f23766x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    gw2.this.f23764kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    gw2.this.f23765to = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                gw2.this.f23762du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("draw:recreate-on-edit", this.f23763k4 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        String str3 = this.f23766x1;
        if (str3 != null) {
            c3059ii.m12955x1("svg:width", str3);
        }
        String str4 = this.f23764kk;
        if (str4 != null) {
            c3059ii.m12955x1("svg:height", str4);
        }
        c3059ii.m12955x1("svg:viewBox", this.f23765to);
        c3059ii.m12955x1("svg:d", this.f23762du);
        c3059ii.mo21898jd();
    }
}
