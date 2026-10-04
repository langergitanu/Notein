package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class ssy extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f30361du = new C7017h4("table:cell-range-address", "table:direction", "table:contains-error", "table:marked-invalid");

    /* JADX INFO: renamed from: k4 */
    private String f30362k4;

    /* JADX INFO: renamed from: kk */
    private boolean f30363kk;

    /* JADX INFO: renamed from: to */
    private byte f30364to;

    /* JADX INFO: renamed from: x1 */
    private int f30365x1;

    public ssy() {
        m41284x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m41284x1() {
        this.f30365x1 = 0;
        this.f30363kk = false;
        this.f30364to = (byte) -1;
    }

    public ssy(AbstractC13912i5 abstractC13912i5) {
        m41284x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ssy.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ssy.f30361du.m27428k4(str);
                if (iM27428k4 == 0) {
                    ssy.this.f30362k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    ssy.this.f30365x1 = r7c.m39900k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    ssy.this.f30363kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                ssy.this.f30364to = AbstractC7361bz.m29296rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f30362k4;
        if (str3 != null) {
            c3059ii.m12955x1("table:cell-range-address", str3);
        }
        int i = this.f30365x1;
        if (i != 0) {
            c3059ii.m12955x1("table:direction", r7c.m39901k4(i));
        }
        boolean z = this.f30363kk;
        String str4 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("table:contains-error", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        byte b = this.f30364to;
        if (b != -1) {
            if (b == 1) {
                str4 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("table:marked-invalid", str4);
        }
        c3059ii.mo21898jd();
    }
}
