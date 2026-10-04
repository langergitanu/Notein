package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class agh extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f20060du = new C7017h4("table:enabled", "table:data-field", "table:member-count", "table:display-member-mode");

    /* JADX INFO: renamed from: k4 */
    private boolean f20061k4;

    /* JADX INFO: renamed from: kk */
    private long f20062kk;

    /* JADX INFO: renamed from: to */
    private int f20063to;

    /* JADX INFO: renamed from: x1 */
    private String f20064x1;

    public agh() {
        m28248x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m28248x1() {
        this.f20063to = 0;
    }

    public agh(AbstractC13912i5 abstractC13912i5) {
        m28248x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.agh.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = agh.f20060du.m27428k4(str);
                if (iM27428k4 == 0) {
                    agh.this.f20061k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    agh.this.f20064x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    agh.this.f20062kk = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                agh.this.f20063to = scu.m40884k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:enabled", this.f20061k4 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        c3059ii.m12955x1("table:data-field", this.f20064x1);
        c3059ii.m12955x1("table:member-count", C13850af.m65147x1(this.f20062kk));
        c3059ii.m12955x1("table:display-member-mode", scu.m40885k4(this.f20063to));
        c3059ii.mo21898jd();
    }
}
