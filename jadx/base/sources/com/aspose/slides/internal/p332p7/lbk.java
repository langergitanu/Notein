package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class lbk extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f26183to = new C7017h4("table:name", "table:display", "table:show-details");

    /* JADX INFO: renamed from: k4 */
    private String f26184k4;

    /* JADX INFO: renamed from: kk */
    private byte f26185kk;

    /* JADX INFO: renamed from: x1 */
    private byte f26186x1;

    public lbk() {
        m35981x1();
    }

    public lbk(AbstractC13912i5 abstractC13912i5) {
        m35981x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lbk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = lbk.f26183to.m27428k4(str);
                if (iM27428k4 == 0) {
                    lbk.this.f26184k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    lbk.this.f26186x1 = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                lbk.this.f26185kk = AbstractC7361bz.m29296rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m35981x1() {
        this.f26186x1 = (byte) -1;
        this.f26185kk = (byte) -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:name", this.f26184k4);
        byte b = this.f26186x1;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (b != -1) {
            c3059ii.m12955x1("table:display", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        byte b2 = this.f26185kk;
        if (b2 != -1) {
            if (b2 == 1) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("table:show-details", str3);
        }
        c3059ii.mo21898jd();
    }
}
