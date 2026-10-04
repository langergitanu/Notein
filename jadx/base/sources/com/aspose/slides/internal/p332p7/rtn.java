package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class rtn extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f29724h4 = new C7017h4("office:name", "office:dde-application", "office:dde-topic", "office:dde-item", "office:automatic-update");

    /* JADX INFO: renamed from: du */
    private boolean f29725du;

    /* JADX INFO: renamed from: k4 */
    private String f29726k4;

    /* JADX INFO: renamed from: kk */
    private String f29727kk;

    /* JADX INFO: renamed from: to */
    private String f29728to;

    /* JADX INFO: renamed from: x1 */
    private String f29729x1;

    public rtn() {
        m40539x1();
    }

    public rtn(AbstractC13912i5 abstractC13912i5) {
        m40539x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.rtn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = rtn.f29724h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    rtn.this.f29726k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    rtn.this.f29729x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    rtn.this.f29727kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    rtn.this.f29728to = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                rtn.this.f29725du = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m40539x1() {
        this.f29725du = true;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("office:name", this.f29726k4);
        c3059ii.m12955x1("office:dde-application", this.f29729x1);
        c3059ii.m12955x1("office:dde-topic", this.f29727kk);
        c3059ii.m12955x1("office:dde-item", this.f29728to);
        boolean z = this.f29725du;
        if (!z) {
            c3059ii.m12955x1("office:automatic-update", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        c3059ii.mo21898jd();
    }
}
